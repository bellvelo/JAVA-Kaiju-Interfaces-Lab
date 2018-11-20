import behaviours.IDamage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KingGizzardTest {

    KingGizzard kingGizzard;
    IDamage iDamage;

    @Before
    public void setUp() throws Exception {
        kingGizzard = new KingGizzard("Dave", 100, 100);
    }

    @Test
    public void canRoar() {
        assertEquals( "I'm King Gizzard, hear me RRRROOOOOAAAAARR!", kingGizzard.roar());
    }

    @Test
    public void canDoMove() {
        assertEquals("Karate-Chop!" , kingGizzard.move());
    }

    @Test
    public void canAttack() {
        assertEquals( "I've suffered ", kingGizzard.attack(iDamage));
    }

    @Test
    public void canTakeDamage() {
        kingGizzard.takeDamage(5);
        assertEquals( 95,  kingGizzard.getHealthValue());
    }


}
