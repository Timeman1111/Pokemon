public class Pokemon {
    //all the pokemons stats and typing
    private int health;
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
    public void birth(int hp, int atk, int def, int spatk, int spdef, int spd, String type1, String type2){
        //sets all the stats
        health = hp;
        attack = atk;
        defense = def;
        specialAttack =spatk;
        specialDefense = spdef;
        speed = spd;
        typing1 = type1;
        typing2 = type2;
    }

    //public int get



}
