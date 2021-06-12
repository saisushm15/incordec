/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.or.dec;
import java.util.Scanner;
/**
 *
 * @author konda babu
 */
public class IncOrDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%4==0)
        {
            n++;
            System.out.println(n);
        }
        else
        {
            n--;
            System.out.println(n);  
        }
        
    }
    
}
