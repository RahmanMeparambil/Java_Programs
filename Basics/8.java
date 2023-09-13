// program to multiply the adjacent values of an array and store it in an another array
import java.util.Scanner;
class matrix_operations
{
    static Scanner input = new Scanner(System.in);
    int[] create_array(int size)
    {
        int[] arr = new int[size];
        System.out.print("Enter array elements : \n");
        for(int i=0;i<size ;i++)
        {
            System.out.print(i +" :");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    
    int[] mul_operation(int arr[],int size)
    {
        int[] res = new int[size];
        for(int i=0;i<size-1;i++)
        {
            res[i] = arr[i]*arr[i+1];
        }
        return res;
    }
    
    void display(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
    public static void main(String args[])
    {
        matrix_operations mul_adj = new matrix_operations();
        int[] arr = new int[20];
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        arr = mul_adj.create_array(n);
        
        System.out.print("array 1 : ");
        mul_adj.display(arr,n);
        System.out.println("");
        
        int[] res = mul_adj.mul_operation(arr,n);
        System.out.print("result : ");
        mul_adj.display(res,n-1);
        System.out.println("");
        

    }
}