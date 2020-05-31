package lab7;
public class MyFraction implements MyMath<MyFraction> {
	private int numerator;
	private int denominator;
	private String sign;
	public MyFraction (String signIn, int numeratorIn, int denominatorIn) {
		sign = signIn;
		numerator = numeratorIn;
		denominator = denominatorIn;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String toString() {
		return sign + numerator + "/" + denominator;
	}
	@Override
	public MyFraction add(MyFraction o) {
		int leastCommonDenominator = (getDenominator() * o.getDenominator());
		int singleD = getDenominator();
		int doubleD = o.getDenominator();
		int numerator1 = 0, numerator2 = 0;
		String negPosSign = getSign();
		int newNumerator = 0;
		if(leastCommonDenominator == 0 || singleD == 0 || doubleD == 0) {
			System.out.print("Undefined");
			System.exit(0);
		}
		if(getSign() == "-") {
			numerator1 = -1 * getNumerator();
		}
		if(o.getSign() == "-") {
			numerator2 = -1 * o.getNumerator();
		}
		if(getSign() == " " && o.getSign() == "-") {
			numerator1 = getNumerator();
			numerator2 = -1 * o.getNumerator();			
			newNumerator = ((o.getDenominator() * numerator1) + (getDenominator() * numerator2));
		}
		if(getSign() == "-" && o.getSign() == " ") {
			numerator1 = -1 * getNumerator();
			numerator2 = o.getNumerator();			
			newNumerator = ((o.getDenominator() * numerator1) + (getDenominator() * numerator2)) - (-2 * newNumerator);
			String q = "-";
			q = q.substring(1);
			return new MyFraction(q, newNumerator, leastCommonDenominator);
		}
		if(getSign() == " " && o.getSign() == " ") {
			numerator1 = getNumerator();
			numerator2 = o.getNumerator();			
			newNumerator = ((o.getDenominator() * numerator1) + (getDenominator() * numerator2));
		}
		if(getSign() == "-" && o.getSign() == "-") {
			numerator1 = -1 * getNumerator();
			numerator2 = -1 * o.getNumerator();			
			newNumerator = ((o.getDenominator() * numerator1) + (getDenominator() * numerator2));
			String q = "-";
			q = q.substring(1); 
			return new MyFraction(q, newNumerator, leastCommonDenominator);
		}
		if(getDenominator() == o.getDenominator()) {
			int newNum = numerator1 + numerator2;
			return new MyFraction(negPosSign, newNum, singleD);
		}
		return new MyFraction(negPosSign, newNumerator, leastCommonDenominator);
	}
	@Override
	public MyFraction subtract(MyFraction o) {
		int leastCommonDenominator = (getDenominator() * o.getDenominator());
		int singleD = getDenominator();
		int doubleD = o.getDenominator();
		int numerator1 = 0, numerator2 = 0;
		String negPosSign = getSign();
		int newNumerator = 0;
		if(leastCommonDenominator == 0 || singleD == 0 || doubleD == 0) {
			System.out.print("Undefined");
			System.exit(0);
		}
		if(getSign() == "-") {
			numerator1 = -1 * getNumerator();
		}
		if(o.getSign() == "-") {
			numerator2 = -1 * o.getNumerator();
		}
		if(getSign() == " " && o.getSign() == "-") {
			numerator1 = getNumerator();
			numerator2 = -1 * o.getNumerator();		
			newNumerator = ((o.getDenominator() * numerator1) - (getDenominator() * numerator2));
		}
		if(getSign() == "-" && o.getSign() == " ") {
			numerator1 = -1 * getNumerator();
			numerator2 = o.getNumerator();			
			newNumerator = ((o.getDenominator() * numerator1) - (getDenominator() * numerator2)) - (-2 * newNumerator);
			String q = "-";
			q = q.substring(1);
			return new MyFraction(q, newNumerator, leastCommonDenominator);
		}
		if(getSign() == " " && o.getSign() == " ") {
			numerator1 = getNumerator();
			numerator2 = o.getNumerator();			
			newNumerator = ((o.getDenominator() * numerator1) - (getDenominator() * numerator2));
		}
		if(getSign() == "-" && o.getSign() == "-") {
			numerator1 = -1 * getNumerator();
			numerator2 = -1 * o.getNumerator();			
			newNumerator = ((o.getDenominator() * numerator1) - (getDenominator() * numerator2));
			String q = "-";
			q = q.substring(1); 
			return new MyFraction(q, newNumerator, leastCommonDenominator);
		}
		if(getDenominator() == o.getDenominator()) {
			int newNum = numerator1 + numerator2;
			return new MyFraction(negPosSign, newNum, singleD);
		}
		return new MyFraction(negPosSign, newNumerator, leastCommonDenominator);
	}
	@Override
	public MyFraction multiply(MyFraction o) {
		int newNumerator = 0;
		int newDenominator = (getDenominator() * o.getDenominator());
		int numerator1 = 0; 
		int numerator2 = 0;
		String negPosSign = getSign();
		if(getSign().equals("-")) {
			numerator1 = -1 * getNumerator();
		}
		if(o.getSign().equals("-")) {
			numerator2 = -1 * o.getNumerator();
		}
		if(getSign().equals(" ") && o.getSign().equals("-")) {
			numerator1 = getNumerator();
			numerator2 = -1 * o.getNumerator();
			newNumerator = (numerator1 * numerator2);			
		}
		if(getSign().equals("-") && o.getSign().equals(" ")) {
			numerator1 = -1 * getNumerator();
			numerator2 = o.getNumerator();
			newNumerator = (numerator1 * numerator2);	
			String q = "-";
			q = q.substring(1);
			return new MyFraction(q, newNumerator, newDenominator);
		}
		if(getSign().equals(" ") && o.getSign().equals(" ")) {
			numerator1 = getNumerator();
			numerator2 = o.getNumerator();
			newNumerator = (numerator1 * numerator2);			
		}
		if(getSign().equals("-") && o.getSign().equals("-")) {
			numerator1 = -1 * getNumerator();
			numerator2 = -1 * o.getNumerator();
			newNumerator = (numerator1 * numerator2);	
			String q = "-";
			q = q.substring(1);
			return new MyFraction(q, newNumerator, newDenominator);
		}
		return new MyFraction(negPosSign, newNumerator, newDenominator);
	}
	@Override
	public MyFraction divide(MyFraction o) {
		int numerator1 = 0, numerator2 = 0;
		int leastCommonDenominator = 0;
		int newNumerator = 0;
		int fix1 = 0;
		int fix2 = 0;
		String negPosSign = getSign();
		if(getSign() == "-") {
			numerator1 = -1 * getNumerator();
		}
		if(o.getSign() == "-") {
			numerator2 = -1 * o.getNumerator();
		}
		if(getSign() == " " && o.getSign() == "-") {
			numerator1 = getNumerator();
			numerator2 = -1 * o.getNumerator();		
			newNumerator = ((numerator1 * o.getDenominator()));
			leastCommonDenominator = (getDenominator() * numerator2);
			if(leastCommonDenominator < 0) {
				fix1 = -1 * leastCommonDenominator;
				fix2 = -1 * newNumerator;
			}
			return new MyFraction(negPosSign, fix2, fix1);
		}
		if(getSign() == "-" && o.getSign() == " ") {
			numerator1 = -1 * getNumerator();
			numerator2 = o.getNumerator();		
			newNumerator = ((numerator1 * o.getDenominator()));
			leastCommonDenominator = (getDenominator() * numerator2);
			String q = "-";
			q = q.substring(1);
			return new MyFraction(q, newNumerator, leastCommonDenominator);
		}
		if(getSign() == " " && o.getSign() == " ") {
			numerator1 = getNumerator();
			numerator2 = o.getNumerator();	
			newNumerator = ((numerator1 * o.getDenominator()));
			leastCommonDenominator = (getDenominator() * numerator2);
		}
		if(getSign() == "-" && o.getSign() == "-") {
			numerator1 = -1 * getNumerator();
			numerator2 = -1 * o.getNumerator();	
			newNumerator = ((numerator1 * o.getDenominator()));
			leastCommonDenominator = (getDenominator() * numerator2);
			String q = "-";
			q = q.substring(1); 
			if (leastCommonDenominator < 0) {
				fix1 = -1 * leastCommonDenominator;
				fix2 = -1 * newNumerator;
			}
			return new MyFraction(q, fix2, fix1);
		}
		return new MyFraction(negPosSign, newNumerator, leastCommonDenominator);
	}
	public MyFraction(String q, int finalQuotient) {
	}
	public MyFraction simplify () {
		int common = 0;
		int newNumerator = numerator;
		int newDenominator = denominator;
		int greatestCommonDenominator;
        if (newNumerator > newDenominator) {
        	greatestCommonDenominator = newNumerator;
        }
        else {
        	greatestCommonDenominator = newDenominator;
        }
        for (int factor = greatestCommonDenominator; factor >= 2; factor--) {
            if (numerator % factor == 0 && denominator % factor == 0) {
                common = factor;
                break; }
        }
        int finalNumerator = numerator / common;
        int finalDenominator = denominator / common;
		return new MyFraction(sign, finalNumerator, finalDenominator);
	}
	public static void main(String[] args) {
		MyFraction example1 = new MyFraction("-", 3, 9);
		MyFraction example2 = new MyFraction("-", 1, 4);
		
		MyFraction sum = example1.add(example2);
		MyFraction difference = example1.subtract(example2);
		MyFraction product = example1.multiply(example2);
		MyFraction quotient = example1.divide(example2);

		System.out.println("Sum: \t\t" + sum.simplify().toString());
		System.out.println("Difference: \t" + difference.simplify().toString());
		System.out.println("Product: \t" + product.simplify().toString());
		System.out.println("Quotient: \t" + quotient.simplify().toString());
	}
}
