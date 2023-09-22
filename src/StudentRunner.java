public class StudentRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Allen", 11, 90.7, "Mr. Miller");
        student1.introduceStudent();
        student1.printStudentInfo();
        student1.printStudentTeacher();

        Student student2 = new Student("Tafsi", 11, 100, "Mr. Miller");
        student2.introduceStudent();
        student2.printStudentInfo();
        student2.printStudentTeacher();
    }
}
