package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyClassTest {

    @Test
    public void test(){
        System.out.println("####################");
        System.out.println(System.getenv("TEST_HOST"));

        assertTrue(true);
    }
}
