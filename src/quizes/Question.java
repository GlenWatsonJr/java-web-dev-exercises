package quizes;

abstract class Question {

    private int questionNumber;
    private static int nextQuestion = 1;
    private String question;
    private String correctAnswer;

    public Question(){
        this.questionNumber = this.nextQuestion;
        this.nextQuestion++;
    }

    public Question (String question, String correctAnswer){
        this();
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    abstract void printQuestion();
}
