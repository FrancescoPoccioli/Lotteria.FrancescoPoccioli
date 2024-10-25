/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;
import java.io.BufferedReader;
import java.util.logging.Logger;
import java.logging.level;

/**
 *
 * @author monica ciuchetti
 * @author alessandro castellani
*/
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public class Lotteria{
        
    public static void main(String[] args) {
        // Scelta del numero dei numeri da estrarre
        
        // Istanza ed avvio del thread Estrazione
        
        try{
            int n = integer.parseInt(br.readLine()); 
        BufferedReader br=new BufferedReader(new inputStreamReader(System.in));
        n=br.readLine();
        Estrazione e = new Estrazione(n);
        system.in.readLine    
        }catch(exception ex){
            
        }
        
       
       
        // Istanza di alcuni thread Giocatore
        Giocatore g1 = new Giocatore(1,"Francesco", e);
        Giocatore g2 = new Giocatore(2,"federico", e);
        Giocatore g3 = new Giocatore(3,"matteo", e);
        // Avvio dei thread Giocatori
       g1.start();
       g2.start();
       g3.start();
       try{
           g1.join();
           g2.join();
           g3.join();
       }catch (interrumptedExeption ex){
           logger.getLogger(Lotteria.class.getName());
           ex.printStackTrace();
           System.err.println("errore join"); //personale
       }
       
      

           
       }
      
        // Comunicazione fine gioco
        System.out.println("FINE LOTTERIA"+ );
    }
}
   