package assignmet.week1.day2;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation&$$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char types[] = test.toCharArray();
		for (int i = 0; i < types.length; i++) {
			if (Character.isDigit(types[i])) {
				num = num + 1;

			} else if (Character.isSpaceChar(types[i])) {
				space = space + 1;

			} else if (Character.isAlphabetic(types[i])) {
				letter = letter + 1;
			}
			else {
				specialChar=specialChar+1;
			}
		}
		System.out.println(num);
		System.out.println(space);
		System.out.println(letter);
		System.out.println(specialChar);
	}
	}



