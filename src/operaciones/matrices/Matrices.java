
package operaciones.matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Matrices {
    
    public void LlenarMatriz (int [][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz [i][j]= Integer.parseInt(JOptionPane.showInputDialog("Teclea el elemento ["+i+"] ["+j+"]"));
            }
        }
        String s="Tabla\n";
         for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                s=s+matriz[i][j]+"\t";
            }
            s=s+"\n";
        }
        System.out.println(s);
    }
    
    public String ImprimirMatriz (int [][] mat) {
        String res ="\n";
        for(int i=0; i<mat.length;i++);{
            int i = 0;
        for (int k=0;k<mat[i].length;k++){
            res=res+mat[i][k]+"   ";
            
        }
        
        
        return res;
    }
  
                
    }
     public void sumaMatrices (int[][] mat1, int[][] mat2, int[][] matSuma){
        for (int i=0;i<mat1.length;i++){
            for (int k=0;k<mat1[i].length;k++){
                matSuma[i][k]=mat1[i][k]+mat2[i][k];
            }
        }
    }
    
     public void restaMatrices (int[][] mat1, int[][] mat2, int[][] matResta ){
         for (int i=0;i<mat1.length;i++){
             for (int k=0;k<mat1[i].length;k++){
                 matResta[i][k]=mat1[i][k]-mat2[i][k];
             }
         }
     }
    
    
}
