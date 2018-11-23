/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibofactor;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class FibonacciFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        display();
    }
    static int fib(int n){
        switch (n){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fib(n-1) + fib(n-2);
        }
    }
    static int fac(int n){
        if(n<=1){
            return 1;
        }else
            return n*fac(n-1);
    }
    static int size(){
        Scanner f = new Scanner(System.in);
        System.out.println("Enter Size:");
         return f.nextInt();
    }
    
    static void display(){
        Scanner f = new Scanner(System.in);
        System.out.println("Enter either 'Factorial' or 'Fibonacci':");
        String op;
        do{
            op = f.nextLine();
        if ("Factorial".equalsIgnoreCase(op)) {
            int size  = size();
            int[] elemt = new int[size];
        System.out.println("Enter the Elements:");
            for (int i = 0; i < size; i++) {
                elemt[i] = f.nextInt();
            }
            for (int i = 0; i < size; i++) {
                System.out.print("f("+elemt[i]+")"+"\t");
            }
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.print(fac(elemt[i])+"\t");
            }
        }else if ("Fibonacci".equalsIgnoreCase(op)) {
            int size  = size();
            int[] elemt = new int[size];
        System.out.println("Enter the Elements:");
            for (int i = 0; i < size; i++) {
                elemt[i] = f.nextInt();
            }
            for (int i = 0; i < size; i++) {
                System.out.print("f("+elemt[i]+")"+"\t");
            }
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.print(fib(elemt[i])+"\t");
            }
            
        }else{
            System.out.println("Invalid. Please pick either 'Factorial' or 'Fibonacci'");
            
        }
    }while(!op.equalsIgnoreCase("Factorial")&&!op.equalsIgnoreCase("fibonacci"));
    }
    
}
