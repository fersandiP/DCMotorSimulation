/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyelakhirfisdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Sandi
 */
public class DCMotorFrame extends javax.swing.JFrame {
    private static final int TIMER_DELAY = 1;
    private Timer timer;

    /**
     * Creates new form MainFrame
     */
    public DCMotorFrame() {
        initComponents();
        setResizable(false);
        setSize(1000,800);
          
        prepareTimer();        
    }
    
    public void prepareRotation(double w, boolean arahB, boolean arahI){
        w *= 1000;
        propellerMagnetComponent.setRotation(w, arahB);
        propellerReelComponent.setRotation(w, arahI);
    }
    
    private void prepareTimer(){
        class TimerListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                propellerMagnetComponent.rotateImage();
                propellerReelComponent.rotateImage();
            }
        }
        
        timer = new Timer(TIMER_DELAY, new TimerListener());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MagnetNS = new javax.swing.JLabel();
        propellerMagnetComponent = new proyelakhirfisdas.PropellerMagnetComponent();
        propellerReelComponent = new proyelakhirfisdas.PropellerReelComponent();
        BatteryLeft = new javax.swing.JLabel();
        BatteryRight = new javax.swing.JLabel();
        Circuit = new javax.swing.JLabel();
        MagnetSN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                onOpened(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                onDispose(evt);
            }
        });
        getContentPane().setLayout(null);

        MagnetNS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Magnet_Side_NS.png"))); // NOI18N
        getContentPane().add(MagnetNS);
        MagnetNS.setBounds(0, 80, 1000, 563);

        propellerMagnetComponent.setRequestFocusEnabled(false);
        getContentPane().add(propellerMagnetComponent);
        propellerMagnetComponent.setBounds(0, -40, 1000, 800);
        getContentPane().add(propellerReelComponent);
        propellerReelComponent.setBounds(0, -40, 1000, 800);

        BatteryLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Battery_Right.png"))); // NOI18N
        getContentPane().add(BatteryLeft);
        BatteryLeft.setBounds(0, -40, 1000, 800);

        BatteryRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Battery_Left.png"))); // NOI18N
        BatteryRight.setText("jLabel3");
        getContentPane().add(BatteryRight);
        BatteryRight.setBounds(0, -40, 1000, 800);

        Circuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Circuit.png"))); // NOI18N
        Circuit.setText("jLabel2");
        getContentPane().add(Circuit);
        Circuit.setBounds(0, -40, 1000, 800);

        MagnetSN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/Magnet_Side_SN.png"))); // NOI18N
        getContentPane().add(MagnetSN);
        MagnetSN.setBounds(0, -40, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onDispose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onDispose
        timer.stop();
    }//GEN-LAST:event_onDispose

    private void onOpened(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_onOpened
        timer.start();
    }//GEN-LAST:event_onOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BatteryLeft;
    private javax.swing.JLabel BatteryRight;
    private javax.swing.JLabel Circuit;
    private javax.swing.JLabel MagnetNS;
    private javax.swing.JLabel MagnetSN;
    private proyelakhirfisdas.PropellerMagnetComponent propellerMagnetComponent;
    private proyelakhirfisdas.PropellerReelComponent propellerReelComponent;
    // End of variables declaration//GEN-END:variables
}
