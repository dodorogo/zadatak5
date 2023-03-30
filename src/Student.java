public class Student {
    private String firstName;
    private String lastName;
    private int yearOfCollege;
    private String indexNumber;

    public Student(String firstName, String lastName, int yearOfCollege, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfCollege = yearOfCollege;
        this.indexNumber = indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfCollege() {
        return yearOfCollege;
    }

    public void setYearOfCollege(int yearOfCollege) {
        this.yearOfCollege = yearOfCollege;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
