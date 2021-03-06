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
import gr.oncrete.nick.maintainmeDesktop.RDBMS.EmptyTables;

/**
 *
 * @author nickapos
 */
public class EmptyDatabaseWindow extends javax.swing.JFrame {

    maintainmeDesktopUI mainui;

    /**
     * Creates new form AboutWindow
     */
    public EmptyDatabaseWindow(maintainmeDesktopUI ui) {
        mainui = ui;
        initComponents();
    }

    public EmptyDatabaseWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle"); // NOI18N
        setTitle(bundle.getString("EmptyDatabaseWindow.title")); // NOI18N
        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(bundle.getString("EmptyDatabaseWindow.jLabel2.text")); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);

        yesButton.setText(bundle.getString("EmptyDatabaseWindow.yesButton.text")); // NOI18N
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(yesButton);

        noButton.setText(bundle.getString("EmptyDatabaseWindow.noButton.text")); // NOI18N
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        jPanel1.add(noButton);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        PopupMessageFrame mes = new PopupMessageFrame();
        mes.setNotification(java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("ALL-THE DATABASE-CONTENT-IS-GOING-TO-BE-DELETED"));
        EmptyTables e = new EmptyTables();
        if (mainui != null) {
            mainui.refreshCompaniesCombo();
        }
        setVisible(false); //you can't see me!
        dispose();
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false); //you can't see me!
        dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_noButtonActionPerformed
    public void runEmptyDB() {
        this.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmptyDatabaseWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noButton;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
