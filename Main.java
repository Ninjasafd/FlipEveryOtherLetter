import java.util.*;

/**
 * @author  Jeffrey Pan
 * @brief   This class just pulls in a string from a user and then flips every letter so that it becomes a pattern of 
 *          [lowerCase, upperCase, lowerCase,upperCase,...] that resets after every space or new word.
 */
public class Main {
    public static void main(String args[]){
        System.out.println("Starting Program");
        Scanner console = new Scanner(System.in);
        String text = getString(console);
        text = flipEveryOtherLetter(text);
        System.out.println(text);
    }

    /**
     * Gets the input from the user 
     * 
     * @param console   Scanner that's passed in
     * @return <string> Value passed in by the user
     */
    public static String getString(Scanner console){
        System.out.println("What would you like to flip?");
        String convert = console.nextLine();
        return convert;
    }

    /**
     * Trims the spaces and then flips every other letter in txt
     * @param txt   String that the user entered
     * @return  <string> String with all the flipped letters
     */
    public static String flipEveryOtherLetter(String txt){
        txt = txt.trim();
        String finalStr = "";
        boolean lowerCase = true;

        for (int i = txt.length() - 1; i >=0; --i){
            if (Character.isLetter(txt.charAt(i))){
                char ch = txt.charAt(i);
                finalStr = lowerCase ? Character.toUpperCase(ch) + finalStr : Character.toLowerCase(ch) + finalStr;
                lowerCase = !lowerCase;
            }
            else if (txt.charAt(i) == ' '){
                finalStr = ' ' + finalStr;
                lowerCase = true;
            }
            else{
                finalStr = txt.charAt(i) + finalStr;
            }
        }
        
        return finalStr;
    }

   

}


