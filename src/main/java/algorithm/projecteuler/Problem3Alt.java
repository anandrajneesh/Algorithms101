package algorithm.projecteuler;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 1/1/15
 * Time: 4:45 PM
 */
public class Problem3Alt {

    public static void main(String[] args) {

        long num = 600851475143l;
        long tmp = num;
        long i = 2  ;
        for(;i < tmp; ){
           if(tmp % i ==0 ){
               tmp = tmp/i;
           }
            else i = i==2 ? 3 : i+2;
        }
        System.out.println(i);
    }


    public static boolean isPrime(long m){
        for(long i = 2; i <= m/2; i++){
            if(m%i == 0) return false;
        }
        return true;
    }
}
