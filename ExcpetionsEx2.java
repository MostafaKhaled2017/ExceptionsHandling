/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excpetions.ex.pkg2;

/**
 *
 * @author mosta
 */
public class ExcpetionsEx2 {

    static void divide(double n1, double n2){
        double result = 0;
        try{
            result = n1/n2;
            System.out.println(result);
        } 
        catch(ArithmeticException a){
            a.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        divide(5.2, 0);
    }
    
}
