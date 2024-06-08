import java.util.*;

public class votingService implements VotingServiceInterface
{
    public Question question;
    public Map<String, String> submittedAnswers;

    public votingService(Question question, List<String> studentAnswer, boolean multChoiceType)
    {
        this.question = question;
        submittedAnswers = new HashMap<>();

        if(multChoiceType)
        {
            question.studentAnswer=studentAnswer;
        }
    }

    public void studentSubmission(Student student, String answer)
    {
        submittedAnswers.put(student.getStudentID(), answer);
    }

    public void results()
    {
        Map<String, Integer> answerCounts = new HashMap<>();
        List<String> studentAnswer = question.getStudentAnswer();

        for(String answer : studentAnswer)
        {
            answerCounts.put(answer, 0);
        }

        for(String answerChoice : submittedAnswers.values())
        {
            answerCounts.put(answerChoice, answerCounts.get(answerChoice) + 1);
        }

        for (String answer : studentAnswer)
        {
            System.out.println(answer + ": " + answerCounts.get(answer));
        }
    }

}