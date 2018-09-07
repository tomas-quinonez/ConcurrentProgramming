/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2_Bis;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Tomas
 */
public class Recurso {
    private int r;
    private Semaphore mutex;
    Recurso(int r){
        this.r=r;
        this.mutex=new Semaphore(1,true);
    }
    public void aumentar() throws InterruptedException{
        mutex.acquire();
        this.r++;
        System.out.println(this.r);
        mutex.release();
    }
    public void multPorDos() throws InterruptedException{
        mutex.acquire();
        this.r=this.r*2;
        System.out.println(this.r);
        mutex.release();
    }
}
