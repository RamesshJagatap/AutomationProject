package JumpingStatement;

public class JumpingStatement {
	
//	1.go to(C++) 2.continue 3.break 4.return

	public static void main(String[] args) {
		
		System.out.println("Break:");
		for (int i=1;i<=10;i++) {
			if(i>4 && i<7) {
				break;
			}
			System.out.println( i);
		}
		
		System.out.println("Continue:");
		for (int i=1;i<=10;i++) {
			if(i>4 && i<7) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
