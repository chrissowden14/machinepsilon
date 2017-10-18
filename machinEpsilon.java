/**
 * 
 */

/**
 * @author chrissowden
 *
 */
public class machinEpsilon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float machEps = 1.0f;

		do
		    machEps /= 2.0f;
		while ((float) (1.0 + (machEps / 2.0)) != 1.0);

		System.out.println( machEps);
		



	}
}
