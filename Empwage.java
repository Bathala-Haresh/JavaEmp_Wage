/**
* This program is to add partTime employee and wage
*
* @author  Bathala Haresh
*/

 public class EmpWage
{
    public static void main(String args[])
    {
        //constants
        final int fullTime = 1;
        final int partTime = 2;
        final int wageHr = 20;
        
        //random method to get values like 0 or 1 or 2
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        

        if (empType == fullTime)
        {
            System.out.println("Employee is Present so ");
            workingHours = 8;
        } 
        else if (empType == partTime) 
        {
            System.out.println("Employee has present PartTime so ");
            workingHours = 4;
        }else
        {
            System.out.println("Employee is Absent so ");
        }
        //calculate the wage of an employee
        int wage = workingHours * wageHr;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
