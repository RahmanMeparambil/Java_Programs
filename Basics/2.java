//check whether a given number is prime or not
// Prime numbers are numbers that have only 2 factors: 1 and themselves..
import java.util.Scanner;
public class prime{
    public static void main(String[] args)
    {
        // get a number
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int flag = 0;
        //System.out.println(""+size);
        //new check_prime = 
        if (size<=2)
        {
            System.out.println("not prime : "+size);
        }
        for(int i=2;i<size;i++)
        {
            if (size%i == 0)
            {
                System.out.println("not prime : "+size);
                break;
            }
            
            else
            {
                if (i == size-1)
                {
                    System.out.println("prime : "+size);
                }
                    
                continue;

            }
        }
    }
}

        