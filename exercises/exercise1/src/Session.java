import java.util.*;
public class Session {
    private ArrayList<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverageQuizScore() {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            sum += student.calculateAverageQuizScore();
            count++;
        }
        return sum / count;
    }

    public void printQuizScores() {
        ArrayList<Integer> allQuizScores = new ArrayList<>();
        for (Student student : students) {
            allQuizScores.addAll(student.getQuizScore());
        }
        Collections.sort(allQuizScores);
        System.out.println("Quiz scores in ascending order:");
        System.out.println(allQuizScores);
    }

    public void printPartTimeStudentNames() {
        System.out.println("Part-time student names:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.getName());
            }
        }
    }

    public void printFullTimeStudentExamScores() {
        System.out.println("Full-time student exam scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println(fullTimeStudent.getName() + ": " + fullTimeStudent.getExamScore2() + ", " + fullTimeStudent.getExamScore2());
            }
        }
    }
}