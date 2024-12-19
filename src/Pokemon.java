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
        if (defBoost > 6)
            defBoost = 6;
        return defense * defBoost;
    }

    public int getSpecialAttack(){
        if (spatkBoost > 6)
            spatkBoost = 6;
        return specialAttack * spatkBoost;
    }

    public int getSpecialDefense(){
        if (spdefBoost > 6)
            spdefBoost = 6;
        return specialDefense * spdefBoost;
    }
    public int getSpeed(){
        if (speedBoost > 6)
            speedBoost = 6;
        return speed * speedBoost;
    }



}
