package patterns.alphabets;

public class J {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==6&&i!=7||i==7&&j<6&&j!=1||j==1&&i>3&&i!=7) 
				{
					System.out.print("@");
				}else
					System.out.print(" ");
			}System.out.println();
		}

	}

}