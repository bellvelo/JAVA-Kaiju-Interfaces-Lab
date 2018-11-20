import behaviours.IDamage;

public class LizzardWizzard extends Kaiju {

    public LizzardWizzard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "I'm Lizzard Wizzard, ROAR, ROAR, ROAR etc...";
    }

    public String move() {
        return "Windmill!";
    }

    public String attack(IDamage idamage) {
        return "I've suffered " + idamage;
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }
}
