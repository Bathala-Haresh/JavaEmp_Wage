/**
* This program is to welcome user to Empwage problem
*
* @author  Bathala Haresh
*/

class Empwage
{
    public static void main(String args[])
    {
        System.out.println("Attendence Checking ....");
        
        //Random function to get either 1 or 0
        int employee=(int)(Math.random() * 100) % 2;
       
        if(employee == 1)
        {
            System.out.print("present");
        }
        else{
            System.out.print("absent");
        }
    }
}