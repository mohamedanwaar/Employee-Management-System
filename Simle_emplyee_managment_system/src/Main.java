import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    static Department d =new Department("dev",3);



    public static    void  RunAPP()
    {
        Boolean   flag= true ;

        do {

            System.out.println("----------------Welcome for Employee Management System-------------------\n");
            System.out.println(" what you want to do ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1- Add Employee to System ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("2- Display Details for specific employee ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("3- Display earning for specific employee ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("4- Remove Employee from System ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("5- Number of Employee in System");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("6- Change data for employee  ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("7- EXIT  ");


            Scanner in = new Scanner(System.in);
            int choose ;
            try {
                choose = in.nextInt();


                switch (choose) {
                    case 1:
                        AddEmlyoyeeToSystem();
                        break;
                    case 2:
                        DispalyData();
                        break;
                    case 3:
                        displayErning();
                        break;
                    case 4:
                        removeEmployee();
                        break;

                    case 5:
                        d.dissplayNumberOfEmplyee();
                        break;
                    case 6:
                        change_data();
                        break;
                    case 7:
                        flag = false;
                        break;


                }
            }
            catch(InputMismatchException e)
                {
                    System.out.println(e.toString()+" enter integer number only ");
                }

        }while(flag);







    }

//
//    public static void DisplayEarnig()
//    {
//        int id ;
//
//        Scanner in = new Scanner(System.in);
//        id= in.nextInt();
//
//
//
//
//    }

    public static   void AddEmlyoyeeToSystem ()
    {
        Scanner in = new Scanner(System.in);
        String fName,mName,lName,nationalyt;
        int SSN ,YearOfBirth;


        System.out.println("enter full name and nationality  ");
        try {


            fName = in.next();
            mName = in.next();
            lName = in.next();
            nationalyt = in.next();

            System.out.println("-----------------------");


            System.out.println("Enter SSN and Year of birth ");

            SSN = in.nextInt();
            YearOfBirth = in.nextInt();

            System.out.println("-----------------------");

            System.out.println("What type of employee that you want to add to system ?   ");
            System.out.println("1- Salaried Employee ");
            System.out.println("2- Commission  Employee ");
            System.out.println("3- Hourly Employee ");
            int choseeOptin;  // this to get chose option for the type of employee
            choseeOptin = in.nextInt();
            switch (choseeOptin)
            {
                case 1:
                    double salary, bounes, deductions;
                    System.out.println(" Enter salary and bones for Employee and deductions if exist ");
                    salary = in.nextDouble();
                    bounes = in.nextDouble();
                    deductions = in.nextDouble();
                    SalaredEmployee s = new SalaredEmployee(fName, mName, lName, nationalyt, SSN, YearOfBirth, salary, deductions, bounes);
                    d.addEmployee(s);
                   break;

                case 2:
                    double grossSales , commissionRate;
                    System.out.println(" Enter commission Rate and gross rate for employee ");
                    commissionRate=in.nextDouble();
                    grossSales=in.nextDouble();
                    CommissionEmplyee c=new CommissionEmplyee(fName, mName, lName, nationalyt, SSN, YearOfBirth,commissionRate,grossSales);
                    d.addEmployee(c);
                    break;

                case 3:
                    double hourlyRate;
                    int numberOfHoures ;
                    System.out.println(" Enter  hourly Rate  and Number of worked  hours  for employee ");
                    hourlyRate=in.nextDouble();
                    numberOfHoures=in.nextInt();
                    HourlyEmployee h=new HourlyEmployee(fName, mName, lName, nationalyt, SSN, YearOfBirth,hourlyRate,numberOfHoures);
                    d.addEmployee(h);
                    break;



            }

        }

        catch (Exception e )
        {
            e.printStackTrace();
            System.out.println( );
            System.out.println(" >>>>>>> enter Valid Data <<<<<<<< ");
        }









    }
    public static   void DispalyData  ()
    {


        System.out.println("enter id for Employee ");
        Scanner in = new Scanner(System.in);
        try
        {
            int id;
            id=in.nextInt();

            if (d.searchEmplyee(id) instanceof SalaredEmployee)
            {
                ((SalaredEmployee) d.searchEmplyee(id)).displayAllDetails();
            }
            else if (d.searchEmplyee(id) instanceof HourlyEmployee) {
                ((HourlyEmployee) d.searchEmplyee(id)).displayAllDetails();

            }
            else if (d.searchEmplyee(id) instanceof CommissionEmplyee)
            {
                ((CommissionEmplyee) d.searchEmplyee(id)).displayAllDetails();
            }
            else
            {
                System.out.println(" Employee is not found  ");
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e.toString()+" enter integer number only ");
        }
        catch (Exception e) {
            e.toString();
        }




    }
    public static void displayErning ( )
    {
        System.out.println(" enter id for Employee ");
        Scanner in = new Scanner(System.in);
        int id;
        id=in.nextInt();
        if (d.searchEmplyee(id) instanceof SalaredEmployee)
        {
            System.out.println(((SalaredEmployee) d.searchEmplyee(id)).earning());
        }
        else if (d.searchEmplyee(id) instanceof HourlyEmployee) {
            System.out.println(((HourlyEmployee) d.searchEmplyee(id)).earning());

        }
        else if (d.searchEmplyee(id) instanceof CommissionEmplyee)
        {
            System.out.println( ((CommissionEmplyee) d.searchEmplyee(id)).earning());

        }
        else {
            System.out.println("Employee is not found ");
        }

    }

    public static void removeEmployee( )
    {
        System.out.println("enter id for Employee that you want to remove from system :-  ");
        Scanner in = new Scanner(System.in);
        try {
            int id ;
            id=in.nextInt();

            d.removeEmployee(id );

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(" Enter Valid integer number ");
        }
    }

    public static void change_data  ( )
    {


        System.out.println("what the type of emplyee that you want to change ");
        System.out.println("1- Salaried Employee ");
        System.out.println("2- Commission  Employee ");
        System.out.println("3- Hourly Employee ");

        Scanner in = new Scanner(System.in);
        try
        {


        int choseeOptin;  // this to get chose option for the type of employee
        choseeOptin = in.nextInt();

        System.out.println("enter  id for user ");
        int id = in.nextInt();
        // check if  data base  if empty or not
        if (d.isDatabaseEmpty())
        {
            if (d.checkIfEmplyeeExist(id))
            {
                switch (choseeOptin)
                {

                    case 1:
                        if (d.searchEmplyee(id)instanceof SalaredEmployee)
                        {
                            System.out.println("what you want to change ");
                            System.out.println("1-Salary ");
                            System.out.println("2-Bones ");
                            System.out.println("3-deductions ");
                            int chosedNumber ;   // this to get chose option from user

                            chosedNumber= in.nextInt();

                            if (chosedNumber==1)
                            {

                                System.out.println("enter new salary ");
                                double salary = in.nextDouble();

                                ((SalaredEmployee) d.searchEmplyee(id)).setSalary(salary);

                            }

                            else if (chosedNumber==2)
                            {
                                System.out.println(" enter new bones ");
                                double bones = in.nextDouble();

                                ((SalaredEmployee) d.searchEmplyee(id)).setBounes(bones);

                            }
                            else if (chosedNumber==3)
                            {
                                System.out.println("enter new deductions ");
                                double deductions = in.nextDouble();
                                ((SalaredEmployee)d.searchEmplyee(id)).setDeductions(deductions);


                            }
                            else
                            {
                                System.out.println("enter valid Number 1 or 2 or 3");
                            }
                        }
                        else
                        {
                            System.out.println(" the Employee id that you entered is not salaried employee  ");
                        }

                        break;


                    case 2:
                        if ( (d.searchEmplyee(id)instanceof CommissionEmplyee))
                      {

                        System.out.println(" what you want to change ");
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("1-grossSales ");
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("2-commission Rate ");
                        System.out.println("-------------------------------------------------------------------------");

                        int chosedNumber2 ;   // this to get chose option from user

                        chosedNumber2= in.nextInt();
                        if (chosedNumber2==1)
                        {
                            System.out.println("enter new grossSales ");
                            double grossSales = in.nextDouble();
                            ((CommissionEmplyee)d.searchEmplyee(id)).setGrossSales( grossSales);

                        }
                        else if(chosedNumber2==2)
                        {

                            System.out.println(" enter new commissionRate ");
                            double commissionRate = in.nextDouble();
                            ((CommissionEmplyee)d.searchEmplyee(id)).setCommissionRate(commissionRate);

                        }
                        else
                        {
                            System.out.println("enter valid number 1 or 2 only ");
                        }
                      }
                        else
                        {
                            System.out.println(" the Employee id that you entered is not commission employee ");
                        }


                        break;

                    case 3:
                        if ( (d.searchEmplyee(id)instanceof HourlyEmployee))
                        {
                            System.out.println(" what you want to change ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("1- hourRate");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("2- NumberOfHours  ");
                            System.out.println("-------------------------------------------------------------------------");
                            int chosedNumber3 ;   // this to get chose option from user

                            chosedNumber3= in.nextInt();
                            if (chosedNumber3==1)
                            {
                                System.out.println(" enter new hourRate ");
                                double hourRate = in.nextDouble();
                                ((HourlyEmployee)d.searchEmplyee(id)).setHourRate(hourRate);

                            }
                            else if(chosedNumber3==2)
                            {
                                System.out.println(" enter new numberOfHours  ");
                                int  numberOfHours = in.nextInt();
                                ((HourlyEmployee)d.searchEmplyee(id)).setNumberOfHours(numberOfHours);

                            }
                            else
                                System.out.println("enter valid number 1 or 2  only ");
                        }
                        else
                            System.out.println("the Employee id that you entered is not hourly  employee");

                        break;



                }

            }
            else
            {
                System.out.println(" Employee is not found !!!!!!!! ");
            }

        }
        else
        {
            System.out.println( " Data base is empty !!!!!!!!!! ");

        }

        }
        catch (InputMismatchException e)
        {
            System.out.println( e.toString() );

        }







    }








    public static void main(String[] args) {

     RunAPP();





    }
}