import static org.junit.Assert.*;
import org.junit.Test;
import src.Dollar;
import src.Franc;



public class Main{
@Test
public static void testMultiplication() {
   Dollar five = new Dollar(5);
   assertEquals(new Dollar(10), five.times(2));
   assertEquals(new Dollar(15), five.times(3));
}

@Test
public static void testEquality() {
   assertTrue(new Dollar(5).equals(new Dollar(5)));
   assertFalse(new Dollar(5).equals(new Dollar(6)));
   assertTrue(new Franc(5).equals(new Franc(5)));
   assertFalse(new Franc(5).equals(new Franc(6)));
}

@Test
public static void testFrancMultiplication() {
   Franc five = new Franc(5);
   assertEquals(new Franc(10), five.times(2));
   assertEquals(new Franc(15), five.times(3));
}


  public static void main(String arg[]) {
    System.out.println("hello world");
    testMultiplication();
    testEquality();

    testFrancMultiplication();
  }

}
