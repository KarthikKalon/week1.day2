package assignmet.week1.day2;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ReverseEvenWords {
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
  
	 public static void main(String[] args) {
		 String str = "I am a software tester"; 
		 String word[] = str.split(" ");
			for (int i = 0; i < word.length; i++) {
				if (i % 2 ==1) {
					int oddword = word[i].length();
					for (int j = oddword - 1; j >= 0; j--) {
						System.out.print(word[i].charAt(j));
					}
					System.out.print(" ");
				}
				else {
					System.out.print(word[i] + " ");
				}

			}

		}


}
