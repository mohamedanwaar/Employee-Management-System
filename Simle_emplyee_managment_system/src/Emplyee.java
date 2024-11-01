public abstract class Emplyee {
   private PersonallInformation personalInfo;
   static int  index=1;
   int id ;


    public Emplyee(String firstName,String middleName,String lastName,String nationality,final int SSN,int yearOfBirth) {
         this.personalInfo =new PersonallInformation(firstName, middleName, lastName, nationality, SSN ,yearOfBirth);
         this.id=index;
         index++;

    }



    public abstract double earning ();


    @Override
    public String toString() {
        return "Emplyee{" +
                "id=" + id +
                ", personalInfo=" + personalInfo +
                '}';
    }
}
