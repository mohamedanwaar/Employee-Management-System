public class PersonallInformation {
    String  firstName;
    String middleName;
    String LastName;
    String nationality;
    final  int  SSN;
    int YearOfBirth;



    public PersonallInformation(String firstName, String middleName, String lastName, String nationality, final int SSN, int yearOfBirth) {
        this.middleName = middleName;
        this.YearOfBirth = yearOfBirth;
        this.SSN = SSN;
        this.LastName = lastName;
        this.nationality = nationality;
        this.firstName = firstName;
    }
    public PersonallInformation() {
        SSN=0;
    }

    // fun to print info for any emplyee


    @Override
    public String toString() {
        return "PersonallInformation{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", SSN=" + SSN +
                ", YearOfBirth=" + YearOfBirth +
                '}';
    }
}
