/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author monica ciuchetti
 */
public class Giocatore extends Thread{
        private String nomeGiocatore;
        private int idGiocatore;
        private Estrazione estrazione;

    /**
    * 
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    */
    public Giocatore(int idGiocatore, String nomeGiocatore, Estrazione estrazione) {
      this.idGiocatore=idGiocatore;
      this.nomeGiocatore=nomeGiocatore;
       this.estrazione=estrazione;
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        //presentazione giocatore // stampa info giocatore
       
       System.out.println("Il nome del giocatore è: " + nomeGiocatore + ", l'id del giocatore è: " + idGiocatore);
       // scelta del numero da giocare
       int numero = 15;
       
       //conto alla rovescia
       for(int i = 3; i>0; i--){
           System.out.println(i);
           this.sleep(1000);
           Thread.currentThread().sleep(1000);
        }
       
       // verifica del risultato
       estrazione.verfica(numero idGiocatore)
       // stampa fine verifica
       System.out.println("Il giocatore: " + idGiocatore + "ha finito di giocare" + "INIZIO");
       
    }
}
