// Write a menu driven java program to do the basic mathematical operations such as addition, subtraction, multiplication and division (hint: use if else ladder or switch)
import java.util.Scanner;
public class mathematical_operation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //int a = input.nextInt();
        //String s = input.nextLine();
        //char opr = '+';
        System.out.println("Enter operator : \n(+)Addition\n(-)Subtraction\n(/)Division\n(*)Multiplication\n(!)Exit");
        char opr = input.next().charAt(0);

        while (opr != '!')
        {


           System.out.println("Enter a : ");
           int a = input.nextInt();
           System.out.println("Enter b : ");
           int b = input.nextInt();


          switch(opr)
          {
            case '+':
                System.out.println("op : "+(a+b));
                break;
       
            case '-':
                System.out.println("op : "+(a-b));
                break;
              case '*':
                  System.out.println("op : "+(a*b));
                  break;
              case '/':
                  System.out.println("op : "+(a/b));
                  break;
            
              case '!':
                  break;
              default :
                  System.out.println("op : Invalid operator ");
                  break;
          }
            System.out.println("\n");
            System.out.println("Enter operator : \n(+)Addition\n(-)Subtraction\n(/)Division\n(*)Multiplication\n(!)Exit");
            opr = input.next().charAt(0);
        }
        
    }
}