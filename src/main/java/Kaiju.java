import behaviours.IAttack;
import behaviours.IDamage;

public abstract class Kaiju implements IAttack, IDamage {

    private String name;
    private int healthValue;
    private int attackValue;


    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String roar();

    public abstract String move();

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public void setName(String name) {
        this.name = name;
    }
}
