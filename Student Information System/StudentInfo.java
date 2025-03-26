package StudentInfo;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        }
}
public class StudentInfo {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Aryan Pratap Singh", 101, 92.5);
        students[1] = new Student("Rahul Sharma", 102, 88.0);
        students[2] = new Student("Priya Verma", 103, 95.2);
        students[3] = new Student("Sneha Patel", 104, 89.7);
        students[4] = new Student("Rohan Gupta", 105, 91.3);

        System.out.println("Student Information System");
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}
