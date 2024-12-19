public class Game {


    // Clears terminal screen (DOES NOT WORK IN INTELLIJ)
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //  Delays code execution
    public void delay(int milliseconds){
        try {
           Thread.sleep(milliseconds);
       }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }


    // Writes out the intro
    public void playIntro(){
        clearScreen();
        String line = "Hello there!";
        line = Colors.RED + line + Colors.ANSI_RESET;

        System.out.println(line);

        delay(2000);

        line = "Welcome to our Pokemon (unofficial) Battle Simulator!";
        System.out.println(line);

        delay(1000);

        line = "\nMade by Ethan Small & Eden Chung";
        System.out.println(line);
    }
}
