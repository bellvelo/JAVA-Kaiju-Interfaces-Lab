import behaviours.IDamage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeepTest {

    Jeep jeep;
    IDamage iDamage;

    @Before
    public void setUp() throws Exception {
        jeep = new Jeep("Wrangler", 50, 75);
    }

    @Test
    public void canAttack() {
        assertEquals( "I've suffered ", jeep.attack(iDamage));
    }

    @Test
    public void canTakeDamage() {
        jeep.takeDamage(5);
        assertEquals( 45,  jeep.getHealthValue());
    }
}
