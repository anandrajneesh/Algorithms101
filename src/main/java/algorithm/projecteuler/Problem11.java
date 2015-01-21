package algorithm.projecteuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author: Anand Rajneesh
 * Date: 21/01/15
 */
public class Problem11 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/algorithm/projecteuler/problem11.txt"))){

            System.out.println(br.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("time taken " + (System.currentTimeMillis() - start));
    }
}
