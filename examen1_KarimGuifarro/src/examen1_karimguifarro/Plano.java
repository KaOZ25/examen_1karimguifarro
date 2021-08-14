/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_karimguifarro;

import java.util.ArrayList;

/**
 *
 * @author Karim Ozael
 */
public class Plano {
    private int x;
    private int y;
    private ArrayList <figura> figu= new ArrayList();

    public Plano(int x, int y) {
        this.x = x;
        this.y = y;
    }
   

    public ArrayList<figura> getFigu() {
        return figu;
    }

    public void setFigu(ArrayList<figura> figu) {
        this.figu = figu;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Plano{" + "x=" + x + ", y=" + y + '}';
    }
    
}
