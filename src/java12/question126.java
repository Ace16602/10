package java12;

import java.util.Scanner;

public class question126{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a hex number ");
	try{
		String hex = input.next();
		System.out.println("The decimal value for hex number " + hex+" is "+hexToDec(hex.toUpperCase()));
        input.close();
	}
	catch(NumberFormatException ex) {
		System.out.println(ex);
	}
}
public static int hexToDec(String hex) throws NumberFormatException{ 
	int ten=0,sixteen=0;
	for(int i=0;i<hex.length();i++) {
		char number = hex.charAt(i);
		if(number>='A'&&number<='F') {
			sixteen=10+number-'A';
		}
		else if(number>='0'&&number<='9'){
			sixteen=number-'0';
		}
		else {
			throw new NumberFormatException();
		}
		ten = ten*16+sixteen;
	}
	return ten;
}
}