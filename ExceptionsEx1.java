/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.ex1;
import java.io.*;
import java.util.*;

/**
 *
 * @author mosta
 */
public class ExceptionsEx1 {


  public static void main(String[] args) throws IOException, FileNotFoundException {
    try{
        File inFile = new File ("input.txt"); 
        File outFile = new File ("output.txt");       
        FileWriter fWriter = new FileWriter (outFile);
        PrintWriter pWriter = new PrintWriter (fWriter);
        
        Scanner sc = new Scanner (inFile);
        String line = sc.nextLine();
        pWriter.println(line);
        pWriter.close();
    } catch(Exception e) {
        e.printStackTrace();
    }
    
          }

    
}
