public class Student {
    private String name;
    private int grade;
    private double gpa;

    private String teacher;

    // constructor
    public Student(String studentName, int studentGrade, double studentGpa, String studentTeacher) {
        name = studentName;
        grade = studentGrade;
        gpa = studentGpa;
        teacher = studentTeacher;
    }


    public void introduceStudent() {
        System.out.println("Hello, my name is " + name);
    }



    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Gpa: " + gpa);
    }


    public void printStudentTeacher() {
        System.out.print("Teacher: " + teacher);
    }
}


