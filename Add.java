import java.util.*;
public class Add {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int m,n;
        System.out.print("Enter the number of rows : ");
        m=s.nextInt();
        System.out.print("Enter the number of columns : ");
        n=s.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.println("Enter the elements of the first matrix : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("The sum of two matrix are");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }

}
