
public class TokenizeCSVString {

	public TokenizeCSVString(String stringToBeTokenized) {
		String[] result = stringToBeTokenized.split(",");
		for (int x=0; x<result.length; x++) {
	         System.out.println(result[x]);
	         System.out.println("---------------------");
		}
	}

	public static void main(String[] args) {
		new TokenizeCSVString("20171005070915,20171005070916,20171005070917");

	}

}
