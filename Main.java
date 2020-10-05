import static org.junit.Assert.*;
import org.junit.Test;
import src.Dollar;



public class Main{
@Test
public void testMultiplication() {
   Dollar five = new Dollar(5);
   assertEquals(new Dollar(10), five.times(2));
   assertEquals(new Dollar(15), five.times(3));
}

@Test
public static void testEquality() {
   assertTrue(new Dollar(5).equals(new Dollar(5)));
   assertFalse(new Dollar(5).equals(new Dollar(6)));
}

  public static void main(String arg[]) {
    System.out.println("hello world");
    testEquality();
  }

}
