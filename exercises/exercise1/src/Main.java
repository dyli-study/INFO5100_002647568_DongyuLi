import java.util.*;

public class Main {

    public static void main(String[] args){
        Session session = new Session();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            PartTimeStudent student = new PartTimeStudent ("Part-time Student " + i);
            for (int j = 0; j < 15; j++) {
                student.addQuizScore((int) (Math.random() * 100));
            }
            session.addStudent(student);
        }

        // Create 10 full-time students
        for (int i = 1; i <= 10; i++) {
            FullTimeStudent student = new FullTimeStudent("Full-time Student " + i);
            for (int j = 0; j < 15; j++) {
                student.addQuizScore((int) (Math.random() * 100));
            }
            student.setExamScore1((int) (Math.random() * 100));
            student.setExamScore2((int) (Math.random() * 100));
            session.addStudent(student);
        }

        System.out.println("Average score: ");
        session.averageScore();
        System.out.println("Quiz scores in ascending order: ");
        session.printQuizScore();
        System.out.println("Part-time student:");
        session.printPartTimeStudent();
        System.out.println("Full-time student exam scores:");
        session.printFullTimeStudentScores();
    }
}
