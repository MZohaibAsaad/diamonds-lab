public class Main {

    public static void main(String[] args) {
        // Please code here
        int c=1;
        for(int i = 10; i >=1; i--)             //No. of column of upper half of triangle
        {
            for(int j = i-1 ; j >=1; j--)       //upper-left half spaces
            {
                System.out.print(" ");
            }
            for (int k=i-1; k<10; k++ )         //upper-left half "*" character
            {
                System.out.print("*");
            }
            for (int l=10; l>i; l-- )           //upper-right "*" character
            {
                System.out.print("*");
            }
            System.out.println(" ");            // Next Line- Next column
        }

        for(int i = 10 ; i >=1; i--)            // Lower half of the triangle
        {
            System.out.print(" ");
            for(int j = 10 ; j > i; j--)        //lower-left spacing
            {
                System.out.print(" ");
            }
            int j;
            for(int k = 19-c; k >1; k--)        // "*" character from 18-1 / lower half of triangle
            {
                System.out.print("*");
            }
            System.out.println(" ");
            c=c+2;
        }
        System.out.println("Assigned task done 3 days After the due date.");

    }
}
