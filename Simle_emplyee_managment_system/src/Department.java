import java.util.ArrayList;

public class Department {

    private int deprtNumber ;
    private String departName;
    private ArrayList <Emplyee> emplyeeArrayList;


    public Department(String departName, int deprtNumber) {
        this.departName = departName;
        this.deprtNumber = deprtNumber;
        emplyeeArrayList =new ArrayList<Emplyee>();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public int getDeprtNumber() {
        return deprtNumber;
    }

    public void setDeprtNumber(int deprtNumber) {
        this.deprtNumber = deprtNumber;
    }

    public void addEmployee(Emplyee e)
    {
        try
        {
            emplyeeArrayList.add(e);
            System.out.println(" >>>>>>> Employee add to system successfully <<<<<<<<  ");
            System.out.println();

        }
        catch (Exception ex)
        {
            ex.printStackTrace();

        }



    }
    public void removeEmployee(int index )
    {

        try
        {

            emplyeeArrayList.remove(index-1);
            System.out.println(" employee removed from system successfully ");
            System.out.println();
        }
        catch(Exception ex)

        {

            ex.printStackTrace();
            System.out.println(" the id that you entered is not exist in system ");
            System.out.println();
        }

    }
    public Object searchEmplyee (int index )
    {
        try
        {
            return ((emplyeeArrayList.get(index-1)));
        }

        catch (IndexOutOfBoundsException ex  )
        {
            ex.getMessage();
            return ex;
        }


    }
    public void dissplayNumberOfEmplyee()
    {

        System.out.println("Number of employee is " + emplyeeArrayList.size());

    }

    public boolean isDatabaseEmpty()
    {

        if (emplyeeArrayList.isEmpty())
        {
            return false ;
        }


        else
        {
            return true;
        }

    }
    public boolean checkIfEmplyeeExist(int index)
    {
        try {
            return emplyeeArrayList.contains(emplyeeArrayList.get(index-1));
        }
        catch (IndexOutOfBoundsException ex)
        {
            ex.getMessage();
            return false;
        }

    }







}
