/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.game;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner n = new Scanner(System.in);
        System.out.println("Enter a number from 1-1000:");
    int y = n.nextInt();
    
    do{
    if(y < 1 || y > 1000){
        System.out.println("Invalid Number");
        y = n.nextInt();
    }
    }while(y < 1 || y > 1000);
        
    int f = 0;
    while(f < 20){
        System.out.println(" ");
        f++;
    }
    
        System.out.println("Guess the Number from 1 - 1000:");
    int u = n.nextInt();
    do{
        if(u>1000 || u<1){
            System.out.println("Invalid Number");
            u = n.nextInt();
        }
        else if(u<y){
            System.out.println("Wrong");
            System.out.println("The number is higher");
            if(y % 2 == 0 && u % 2 != 0){
                System.out.println("The number is an even number");
            }
            if(y % 2 != 0 && u % 2 == 0){
                System.out.println("The number is an odd number");
            }
            u = n.nextInt();
        }
        else if(u>y){
            System.out.println("Wrong");
            System.out.println("The number is lower");
            if(y % 2 == 0 && u % 2 != 0){
                System.out.println("The number is an even number");
            }
            if(y % 2 != 0 && u % 2 == 0){
                System.out.println("The number is an odd number");
            }
            u = n.nextInt();
        }
        
        if(u==y){
            System.out.println("You are correct!");
        }
        
    }while(u!=y);
    }
    
    }
    

