// Program should accept annual income of a person
import calc_tax.finance;
//import calc_tax.finance;

import java.util.Scanner;

public class annualincome
{
    int a=12;
    finance fin = new finance();
    fin.tax(a);
    public static void main(String args[])
    {
        System.out.println("Enter the income : ");
        Scanner input = new Scanner(System.in);
        int income = input.nextInt();
        //annualincome a=new annualincome();
       
       /* annual_income an_inc = new annual_income();
        int tax = an_inc.calculate_tax(income);
        System.out.println("Amount of tax he has to pay : "+tax);*/
    }
}