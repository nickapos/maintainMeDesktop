/*
 *  Copyright (C) 2010 nickapos
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * AboutWindow.java
 * This class will create a window with a text area and depending on the need
 * will present in the text are a message, be it an about or a readme.
 * Created on 11 Αυγ 2010, 9:51:33 μμ
 */
package gr.oncrete.nick.maintainmeDesktop.UserInterface;

import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.Amortization;

/**
 *
 * @author nickapos
 */
public class ImportPaypalRecordsFrame extends javax.swing.JFrame {

    /** Creates new form AboutWindow */
    public ImportPaypalRecordsFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        northPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        companiesCategoryComboBox = new javax.swing.JComboBox();
        periodLabel = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        rateLabel = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        importRecordsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        southPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        presentResultLabel = new javax.swing.JLabel();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle"); // NOI18N
        jTextField1.setText(bundle.getString("ImportPaypalRecordsFrame.jTextField1.text")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(bundle.getString("ImportPaypalRecordsFrame.title")); // NOI18N

        northPanel.setLayout(new javax.swing.BoxLayout(northPanel, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setText(bundle.getString("ImportPaypalRecordsFrame.jLabel4.text")); // NOI18N
        northPanel.add(jLabel4);

        getContentPane().add(northPanel, java.awt.BorderLayout.NORTH);

        centerPanel.setLayout(new java.awt.GridLayout(5, 2));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(bundle.getString("ImportPaypalRecordsFrame.jLabel2.text")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        centerPanel.add(jLabel2);

        companiesCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        centerPanel.add(companiesCategoryComboBox);

        periodLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        periodLabel.setText(bundle.getString("ImportPaypalRecordsFrame.periodLabel.text")); // NOI18N
        centerPanel.add(periodLabel);
        centerPanel.add(jFileChooser1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(bundle.getString("ImportPaypalRecordsFrame.jLabel3.text")); // NOI18N
        centerPanel.add(jLabel3);

        jCheckBox2.setText(bundle.getString("ImportPaypalRecordsFrame.jCheckBox2.text")); // NOI18N
        centerPanel.add(jCheckBox2);

        rateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rateLabel.setText(bundle.getString("ImportPaypalRecordsFrame.rateLabel.text")); // NOI18N
        rateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        centerPanel.add(rateLabel);

        jCheckBox1.setText(bundle.getString("ImportPaypalRecordsFrame.jCheckBox1.text")); // NOI18N
        centerPanel.add(jCheckBox1);

        importRecordsButton.setText(bundle.getString("ImportPaypalRecordsFrame.importRecordsButton.text")); // NOI18N
        importRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importRecordsButtonActionPerformed(evt);
            }
        });
        centerPanel.add(importRecordsButton);

        jLabel1.setText(bundle.getString("ImportPaypalRecordsFrame.jLabel1.text")); // NOI18N
        centerPanel.add(jLabel1);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        southPanel.setLayout(new javax.swing.BoxLayout(southPanel, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setText(bundle.getString("ImportPaypalRecordsFrame.jLabel5.text")); // NOI18N
        southPanel.add(jLabel5);

        presentResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        presentResultLabel.setText(bundle.getString("ImportPaypalRecordsFrame.presentResultLabel.text")); // NOI18N
        southPanel.add(presentResultLabel);

        getContentPane().add(southPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importRecordsButtonActionPerformed
        
    }//GEN-LAST:event_importRecordsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ImportPaypalRecordsFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JComboBox companiesCategoryComboBox;
    private javax.swing.JButton importRecordsButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel northPanel;
    private javax.swing.JLabel periodLabel;
    private javax.swing.JLabel presentResultLabel;
    private javax.swing.JLabel rateLabel;
    private javax.swing.JPanel southPanel;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    public void calcAmortization() {
        this.setVisible(true);
    }
}