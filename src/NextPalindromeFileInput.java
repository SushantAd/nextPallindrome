import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NextPalindromeFileInput {

//main logic for finding next palindrome	
	public static String findNext(String str){
//replaceFirst removes all leading zeroes, except if only one zero is present		
    	String val= checkPositiveInteger(str);
    	int len= val.length();
    	int mid= len/2;
    	String left= val.substring(0, mid);
    	String middle= val.substring(mid, len-mid);
    	String right = val.substring(len-mid);
    
//check if right is greater than left, if yes, form mirror of left and replace with right    	  	
    	if (left.compareTo(reverse(right)) > 0) {
            return left + middle + reverse(left);
    	}

//form newVal using left and ny incrementing middle with 1    	
    	Long next2 = new Long(Long.parseLong(left + middle)+1);
    	String newVal= next2.toString();
//form mirror of left and replace with right    	
    	return newVal.substring(0, left.length()+middle.length())+ reverse(newVal). substring(middle.length());
    }
	
//leveraging use of reverse function in StringBuilder	
	private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

//check if value is integer/float/rounded/absolute	
	private static String checkPositiveInteger(String strVal) {
//to check if string value is integer
		String str = strVal.replaceFirst("^0+(?!$)", "").replaceAll("\\s","");
		try {
		Integer.parseInt(str);
		return String.valueOf(Math.round(Math.abs(Long.parseLong(str))));
       }
       catch (NumberFormatException nfe1) {   	  
    	   try { 		 
//to check if string value is float
    		   return String.valueOf(Math.round(Math.abs(Double.parseDouble(str))));
    	   }
    	   catch(NumberFormatException nfe2) {
//to deal with string values that are actually string e.g abc,abcd
    		   return " ";   
    	   }    	   
       }
	}
	
	
	public static void main(String[] args) throws CustomException {
		
		try {
			URL url = NextPalindromeFileInput.class.getClassLoader().getResource("testcases.txt");
			File file = new File(url.getPath());
			FileReader fr = new FileReader(file);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			String line= br.readLine();
			String[] inputValues = line.trim().split("\\s+");			
			int testcases= Integer.parseInt(checkPositiveInteger(inputValues[0]));

			//custom exception, if testcases is set to 0
			if(testcases<=0) {
				throw new CustomException("Input value should be greater than Zero!");
			}
						
			
			String[] testValues = new String[testcases];
			for(int i=1;i<=testcases;i++) {
				String val= inputValues[i];
		
				
//to check if any value given is not null/""/empty
				if(val.equals(null) || val.equals("") || val.isEmpty()) 
				{
					throw new NullPointerException();
				}
//deals with empty spaces in given value
				testValues[i-1]= val;
			}
			
			for(int i=0;i<testcases;i++) 
			{
				System.out.print(findNext(testValues[i])+" ");
			}

		} 
		catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Input value cannot be less than test cases= "+ae.getMessage());
		}
		catch(NullPointerException npe) {
			System.out.println("Input value cannot be null or empty.");			
		}
		catch(IOException io) {
			System.out.println("IO Exception: "+io);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Please enter integer only.");
		}
	}   
}