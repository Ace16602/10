package java12;

import java.util.Scanner;

public class question127 {
	public static void mian(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter a 2Dec number: ");
		try {
		String d=input.next();
		System.out.println("The  value for bin number " + d +" is "+BinToDec(d.toUpperCase()));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
		
	}
public static int BinToDec(String d) throws NumberFormatException{
	int b=0,Dec=0;
	for(int i=0;i<=d.length();i++) {
		char newBin=d.charAt(i);
		if(newBin<0&&newBin>1) {
			throw new NumberFormatException();
		}
		Dec=2*Dec+b;
	}
	return Dec;
}
}