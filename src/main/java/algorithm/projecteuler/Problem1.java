package algorithm.projecteuler;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 1/1/15
 * Time: 4:14 PM
 */
public class Problem1 {

    public static void main(String[] args) {
        int result = 0;
        for(int i = 1; i < 1000 ; i++){
            if(i % 3==0 || i % 5==0 ){
                result+=i;
            }
        }
        System.out.println(result);
    }
}
