package Assignment;

public class Assignment10 {

	public static void main(String[] args) {
		
		int[] arr = {12 ,34,11,36,87,98,93};
//		
//    	int higestnum = 0;
//		
//		for ( int i=0;i<=arr.length;i++) {
//			if (higestnum > arr[1]) {
//				higestnum = higestnum;
//			}
//			
//		}
//		System.out.println(higestnum);
//
//}}

		
//		int java.lang.Integer.MIN_VALUE : -2147483648 [0x80000000]
				
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // Find first largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {                            //  -2147483648>12 , > 34
                first = arr[i];                               // first = 12
                System.out.println("increment of fitst = " + first);
            }
        }
        System.out.println(first);

        // Find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }

        // Find third largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }

        System.out.println("Second largest: " + second);
        System.out.println("Third largest: " + third);
    }
}
