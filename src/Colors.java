public class Colors {

    public static final String BLACK = "\u001B[31m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static String formatText(String x, String color){

        return color + x + ANSI_RESET;
    }
}
