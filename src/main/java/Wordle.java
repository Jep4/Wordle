import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Wordle {
    public static void main (String[] args){
        String[] words = {"21+3=24", "41+2=43"};
        String answer = words[(int)(Math.random() * words.length)];
        String guess = "";

        Scanner inputText = new Scanner (System.in);
        final int LENG = 7;
        final int MAXTRY = 5;
        int currentTry = 0;

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");


        while(guess != answer && currentTry<MAXTRY){
            currentTry++;
            System.out.println("Try "+ currentTry + ": Guess it");

            char[] ans = {};
                System.out.println("Put a equation");
                System.out.println("Length : 7");
                guess = inputText.nextLine();

                if (guess.length()==7){


                for(int i = 0; i <LENG; i++){
                    if(guess.charAt(i) == answer.charAt(i)){
                        System.out.println(i + ": right");
                    }
                    else{
                        boolean ifThere = false;

                        for (int j = 0 ; j < LENG; j++){
                            if(guess.charAt(i)==answer.charAt(j)){
                                 ifThere = true;

                            }

                            }


                        if(ifThere){
                            System.out.println(i + ": there is");

                        }
                        else{
                            System.out.println(i + ": not there");

                        }
                    }
                }

                }
                else{
                    System.out.println("enter 7 numbers");
                }

            System.out.println(ans);

        }
    }
}
