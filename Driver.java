public class Driver  
 { 
 	public static void main(String[] args) 
 	{ 
 		String s = "1001"; 
 		System.out.println(s + 5); 
 		System.out.println(Driver.stringToInt(s) + 5); 
 		System.out.println(Integer.parseInt(s) + 5);
 		System.out.println(Driver.binaryToInteger(s));
 	} 
 	 
 	//this guy should take a String representation of a binary number 
 	//as a parameter and return as a int the decimal equivalent 
 	//"1011" -> 11 
 	static int binaryToInteger(String bin) 
 	{ 
 		int total = 0;
		int power = 0;
		char currChar;
		for(int i = bin.length()-1; i >= 0; i--)
		{
			currChar = bin.charAt(i);
			total += Driver.charToInt(currChar) * Math.pow(2, power);
			power += 1;
		}
		return total;

 	} 
 	 
 	//return the integer version of the char parameter 
 	static int charToInt(char c) 
	{ 
 		return "0123456789".indexOf(c); 
 	} 
 	 
 	//Converts s, which is a string representation 
 	//of an int into an int representation 
 	//"124" -> 124 
 	static int stringToInt(String s) 
 	{ 
 		int place = 1; 
 		int total = 0; 
 		char currChar; 
 		for(int i = s.length()-1; i >= 0; i--) 
 		{ 
 			currChar = s.charAt(i); 
 			if(currChar == '-') 
 			{ 
 				return total * -1; 
 			} 
 			else 
 			{ 
 				total += (Driver.charToInt(currChar) * place); 
 				place *= 10; 
 			} 
 		} 
 		return total; 
 	} 
 	 
 	static String removeChars(String s, String charsToRemove) 
 	{ 
 		String answer = ""; 
 		for(int i = 0; i < s.length(); i++) 
 		{ 
 			//should we keep the current character 
 			if(charsToRemove.indexOf(s.charAt(i)) == -1) 
 			{ 
 				answer = answer + s.charAt(i); 
 			} 
 		} 
 		return answer; 
 	} 
 	 
 	//returns a new String with all of the vowels 
	//removed form the parameter String 
	//"hello" -> hll 
 	static String removeVowels(String s) 
 	{ 
 		return Driver.removeChars(s, "aeiouAEIOU"); 
 	} 
 	 
 	//returns a new String with all of the consonants 
	//removed form the parameter String 
 	//"hello" -> eo 
 	static String removeConsonants(String s) 
 	{ 
 		return Driver.removeChars(s, "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"); 
 	} 
 		 
 	//returns a new String with all of the numbers 
 	//removed form the parameter String 
 	//"he11o" -> heo 
 	static String removeDigits(String s) 
 	{ 
 		return Driver.removeChars(s, "0123456789"); 
 	} 
 		 
 	//return the first occurence in s where c is found or -1 if  
 	//it was not found - we can't use the String's indexOf 
 	static int indexOf(String s, char c) 
 	{ 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			if(s.charAt(i) == c) 
 			{ 
 				return i; 
 			} 
 		} 
 		//if we are still kicking.... 
 		return -1; 
 	} 
 	 
 	static void displayString(String s) 
 	{ 
 		//should display the contents of the String one character per line 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			System.out.println(s.charAt(i)); 
 		} 
 	} 
 	 
 	static void displayWithSpaces(String s) 
 	{ 
 		String answer = ""; 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			answer = answer + s.charAt(i) + " "; 
 		} 
 		System.out.println(answer); 
 	} 
 	 
 	//this method should display on a single line the input String 
 	//in reverse: "hello" -> "olleh" 
 	static String reverseString(String s) 
 	{ 
 		String answer = ""; 
 		for(int i = s.length()-1; i >= 0; i = i - 1) 
 		{ 
 			answer = answer + s.charAt(i); 
 		} 
 		return answer; 
 	} 
 } 
