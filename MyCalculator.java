package assignmet.week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
	    cal.add(1000,100, 10);
	    cal.sub(99, 11);
	    int result4 =cal.mul(25, 5);
	    System.out.println(result4);
	    int result3 = cal.div();
	    System.out.println(result3);
		
	
	}

}
