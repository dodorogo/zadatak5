import java.util.ArrayList;

public class Evidencija {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student findStudent(String indexNumber) {
        for (Student student : studentList) {
            if (student.getIndexNumber().equals(indexNumber)) {
                return student;
            }
        }
        return null;
    }

    public void writeAllStudent() {
        for (Student student : studentList) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ", year of college: " + student.getYearOfCollege()
                    + ", index number: " + student.getIndexNumber());
        }
    }
}
