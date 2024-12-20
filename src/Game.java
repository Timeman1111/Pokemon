public class Game {



    private Player player;

    public Game(Pokemon pokemon){

    }

    public Game(){

        assignPokemon();
    }

    // Clears terminal screen (DOES NOT WORK IN INTELLIJ)
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //  Delays code execution
    public static void delay(int milliseconds){
        try {
           Thread.sleep(milliseconds);
       }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }


    // Writes out the intro
    public static void playIntro(){
        clearScreen();

        String line = "Welcome to our Pokemon " + Colors.formatText("(unofficial)", Colors.RED) + " Battle Simulator!";
        System.out.println(line);

        delay(2000);

        line = "\nBy: Ethan Small & " + Colors.rainbowColor("Eden Chung");
        System.out.println(line);

        delay(5000);

    }

    public void assignPokemon(){
        clearScreen();

        String line = "Now you need a pokemon!";
        line = Colors.formatText(line, Colors.RED);
        System.out.println(line);



    }
}
