import java.util.Scanner;

public class Battle {
    private Pokemon playerPokemon;
    private Pokemon enemyPokemon;

    public Battle(Pokemon playerPokemon, Pokemon enemyPokemon){
        this.playerPokemon = playerPokemon;
        this.enemyPokemon = enemyPokemon;

    }

    public Battle(){
        this.playerPokemon = generatePokemon();
        this.enemyPokemon = generatePokemon();

    }

    // Creates a new pokemon
    public Pokemon generatePokemon(){


        return new Pokemon(1, 100, 5, 5, 5, 5, 5, "water", "void");
    }

    // Returns current player pokemon
    public Pokemon getPlayerPokemon(){

        return playerPokemon;
    }


    // Returns current enemy pokemon
    public Pokemon getEnemyPokemon(){

        return enemyPokemon;
    }


    public void printHP(){
        System.out.println("[ENEMY ]: 100");
        System.out.println("[PLAYER]: 100");
    }

    public void spacer(){
        System.out.println(" ");
    }
    public void printOptions(){
        System.out.println("Pick an option");
        System.out.println("[1] Fight");
        System.out.println("[2] Run");
        System.out.println("[3] Exit");

    }
    // Main runtime of battle
    public void start(){

        Scanner keyboard = new Scanner(System.in);
        while (true){
            printHP();
            spacer();
            printOptions();
            int playerInput = keyboard.nextInt();

            if (playerInput == 1){

                System.out.println("YOU'RE COOKED BUDDY");
            }

            if (playerInput == 2){

                System.out.println("MADE A SMART DECISION FOR ONCE");
            }

            if (playerInput == 3){

                System.out.println("OOH PUSSY");
                break;
            }

            spacer();



        }

    }



}
