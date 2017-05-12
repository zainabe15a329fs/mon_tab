/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_tableau;
 import java.util.Scanner;
/**
 *
 * @author MOUSTAPHA
 */
public class Mon_tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int[] monTableau=new int[10];
      int[] tab={12,15,13,10,8,9,13,14};
      int n;
      Scanner sc=new Scanner(System.in);
      
  
      boolean estLa=false;
      //terminal.ecrireString("Entrez_le_nombre_a_chercher:_");
      System.out.println("Entrez_le_nombre_a_chercher:_");
      n=sc.nextInt();
      //terminal.ecrireString("Entrez_le_nombre_a_chercher:_")
      //n=terminal.lireInt()
      for(int i=0;i<tab.length;i++){
          if(tab[i]==n){
             estLa=true; 
          }
      }
      if(estLa){
          //terminal.ecrireString("le_nombre_est_dans_le_tableau")
          System.out.println("le_nombre_est_danst_le_tableau");
      }else{
          //terminal.ecrireString("le_nombre_n_est_pas_dans_le_tableau")
          System.out.println("le_nombre_n_est_pas_dans_le_tableau");
      }
    }
}
