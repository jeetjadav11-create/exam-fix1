/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String newfullname, int newyearOfBirth, double newhourlyWage){
        fullname = newfullname;
        yearOfBirth = newyearOfBirth;
        hourlyWage = newhourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // to be completed
        if ( age>=16){
            return true;
        }
        else{
            System.out.println ( 16 - age );
            return false;
        }
    } 
        

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(double hoursWorked){
        // to be completed
        unpaidHours=hoursWorked;
         double calculatePay=unpaidHours * hourlyWage;
         calculatePay=calculatePay * 70;
         calculatePay=calculatePay / 100;
         return calculatePay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(double timeWorked){
        // to be completed
        double salaryme=calculatePay(timeWorked);
        System.out.println(fullname+"has received a wire transfer of "+ salaryme+"CAD");
        unpaidHours=0;
        
    }
    
    private double getunpaidhours(){
         return unpaidHours;
     }
    
     private void caculateUnpaidHours(int hoursWorked){
       double caculateUnpaidHours=unpaidHours+hoursWorked;
      unpaidHours= caculateUnpaidHours;
     }
    
}