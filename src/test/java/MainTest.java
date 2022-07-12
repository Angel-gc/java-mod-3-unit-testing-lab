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

        assertEquals("FizzBuzz", fbStr);
    }
}