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

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        fullname = newfullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
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
        if Age >= then;
        return candrive = true;
        else;
        println(16-Age);
        return candrive = false;
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
         calculatePay=unpaidHours x hourlyWage;
         calculatePay=calculatePay x 70;
         calculatePay=calculatePay / 100;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        Println(fullname+"has received a wire transfer of "calculatePay+"CAD");
        unpaidHours=0;
        
    }
    
    private double getunpaidhours();
         return (unpaidhours);

    private void caculateUnpaidHours(int hoursWorked)
    caculateUnpaidHours=unpaidHours+hoursWorked;
    unpaidhours= caculateUnpaidHours;
    
    
}