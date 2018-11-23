/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.input.pkg2d;
import java.util.Scanner;
 /*
/**
 * @author MAX
 */
public class UserInput2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int x = in.nextInt();
        System.out.println("Enter Columns:");
        int y = in.nextInt();
        
        int[][] a = new int[x][y];
        
        for(int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Row "+i+" Column"+j);
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
