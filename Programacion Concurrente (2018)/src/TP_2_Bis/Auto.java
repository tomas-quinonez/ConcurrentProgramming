/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2_Bis;

/**
 *
 * @author tomas.quinonez
 */
public class Auto extends Vehiculo implements Runnable{
    public Auto(String pat,String mod,String marca,int km){
        super(pat,mod,marca,km);
    }
    public void run(){
        System.out.println("El auto "+Thread.currentThread().getName()+" esta a "+this.kmParaEstacion+" de la estacion.");
        try{
            Thread.sleep(kmParaEstacion*1000);
        }catch(Exception e){}
        System.out.println("El auto "+Thread.currentThread().getName()+" empieza a cargar nafta.");
        
    }
}
