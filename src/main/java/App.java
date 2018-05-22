import models.FindReplace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args){

        System.out.println("Enter a sentence");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String inputSentence = bufferedReader.readLine();
            System.out.println("Choose a word to replace");
            String inputTarget = bufferedReader.readLine();
            System.out.println("Choose a replacement word");
            String inputReplacement = bufferedReader.readLine();

            FindReplace game = new FindReplace();
            System.out.println("Here's your result: " + game.replace(inputSentence, inputTarget, inputReplacement));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
