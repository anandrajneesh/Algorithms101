package algorithm.projecteuler;

/**
 * Author: Anand Rajneesh
 * Date: 29/12/14
 */
public abstract class AbstractSolution<T> {

    public static void main(String[] args) {
        System.out.println(String.format("Answer for problem : %s is, %s", problem(), ));
    }


    public abstract T solve();

    public abstract String problem();


}
