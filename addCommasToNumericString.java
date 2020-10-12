import acm.program.*;


public class addCommasToNumericString extends ConsoleProgram {
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;  
			println(addCommasToNumericString(digits)); 
		 }
	}

	private String addCommasToNumericString(String digits) {
		String result = " ";
			int countLen = digits.length();
			int numOfDigits = 0; 
			for (int i = countLen - 1; i >= 0; i--) {  
				result = digits.charAt(i) + result; //index the position
				numOfDigits++;
				if (((numOfDigits % 3) == 0) && (i > 0)) {
					result = "," + result;
				}
			}
			return result;
	}
}
