/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg02;

/**
 *
 * @author jaime
 */
public class recursividad {
    public static int factorial (int n){
        if (n==0){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    
    public static int sumaVector (int vector [],int n){
        if(n==0){
            return vector[n];
        }else{
            return sumaVector (vector,n-1) + vector[n];
        }
        
    }
    
    public static int multVector (int vector [], int n){
        if(n==0){
            return vector[n];
        }else{
            return multVector (vector, n-1) * vector[n];
            
        }
    }
}
