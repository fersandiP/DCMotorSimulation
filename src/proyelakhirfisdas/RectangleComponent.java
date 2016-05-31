/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyelakhirfisdas;

import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;

/**
 *
 * @author Sandi
 */
public class RectangleComponent extends JComponent{
    private static final int LENGTH = 200;
    private static final int WIDTH = 200;
    
    private int rotation;
    
    public RectangleComponent(){
        super();
        setSize(LENGTH, WIDTH);
        rotation = 1;
    }
    
    public void rotateComponent(){
        repaint();
        
        rotation++;
    }
        
    @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        Graphics2D g2d = (Graphics2D) g;

        // The 20x20 rectangle that you want to draw
        Rectangle2D rect = new Rectangle2D.Double( 50, 50, 100, 100 );

        // This transform is used to modify the rectangle (an affine
        // transform is a way to do operations like translations, rotations,
        // scalings, etc...)
        AffineTransform transform = new AffineTransform();

        // 3rd operation performed: translate the rectangle to the desired
        // x and y position
        transform.rotate(rotation/180.0 *2*Math.PI,100,100);
        
        // Apply the affine transform
        Shape s = transform.createTransformedShape( rect );

        // Fill the shape with the current paint
        g2d.fill( s );

        // Stroke the edge of the shape with the current paint
        g2d.draw( s );
    }
}
