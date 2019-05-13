/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
    public void Lanzar(){
       RandomDado dado = new RandomDado();
       RandomDado dado1 = new RandomDado(); 
       
       int m2=0,m3=0,m4=0,m5=0,m6=0,m7=0,m8=0,m9=0,m10=0,m11=0,m12=0;
       
        for (int i=0; i<1000;i++){
        int suma = (dado.operacion()+dado1.operacion());
        if (suma==2){
            m2++;
        }
        if (suma==3){
            m3++;
        }
        if (suma==4){
            m4++;
        }    
        if (suma==5){
            m5++;
            
        }
        if (suma==6){
            m6++;
            
        }
        if (suma==7){
            m7++;
            
        }
        if (suma==8){
            m8++;
            
        }
        if (suma==9){
            m9++;
            
        }
        if (suma==10){
            m10++;
            
        }
        if (suma==11){
            m11++;
            
        }
        if (suma==12){
            m12++;
            
        }
        }
        System.out.println("La frecuencia es:"+m2
        
        );
        
        
    }

    
            
    
}
