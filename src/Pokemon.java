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
    //stat boosts up to 6
    private int atkBoost;
    private int defBoost;
    private int spatkBoost;
    private int spdefBoost;
    private int speedBoost;
    private int accBoost;
    private int evaBoost;
    // default no gender 1 is female 2 is male
    private int gender;


//makes new pokemon
    public void birth(int lvl, int hp, int atk, int def, int spatk, int spdef, int spd, String type1, String type2){
        //sets all the stats
        maxHealth = hp;
        currentHealth = hp;
        attack = atk;
        defense = def;
        specialAttack =spatk;
        specialDefense = spdef;
        speed = spd;
        typing1 = type1;
        typing2 = type2;
    }


    public int getAttack(){
        // gets the attack stat of a pokeomn
        if(atkBoost > 6)
            atkBoost = 6;
        return attack * atkBoost;
    }

    public int getDefense(){
        //gets defense of a pokemon
        if (defBoost > 6)
            defBoost = 6;
        return defense * defBoost;
    }

    public int getSpecialAttack(){
        //gets special attack of a pokemon
        if (spatkBoost > 6)
            spatkBoost = 6;
        return specialAttack * spatkBoost;
    }

    public int getSpecialDefense(){
        //gets the special defnse of a pokemon
        if (spdefBoost > 6)
            spdefBoost = 6;
        return specialDefense * spdefBoost;
    }
    public int getSpeed(){
        //gets the speed of a pokemon
        if (speedBoost > 6)
            speedBoost = 6;
        return speed * speedBoost;
    }

    public int getAccBoost(){
        //returns the accuracy modifier
        if (accBoost > 6)
            accBoost = 6;
        return accBoost;
    }

    public int getEvaBoost(){
        //returns the evasion modifier
        if (evaBoost > 6)
            evaBoost = 6;
        return evaBoost;
    }

    public String getTyping1(){
        //returns the 1st type of the pokemon
        return typing1;
    }
    public String getTyping2(){
        //returns the 2nd type of the pokemon
        return typing2;
    }



}
