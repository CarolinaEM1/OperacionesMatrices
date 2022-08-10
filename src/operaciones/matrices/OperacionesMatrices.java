/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.matrices;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class OperacionesMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matrices ob= new Matrices();
        
        int r,c;
        r=Integer.parseInt(JOptionPane.showInputDialog("Teclea el número de renglones"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Teclea el número de columnas"));
        int [][] ar=new int [r][c];
        
        System.out.println("Numero de renglones ="+ar.length);
        System.out.println("Numero de columnas ="+ar[0].length);
        
        
        
        ob.LlenarMatriz(ar);
        System.out.println("Matriz uno\n"+ob.ImprimirMatriz(ar));
        
        int [][] ar2= new int [r][c];
        ob.LlenarMatriz(ar2);
        System.out.println("Matriz dos\n"+ob.ImprimirMatriz(ar2));
        
                
    
        int [][] ar3= new int [r][c];
        ob.sumaMatrices(ar, ar2, ar3);
        System.out.println("Suma de matriz 1 mas matriz 2\n"+ob.ImprimirMatriz(ar3));
        
        ob.sumaMatrices(ar2, ar, ar3);
        System.out.println("Suma de matriz 2 mas matriz 1\n"+ob.ImprimirMatriz(ar3));
        
        ob.restaMatrices(ar, ar2, ar3);
        System.out.println("Resta de matriz 1 menos matriz 2\n"+ob.ImprimirMatriz(ar3));
        
        ob.restaMatrices(ar2, ar, ar3);
        System.out.println("Resta de matriz 2 menos matriz 1\n"+ob.ImprimirMatriz(ar3));
        
        System.exit(0);
    }
    
}
