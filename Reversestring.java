/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Reversestring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        Scanner ss=new Scanner(System.in);
        s=ss.nextLine();
        String ans=new StringBuilder(s).reverse().toString();
    }
    
}
