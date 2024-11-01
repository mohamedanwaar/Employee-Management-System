public class CommissionEmplyee extends Emplyee implements Dispalyables {

    private double  grossSales;
    private double commissionRate;


    public CommissionEmplyee(String firstName, String middleName, String lastName, String nationality,final int SSN, int yearOfBirth, double commissionRate, double grossSales) {
        super(firstName, middleName, lastName, nationality, SSN, yearOfBirth);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earning()
    {
        return grossSales*commissionRate;

    }

    @Override
    public String toString() {
        return "CommissionEmplyee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    public void  displayAllDetails()
    {
        System.out.println(super.toString());
        System.out.println(toString());

    }
    public void  displayEarning()
    {
        System.out.println(earning());


    }



}
