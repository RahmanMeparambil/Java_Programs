// Grades are computed using a weighted average.
// Suppose that the written test counts 70%,  lab exams 20% and assignments 10%.
// If Arun has a score of
// Written test = 81
// Lab exams = 68
// Assignments = 92
// Arun’s overall grade = (81x70)/100 + (68x20)/100 + (92x10)/100 = 79.5
// Write a program to find the grade of a student during his academic year. 
// Program should accept the scores for written test, lab exams and assignments
// Output the grade of a student (using weighted average)
import java.util.Scanner;
class Weighted_avg
{
    void Compute()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("input written test : ");
        int a = input.nextInt();
        System.out.println("\ninput lab exams : ");
        int b = input.nextInt();
        System.out.println("\ninput assignments : ");
        int c = input.nextInt();
        float overall_grade = (a*70)/100 + (b*20)/100 + (c*10)/100;
        System.out.println(overall_grade);   
    }
    
    public static void main(String args[])
    {
        Weighted_avg wa = new Weighted_avg();
        wa.Compute();
    }
}
