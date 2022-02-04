package quizes;

import java.util.ArrayList;
import java.util.Random;

public class MultipleChoice extends Question{

    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;

    public MultipleChoice(String question, String correctAnswer, String incorrect1, String incorrect2, String incorrect3 ){
        super(question, correctAnswer);
        ArrayList<String> randomizer = new ArrayList<String>();
        randomizer.add(correctAnswer);
        randomizer.add(incorrect1);
        randomizer.add(incorrect2);
        randomizer.add(incorrect3);
        Random rand = new Random();
        int randomChoice = rand.nextInt(3);
        this.choiceA = randomizer.get(randomChoice);
        randomizer.remove(randomChoice);
        randomChoice = rand.nextInt(2);
        this.choiceB = randomizer.get(randomChoice);
        randomizer.remove(randomChoice);
        randomChoice = rand.nextInt(1);
        this.choiceC = randomizer.get(randomChoice);
        randomizer.remove(randomChoice);
        this.choiceD = randomizer.get(0);
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }

    public void printQuestion(){
        System.out.println(super.getQuestionNumber() + ": " + this.getQuestion());
        System.out.println("A: " + this.choiceA);
        System.out.println("B: " + this.choiceB);
        System.out.println("C: " + this.choiceC);
        System.out.println("D: " + this.choiceD);
    }
}
