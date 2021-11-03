/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.ex.pkg3;

import java.io.*;
import java.net.URL;

/**
 *
 * @author mosta
 */
public class ExceptionsEx3 {

public static void saveImage(String imageUrl) throws IOException {
    try{
    URL url = new URL(imageUrl);
    String fileName = url.getFile();
    String destName = "./figures" + fileName.substring(fileName.lastIndexOf("/"));
    System.out.println(destName);
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(destName);
    byte[] b = new byte[2048];
    int length;
    while ((length = is.read(b)) != -1) {
        os.write(b, 0, length);
    }
    is.close();
    os.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        saveImage("https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072821_960_720.jpg");
    }
    
}
