import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colors {

    // Define colors
    public static final String BLACK = "\u001B[31m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // Reset to white
    public static final String ANSI_RESET = "\u001B[0m";

    // Define background colors
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";


    // Define string bolds, italics, etc

    public static final String BOLD = "\u001b[1m";
    public static final String ITAlICIZE = "\u001b[3m";

    // Return the string with the formatted color
    public static String formatText(String x, String color){

        return color + x + ANSI_RESET;
    }

    // Return the string with the formatted color and formatted background
    public static String formatText(String x, String color, String backgroundColor){

        return backgroundColor + color + x + ANSI_RESET;
    }

    public static String boldText(String x){

        return BOLD + x + ANSI_RESET;
    }

    public static String italicize(String x){

        return ITAlICIZE + x + ANSI_RESET;
    }

    public static String underline(String x){

        return ITAlICIZE + x + ANSI_RESET;
    }


    // Choose a random color
    private static String randomColor(){

        int choice = (int) (6*Math.random() + 1);

        return switch (choice) {
            case 1 -> Colors.RED;
            case 2 -> Colors.GREEN;
            case 3 -> Colors.YELLOW;
            case 4 -> Colors.BLUE;
            case 5 -> Colors.PURPLE;
            case 6 -> Colors.CYAN;
            default ->
                // THIS SHOULD NEVER RUN BTW
                Colors.RED;
        };

    }

    public static String rainbowColor(String s){
        StringBuilder result = new StringBuilder();

        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            result.append(randomColor());
            result.append(currentChar);

        }
        result.append(ANSI_RESET);
        // Convert the StringBuilder back to a string and return
        return result.toString();
    }
}
