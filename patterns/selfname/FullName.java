package patterns.selfname;

public class FullName {
	public static void main(String[] args) {

		int n = 7;
		for (int i = 1; i <= n; i++) {
			// System.out.print("*");
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 || i == 4 && j != 7 && j != 1 || i == 7 && j != 7 || j == 1 && i != 1 && i < 4
						|| j == 7 && i != 7 && i > 4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != 7 || j == 1 && i != 1 || j == 7 && i != 1 || i == 4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 || j == 1 && i != 1 && i != 7 || i == 7 && j != 1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == 7 || i == 4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 4 || i == 7) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == 7 || j == i) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		for (int i = 1; i <= n; i++) {
			// System.out.print("*");
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 || i == 4 && j != 7 && j != 1 || i == 7 && j != 7 || j == 1 && i != 1 && i < 4
						|| j == 7 && i != 7 && i > 4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != 7 || i == 7 && j != 1 && j != 7 || j == 1 && i != 1 && i != 7
						|| j == 7 && i != 1 && i != 7) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (i == 7 || j == 1 || j == 7 && i == 6) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != 7 || j == 1 && i != 1 || j == 7 && i != 1 || i == 4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == 7 || j == i) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 4 && j == 2 || (i == 3 || i == 5) && j == 3 || (i == 2 || i == 6) && j == 4
						|| (i == 1 || i == 7) && j == 5) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (i == 1 && j != 1 && j != 7 || j == 1 && i != 1 || j == 7 && i != 1 || i == 4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 && j != 7 || i == 4 && j != 7 || j == 7 && i != 1 && i != 4) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
