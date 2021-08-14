package assignmet.week1.day2;

public class Calculator {
	int num1, num2, num3;

	public int add(int num1, int num2, int num3) {
		int sum = 0;
		sum = num1 + num2 + num3;
		System.out.println(sum);
		return sum;
	}

	public int sub(int num1, int num2) {
		int result1 = 0;
		result1 = num1 - num2;
		System.out.println(result1);
		return result1;
	}

	public int mul(int num1, int num2) {
		int res = 0;
		res = num1 * num2;
		return res;
	}

	public int div() {
		int divide = 0;
		num1 = 100;
		num2 = 5;
		divide = num1 / num2;
		return divide;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result2 = cal.add(2, 4, 6);
		System.out.println(result2);
	}

}
