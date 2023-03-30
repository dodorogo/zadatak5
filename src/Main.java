import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Evidencija evidencija = new Evidencija();

        while (true) {
            System.out.println("\nChoose:");
            System.out.println("1 - Add new student");
            System.out.println("2 - Search student");
            System.out.println("3 - Print all students");
            System.out.println("4 1- Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Firstname:");
                    String firstName = scanner.nextLine();

                    System.out.println("Lastname:");
                    String lastName = scanner.nextLine();

                    System.out.println("Year of collegge:");
                    int yearOfCollege = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Index number:");
                    String indexNumber = scanner.nextLine();

                    Student student = new Student(firstName, lastName, yearOfCollege, indexNumber);
                    evidencija.addStudent(student);

                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.print("Index number: ");
                    String index = scanner.next();

                    Student s = evidencija.findStudent(index);
                    if (s != null) {
                        System.out.println(s.getFirstName() + " " + s.getLastName() + ", " + s.getYearOfCollege() + ". year");
                    } else {
                        System.out.println("Student with index number " + index + " doesn't exist!");
                    }
                    break;

                case 3:
                    evidencija.writeAllStudent();
                    break;

                case 4:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Incorrect selection!");
                    break;
            }
        }

    }
}