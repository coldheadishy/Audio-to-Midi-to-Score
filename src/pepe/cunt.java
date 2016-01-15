/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepe;

import java.awt.*; 
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class cunt extends JApplet {

    public void init() {
        setBackground(Color.white);
        setForeground(Color.white);
    }
    public void paint(Graphics g) {
          Graphics2D g2d = (Graphics2D)g;
      int bytes, seconds, frequency;
      try {
      FileInputStream fis = new FileInputStream("./pepe.wav");
      BufferedInputStream b = new BufferedInputStream(fis);
      byte[] data = new byte[128];
      b.skip(44);
      seconds = 0;
      g2d.setPaint(Color.RED);
      while ((bytes = b.read(data)) > 0) {
        for(int i=0; i<bytes; i++) {
                frequency = data[i] & 0xFF; // Java..
                System.out.println(seconds + " " + frequency);
                Line2D line = new Line2D.Double(seconds, frequency+300, seconds, -frequency+300);
                g2d.draw(line);
                seconds++;
        }
        
      }
      b.read(data);
      b.close();
    } catch(Exception e) {
      e.printStackTrace();
      
    }
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jInternalFrame1 = new javax.swing.JInternalFrame();
        panel1 = new java.awt.Panel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jInternalFrame1, org.jdesktop.beansbinding.ObjectProperty.create(), panel1, org.jdesktop.beansbinding.BeanProperty.create("visible"));
        bindingGroup.addBinding(binding);

        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jInternalFrame1, org.jdesktop.beansbinding.ObjectProperty.create(), jScrollBar1, org.jdesktop.beansbinding.BeanProperty.create("border"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 257, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        JFrame f = new JFrame("Line");
        f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
         });
         JApplet applet = new cunt();
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(800, 700));
        f.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollBar jScrollBar1;
    private java.awt.Panel panel1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

//public class Main extends JApplet {
//   public void init() {
//      setBackground(Color.white);
//      setForeground(Color.white);
//   }
//   public void paint(Graphics g) {
//      Graphics2D g2 = (Graphics2D) g;
//      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//      RenderingHints.VALUE_ANTIALIAS_ON);
//      g2.setPaint(Color.gray);
//      int x = 5;
//      int y = 7;
//      g2.draw(new Line2D.Double(x, y, 200, 200));
//      g2.drawString("Line", x, 250);
//   }
//   public static void main(String s[]) {
//      JFrame f = new JFrame("Line");
//      f.addWindowListener(new WindowAdapter() {
//         public void windowClosing(WindowEvent e) {
//            System.exit(0);
//         }
//      });
//      JApplet applet = new Main();
//      f.getContentPane().add("Center", applet);
//      applet.init();
//      f.pack();
//      f.setSize(new Dimension(300, 300));
//      f.setVisible(true);
//   }
//}
