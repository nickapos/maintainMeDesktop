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

package gr.oncrete.nick.mybill.UserInterface;

import gr.oncrete.nick.mybill.BusinessLogic.InvertRecord;

/**
 *
 * @author nickapos
 */
public class InvertRecordWindow extends javax.swing.JFrame {

    /** Creates new form AboutWindow */
    public InvertRecordWindow() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        recordIdTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();

        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle"); // NOI18N
        jLabel3.setText(bundle.getString("RECORD TYPE")); // NOI18N
        jPanel1.add(jLabel3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Expenses", "Income" }));
        jPanel1.add(jComboBox1);

        jLabel2.setText(bundle.getString("RECORD ID")); // NOI18N
        jPanel1.add(jLabel2);

        recordIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordIdTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(recordIdTextField);
        jPanel1.add(jLabel4);

        jButton1.setText(bundle.getString("INVERT!")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jLabel1.setText(bundle.getString("STATUS:")); // NOI18N
        jPanel1.add(jLabel1);

        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText(bundle.getString("READY")); // NOI18N
        jPanel1.add(statusLabel);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recordIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recordIdTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InvertRecord invr = new InvertRecord();
        String recordToBeInverted = (String) recordIdTextField.getText();

        int recordToBeInvertedId = invr.convertID(recordToBeInverted);
        if (recordToBeInvertedId == -1) {
            statusLabel.setText(java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("INVALID RECORD ID"));
        } else if (recordToBeInvertedId == -3) {
            statusLabel.setText(java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("EMPTY RECORD ID"));
        } else if (recordToBeInvertedId >0) {
            int recordTypeToBeInverted = jComboBox1.getSelectedIndex();
            if (recordTypeToBeInverted == 0) {
                //if we have incoming type expenses
                invr.invertExpense(recordToBeInvertedId);
                statusLabel.setText(java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("DONE!"));
            } else if (recordTypeToBeInverted == 1) {
                //if we have incoming type income
                invr.invertIncome(recordToBeInvertedId);
                statusLabel.setText(java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("DONE!"));
            } 
        }else {
                statusLabel.setText(java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("INVALID RECORD TYPE SELECTED"));
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvertRecordWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField recordIdTextField;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

    /**
     *
     */
    public void showInvertRecord()
    {
        this.setVisible(true);
    }
}