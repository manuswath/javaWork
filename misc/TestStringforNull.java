
public class TestStringforNull {

	public static void main(String[] args) {
		isNull("");
		isNull("     ");
	}

	public static void isNull(String stringToBeProcessed) {
		
		if (stringToBeProcessed != null && !stringToBeProcessed.equals(" ")
				&& stringToBeProcessed.length() > 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	} 
}
