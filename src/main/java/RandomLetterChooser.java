public class RandomLetterChooser extends RandomStringChooser
{
	private String[] letterArray;
	private ArrayList<String> usedLetters;
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */
		super(getSingleLetters(str));
		
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
