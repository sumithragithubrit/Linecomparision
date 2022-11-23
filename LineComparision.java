package linecomparision;
import static java.lang.Math.sqrt;
public class LineComparision {
	 static int x1 = 6;
	    static int x2 = 8;
	    static int y1 = 2;
	    static int y2 = 9;

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		double LengthOfLine = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
        System.out.println("Length of line is "+LengthOfLine );

	}

}
