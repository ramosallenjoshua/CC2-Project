/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        display();
    }
    static int fib(int n){
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default: 
                return fib(n-1)+fib(n-2);
        }
    }
    static void display(){
        Scanner p = new Scanner(System.in);
        System.out.println("Enter a Number");
        int g = p.nextInt();
        for(int i = -1; i<g; i++){
            int s = i+1;
            System.out.print("f("+s+")"+"\t");
        }
        
        for(int i = -1; i<g; i++){
            System.out.println();
            for(int y = -1; y<=i; y++){
                int fi = fib(y+1);
                System.out.print(fi+"\t");
            
        }
        }
    }
}
        
    

