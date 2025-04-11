package patterns.alphabets;

public class Y {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j-i==0&&i<5||i+j==8&&i<5||j==4&&i>4) 
				{
					System.out.print("@");
				}else
					System.out.print(" ");
			}System.out.println();
		}

	}


}
