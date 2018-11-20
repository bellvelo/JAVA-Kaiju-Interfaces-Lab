import behaviours.IDamage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LizzardWizzardTest {

    LizzardWizzard lizzardWizzard;
    IDamage iDamage;

    @Before
    public void setUp() throws Exception {
        lizzardWizzard = new LizzardWizzard("Frank", 50, 75);
    }

    @Test
    public void canRoar() {
        assertEquals( "I'm Lizzard Wizzard, ROAR, ROAR, ROAR etc...", lizzardWizzard.roar());
    }

    @Test
    public void canDoMove() {
        assertEquals("Windmill!" , lizzardWizzard.move());
    }

    @Test
    public void canAttack() {
        assertEquals( "I've suffered ", lizzardWizzard.attack(iDamage));
    }

    @Test
    public void canTakeDamage() {
        lizzardWizzard.takeDamage(5);
        assertEquals( 45,  lizzardWizzard.getHealthValue());
    }
}
