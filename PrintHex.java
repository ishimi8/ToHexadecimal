// Jase Ishimi
import java.util.Scanner;
public class PrintHex {
	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in); 
		while(true) { // while loop to iterate
			System.out.println("Enter A Number"); // get number
		int value=Input.nextInt(); // to int
		if(value<=-1) { // if value is a negative number, break
			break;
		}
		
		System.out.println(intToHex(value)); // print hex
		}
	}


public static String intToHex (int value) { 
String HexDigit = ""; // create empty string
if (value >= 16) { // check if value is greater than or equal to 16
HexDigit = intToHex(value/16); } // Hex Digit is equal to the value/16, keep on doing it until value is not greater than or equal to 16
    return HexDigit + digitToHex(value % 16); // print the last  value of the hexadecimals until it runs then print the HexDigit in front
  }

public static String digitToHex (int value) { 
	   switch (value) { // switch value's with that of corresponding hex values
	   case 0: return "0";
	   case 1: return "1";
	   case 2: return "2";
	   case 3: return "3";
	   case 4: return "4";
	   case 5: return "5";
	   case 6: return "6";
	   case 7: return "7";
	   case 8: return "8";
	   case 9: return "9";
	   case 10:return "A";
	   case 11:return "B";
	   case 12:return "C";
	   case 13:return "D";
	   case 14:return "E";
	   case 15:return "F";
	   }
	return null ;
	 }
}