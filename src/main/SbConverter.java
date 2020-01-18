package main;

public class SbConverter {
	
	private String givenNumber = "11011011";
	private int givenNumberInDecimal = 0;
	private final String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public SbConverter()
	{
		givenNumberInDecimal = Integer.parseInt(givenNumber, 2);
	}
	
	private String convertToHex()
	{	
		return Integer.toHexString(givenNumberInDecimal);
	}
	
	private int convertToDecimal()
	{
		return givenNumberInDecimal;
	}
	private String convertToTheBaseOfThree()
	{
		String result = "";
		if (givenNumberInDecimal == 0)
			return "0";
		while (givenNumberInDecimal > 0)
		{
		result = pattern.charAt(givenNumberInDecimal % 3) + result;
		givenNumberInDecimal /= 3;
		}		 
		return result;
	}
	
	public String conversionDecisionMaker(String conversionBase)
	{
		String result = "";
		switch(conversionBase) 
        { 
            case "dziesi��": 
            	result = String.valueOf(convertToDecimal());
                break; 
            case "trzy": 
            	result = convertToTheBaseOfThree();
            	break; 
            case "szesna�cie": 
                result =  convertToHex();
                break; 
            default:
            	result = "Wpisano b�edny typ konwersji./n Dost�pne typy to dziesi��,trzy,szesna�cie";                 
        }
	return result;
	}

}
