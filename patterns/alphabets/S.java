package patterns.alphabets;

public class S {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j!=1&&j!=7||j==1&&i<4&&i!=1||j==7&&i>4&&i!=7&&i!=1||
						i==7&&j!=7&&j!=1||i==4&&j!=7&&j!=1) 
				{
					System.out.print("@");
				}else
					System.out.print(" ");
			}System.out.println();
		}

	}


}
