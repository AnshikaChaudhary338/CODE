package JAVA.Strings;

public class Str2_String_is_Palindrone {
    public static boolean isPalindrone(String str){
        for( int i=0;i<str.length()/2;i++){
            int n = str.length();
            if( str.charAt(i) != str.charAt( n -1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str = " Racecar ";
        System.out.println(isPalindrone(str));
    }
    
}
