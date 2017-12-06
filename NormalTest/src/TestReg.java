import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {

	   public static void main(String[] args) {
		   Pattern pattern = Pattern.compile("(\\s+)(.*)(\\s+)");
		   String string = "abc  abc  bdc ";
		   string.trim();
		   Matcher matcher = pattern.matcher(string);
		   while(matcher.find())
		   {
			   for(int i=0; i<=matcher.groupCount(); i++){  
			        System.out.println(i+":"+matcher.group(i));  
			    }  
		   }
	   }
}
