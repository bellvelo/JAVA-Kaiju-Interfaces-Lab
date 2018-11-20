import behaviours.IDamage;

public class Tank extends Vehicle {

    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }

    public String attack(IDamage idamage) {
        return "I've suffered " + idamage;
    }
}
