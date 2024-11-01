public class HourlyEmployee extends Emplyee implements Dispalyables{
      private double hourRate;
      private int numberOfHours;

    public HourlyEmployee(String firstName, String middleName, String lastName, String nationality, int SSN, int yearOfBirth, double hourRate, int numberOfHours) {
        super(firstName, middleName, lastName, nationality, SSN, yearOfBirth);
        this.hourRate = hourRate;
        this.numberOfHours = numberOfHours;
    }

    public double getHourRate() {

        return hourRate;

    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double earning()
    {
      return   numberOfHours*hourRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourRate=" + hourRate +
                ", numberOfHours=" + numberOfHours +
                '}';
    }

    public void  displayAllDetails()
   {
       System.out.println(super.toString());
       System.out.println(toString());

   }
   public void displayEarning()
   {
       System.out.println(earning());

   }

}
