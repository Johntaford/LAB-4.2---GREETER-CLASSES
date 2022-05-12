
public class Greeter {
	public String greeting;
	
	public Greeter (String greeting) {
		this.greeting = greeting;
	}
	
	public String greet(String name) {
		return (greeting +"," + name + "!");
	}
	
	public void setgreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String getgreeting() {
		return greeting;
	}
	@Override
	public String toString () {
		return "Greeter";
	}
}
