
public class JavaScriptGreeter extends Greeter {

	public JavaScriptGreeter(String greeting) {
		super(greeting);
	}
	@Override
	public String toString () {
		return "Greeter";
	}
	@Override 
	public String greet(String name) {
		return toString();
	}
	
}
