/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_karimguifarro;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Karim Ozael
 */
public class Triangulo extends figura{
    private ArrayList <Plano> coordenada=new ArrayList();
    private String tipo;

    public Triangulo(String tipo, Color color, int x, int y) {
        super(color, x, y);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Plano> getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(ArrayList<Plano> coordenada) {
        this.coordenada = coordenada;
    }

   

    @Override
    public String toString() {
        return super.toString() +"Triangulo{" + "Plano=" + coordenada + ", tipo=" + tipo + '}';
    }
   
    
  

    
   
}
