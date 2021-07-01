/**
* This program is to solve using switch statement
*
* @author  Bathala Haresh
*/

 public class Empwage
{
    public static void main(String args[])
    {
        //constants
        final int partTime = 1;
        final int fullTime = 2;
        final int wageHr = 20;
        
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours =0;
        
        //switcj case to find employee Present or absent or worked partTime
        switch (empType)
        {
            case fullTime:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
            case partTime:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");  
        }
        //calculating wage of an employee
        int wage = workingHours * wageHr;
        System.out.println("Employee Daily Wage is " + wage);
        
    }
}
