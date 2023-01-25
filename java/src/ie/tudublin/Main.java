package ie.tudublin;

public class Main
{
	public static void main(String[] args)
	{
		Cat ginger = new Cat("Ginger");
		int numLives = ginger.getNumLives();
		for(int i = 0; i < numLives+1; i++)
		{
			ginger.Kill();
		}
	}
	
}