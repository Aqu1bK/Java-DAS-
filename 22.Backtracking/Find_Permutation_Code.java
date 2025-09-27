// Find Permutation Code


public class Find_Permutation_Code {
    public static void findPermuatation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursive 
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de" ="abcd" for removing i.
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermuatation(newStr, ans+curr);

        }
    }
    public static void main(String args[]) {
        String str = "abc";
        findPermuatation(str, "");
    }
}
