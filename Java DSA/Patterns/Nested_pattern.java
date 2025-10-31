// my code 

// public class Nested_pattern {
//     public static void main(String[] args) {
//         for (int i = 0; i < 4; i++) {
//             System.out.println();
//             for (int j = 0 ; j <= i; j++) {
//                 System.out.print("*");
//             }
//         }
//     }
// }

// cousers 

public class Nested_pattern
{
	public static void main(String[] args) {
	    
	    
		for (int line = 1; line<=4 ; line++) {
		    
		    for(int star=1; star<=line; star++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		} 
	}
}

