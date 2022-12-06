package linecomparision;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class LineComparision {

	      private int x11;
	      private int x12;
	      private int y11;
	       private int y12;
	       private int x21;
	       private int x22;
	       private int y21;
	       private int y22;


	    public int getX21() {
	        return x21;
	    }

	    public void setX21(int x21) {
	        this.x21 = x21;
	    }

	    public int getX22() {
	        return x22;
	    }

	    public void setX22(int x22) {
	        this.x22 = x22;
	    }

	    public int getY21() {
	        return y21;
	    }

	    public void setY21(int y21) {
	        this.y21 = y21;
	    }

	    public int getY22() {
	        return y22;
	    }

	    public void setY22(int y22) {
	        this.y22 = y22;
	    }


	    public int getY12() {
	        return y12;
	    }

	    public void setY12(int y12) {
	        this.y12 = y12;
	    }


	    public int getX11() {
	        return x11;
	    }

	    public void setX11(int x11) {
	        this.x11 = x11;
	    }

	    public int getY11() {
	        return y11;
	    }

	    public void setY11(int y11) {
	        this.y11 = y11;
	    }

	    public int getX12() {
	        return x12;
	    }

	    public void setX12(int x12) {
	        this.x12 = x12;
	    }

	 

	public static void main(String[] args) {
		System.out.println("Welcome to line comparison computation program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for line 2 ");
        int x21 = sc.nextInt();
        int x22 = sc.nextInt();
        int y21 = sc.nextInt();
        int y22 = sc.nextInt();
        System.out.println("Enter values for line 1 ");
        int x11 = sc.nextInt();
        int x12 = sc.nextInt();
        int y11 = sc.nextInt();
        int y12 = sc.nextInt();
        double length1 = sqrt(Math.pow((x12-x11),2)+Math.pow((y12-y11),2));
        double length2 = sqrt(Math.pow((x22-x21),2)+Math.pow((y22-y21),2));
        System.out.println("Length of line 1 is "+length1);
        System.out.println("Length of line 2 is "+length2);
        Double dLen1 = new Double(length1);
        Double dLen2 = new Double(length2);
        if ( dLen1.equals( dLen2)){
            System.out.println("Two lines are equal ");


        }
        else if (dLen1>dLen2 ) 
        {

            System.out.println("line 1 is greater than line 2");

        } 
        else if(dLen1<dLen2) {
            System.out.println( "line 2 is greater than line 1");

        }
        else 
        {
            System.out.println( "Two lines are not equal");

        }
    }        

	
	
}
