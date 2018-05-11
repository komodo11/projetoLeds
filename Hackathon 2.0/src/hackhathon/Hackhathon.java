/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackhathon;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Laranja
 */ 

public class Hackhathon {

   
public static double getDistancia(double latitude, double longitude, double latitudePto, double longitudePto){
	    double dlon, dlat, a, distancia;
	    dlon = longitudePto - longitude;
	    dlat = latitudePto - latitude;
	    a = Math.pow(Math.sin(dlat/2),2) + Math.cos(latitude) * Math.cos(latitudePto) * Math.pow(Math.sin(dlon/2),2);
	    distancia = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return 6378140 * distancia; /* 6378140 is the radius of the Earth in meters*/
	}
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(Exception e){}
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        int contador;
        double percurso;
        double tempo;
        double tempo_espera;
        
        rotas rota[] =  new rotas[5];         
       
        
        for(contador = 0; contador < 1; contador++){

	percurso = getDistancia(-4.9730249, -39.0194704,-4.96857 , -39.0133757);
        System.out.println("Percurso: "+percurso+"metros");

	tempo = percurso/16.6667;     
         System.out.println("Tempo: "+tempo);
        //60 km/h => 16,6667 m/s, tempo em segundos
	tempo_espera = (tempo);		//95% do tempo
        System.out.println("Tempo: "+tempo_espera);
        
       int tempoe = (int) tempo_espera;
   
       System.out.println(tempoe);
       sleep(tempoe*1000);
	//Informar o Servidor
        
        }										
          
        
    }
    
}
