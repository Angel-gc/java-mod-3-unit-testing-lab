import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void nullTest(){
        FizzBuzz fb = new FizzBuzz();
        String nullStr = fb.fizzBuzzString(null);
        assertNull(nullStr);
    }
    @Test
    void startsWithF(){
        FizzBuzz fb = new FizzBuzz();
        String fStr = fb.fizzBuzzString("fire");
        String fs = fb.fizzBuzzString("FIRE");
        assertEquals("Fizz", fs);
        assertEquals("Fizz", fStr);
    }

    @Test
    void startsWithB(){
        FizzBuzz fb = new FizzBuzz();
        String bStr = fb.fizzBuzzString("lib");

        assertEquals("Buzz", bStr);
    }

    @Test
    void startsWithFEndsWithB(){
        FizzBuzz fb = new FizzBuzz();
        String fbStr = fb.fizzBuzzString("firb");
        String fbSt = fb.fizzBuzzString("Fb");
        assertEquals("FizzBuzz", fbStr);
        assertEquals("FizzBuzz", fbSt);

    }
    @Test
    void returnsString() {
        FizzBuzz fb = new FizzBuzz();
        String fbStr = fb.fizzBuzzString("other");
        assertEquals("other", fbStr);
    }
}