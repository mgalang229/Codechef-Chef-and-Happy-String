import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] s = fs.next().toCharArray();
			boolean happy = false;
			for (int i = 0; i < s.length - 2; i++) {
				if (isVowel(s[i]) && isVowel(s[i+1]) && isVowel(s[i+2])) {
					happy = true;
					break;
				}
			}
			System.out.println(happy ? "Happy" : "Sad");
		}
		fs.close();
	}
	
	static boolean isVowel(char c) {
		char[] vowels = "aeiou".toCharArray();
		for (char v : vowels) {
			if (v == c) {
				return true;
			}
		}
		return false;
	}
}
