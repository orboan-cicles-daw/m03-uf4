/*
 * Gui02.java
 * 
 * Copyright 2009-2010 Joaquim Laplana, Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 * 
 */

package dev.orboan.ipAdresses2;

import javax.swing.*;
import java.math.BigInteger;
import java.text.NumberFormat;

/**
 * Modelizes an UI implementing a basic Graphical User Interface. *
 */
public class Gui02 extends javax.swing.JFrame implements IUi {

    private static final long serialVersionUID = -5006158830664239711L;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCalculate;
    private javax.swing.JButton jbQuit;
    private javax.swing.JLabel jlCapacity;
    private javax.swing.JTextField jtfNB;
    private javax.swing.JTextField jtfNC;

    /** Visibility to the controller. */
    private Controller c;

    /**
     * Constructor
     */
    public Gui02() {
        this.initComponents();
        this.createController();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNC = new javax.swing.JTextField();
        jtfNB = new javax.swing.JTextField();
        jlCapacity = new javax.swing.JLabel();
        jbQuit = new javax.swing.JButton();
        jbCalculate = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        jLabel1.setText("Capacitat de connexió d'un sistema IP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 30, 250, 17);
        jLabel2.setText("Nombre de camps");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 150, 17);
        jLabel3.setText("Nombre de bits per camp");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 190, 17);
        jtfNC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfNC.setText("4");
        getContentPane().add(jtfNC);
        jtfNC.setBounds(240, 80, 70, 27);
        jtfNB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfNB.setText("8");
        getContentPane().add(jtfNB);
        jtfNB.setBounds(240, 120, 70, 27);
        jlCapacity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlCapacity.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        getContentPane().add(jlCapacity);
        jlCapacity.setBounds(15, 180, 375, 30);
        jbQuit.setText("Surt");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });
        getContentPane().add(jbQuit);
        jbQuit.setBounds(70, 250, 90, 29);
        jbCalculate.setText("Calcula");
        jbCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(jbCalculate);
        jbCalculate.setBounds(240, 250, 90, 29);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 406) / 2, (screenSize.height - 352) / 2, 406, 352);
    }

    /**
     * Creates Controller object.
     */
    private void createController() {
        this.c = new Controller(this);
    }

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jbCalculateActionPerformed(java.awt.event.ActionEvent evt) {
        this.c.interactUser();
    }

    @Override
    public int readNumberOfFields() {
        String str = jtfNC.getText();
        final int nc = Integer.parseInt(str);
        return nc;
    }

    @Override
    public int readNumberOfBits() {
        String str = jtfNB.getText();
        final int nb = Integer.parseInt(str);
        return nb;
    }

    @Override
    public void writeCapacity(final BigInteger c) {
        final NumberFormat nf = NumberFormat.getInstance();
        jlCapacity.setText(nf.format(c));
    }

    @Override
    public void writeValidationError() {
        JOptionPane.showMessageDialog(null, "Les dades d'entrada no son valides.");
    }

    /**
     * Main program. Initializes the interaction with the user.
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui02().setVisible(true);
            }
        });
    }

}
