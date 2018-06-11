import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test for DependencyInjection class
 */
public class dependencyInjectionTest {

    /**
     * Test if 5.0 is the number returned from multipleNumber method
     */
    @Test
    public void multipleNumberPos() {
        dependencyInjection D = new dependencyInjection(5.0, new double[]{1.0, 2.5, 5.2});
        assertTrue(D.multipleNumber() == 5.0);
    }

    /**
     * Test if .05 is not returned from multipleNumber method
     */
    @Test
    public void MultipleNumberNeg(){
        dependencyInjection D = new dependencyInjection(5.0, new double[]{1.0, 2.5, 5.2});
        assertFalse(D.multipleNumber() == 0.5);
    }

    /**
     * Test if 13.7 is returned from addDoubleArray method
     */
    @Test
    public void addDoubleArrayPos() {
        dependencyInjection D = new dependencyInjection(5.0, new double[]{1.0, 2.5, 5.2});
        assertTrue(D.addDoubleArray() == 13.7);
    }

    /**
     * Test if 1.37 is not returned from addDoubleArray method
     */
    @Test
    public void addDoubleArrayNeg() {
        dependencyInjection D = new dependencyInjection(5.0, new double[]{1.0, 2.5, 5.2});
        assertFalse(D.addDoubleArray() == 1.37);
    }
}