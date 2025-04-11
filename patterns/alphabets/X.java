package patterns.alphabets;

public class X {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j - i == 0 || i + j == 10) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
