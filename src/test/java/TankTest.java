import behaviours.IDamage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    IDamage iDamage;

    @Before
    public void setUp() throws Exception {
        tank = new Tank("Sherman", 100, 125);
    }

    @Test
    public void canAttack() {
        assertEquals( "I've suffered ", tank.attack(iDamage));
    }

    @Test
    public void canTakeDamage() {
        tank.takeDamage(5);
        assertEquals( 95,  tank.getHealthValue());
    }
}
