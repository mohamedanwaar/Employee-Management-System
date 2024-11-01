public class SalaredEmployee extends Emplyee implements Dispalyables {
    double salary;
    double bounes;
    double deductions;


    public SalaredEmployee(String firstName, String middleName, String lastName, String nationality, int SSN, int yearOfBirth, double salary, double deductions, double bounes) {
        super(firstName, middleName, lastName, nationality, SSN, yearOfBirth);
        this.salary = salary;
        this.deductions = deductions;
        this.bounes = bounes;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getBounes() {
        return bounes;
    }

    public void setBounes(double bounes) {
        this.bounes = bounes;
    }


    public double earning()
   {
       return (salary+bounes)-deductions;
   }

    @Override
    public String toString() {
        return "SalaredEmployee{" +
                "salary=" + salary +
                ", bounes=" + bounes +
                ", deductions=" + deductions +
                '}';
    }
    public void  displayAllDetails()
    {
        System.out.println(toString());
        System.out.println(super.toString());

    }
    public void  displayEarning()
    {
        System.out.println(earning());
    }

}
