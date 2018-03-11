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
import gr.oncrete.nick.mybill.RDBMS.InsertIntoTable;

/**
 *
 * @author nickapos
 */
public class ExecuteSqlWindow extends javax.swing.JFrame {

    /** Creates new form AboutWindow */
    public ExecuteSqlWindow() {
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sqlTextArea = new javax.swing.JTextArea();
        executeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle"); // NOI18N
        setTitle(bundle.getString("ExecuteSqlWindow.title")); // NOI18N
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        jLabel2.setText(bundle.getString("ExecuteSqlWindow.jLabel2.text")); // NOI18N
        getContentPane().add(jLabel2);

        sqlTextArea.setColumns(20);
        sqlTextArea.setRows(5);
        jScrollPane1.setViewportView(sqlTextArea);

        getContentPane().add(jScrollPane1);

        executeButton.setText(bundle.getString("ExecuteSqlWindow.executeButton.text")); // NOI18N
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(executeButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        String sqlcommand = sqlTextArea.getText();
        System.out.println(sqlcommand);
        if (sqlcommand.length() > 0) {
            InsertIntoTable in = new InsertIntoTable(sqlcommand);
            sqlTextArea.setText("");
        }

    }//GEN-LAST:event_executeButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExecuteSqlWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton executeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea sqlTextArea;
    // End of variables declaration//GEN-END:variables

  

    /**
     *
     */
    public void runExecuteSqlCommand()
    {
        this.setVisible(true);
    }
}
