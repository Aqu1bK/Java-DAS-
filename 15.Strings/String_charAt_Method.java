public class String_charAt_Method {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s1 = "Java";
        // char ch = s1.charAt(2);
        // System.out.println(ch);
        printLetters(s1);
    }
}
