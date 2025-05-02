
import java.util.Scanner;

public class program_one {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=scan.nextInt();
        }
        printAllPairs(arr);

   
    }

public static void printAllPairs(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            System.out.println("The all possible pairs are:");
            System.out.println(arr[i]+" "+arr[j]);
        }
    }
}
}
