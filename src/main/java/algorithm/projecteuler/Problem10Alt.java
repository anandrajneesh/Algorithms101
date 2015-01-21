package algorithm.projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Anand Rajneesh
 * Date: 21/01/15
 */
public class Problem10Alt
{

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Long> primes = new ArrayList<Long>();
        primes.add(2l);
        long twoMil = 2000000l;
        //long twoMil = 10l;
        long sum = 2l;
        outerloop : for(long i = 3;i <=twoMil ; i++){
            long sqrt = (long) Math.sqrt(i);
            for(long prime : primes){
                if(prime <= sqrt && i%prime==0){
                       continue outerloop;
                }
            }
            System.out.println(i);
            primes.add(i);
            sum+=i;

        }
        System.out.println(sum);
        System.out.println("time taken "+(System.currentTimeMillis()-start));
    }
}
