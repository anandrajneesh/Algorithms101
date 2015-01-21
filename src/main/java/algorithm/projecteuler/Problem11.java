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
        int [][] grid = new int[20][20];
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/algorithm/projecteuler/problem11.txt"))){
            String tmp = null;
            int index = 0;
            while((tmp = br.readLine())!= null){
                String [] splits = tmp.split(" ");
                int [] a = new int[splits.length];
                for(int i = 0; i<splits.length; i++){
                    a[i] = Integer.parseInt(splits[i]);
                }
                grid[index] = a;
                index++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
       /* for(int[] inner : grid){
            for(int i : inner){
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        int left = 1,right  = 1;

        for(int index = 0; index < grid.length ; index++){
            int[] a = grid[index];
            left : for(int l = 0; l<a.length;l+=4){
                int tmp = a[l]*a[l+1]*a[l+2]*a[l+3];
                left = left > tmp ? left : tmp;
            }

            right : for(int l = a.length-1; l>=0;l-=4){
                int tmp = a[l]*a[l-1]*a[l-2]*a[l-3];
                right = right > tmp ? right : tmp;
            }
        }
        System.out.println(left);
        System.out.println(right);

        System.out.println("time taken " + (System.currentTimeMillis() - start));
    }
}
