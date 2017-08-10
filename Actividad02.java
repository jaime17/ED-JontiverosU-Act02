/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg02;
import java.util.*;

/**
 *
 * @author jaime
 */
public class Actividad02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(recursividad.factorial(10));
      int [] vector = {10,20,30,20};
        System.out.println(recursividad.sumaVector(vector, vector.length-1));
        System.out.println(recursividad.multVector(vector, vector.length-1));
        
       
    }
    
}
