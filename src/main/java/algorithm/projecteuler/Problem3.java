package algorithm.projecteuler;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 1/1/15
 * Time: 4:32 PM
 */
public class Problem3 {
    public static void main(String[] args) {

        long num = 600851475143l;
        long half = num/2;
        for(long i = 2;i < half; i++){
            if(isPrime(i) && num%i == 0) System.out.println(i);
        }
    }


    public static boolean isPrime(long m){
        for(long i = 2; i <= m/2; i++){
            if(m%i == 0) return false;
        }
        return true;
    }
}
