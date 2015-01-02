package algorithm.projecteuler;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 1/2/15
 * Time: 1:53 PM
 */
public class Problem6 {
    public static void main(String[] args) {
        int n = 100;
        int sumN = (n*(n+1))/2;
        System.out.println((sumN*sumN)-((n*(n+1)*(2*n+1))/6));
    }
}
