package patterns.selfname;

public class SBR {
	public static void main(String[] args) {
		
   	int n=7;
   	for(int i=1;i<=n;i++) {
   		for(int j=1;j<=n;j++) {
   			if(i==1&&j!=1||i==4&&j!=7&&j!=1||i==7&&j!=7||j==1&&i!=1&&i<4||j==7&&i!=7&&i>4) {
   				System.out.print("®️");
   			}else
   				System.out.print(" ");
   		}
   		System.out.print("  ");
   		
   		
 		   for(int j=1;j<=n;j++) {
 			   if(j==1||j==7&&i!=1&&i!=4&&i!=7||i==1&&j!=7||i==4&&j!=7||i==7&&j!=7) {
 				   System.out.print("@");
 			   }else
 				   System.out.print(" ");
 		   }
 		  System.out.print("  ");
 		  
 		  for(int j=1;j<=n;j++) {
			   if(j==1||i==1&&j!=7||j==7&&(i==2||i==3)||i==4&&j!=7||j==7&&(i==5||i==6||i==7)) {
				   System.out.print("®️");
			   }else
				   System.out.print(" ");
		   }
 		  
 		  System.out.println();
   	}
  }
}
