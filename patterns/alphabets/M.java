package patterns.alphabets;

public class M {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==7||(j==6||j==2)&&i==2||(j==3||j==5)&&i==3||j==4&&i==4) 
				{
					System.out.print("@");
				}else
					System.out.print(" ");
			}System.out.println();
		}

	}

}