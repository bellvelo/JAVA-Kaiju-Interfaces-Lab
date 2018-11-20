import behaviours.IDamage;

public class KingGizzard extends Kaiju {


    public KingGizzard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }


    public String roar() {
        return "I'm King Gizzard, hear me RRRROOOOOAAAAARR!";
    }

    public String move() {
        return "Karate-Chop!";
    }

    public String attack(IDamage idamage) {
        return "I've suffered " + idamage;
    }


    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);

    }
    }



