import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class ReadFromCSVFile {

		public ReadFromCSVFile() {
			readInputFromFileUsingBufferedReader("detail.txt");
		}

		private void readInputFromFile(String filePath) {
			StringBuilder contentBuilder = new StringBuilder();
			try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)) {
		        stream.forEach(s -> contentBuilder.append(s).append("\n"));		        
		    }
		    catch (IOException e) {
		        e.printStackTrace();
		    }
		    System.out.println(contentBuilder.toString());			
		}
		
		private void readInputFromFileUsingBufferedReader(String filePath) {
		    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {		 
		        String sCurrentLine;
		        while ((sCurrentLine = br.readLine()) != null) {
		        	System.out.println(sCurrentLine);
		        	System.out.println("****************************");
		        }
		    }
		    catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
		private static String readAllBytesJava7(String filePath)
		{
		    String content = "";
		    try
		    {
		        content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
		    }
		    catch (IOException e)
		    {
		        e.printStackTrace();
		    }
		    return content;
		}
		
		public static void main(String[] args) {
			new ReadFromCSVFile();
		}
}
