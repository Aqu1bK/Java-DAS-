// my code 

// public class inverted_star {
//     public static void main(String[] args) {
//         for (int i = 3; i >= 0; i--) {
//             System.out.println();
//             for (int j = 0 ; j <= i; j++) {
//                 System.out.print("*");
//             }
//         }
//     }
// }

// coures

public class inverted_star
{
	public static void main(String[] args) {
	    
	    
		for (int line = 4; line>=1 ; line--) {
		    
		    for(int star=1; star<=line; star++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		} 
	}
}


