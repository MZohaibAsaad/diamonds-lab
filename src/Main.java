import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please code here
        System.out.println("^^^^^Enter the maximum number of Stars in a Row and Print a Diamond^^^^^ \n \n");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the max. number of Stars in a Row : ");
        int n = reader.nextInt();

            if (n % 2 != 0) {
                int a, b, c, f;                            //Variables
                a = (n / 2) + 1;                           //Natural number against an odd number.
                b = n - a;
                c = n - 2;
                f = (c / 2) + 1;


                for (int i = a; i >= 1; i--)             //No. of columns of upper half of triangle
                {
                    for (int j = b; j >= 1; j--)       //upper-left half spaces
                    {
                        System.out.print("^");
                    }
                    for (int k = i - 1; k < a; k++)         //upper-left half "*" character
                    {
                        System.out.print("*");
                    }
                    for (int l = a; l > i; l--)           //upper-right "*" character
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");                   // Next Line- Next column
                    b--;
                }

                for (int i = f; i >= 1; i--)            // Lower half of the triangle
                {
                    for (int j = f; j >= i; j--)        //lower-left spacing
                    {
                        System.out.print("^");
                    }
                    for (int k = c; k >= 1; k--)        // "*" character from max-1 starts to 1 / lower half of triangle
                    {
                        System.out.print("*");
                    }
                    c = c - 2;
                    System.out.println(" ");
                }

                System.out.println("Assigned task done.");
            }

            else {
                System.out.println("You must enter an Odd number.");
            }
    }
}
