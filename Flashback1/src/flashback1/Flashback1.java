/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashback1;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm BSD
 */
public class Flashback1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,kelas,hbi,nama_hobi = null;
        
        
        
        
         Scanner inputan= new Scanner(System.in);
         
         for(int i=1;i<3;i++)
         {
             System.out.println("data peserta ke-"+i);
             
         System.out.print("nama: ");
         nama=inputan.nextLine();
         System.out.print("kelas: ");
         kelas=inputan.nextLine();
         System.out.print("hobi [bas/ban/mad]: ");
         hbi=inputan.nextLine();
         
          switch(hbi){
            case "bas":
                nama_hobi="basket" ;
                break;
            case "ban": 
                nama_hobi="band";
                break;
            case "mad":
                nama_hobi="mading";
                break;
                default:
                System.out.print("hobi tidak tersedia") ;
                break;
         }
                
               System.out.println("Terimakasih telah menginput " +nama+ "kelas " +kelas+ "dan hobi "+nama_hobi);
         
         
         
    }}}
    

