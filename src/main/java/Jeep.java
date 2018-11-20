import behaviours.IDamage;

public class Jeep extends Vehicle {

    public Jeep(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }


    public String attack(IDamage idamage) {
        return "I've suffered " + idamage;
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue(healthValue - damage);
    }
}
