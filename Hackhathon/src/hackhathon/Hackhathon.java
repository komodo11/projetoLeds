/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackhathon;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Laranja
 */ 

public class Hackhathon {

   
  static double distancia(double latitude1, double longitude1, double latitude2, double longitude2){
	
    return Math.sqrt((latitude1 - longitude1)*(longitude1 - latitude1))+ 
                    ((latitude2 - longitude2)*(longitude2 - latitude2));    
    }

    public static void main(String[] args) {
        
        int contador;
        double percurso;
        double tempo;
        double tempo_espera;
        rotas rota[] =  new rotas[5];         
    
        
        for(contador = 0; contador < 1; contador++){

	percurso = distancia(1, 2, 3, 4 );
                    System.out.println("Tempo: "+percurso);

	tempo = percurso/16.6667;				//60 km/h => 16,6667 m/s, tempo em segundos
	tempo_espera = (tempo - (tempo/20));		//95% do tempo
            System.out.println("Tempo: "+tempo_espera);
            int tempoe = (int) tempo_espera;
        new Reminder(tempoe);
        
	//Informar o Servidor
}										

        
    }
    
}
