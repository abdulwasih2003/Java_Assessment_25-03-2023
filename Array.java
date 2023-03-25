import java.util.*;
public class Array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int m,n;
        System.out.print("Enter the size of the array : ");
        n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
                a[i]=s.nextInt();
        }

        System.out.println("Original Array : ");
        for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
                b[i]=a[i];
        }
        System.out.println();
        System.out.println("Duplicated Array : ");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
