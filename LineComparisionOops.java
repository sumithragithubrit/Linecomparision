package linecomparision;

public class LineComparisionOops {

	public static void main(String[] args) {
		lineCom lineComapar = new lineCom();
        LineComparision lineComparison = lineComapar.setCompareValues();
        lineComapar.geometryCalculation(lineComparison);
        lineComapar.compareOrEqual();


	}

}
