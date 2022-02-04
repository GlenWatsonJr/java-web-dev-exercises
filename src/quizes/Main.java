package quizes;

public class Main {
    public static void main(String[] args) {
        MultipleChoice questionOne = new MultipleChoice("Who is Mario?", "Mario", "Luigi", "Daisy", "Peach");


        questionOne.printQuestion();
        System.out.println("Correct Choice: " + questionOne.getCorrectAnswer());


    }
}
