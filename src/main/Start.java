package main;
import main.SbConverter;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) 
	{		
		String answear = "";
		
		SbConverter c = new SbConverter();
		Scanner sc = new Scanner(System.in);
		
//		String str = "11011011";
//		System.out.println(Integer.parseInt(str,2));

		do
		{		
			
			System.out.println("Witaj!!!!! \n Podaj na jaki system pragniesz zamienic liczb� 0b1101_1011? \n"
					+ " Do wyboru s� dziesi��,trzy,szesna�cie");
			answear = sc.nextLine();
			System.out.println(c.conversionDecisionMaker(answear));
			System.out.println("\n\n");
		}
		while(answear == "dziesi��" || answear == "trzy" || answear == "szesna�cie");
		System.out.println("DZIEKUJ� ZA ODPOWIED�!!!!\nDO WIDZENIA");
		sc.close();
	}

}
