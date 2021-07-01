/**
* This program is to calculate employee wage
*
* @author  Bathala Haresh
*/

 public class Empwage
{
    public static void main(String args[])
    {
        //constants
        final int fullTime = 1;
        final int wageHr = 20;
        
        int empType = (int) (Math.random() * 100) % 2;
        int workingHours = 0;
        
        //If condition to check employee is present or absent
        if (empType == fullTime)
        {
            System.out.println("Employee is Present so ...");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent so ...");
        }
        //calculating the wage
        int wage = workingHours * wageHr;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
