package edu.vassar.cmpu203.datingsim;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import edu.vassar.cmpu203.datingsim.model.Character;
import java.util.ArrayList;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CharacterTest {
    /**
     * Tests getName() by getting name and testing to make sure it's right
     */
    @Test
    public void testGetName() {
        List<String> tested = new ArrayList<>();
        Character teste = new Character("Teste", 0, tested, 10, 0);
        assertTrue(teste.getName().equals("Teste"));

    }

    @Test
    public void testSetAffection() {
        List<String> tested = new ArrayList<>();
        Character teste = new Character("Teste", 0, tested, 10, 0);
        assertEquals(teste.setAffection(14), 14);

    }

}