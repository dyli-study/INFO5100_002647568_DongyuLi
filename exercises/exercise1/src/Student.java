import java.util.Arrays;
import java.util.Random;

public class Student {
    String Name;
    String StudentType;
    int[] QuizScore;

    public Student(String Name, String StudentType){
        this.Name = Name;
        this.StudentType = StudentType;
        this.QuizScore = new int[15];
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStudentType() {
        return StudentType;
    }

    public void setStudentType(String studentType) {
        StudentType = studentType;
    }


    public int getAverQuizzesScore() {
        int sum =0;
        for(int a:QuizScore){
            sum += a;
        }
        return sum/15;
    }

    public void setQuizzesScore() {
        Random rand = new Random();
        for (int i = 0; i < QuizScore.length; i++) {
            QuizScore[i] = rand.nextInt(100);
        }
    }

    public int[] getAscQuiz(Student s){

        Arrays.sort(s.QuizScore);
        return s.QuizScore;
    }

}
class PartTimeStudent extends Student{
    public PartTimeStudent(String Name, String StudentType){
        super(Name, StudentType);
    }
}

class FullTimeStudent extends Student{
    public int ExamScore1;
    public int ExamScore2;

    public FullTimeStudent(String Name, String StudentType){
        super(Name, StudentType);
        this.ExamScore1 = ExamScore1;
        this.ExamScore2 = ExamScore2;
    }
}