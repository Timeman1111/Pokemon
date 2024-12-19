public class Game {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void delay(int milliseconds){
        try {
           Thread.sleep(milliseconds);
       }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public void playIntro(){
        clearScreen();
        String line = "Hello there!";
        line = Colors.RED + line + Colors.ANSI_RESET;

        System.out.println(line);

        delay(2000);

        line = "Welcome to our Pokemon (unofficial) Battle Simulator!";
        System.out.println(line);
    }
}
