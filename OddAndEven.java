/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.and.even;

/**
 *
 * @author MAX
 */
public class OddAndEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x[] = {3,9,15,20,65,23,18,4,2,14,21};
    
    int[] a = new int[x.length];
    int[] b = new int[x.length];
    
    int odd = 0;
    int even = 0;
    
        System.out.println("Odd \t Even");
        for(int n = 0; n < x.length; n++){
                if (x[n]%2!=0) {
                  a[odd] = x[n]; 
                  odd++;
                }
        }
        for (int n = 0; n < x.length; n++) {
            if (x[n]%2==0) {
                b[even] = x[n];
                even++;
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(a[i]+"\t"+b[i]);
        }
    }
    
}
