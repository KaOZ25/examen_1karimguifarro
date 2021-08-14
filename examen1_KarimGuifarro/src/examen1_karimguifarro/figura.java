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
public class figura extends Plano{
    private Color color;

    public figura(Color color, int x, int y) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "figura{" + "color=" + color + '}';
    }
    
}
