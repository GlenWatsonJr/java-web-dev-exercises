package exercieses;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (Integer inta : someInts){
            System.out.println(inta);
        }
        String sentence = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] senArr = sentence.split(" ");
        System.out.println(Arrays.toString(senArr));
        String[] senArr2 = sentence.split("\\.");
        System.out.println(Arrays.toString(senArr2));

     }
}
