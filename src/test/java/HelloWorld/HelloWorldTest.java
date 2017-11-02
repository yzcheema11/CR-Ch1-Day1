package HelloWorld;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */
public class HelloWorldTest {

    HelloWorld helloWorld;

    @Before public void initialize(){
        helloWorld = new HelloWorld();
    }

    @Test
    public void TestGreeting(){
        String expected = "Hello World";
        String actual = this.helloWorld.greeting();

        assertEquals(expected,actual);
    }

}
