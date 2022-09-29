package media;


import java.text.DecimalFormat;

public class app {
	
	public static void main(String [] args){ 
	
	double m1, m2, m3, media;
	m1 = 9;
	m2 = 10;
	m3 = 3;

	media = (m1 + m2 + m3) / 3; 

		System.out.println("A média final é: " + media);


	if (m1 < media)
		{ 
		System.out.println("A média 1 é menor que a média final");
		}
			
	if (m2 < media) 
			{
		System.out.println("A média 2 é menor que a média final");
		}
			
	if (m3 < media)
		{
		System.out.println("A média 3 é menor que a média final");
		}		
	}
}