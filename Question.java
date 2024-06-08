import java.util.*;

public class Question implements QuestionInterface
{
    String question, choiceType;
    List<String> studentAnswer;

    public Question(String question, String choiceType, List<String> studentAnswer)
    {
        this.question = question;
        this.choiceType = choiceType;
        this.studentAnswer = studentAnswer;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getChoiceType()
    {
        return choiceType;
    }

    public List<String> getStudentAnswer()
    {
        return studentAnswer;
    }
}