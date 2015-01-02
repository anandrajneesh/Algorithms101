package algorithm.projecteuler;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 1/2/15
 * Time: 1:29 PM
 */
public class Problem5 {
    public static void main(String[] args) {
        int i = 21;
        outer: for(; ;i++ ){
            for(int j = 1;j<21;j++){
                if(i %j !=0) break;
                else if(j == 20) break outer;
            }
        }
        System.out.println(i);
    }
}
