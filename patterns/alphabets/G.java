package patterns.alphabets;

public class G {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1&&i!=1&&i!=7||i==1&&j!=1&&j!=7||i==7&&j!=1&&j!=7||j==7&&i>3&&i!=7||i==4&&j>3||j==4&&i==5) 
				{
					System.out.print("@");
				}else
					System.out.print(" ");
			}System.out.println();
		}

	}

}
