import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {

	@Test
	void test() {
		Greeter greeter = new Greeter("Hello");
		String expected = "Hello, Bob!";
		assertEquals(greeter.greet("Bob"), expected);
		
		
		greeter.setgreeting("Goodbye");
		expected = "Goodbye, Bob!";
		assertEquals(greeter.greet("Bob"), expected);
		
		JavaScriptGreeter simon = new JavaScriptGreeter("Hello");
        expected = "Simon says, Hello, Bob!";
        assertEquals(simon.greet("Bob"), expected);
        expected = "Simon says, Hello, Joe!";
        assertEquals(simon.greet("Joe"), expected);

        HtmlGreeter html = new HtmlGreeter("Hello");
        expected = "<h1>Hello, Bob!</h1>";
        assertEquals(html.greet("Bob"), expected);
        html.setTagName("h2");
        expected = "<h2>Hello, Bob!</h2>";
        assertEquals(html.greet("Bob"), expected);

        LoudGreeter loud = new LoudGreeter("HELLO");
        expected = "HELLO, BOB!!";
        assertEquals(loud.greet("Bob"), expected);
        loud.addVolume();
        expected = "HELLO, BOB!!!";
        assertEquals(loud.greet("Bob"), expected);
	}
	

}
