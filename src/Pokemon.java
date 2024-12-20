public class Pokemon {
    //all the pokemons stats and typing
    private int level;
    private int maxHealth;
    private int currentHealth;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private String typing1;
    private String typing2;
    //stat boosts up to
    private double[] boost = new double [7];

    /*private int atkBoost;
    private int defBoost;
    private int spatkBoost;
    private int spdefBoost;
    private int speedBoost;
    private int accBoost;
    private int evaBoost;*/

    // default no gender 1 is female 2 is male
    private int gender;


//makes new pokemon
    public Pokemon (int lvl, int hp, int atk, int def, int spatk, int spdef, int spd, String type1, String type2){
        //sets all the base stats
        level = lvl;
        //converts the base stats to actual stats
        maxHealth = 2*hp*lvl/100+lvl+10;
        currentHealth = maxHealth;
        attack = 2*atk*lvl/100;
        defense = 2*def*lvl/100;
        specialAttack = 2*spatk*lvl/100;
        specialDefense = 2*spdef*lvl/100;
        speed = 2*spd*lvl/100;
        //sets the types
        typing1 = type1;
        typing2 = type2;
    }

    //getters
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getCurrentHealth(){
        return currentHealth;
    }
    public int getLevel(){
        return level;
    }
    public int getAttack() {

        // gets the attack stat of a pokemon
        if (boost[0] >= 0) {
            if (boost[0] > 6) {
                boost[0] = 6;
            }
            return (int) (attack * (1 + boost[0] * 0.5));
        }
        if (boost[0] < -6) {
            boost[0] = -6;
        }
        return (int) (attack / (1 + boost[0] * 0.5));
    }
    public int getDefense() {
        // gets the defense stat of a pokemon
        if (boost[1] >= 0) {
            if (boost[1] > 6) {
                boost[1] = 6;
            }
            return (int) (defense * (1 + boost[1] * 0.5));
        }
        if (boost[1] < -6) {
            boost[0] = -6;
        }
        return (int) (defense / (1 + boost[1] * 0.5));
    }
    public int getSpecialAttack() {
        // gets the special attack stat of a pokemon
        if (boost[2] >= 0) {
            if (boost[2] > 6) {
                boost[2] = 6;
            }
            return (int) (specialAttack * (1 + boost[2] * 0.5));
        }
        if (boost[2] < -6) {
            boost[2] = -6;
        }
        return (int) (specialAttack / (1 + boost[2] * 0.5));
    }
    public int getSpecialDefense() {
        // gets the Specail defense stat of a pokemon
        if (boost[3] >= 0) {
            if (boost[3] > 6) {
                boost[3] = 6;
            }
            return (int) (specialDefense * (1 + boost[3] * 0.5));
        }
        if (boost[3] < -6) {
            boost[3] = -6;
        }
        return (int) (specialDefense / (1 + boost[3] * 0.5));
    }
    public int getSpeed() {
        // gets the speed stat of a pokemon
        if (boost[4] >= 0) {
            if (boost[4] > 6) {
                boost[4] = 6;
            }
            return (int) (speed * (1 + boost[4] * 0.5));
        }
        if (boost[4] < -6) {
            boost[4] = -6;
        }
        return (int) (speed / (1 + boost[4] * 0.5));
    }
    public int getAccBoost(){
        //returns the accuracy modifier
        if (boost[5] > 6)
            boost[5] = 6;
        else if (boost[5] < -6)
            boost[5] = -6;
        return (int) boost[5];
    }

    public int getEvaBoost(){
        //returns the evasion modifier
        if (boost[6] > 6)
            boost[6] = 6;
        else if (boost[6] < -6)
            boost[6] = -6;
        return (int) boost[6];
    }

    public String getTyping1(){
        //returns the 1st type of the pokemon
        return typing1;
    }
    public String getTyping2() {
        //returns the 2nd type of the pokemon
        return typing2;
    }

    //0 is attack 1 is defense 2 is special attack 3 is special defense 4 is speed 5 is accuracy 6 is evasion
    public void statBoost(int stages, int stat) {
        boost[stat] += stages;
    }
    //sets the current health
    public void setCurrentHealth(int newHealth) {
        currentHealth = newHealth;
    }
}
