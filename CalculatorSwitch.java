/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.pkgswitch;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class CalculatorSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner n = new Scanner(System.in);
    
    int x, y;
    char operator;
    
    System.out.println("Enter the first number");
    x = n.nextInt();
    System.out.println("Enter the operator");
    operator = n.next().charAt(0);
    System.out.println("Enter the second number");
    y = n.nextInt();
    
    double addition = x+y;
    double subtraction = x-y;
    double multiplication = x*y;
    double division = x/y;
    
    switch(operator){
        case '+':
            System.out.println("Sum="+addition);
            break;
        case '-':
            System.out.println("difference="+subtraction);
            break;
        case '*':
            System.out.println("Product="+multiplication);
            break;
        case '/':
            System.out.println("Quotient="+division);
            break;
        default:
            System.out.println("Invalid Operator");    }
    
    
    
    }
    
}
