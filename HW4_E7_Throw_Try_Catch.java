import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        //Question 7
        int[] arr = null;
        while (true) {
            System.out.println("\n" + "Menu:");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search for an element within the array");
            System.out.println("4. Sort the array");
            System.out.println("5. Exit");
            System.out.print("Please enter here: ");
            int num = 0;
            try {
                 num = s.nextInt();
                check(num);
            }catch (Exception e1){
                System.out.println("Invalid input " + e1.getMessage());
                s.next();
            }
            try{
                switch (num) {
                    case 1:
                        System.out.println("Enter the size of your Array: ");
                        int size = s.nextInt();

                        arr = new int[size];
                        System.out.println("enter the elements of the Array:");
                        for (int i = 0; i < size; i++) {
                            arr[i] = s.nextInt();
                        }
                        break;

                    case 2:
                        if (arr == null) {
                            System.out.println("Your Array empty!");
                        } else {
                            System.out.println("your Array: ");
                            System.out.println(Arrays.toString(arr));
                        }
                        break;

                    case 3:
                        if (arr == null) {
                            System.out.println("Your Array empty!");
                        } else {
                            System.out.println("Please enter the element you want to search: ");
                            int elm = s.nextInt();

                            boolean noElm = true;
                            ArrayList index = new ArrayList();
                            for (int i = 0; i < arr.length; i++) {
                                if (arr[i] == elm) {
                                    index.add(i);
                                    noElm = false;
                                }
                            }
                            if (noElm) {
                                System.out.println("Sorry element " + elm + " cant be found");
                            } else {
                                System.out.println("The element " + elm + " can be found at index " + index);
                            }
                        }
                        break;

                    case 4:
                        Arrays.sort(arr);
                        System.out.println("Your Array after sorting the elements: ");
                        System.out.println(Arrays.toString(arr));
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            }catch (Exception e1){
                System.out.println("Invalid input " + e1.getMessage());
                s.next();
            }

        }
    }
    public static void check(int input) throws Exception {
        if (input < 1 || input > 5) {
            throw new Exception("Invalid! Please enter a number from 1-5");
        }

    }
}

