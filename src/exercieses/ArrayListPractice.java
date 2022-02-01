package exercieses;


import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            intList.add(i);
        }
        System.out.println(intList);
        System.out.println(addEven(intList));
        ArrayList<String> letterList = new ArrayList<>(Arrays.asList("a", "b","c","d","e"));
        System.out.println(getWords(letterList));
        String sentence = "I would not could not in a box I would not could not with a fox I will not eat them in a " +
                "house I will not eat them with a mouse";
        System.out.println(printWords(sentence, 3));
    }
    public static int addEven(ArrayList<Integer> list) {
        int returnInt = 0;
        for (Integer aint : list){
            if (aint % 2 == 0){
                returnInt += aint;
            }
        }
        return returnInt;
    }
    public static ArrayList<String> printWords(String words, int wordSize){
        String[] arr = words.split(" ");
        ArrayList<String> parseArr = new ArrayList<>();
        ArrayList<String> returnArr2 = new ArrayList<>();
        for (String word : arr){
            parseArr.add(word);
        }
        for (String elem : parseArr){
            if(elem.length() == wordSize){
                returnArr2.add(elem);
            }
        }
        return returnArr2;

    }
    public static ArrayList<String> getWords(ArrayList<String> letters) {
        ArrayList<String> returnArr = new ArrayList<>();
        String moved = "";
        for (int i = 0; i < 5; i++) {
            String word = "";
            for (String letter : letters) {
                word += letter;
            }
            returnArr.add(word);
            moved = letters.get(0);
            letters.remove(0);
            letters.add(moved);
        }
        return returnArr;
    }
}
