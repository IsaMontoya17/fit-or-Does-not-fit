
package calentamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class Calentamiento {

    public static void main(String[] args) {

        int N = 0;
        Scanner pedir = new Scanner(System.in);
        N= pedir.nextInt();
        int potencia = (int) Math.pow(2, 31);
        int j=0;
        ArrayList<int[]> vectorPrincipal = new ArrayList<>();
        
        while(j<N){
            
            int a = pedir.nextInt();
            
            while (a < 1 || a >= potencia) {
                a = pedir.nextInt();
            }
            
            String aa = String.valueOf(a);
            int vector2[]=new int[aa.length()];
            
            for(int i=0; i<vector2.length; i++){
                int dato = Character.getNumericValue(aa.charAt(i));
                vector2[i]= dato;
            }

            vectorPrincipal.add(vector2);
            
            int b = pedir.nextInt();

            while(b<1 || b>=potencia){
                b = pedir.nextInt();
            }
            
            String bb = String.valueOf(b);
            int vector3[]=new int[bb.length()]; 
            
            for (int i = 0; i < vector3.length; i++) {
                int dato = Character.getNumericValue(bb.charAt(i));
                vector3[i] = dato;
            }
            
            vectorPrincipal.add(vector3);
            
            j++;
        } 
        
        int algo=0;
        
        while(algo<vectorPrincipal.size()){

            int tamaño = (vectorPrincipal.get(algo).length)-(vectorPrincipal.get(algo+1).length);
            int avanceVB=0;
            int cont=0;
            
            for(int i=tamaño; i<vectorPrincipal.get(algo).length; i++){
                if(vectorPrincipal.get(algo)[i]==vectorPrincipal.get(algo+1)[avanceVB]){
                    cont++;
                }
                avanceVB++;
                
            }
            
            if(cont==vectorPrincipal.get(algo+1).length){
                System.out.println("fit");
            }
            else{
                System.out.println("Does not fit");
            }
            
            algo+=2;
        }

    }//
  
}



