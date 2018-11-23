/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle:");
        double r = in.nextDouble();
        
        System.out.println("Enter the Side of the Square:");
        double s = in.nextDouble();
        
        System.out.println("Enter the Height of the Triangle:");
        double h = in.nextDouble();
        
        System.out.println("Enter the Base of the Triangle:");
        double b = in.nextDouble();
        
        double circle = Math.PI*Math.pow(r, 2);
        double square = Math.pow(s,2);
        double triangle = (b*h)/2;
        
        System.out.println("Area of Circle: "+circle);
        System.out.println("Area of Square: "+square);
        System.out.println("Area of Triangle: "+triangle);
    }
    
}
