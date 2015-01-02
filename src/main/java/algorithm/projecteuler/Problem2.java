package algorithm.projecteuler;

/**
 * Created with IntelliJ IDEA.
 * User: Anand_Rajneesh
 * Date: 1/1/15
 * Time: 4:18 PM
 */
public class Problem2 {

    public static void main(String[] args) {

        long limit = 4000000l;
        long num1 = 1l;
        long num2 = 2l;
        long result = 0l;
        do{
            if(num2%2==0){
                result+=num2;
            }
            long tmp = num2;
            num2 = num2+num1;
            num1 = tmp;


        }while(num2<limit);

        System.out.println(result);
    }

}
