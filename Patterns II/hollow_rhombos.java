//  public static void triangle(int totRows, int totCols){
//     for(int i=1; i<=totRows; i++){
//         for(int j=1; j<=totRows-i; j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=totCols; j++){
//                 //cell - (i,j)
//                 if( i == 1 || i == totRows || j == 1 || j == totCols) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//         System.out.println();
//     }
// }
// 	public static void main(String[] args) {
// 		triangle(4,6);
// 	}

public class hollow_rhombos {
    public static void triangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=totCols; j++){
                //cell - (i,j)
                if( i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(4,6);
    }
}