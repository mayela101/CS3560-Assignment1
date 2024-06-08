import java.util.*;

public class Student implements StudentInterface
{
    String studentID, answerChoice;


    public Student(String studentID)
    {
        this.studentID = studentID;
    }

    public void answerChoice(String answer)
    {
        this.answerChoice = answer;
    }   

    public String getStudentID()
    {
        return studentID;
    }

    public String getAnswerChoice()
    {
        return answerChoice;
    }

}