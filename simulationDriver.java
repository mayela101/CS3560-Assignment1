import java.util.*;

public class simulationDriver
{
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        List<String> studentAnswer = new ArrayList<>();
        boolean multChoiceType;

        System.out.println("Choose a type of question:");
        System.out.println("1. Multiple Choice");
        System.out.println("2. Right/Wrong");

        int questionType = scanner.nextInt();



        if(questionType==1)
        {
            studentAnswer.add("A");
            studentAnswer.add("B");
            studentAnswer.add("C");
            studentAnswer.add("D");

            multChoiceType = true;
        } 
        else
        {
            studentAnswer.add("Right");
            studentAnswer.add("Wrong");

            multChoiceType = false;
        }

        Question question = new Question("Please select your answer from the following choices.", "multiple-choice", studentAnswer);
        votingService votingService = new votingService(question, studentAnswer, multChoiceType);

        Random random = new Random();
        int numStudents = random.nextInt(50) + 1;

        for(int i = 0;i<numStudents;i++)
        {
            String studentID = "Student" + (i+5);
            Student student = new Student(studentID);

            String randomAnswer = studentAnswer.get(random.nextInt(studentAnswer.size()));
            student.answerChoice(randomAnswer);

            votingService.studentSubmission(student, student.getAnswerChoice());
        }

        votingService.results();
    }
}