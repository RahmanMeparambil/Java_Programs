// Program should accept annual income of a person
import java.util.Scanner;
class annual_income
{
    int calculate_tax(int income)
    {
        int tax = 0; 
        if (income <= 250000)
        {
            tax = 0;
        }
        else if (income <= 500000)
        {
            tax = (5*income)/100;
        }
        else if (income <= 1000000)
        {
            tax = (20*income)/100;
        }
        else if (income <= 5000000)
        {
            tax = (30*income)/100;
        }
        else 
        {
            System.out.println("you don't have to pay tax :D");
        }
        return tax;
    }
    
    public static void main(String args[])
    {
        System.out.println("Enter the income : ");
        Scanner input = new Scanner(System.in);
        int income = input.nextInt(); 
        annual_income an_inc = new annual_income();
        int tax = an_inc.calculate_tax(income);
        System.out.println("Amount of tax he has to pay : "+tax);
    }
}