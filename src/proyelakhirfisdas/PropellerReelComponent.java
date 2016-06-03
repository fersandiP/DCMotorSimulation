/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyelakhirfisdas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import javax.imageio.*;
import java.awt.image.*;

/**
 *
 * @author Fersandi Pratama
 */
public class PropellerReelComponent extends JComponent{
    private static final int WIDTH = 1000;
    private static final int LENGTH = 800;
    private double rotation;
    private double w;
    private boolean direction;
    private Image image;
    
    
    public PropellerReelComponent(){
        setSize(WIDTH,LENGTH);
        rotation = 0;
        
        prepareImage();
    }
    
    public void setRotation(double w, boolean direction){
        this.direction = direction;
        this.w = w;
    }
    
     private void prepareImage(){
        image = null;
        try {
            image = (new ImageIcon(getClass().getResource("/Asset/Propeller_Reel.png"))).getImage();
        } catch (Exception E){
            
        }
    }
    
    public void rotateImage(){
        rotation += ((direction) ? w : -w);
        
        repaint();
    }
    
     @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        Graphics2D g2d = (Graphics2D) g;

        AffineTransform transform = new AffineTransform();

        transform.rotate(rotation/180.0 *2*Math.PI,500,375);
        
        g2d.drawImage(image, transform,null);
    }
}
