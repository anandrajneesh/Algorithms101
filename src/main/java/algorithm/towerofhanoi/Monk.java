package algorithm.towerofhanoi;

import java.util.Scanner;

/**
 * Author: Anand Rajneesh
 * Date: 17/12/14
 */
public class Monk {

    public static int counter = 0;

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            do {
                System.out.println("Enter no of disks else enter 0 to exit");
                int disks = in.nextInt();
                if (disks == 0) {
                    break;
                }
                move(disks, 'A', 'C', 'B');
                System.out.println("Total moves -> " +counter );
                counter = 0;
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void move(int n, char origin, char dest, char temp) {
        counter ++;
        if (n == 1) {
            System.out.println(String.format("--> Move disk %s from %s to %s", n, origin, dest));
        }else{
            move(n - 1, origin, temp, dest);
            System.out.println(String.format("--> Move disk %s from %s to %s", n, origin, dest));
            move(n - 1, temp, dest, origin);
        }
    }

}
