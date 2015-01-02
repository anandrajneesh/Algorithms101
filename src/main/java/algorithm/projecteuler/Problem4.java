package algorithm.projecteuler;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 1/1/15
 * Time: 4:54 PM
 */
public class Problem4 {
    public static void main(String[] args) {
        int tmp = 0;
        for(int i = 999; i>= 100; i--){
            for(int j = 999;j>=100;j--){
                int n = i*j;
                if(isPallindrome(n) && n > tmp){
                    tmp = n;
                }
            }
        }
        System.out.println(tmp);
    }

    public static boolean isPallindrome(int n) {
        String tmp = Integer.toString(n);
        char[] digits = tmp.toCharArray();
        for (int i = 0; i <= digits.length / 2; i++) {
            if(digits[i] != digits[(digits.length-1)-i])
                return false;
        }
        return true;
    }
}
