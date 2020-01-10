package main;

public class Converter {
	
	private int givenNumber = 0;
	private String conversionBase = "";
	private final String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public Converter(String number,String conversionType)
	{
		givenNumber = Integer.parseInt(number, 2);
		conversionBase = conversionType;
	}
	
	public String convertToHex()
	{		
		return Integer.toHexString(givenNumber);
	}
	
	public int convertToDecimal()
	{
		return givenNumber;
	}
	public String convertToTheBaseOfThree()
	{
		String result = "";
		if (givenNumber == 0)
			return "0";
		while (givenNumber > 0)
		{
		result = pattern.charAt(givenNumber % 3) + result;
		givenNumber /= 3;
		}		 
		return result;
	}
	
	public String conversionDecisionMaker(String conversionType)
	{
		String result = "";
		if(conversionType == "dziesi��" || conversionType == "trzy" || conversionType == "szesna�cie")
		{
			System.out.println("Wpisano b�edny typ konwersji./n Dost�pne typy to dziesi��,trzy,szesna�cie");
			return "0";
		}
		
		
		
		return result;
	}

}
