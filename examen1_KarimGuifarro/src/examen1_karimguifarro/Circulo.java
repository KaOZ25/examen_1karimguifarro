/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_karimguifarro;

import java.awt.Color;

/**
 *
 * @author Karim Ozael
 */
public class Circulo extends figura{
    private Plano [] coordenada=new Plano[1];
    private double area;

    public Circulo(double area, Color color, int x, int y) {
        super(color, x, y);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) throws exception{
        if (area<10) {
            this.area = area;
        }else {
            throw new exception(Color.red,"Radio invalido");
        }
       
    }
   

    public Plano[] getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Plano[] coordenada) {
        this.coordenada = coordenada;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "coordenada=" + coordenada + ", area=" + area + '}';
    }

    
}
