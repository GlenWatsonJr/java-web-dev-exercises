package exercieses;

import java.util.Scanner;

public class Alice2 {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search Word: ");
        String searchPram = input.nextLine();
        alice = alice.toLowerCase();
        searchPram = searchPram.toLowerCase();
        boolean isThere = alice.contains(searchPram);
        if (isThere) {
            System.out.println(alice.indexOf(searchPram) + " " + searchPram.length());
            String[] strArr = alice.split(searchPram + " ");
            String newAlice = "";
            for (int i=0; i < strArr.length; i++){
                newAlice += strArr[i];
            }
            System.out.println(newAlice);
        }
    }
}
