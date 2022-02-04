package quizes;

public class TrueFalse extends Question {

    public TrueFalse(String question, String correctAnswer){
        super(question, correctAnswer);
    }

    public void printQuestion(){
        System.out.println(super.getQuestionNumber() + ": " + this.getQuestion() + " (True/False)");
    }

}
