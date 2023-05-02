package bigO;

public class squareRoot {
	public static void main(String[] args) {

		double figure = 9;
		System.out.println(squareRoot(figure));

	}
	
	//Applying Babylonian method
	// x <- (x + n/2)/2
	public static double squareRoot(double num) {
		double i = 0;
		double root = 17;
		do {
			i = root;
			root = (i+(num/i))/2;
		}
	while ((i-root)!=0);
		return root;
	}
}
// O(n^2)