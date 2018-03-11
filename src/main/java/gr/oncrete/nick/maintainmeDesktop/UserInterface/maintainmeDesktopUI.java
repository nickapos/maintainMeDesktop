/*
 myBill, bills tracking program
 Copyright (C) 2010  Nick Apostolakis

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * maintainmeDesktopUI.java
 *
 * Created on 15 Ιουν 2010, 11:05:26 μμ
 */
package gr.oncrete.nick.maintainmeDesktop.UserInterface;

import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportIncomeSumsPerYear;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectAllCompaniesIDS;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectAllIncomeDetails;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectAllBillsDetails;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportExpensesSumsPerMonthYear;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectProfitPerMonthYear;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportIncomeSumsPerMonthYear;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportExpensesPerCategoryForAYear;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.CompareExpensesPerCategoryForTwoYears;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectCompanyDetails;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportTotalExpenseSums;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportExpensesPerCategoryForAllYears;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportExpenseSumsPerYear;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectReportTotalIncomeSums;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.DeleteCompany;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.Categories;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.DeleteIncome;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.InsertCompany;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.ShutdownDB;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.InsertBills;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.InsertIncome;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.Companies;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.DeleteBill;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.DumpDatabase;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.FileHandlers.MyFileWriter;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.FileHandlers.NewThreadFileWriter;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.PlotDataObject;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.Category;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectBillDetails;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.SelectInfo.SelectIncomeDetails;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.Today;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.UpdateInfo.UpdateBillRecord;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.UpdateInfo.UpdateCompanyRecord;
import gr.oncrete.nick.maintainmeDesktop.BusinessLogic.UpdateInfo.UpdateIncomeRecord;
import javax.swing.*;
import java.util.*;
import jahuwaldt.plot.*;
import java.awt.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author nickapos
 */
public class maintainmeDesktopUI extends javax.swing.JFrame {

    //just the plot panel
    PlotPanel plPanel;
    Today today = new Today();
    ArrayList<String[]> currentReport;//a report table used in save report as txt
    String[] comboBoxActions = {"Isert","Edit","Delete"};//the dropdown list at the action combo boxes
    String[] comboBoxReports = {"COMPANIES", 
        "BILLS",
        "EXPENSES-PER-COMPANY-FOR-ALL-YEARS",
        "EXPENSES-AMOUNT-PER-COMPANY-BY-YEAR",
        "EXPENSES-AMOUNT-PER-MONTH-BY-YEAR",
        "INCOME",
        "INCOME-FOR-ALL-YEARS",
        "INCOME-BY-YEAR",
        "INCOME-AMOUNT-PER-MONTH-BY-YEAR",
        "INCOME-EXPENSES-MONTH-PER-YEAR",
        "EXPENSES-PER-CATEGORY-FOR-ALL-YEARS",
        "EXPENSES-PER-CATEGORY-PER-YEAR",
        "COMPARE-TWO-YEAR_EXPENCES-PER-CATEGORY"};//the labels of the reports

    /**
     * Creates new form billsUI
     */
    public maintainmeDesktopUI() {
        initComponents();
        this.interNReportJtableColNames();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        InsertEditBillPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        inserEditBillComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        billIdTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        billInsertEditCompanyNameComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        dateOfPaymentTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        billAmountTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        billCommentTextField = new javax.swing.JTextField();
        billRetrieveButton = new javax.swing.JButton();
        billGoButton = new javax.swing.JButton();
        InsertEditIncome = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        incomeActionComboBox = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        incomeIDTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        incomeDateTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        incomeAmountTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        incomeCommentTextField = new javax.swing.JTextField();
        incomeRetrieveButton = new javax.swing.JButton();
        incomeGoButton = new javax.swing.JButton();
        InsertEditCompanyPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        companyDetailsComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        companyDetailsIDTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        catComboBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        companyDetailsCNameTextField = new javax.swing.JTextField();
        companyRetrieveButton = new javax.swing.JButton();
        companyDetailsGoButton = new javax.swing.JButton();
        ReportsPanel = new javax.swing.JPanel();
        reportPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        reportComboBox = new javax.swing.JComboBox();
        reportParameterPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        reportParametersComboBox = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        reportParametersFinalComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        goPanel = new javax.swing.JPanel();
        reportButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        importMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exportMenu = new javax.swing.JMenu();
        exportDBMenuItem = new javax.swing.JMenuItem();
        exportCSVsMenuItem = new javax.swing.JMenuItem();
        exportCVSYear = new javax.swing.JMenuItem();
        exportCVSPeriod = new javax.swing.JMenuItem();
        emptyDBMenyItem = new javax.swing.JMenu();
        emptyDBMenuItem = new javax.swing.JMenuItem();
        executeSqlMenuItem = new javax.swing.JMenuItem();
        shutdownMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        validateVatMenuItem = new javax.swing.JMenuItem();
        mergeOperationsJMenu = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle"); // NOI18N
        setTitle(bundle.getString("maintainmeDesktopUI.title")); // NOI18N

        InsertEditBillPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        InsertEditBillPanel.setLayout(new java.awt.GridLayout(7, 2, 1, 1));

        jLabel8.setText(bundle.getString("maintainmeDesktopUI.jLabel8.text")); // NOI18N
        InsertEditBillPanel.add(jLabel8);

        inserEditBillComboBox.setModel(new javax.swing.DefaultComboBoxModel(comboBoxActions));
        inserEditBillComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserEditBillComboBoxActionPerformed(evt);
            }
        });
        InsertEditBillPanel.add(inserEditBillComboBox);

        jLabel6.setText(bundle.getString("maintainmeDesktopUI.jLabel6.text")); // NOI18N
        InsertEditBillPanel.add(jLabel6);

        billIdTextField.setEditable(false);
        billIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billIdTextFieldActionPerformed(evt);
            }
        });
        InsertEditBillPanel.add(billIdTextField);

        jLabel1.setText(bundle.getString("maintainmeDesktopUI.jLabel1.text")); // NOI18N
        InsertEditBillPanel.add(jLabel1);

        billInsertEditCompanyNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(this.getCompaniesCombo()));
        InsertEditBillPanel.add(billInsertEditCompanyNameComboBox);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText(bundle.getString("maintainmeDesktopUI.jLabel3.text")); // NOI18N
        InsertEditBillPanel.add(jLabel3);

        dateOfPaymentTextField.setText(today.getToday());
        InsertEditBillPanel.add(dateOfPaymentTextField);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText(bundle.getString("maintainmeDesktopUI.jLabel4.text")); // NOI18N
        InsertEditBillPanel.add(jLabel4);

        billAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billAmountTextFieldActionPerformed(evt);
            }
        });
        InsertEditBillPanel.add(billAmountTextField);

        jLabel22.setText(bundle.getString("maintainmeDesktopUI.jLabel22.text")); // NOI18N
        InsertEditBillPanel.add(jLabel22);

        billCommentTextField.setText(bundle.getString("maintainmeDesktopUI.billCommentTextField.text")); // NOI18N
        billCommentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billCommentTextFieldActionPerformed(evt);
            }
        });
        InsertEditBillPanel.add(billCommentTextField);

        billRetrieveButton.setText(bundle.getString("maintainmeDesktopUI.billRetrieveButton.text")); // NOI18N
        billRetrieveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billRetrieveButtonActionPerformed(evt);
            }
        });
        InsertEditBillPanel.add(billRetrieveButton);

        billGoButton.setText(bundle.getString("maintainmeDesktopUI.billGoButton.text")); // NOI18N
        billGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billGoButtonActionPerformed(evt);
            }
        });
        InsertEditBillPanel.add(billGoButton);

        tabs.addTab(bundle.getString("maintainmeDesktopUI.InsertEditBillPanel.TabConstraints.tabTitle"), InsertEditBillPanel); // NOI18N

        InsertEditIncome.setLayout(new java.awt.GridLayout(6, 2));

        jLabel13.setText(bundle.getString("maintainmeDesktopUI.jLabel13.text")); // NOI18N
        InsertEditIncome.add(jLabel13);

        incomeActionComboBox.setModel(new javax.swing.DefaultComboBoxModel(comboBoxActions));
        incomeActionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeActionComboBoxActionPerformed(evt);
            }
        });
        InsertEditIncome.add(incomeActionComboBox);

        jLabel16.setText(bundle.getString("maintainmeDesktopUI.jLabel16.text")); // NOI18N
        InsertEditIncome.add(jLabel16);

        incomeIDTextField.setEditable(false);
        incomeIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeIDTextFieldActionPerformed(evt);
            }
        });
        InsertEditIncome.add(incomeIDTextField);

        jLabel14.setText(bundle.getString("maintainmeDesktopUI.jLabel14.text")); // NOI18N
        InsertEditIncome.add(jLabel14);

        incomeDateTextField.setText(today.getToday());
        InsertEditIncome.add(incomeDateTextField);

        jLabel15.setText(bundle.getString("maintainmeDesktopUI.jLabel15.text")); // NOI18N
        InsertEditIncome.add(jLabel15);

        incomeAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeAmountTextFieldActionPerformed(evt);
            }
        });
        InsertEditIncome.add(incomeAmountTextField);

        jLabel23.setText(bundle.getString("maintainmeDesktopUI.jLabel23.text")); // NOI18N
        InsertEditIncome.add(jLabel23);

        incomeCommentTextField.setText(bundle.getString("maintainmeDesktopUI.incomeCommentTextField.text")); // NOI18N
        InsertEditIncome.add(incomeCommentTextField);

        incomeRetrieveButton.setText(bundle.getString("maintainmeDesktopUI.incomeRetrieveButton.text")); // NOI18N
        incomeRetrieveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeRetrieveButtonActionPerformed(evt);
            }
        });
        InsertEditIncome.add(incomeRetrieveButton);

        incomeGoButton.setText(bundle.getString("maintainmeDesktopUI.incomeGoButton.text")); // NOI18N
        incomeGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeGoButtonActionPerformed(evt);
            }
        });
        InsertEditIncome.add(incomeGoButton);

        tabs.addTab(bundle.getString("maintainmeDesktopUI.InsertEditIncome.TabConstraints.tabTitle"), InsertEditIncome); // NOI18N

        InsertEditCompanyPanel.setLayout(new java.awt.GridLayout(5, 2));

        jLabel5.setText(bundle.getString("maintainmeDesktopUI.jLabel5.text")); // NOI18N
        InsertEditCompanyPanel.add(jLabel5);

        companyDetailsComboBox.setModel(new javax.swing.DefaultComboBoxModel(comboBoxActions));
        companyDetailsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyDetailsComboBoxActionPerformed(evt);
            }
        });
        InsertEditCompanyPanel.add(companyDetailsComboBox);

        jLabel9.setText(bundle.getString("maintainmeDesktopUI.jLabel9.text")); // NOI18N
        InsertEditCompanyPanel.add(jLabel9);

        companyDetailsIDTextField.setEditable(false);
        InsertEditCompanyPanel.add(companyDetailsIDTextField);

        jLabel18.setText(bundle.getString("maintainmeDesktopUI.jLabel18.text")); // NOI18N
        InsertEditCompanyPanel.add(jLabel18);

        catComboBox.setModel(new javax.swing.DefaultComboBoxModel(this.getCategoriesCombo()));
        InsertEditCompanyPanel.add(catComboBox);

        jLabel12.setText(bundle.getString("maintainmeDesktopUI.jLabel12.text")); // NOI18N
        InsertEditCompanyPanel.add(jLabel12);

        companyDetailsCNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyDetailsCNameTextFieldActionPerformed(evt);
            }
        });
        companyDetailsCNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                companyDetailsCNameTextFieldKeyReleased(evt);
            }
        });
        InsertEditCompanyPanel.add(companyDetailsCNameTextField);

        companyRetrieveButton.setText(bundle.getString("maintainmeDesktopUI.companyRetrieveButton.text")); // NOI18N
        companyRetrieveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyRetrieveButtonActionPerformed(evt);
            }
        });
        InsertEditCompanyPanel.add(companyRetrieveButton);

        companyDetailsGoButton.setText(bundle.getString("maintainmeDesktopUI.companyDetailsGoButton.text")); // NOI18N
        companyDetailsGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyDetailsGoButtonActionPerformed(evt);
            }
        });
        InsertEditCompanyPanel.add(companyDetailsGoButton);

        tabs.addTab(bundle.getString("maintainmeDesktopUI.InsertEditCompanyPanel.TabConstraints.tabTitle"), InsertEditCompanyPanel); // NOI18N

        ReportsPanel.setLayout(new javax.swing.BoxLayout(ReportsPanel, javax.swing.BoxLayout.Y_AXIS));

        jLabel7.setText(bundle.getString("maintainmeDesktopUI.jLabel7.text")); // NOI18N
        reportPanel.add(jLabel7);

        reportComboBox.setModel(new javax.swing.DefaultComboBoxModel(comboBoxReports));
        reportComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportComboBoxActionPerformed(evt);
            }
        });
        reportPanel.add(reportComboBox);

        ReportsPanel.add(reportPanel);

        jLabel11.setText(bundle.getString("maintainmeDesktopUI.jLabel11.text")); // NOI18N
        reportParameterPanel.add(jLabel11);

        jLabel20.setText(bundle.getString("maintainmeDesktopUI.jLabel20.text")); // NOI18N
        reportParameterPanel.add(jLabel20);

        reportParametersComboBox.setPreferredSize(new java.awt.Dimension(100, 27));
        reportParameterPanel.add(reportParametersComboBox);

        jLabel21.setText(bundle.getString("maintainmeDesktopUI.jLabel21.text")); // NOI18N
        reportParameterPanel.add(jLabel21);

        reportParametersFinalComboBox.setEnabled(false);
        reportParameterPanel.add(reportParametersFinalComboBox);

        ReportsPanel.add(reportParameterPanel);

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Company Name", "Afm", "Date Of Issue", "Date of Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reportTable);

        ReportsPanel.add(jScrollPane1);

        reportButton.setText(bundle.getString("maintainmeDesktopUI.reportButton.text")); // NOI18N
        reportButton.setAlignmentY(0.0F);
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        goPanel.add(reportButton);

        jButton1.setText(bundle.getString("maintainmeDesktopUI.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        goPanel.add(jButton1);

        ReportsPanel.add(goPanel);

        tabs.addTab(bundle.getString("maintainmeDesktopUI.ReportsPanel.TabConstraints.tabTitle"), ReportsPanel); // NOI18N

        jMenu1.setText(bundle.getString("maintainmeDesktopUI.jMenu1.text")); // NOI18N

        importMenu.setText(bundle.getString("maintainmeDesktopUI.importMenu.text")); // NOI18N

        jMenuItem2.setText(bundle.getString("maintainmeDesktopUI.jMenuItem2.text")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        importMenu.add(jMenuItem2);

        jMenuItem1.setText(bundle.getString("maintainmeDesktopUI.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        importMenu.add(jMenuItem1);

        jMenu1.add(importMenu);

        exportMenu.setText(bundle.getString("maintainmeDesktopUI.exportMenu.text")); // NOI18N

        exportDBMenuItem.setText(bundle.getString("maintainmeDesktopUI.exportDBMenuItem.text")); // NOI18N
        exportDBMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportDBMenuItemActionPerformed(evt);
            }
        });
        exportMenu.add(exportDBMenuItem);

        exportCSVsMenuItem.setText(bundle.getString("maintainmeDesktopUI.exportCSVsMenuItem.text")); // NOI18N
        exportCSVsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCSVsMenuItemActionPerformed(evt);
            }
        });
        exportMenu.add(exportCSVsMenuItem);

        exportCVSYear.setText(bundle.getString("maintainmeDesktopUI.exportCVSYear.text")); // NOI18N
        exportCVSYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCVSYearActionPerformed(evt);
            }
        });
        exportMenu.add(exportCVSYear);

        exportCVSPeriod.setText(bundle.getString("maintainmeDesktopUI.exportCVSPeriod.text")); // NOI18N
        exportCVSPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCVSPeriodActionPerformed(evt);
            }
        });
        exportMenu.add(exportCVSPeriod);

        jMenu1.add(exportMenu);

        emptyDBMenyItem.setText(bundle.getString("maintainmeDesktopUI.emptyDBMenyItem.text")); // NOI18N

        emptyDBMenuItem.setText(bundle.getString("maintainmeDesktopUI.emptyDBMenuItem.text")); // NOI18N
        emptyDBMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyDBMenuItemActionPerformed(evt);
            }
        });
        emptyDBMenyItem.add(emptyDBMenuItem);

        jMenu1.add(emptyDBMenyItem);

        executeSqlMenuItem.setText(bundle.getString("maintainmeDesktopUI.executeSqlMenuItem.text")); // NOI18N
        executeSqlMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeSqlMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(executeSqlMenuItem);

        shutdownMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        shutdownMenuItem.setText(bundle.getString("maintainmeDesktopUI.shutdownMenuItem.text")); // NOI18N
        shutdownMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdownMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(shutdownMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu3.setText(bundle.getString("maintainmeDesktopUI.jMenu3.text")); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        validateVatMenuItem.setText(bundle.getString("maintainmeDesktopUI.validateVatMenuItem.text")); // NOI18N
        validateVatMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateVatMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(validateVatMenuItem);

        mergeOperationsJMenu.setText(bundle.getString("maintainmeDesktopUI.mergeOperationsJMenu.text")); // NOI18N

        jMenuItem9.setText(bundle.getString("maintainmeDesktopUI.jMenuItem9.text")); // NOI18N
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mergeOperationsJMenu.add(jMenuItem9);

        jMenuItem10.setText(bundle.getString("maintainmeDesktopUI.jMenuItem10.text")); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        mergeOperationsJMenu.add(jMenuItem10);

        jMenu3.add(mergeOperationsJMenu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabs, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, tabs, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billGoButtonActionPerformed
        this.billAction();
    }//GEN-LAST:event_billGoButtonActionPerformed

    private void billIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billIdTextFieldActionPerformed

    private void inserEditBillComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserEditBillComboBoxActionPerformed
        //an alaksei to status na vriskei to id kai analoga na thetei ta diafora values
        //kai na kanei ta kelia editable i mi.
        int a = this.inserEditBillComboBox.getSelectedIndex();
        if (a == 0)//if selected value is insert
        {
            this.billIdTextField.setEditable(false);
            this.billRetrieveButton.setEnabled(false);

        } else if (a == 1)//if selected value is edit
        {

            this.billIdTextField.setEditable(true);
            this.billRetrieveButton.setEnabled(true);

        } else if (a == 2)//if selected value is delete
        {
            this.billIdTextField.setEditable(true);
            this.billRetrieveButton.setEnabled(true);
        }
    }//GEN-LAST:event_inserEditBillComboBoxActionPerformed

    private void companyDetailsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyDetailsComboBoxActionPerformed
        
    }//GEN-LAST:event_companyDetailsComboBoxActionPerformed

    private void companyDetailsGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyDetailsGoButtonActionPerformed
        this.insertCompanyAction();
    }//GEN-LAST:event_companyDetailsGoButtonActionPerformed

    private void companyRetrieveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyRetrieveButtonActionPerformed
       
    }//GEN-LAST:event_companyRetrieveButtonActionPerformed

    private void billRetrieveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billRetrieveButtonActionPerformed
      
    }//GEN-LAST:event_billRetrieveButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        this.reportActions();
    }//GEN-LAST:event_reportButtonActionPerformed

    private void shutdownMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdownMenuItemActionPerformed
        PopupMessageFrame mes = new PopupMessageFrame();
        mes.setNotification(java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("THE-DATABASE-ENGINE-AND-THE-APPLICATION-WILL-SHUTDOWN"));
        ShutdownDB s = new ShutdownDB();
        System.exit(0);
}//GEN-LAST:event_shutdownMenuItemActionPerformed

    private void emptyDBMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyDBMenuItemActionPerformed
        //open a new window and require authorization to empty the db
        EmptyDatabaseWindow emptyDB = new EmptyDatabaseWindow(this);
        emptyDB.runEmptyDB();
        //this.refreshCompaniesCombo();
        //this.refreshCatIDCombo();
    }//GEN-LAST:event_emptyDBMenuItemActionPerformed

    private void exportCSVsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCSVsMenuItemActionPerformed
        //export all expenses into csv format
        DumpDatabase d = new DumpDatabase();
        ArrayList a = d.getEforiaCsv("");
        //this.writeFile("eforiaCSV.csv", a);
        this.writeFileNewThread("eforiaCSV.csv", a);
    }//GEN-LAST:event_exportCSVsMenuItemActionPerformed

    private void exportDBMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportDBMenuItemActionPerformed
        //export all the records of the db in csv format
        ExportAllRecords exp = new ExportAllRecords();
        exp.displayGUI();
    }//GEN-LAST:event_exportDBMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ImportAllRecords imp = new ImportAllRecords();
        imp.displayGUI();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * this little method will return to the world an string array to be used in
     * combo boxes
     *
     * @param numOfYears
     * @return
     */
    private String[] yearsCombo(int numOfYears) {
        int startyear = 2006;
        String[] years = new String[numOfYears];
        for (int o = startyear, i = 0; i < 125; o++, i++) {
            years[i] = "" + o;
        }
        return years;
    }

    private void reportComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportComboBoxActionPerformed
        String[] years = this.yearsCombo(125);
        int a = reportComboBox.getSelectedIndex();
        if (a == 0 || a == 1 || a == 2 || a == 5 || a == 6 || a == 10)//if report does not need year filtering
        {
            reportParametersComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{""}));
            reportParametersFinalComboBox.setEnabled(false);
        }

        if (a == 3 || a == 4 || a == 7 || a == 8 || a == 9 || a == 11)//if report needs year filtering
        {
            reportParametersComboBox.setModel(new javax.swing.DefaultComboBoxModel(years));
            reportParametersFinalComboBox.setEnabled(false);

        }
        if (a == 12)//if the menu selection is to compare two years enable the final combobox and fill it up with years
        {
            reportParametersFinalComboBox.setEnabled(true);
            reportParametersComboBox.setModel(new javax.swing.DefaultComboBoxModel(years));
            reportParametersFinalComboBox.setModel(new javax.swing.DefaultComboBoxModel(years));
        }


    }//GEN-LAST:event_reportComboBoxActionPerformed

    private void incomeIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeIDTextFieldActionPerformed

    private void incomeActionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeActionComboBoxActionPerformed
        //an alaksei to status na vriskei to id kai analoga na thetei ta diafora values
        //kai na kanei ta kelia editable i mi.
        int a = this.incomeActionComboBox.getSelectedIndex();
        if (a == 0)//if selected value is insert
        {
            this.incomeIDTextField.setEditable(false);
            this.incomeRetrieveButton.setEnabled(false);

        } else if (a == 1)//if selected value is edit
        {

            this.incomeIDTextField.setEditable(true);
            this.incomeRetrieveButton.setEnabled(true);

        } else if (a == 2)//if selected value is delete
        {
            this.incomeIDTextField.setEditable(true);
            this.incomeRetrieveButton.setEnabled(true);
        }

    }//GEN-LAST:event_incomeActionComboBoxActionPerformed

    private void incomeGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeGoButtonActionPerformed
        this.incomeAction();
    }//GEN-LAST:event_incomeGoButtonActionPerformed

    private void incomeRetrieveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeRetrieveButtonActionPerformed
        
    }//GEN-LAST:event_incomeRetrieveButtonActionPerformed

    private void executeSqlMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeSqlMenuItemActionPerformed
        ExecuteSqlWindow e = new ExecuteSqlWindow();
        e.runExecuteSqlCommand();
    }//GEN-LAST:event_executeSqlMenuItemActionPerformed

    private void validateVatMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateVatMenuItemActionPerformed
        ValidateAFM v = new ValidateAFM();
        v.validateAFM();
    }//GEN-LAST:event_validateVatMenuItemActionPerformed

    private void exportCVSYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCVSYearActionPerformed
        ExportCSVByYear exp = new ExportCSVByYear();
        exp.displayGUI();
    }//GEN-LAST:event_exportCVSYearActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String outStr = "";
        outStr = outStr + "Date:" + this.getDateTime() + "\n\n";
        if (currentReport != null) {
            Iterator i = currentReport.iterator();
            while (i.hasNext()) {
                String row = "";
                String[] arrRow = (String[]) i.next();
                int arrayLength = arrRow.length;
                for (int o = 0; o < arrayLength; o++) {
                    if (o == arrayLength - 1) {
                        row = row + arrRow[o] + ";\n";
                    } else {
                        row = row + arrRow[o] + ";";
                    }
                }
                outStr = outStr + row;
            }
            JFileChooser fc = new JFileChooser(System.getProperty("user.home"));
            int option = fc.showSaveDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {
                if (fc.getSelectedFile() != null) {
                    String curDir = fc.getCurrentDirectory().getAbsolutePath();
                    String theFileToSave = fc.getName(fc.getSelectedFile());
                    //this.writeFile(curDir + System.getProperty("file.separator") + theFileToSave, outStr);
                    this.writeFileNewThread(curDir + System.getProperty("file.separator") + theFileToSave, outStr);
                }
            }
        }
        // System.out.println(outStr);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void billAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billAmountTextFieldActionPerformed
        this.billAction();
    }//GEN-LAST:event_billAmountTextFieldActionPerformed

    private void incomeAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeAmountTextFieldActionPerformed
        this.incomeAction();
    }//GEN-LAST:event_incomeAmountTextFieldActionPerformed

    private void companyDetailsCNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyDetailsCNameTextFieldActionPerformed
        this.insertCompanyAction();
    }//GEN-LAST:event_companyDetailsCNameTextFieldActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        MergeCategoriesFrame mc = new MergeCategoriesFrame();
        mc.displayApp();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        MergeCompanyRecordsFrame mcr = new MergeCompanyRecordsFrame();
        mcr.displayApp();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void billCommentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billCommentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billCommentTextFieldActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ImportBankStatementFrame importStatement = new ImportBankStatementFrame();
        importStatement.showImportStatemenFrame();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void companyDetailsCNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_companyDetailsCNameTextFieldKeyReleased
      
    }//GEN-LAST:event_companyDetailsCNameTextFieldKeyReleased

    private void exportCVSPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCVSPeriodActionPerformed
        ExportCSVByPeriod cvsp = new ExportCSVByPeriod();
        cvsp.displayGUI();
    }//GEN-LAST:event_exportCVSPeriodActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maintainmeDesktopUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InsertEditBillPanel;
    private javax.swing.JPanel InsertEditCompanyPanel;
    private javax.swing.JPanel InsertEditIncome;
    private javax.swing.JPanel ReportsPanel;
    private javax.swing.JTextField billAmountTextField;
    private javax.swing.JTextField billCommentTextField;
    private javax.swing.JButton billGoButton;
    private javax.swing.JTextField billIdTextField;
    private javax.swing.JComboBox billInsertEditCompanyNameComboBox;
    private javax.swing.JButton billRetrieveButton;
    private javax.swing.JComboBox catComboBox;
    private javax.swing.JTextField companyDetailsCNameTextField;
    private javax.swing.JComboBox companyDetailsComboBox;
    private javax.swing.JButton companyDetailsGoButton;
    private javax.swing.JTextField companyDetailsIDTextField;
    private javax.swing.JButton companyRetrieveButton;
    private javax.swing.JTextField dateOfPaymentTextField;
    private javax.swing.JMenuItem emptyDBMenuItem;
    private javax.swing.JMenu emptyDBMenyItem;
    private javax.swing.JMenuItem executeSqlMenuItem;
    private javax.swing.JMenuItem exportCSVsMenuItem;
    private javax.swing.JMenuItem exportCVSPeriod;
    private javax.swing.JMenuItem exportCVSYear;
    private javax.swing.JMenuItem exportDBMenuItem;
    private javax.swing.JMenu exportMenu;
    private javax.swing.JPanel goPanel;
    private javax.swing.JMenu importMenu;
    private javax.swing.JComboBox incomeActionComboBox;
    private javax.swing.JTextField incomeAmountTextField;
    private javax.swing.JTextField incomeCommentTextField;
    private javax.swing.JTextField incomeDateTextField;
    private javax.swing.JButton incomeGoButton;
    private javax.swing.JTextField incomeIDTextField;
    private javax.swing.JButton incomeRetrieveButton;
    private javax.swing.JComboBox inserEditBillComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mergeOperationsJMenu;
    private javax.swing.JButton reportButton;
    private javax.swing.JComboBox reportComboBox;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel reportParameterPanel;
    private javax.swing.JComboBox reportParametersComboBox;
    private javax.swing.JComboBox reportParametersFinalComboBox;
    private javax.swing.JTable reportTable;
    private javax.swing.JMenuItem shutdownMenuItem;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JMenuItem validateVatMenuItem;
    // End of variables declaration//GEN-END:variables

    private String[] getCompaniesCombo() {
        Companies com = new Companies();
        return com.companyNames();
    }

    private void clearBillTextFields() {
        billAmountTextField.setText("");
        billIdTextField.setText("");
        dateOfPaymentTextField.setText(today.getToday());
        billCommentTextField.setText("");

    }

    private void clearIncomeTextFields() {
        incomeIDTextField.setText("");
        incomeDateTextField.setText(today.getToday());
        incomeAmountTextField.setText("");
        incomeCommentTextField.setText("");
    }

    private void clearCompanyTextFields() {
        companyDetailsIDTextField.setText("");
        companyDetailsCNameTextField.setText("");
        //refresh the combobox
        this.refreshCompaniesCombo();

    }

    /**
     * this method refreshes the companies combo box in bills tab
     *
     */
    public void refreshCompaniesCombo() {
        billInsertEditCompanyNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(this.getCompaniesCombo()));
       
    }

    /**
     * e private method that creates the reports
     *
     */
    private void reportActions() {
        int a = reportComboBox.getSelectedIndex();
        if (a == 0)//if selected action is present companies
        {
            this.reportPresentCompanies();
        } else if (a == 1)//if selected action is present bills
        {
            this.reportPresentBills();
        } else if (a == 2)//if the option is report expenses totals per company
        {
            this.reportExpenceTotalsPerCompany();
        } else if (a == 3)//if the option is report expence totals per company per year
        {
            this.reportExpenceTotalsPerCompanyPerYear();
        } else if (a == 4)//if the option is report expence amount per month by year
        {
            this.reportExpenceAmountPerMonthPerYear();

        } else if (a == 5)//if the option is report income rows
        {
            this.reportIncomeRows();
        } else if (a == 6)//report total income for all years
        {
            this.reportTotalIncomeForAllYears();
        } else if (a == 7)//report total income by year
        {
            this.reportTotalIncomeByYear();
        } else if (a == 8)//report income/month by year
        {
            this.reportSumIncomePerMonthByYear();
        } else if (a == 9)//report (income-expenses)/month by year
        {
            this.reportProfitPerMonthByYear();
        } else if (a == 10)//expenses per category for all years
        {
            this.reportExpensesPerCategoryForAllYears();
        } else if (a == 11)//expenses per category per year
        {
            this.reportExpensesPerCategoryForAYear();
        } else if (a == 12)//expenses per category per year
        {
            this.reportCompareExpensesPerCategoryFor2Years();
        }
    }

    /**
     *
     * this method will be used to create the plots in a new tab
     *
     * @param p
     */
    private void plotData(PlotDataObject p) {

        double[] xAx = p.getXdataD();
        double[] yAx = p.getYdata();
        String xLabel = p.getXtitle();
        String yLabel = p.getYtitle();
        String plotLabel = p.getPlottitle();

        Plot2D aPlot = new SimplePlotXY(xAx, yAx, plotLabel, xLabel, yLabel,
                null, null, new CircleSymbol());
        //	Make the horizontal axis a log axis.
        PlotAxis xAxis = aPlot.getHorizontalAxis();
        xAxis.setScale(new LinearAxisScale());
        aPlot.getRuns().setLineColor(Color.blue);
        this.removeOldPlotPanel();
        plPanel = new PlotPanel(aPlot);
        plPanel.setBackground(Color.white);
        tabs.addTab(plotLabel, plPanel);
    }

    /**
     * this method is used to present the company entries of the datbase
     *
     *
     */
    private void reportPresentCompanies() {
        //TODO: change this with a faster algorithm, like the bill report
        SelectAllCompaniesIDS compIDS = new SelectAllCompaniesIDS();
        java.util.LinkedList cIdList = (LinkedList) compIDS.getAllRows();
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY ID"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY AFM"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("CATEGORY")};
        Object[][] d;
        if (cIdList == null) {
            String[] blank = {"", "", "", ""};
            cIdList = new LinkedList();
            cIdList.add(blank);
            d = new Object[1][4];
        } else {
            d = new Object[cIdList.size()][4];
        }
        currentReport = new ArrayList(cIdList.size() + 2);//for the save as txt function
        String[] reportName = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT COMPANIES"), "", "", ""};
        currentReport.add(reportName);

        currentReport.add(columnNames);
        Iterator it = cIdList.iterator();

        int o = 0;

        while (it.hasNext()) {
            String[] a = (String[]) it.next();
            d[o] = a;
            currentReport.add(a);//fill the rest of the list with the lines of the report
            o++;
        }
        if (cIdList.size() > 0) {
            reportTable.setModel(new MyTableModel(d, columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }

    }

    /**
     * this method is used to present the expence bills entries of the datbase
     *
     *
     */
    private void reportPresentBills() {
        SelectAllBillsDetails billDet = new SelectAllBillsDetails();
        java.util.LinkedList bIdList = (LinkedList) billDet.getAllRows();
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("BILL ID"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("DATE OF ISSUE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("DATE OF PAYMENT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PRICE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMMENT")};
        Object[][] d;
        if (bIdList == null) {
            String[] blank = {"", "", "", "", "", ""};
            bIdList = new LinkedList();
            bIdList.add(blank);
            d = new Object[1][6];
        } else {
            d = new Object[bIdList.size() + 1][6];
        }

        currentReport = new ArrayList(bIdList.size() + 2);//for the save as txt function
        String[] reportName = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT BILLS"), "", "", "", "", ""};
        currentReport.add(reportName);
        currentReport.add(columnNames);
        Iterator it = bIdList.iterator();
        int o = 0;
        while (it.hasNext()) {
            String[] a = (String[]) it.next();
            d[o] = a;
            currentReport.add(a);//fill the rest of the list with the lines of the report
            o++;
        }

        if (bIdList.size() > 0) {
            reportTable.setModel(new MyTableModel(d, columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     * this method is used to present the expence totals per company
     *
     *
     */
    private void reportExpenceTotalsPerCompany() {
        SelectReportTotalExpenseSums s = new SelectReportTotalExpenseSums();
        currentReport = new ArrayList(s.getColumns().length + 2);
        String[] reportName = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT TOTAL EXPENSES PER COMPANY"), "", "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AFM")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < s.getColumns().length) {
            currentReport.add(s.getColumns()[o]);
            o++;
        }

        if (!s.isEmpty()) {

            reportTable.setModel(new MyTableModel(s.getColumns(), columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     * this method is used to present the expence totals per company per year
     *
     *
     */
    private void reportExpenceTotalsPerCompanyPerYear() {
        String year = (String) reportParametersComboBox.getSelectedItem();
        SelectReportExpenseSumsPerYear s = new SelectReportExpenseSumsPerYear(year);
        currentReport = new ArrayList(s.getColumns().length + 2);
        String reportTitle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT TOTAL YEARLY") + year + java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("EXPENSES PER COMPANY ");
        String[] reportName = {reportTitle, "", "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AFM")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < s.getColumns().length) {
            currentReport.add(s.getColumns()[o]);
            o++;
        }
        if (!s.isEmpty()) {

            reportTable.setModel(new MyTableModel(s.getColumns(), columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     * this method is used to report expence amount per month by year
     *
     */
    private void reportExpenceAmountPerMonthPerYear() {
        String year = (String) reportParametersComboBox.getSelectedItem();
        SelectReportExpensesSumsPerMonthYear s = new SelectReportExpensesSumsPerMonthYear(year);
        String[][] dataCols = s.getColumns();
        currentReport = new ArrayList(dataCols.length + 2);
        String reportTitle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT TOTAL EXPENSES PER YEAR") + year + ")";
        String[] reportName = {reportTitle, "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("MONTH")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < dataCols.length) {
            currentReport.add(dataCols[o]);
            o++;
        }
        if (!s.isEmpty()) {
            this.plotData(s.returnPlotData());
            reportTable.setModel(new MyTableModel(dataCols, columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }

    }

    /**
     *
     * report income rows
     *
     */
    private void reportIncomeRows() {
        SelectAllIncomeDetails incDet = new SelectAllIncomeDetails();
        java.util.LinkedList incList = (LinkedList) incDet.getAllRows();
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("INCOME ID"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("DATE OF PAYMENT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMMENT")};
        Object[][] d;
        if (incList == null) {
            String[] blank = {"", "", "", "", ""};
            incList = new LinkedList();
            incList.add(blank);
            d = new Object[1][5];
        } else {
            d = new Object[incList.size()][5];
        }
        currentReport = new ArrayList(d.length + 2);
        String[] reportName = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT INCOME"), "", "", ""};
        currentReport.add(reportName);

        currentReport.add(columnNames);
        Iterator it = incList.iterator();

        int o = 0;
        while (it.hasNext()) {
            String[] a = (String[]) it.next();
            d[o] = a;
            currentReport.add(a);
            o++;
        }

        if (incList.size() > 0) {

            reportTable.setModel(new MyTableModel(d, columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function

        }

    }

    /**
     *
     * report total income for all years
     *
     */
    private void reportTotalIncomeForAllYears() {
        SelectReportTotalIncomeSums s = new SelectReportTotalIncomeSums();
        currentReport = new ArrayList(s.getColumns().length + 2);
        String[] reportName = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT TOTAL INCOME"), "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < s.getColumns().length) {
            currentReport.add(s.getColumns()[o]);
            o++;
        }
        if (!s.isEmpty()) {
            reportTable.setModel(new MyTableModel(s.getColumns(), columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     *
     * report expsnses per category for all years
     *
     */
    private void reportExpensesPerCategoryForAllYears() {
        SelectReportExpensesPerCategoryForAllYears e = new SelectReportExpensesPerCategoryForAllYears();
        currentReport = new ArrayList(e.getColumns().length + 2);
        String[] reportName = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT EXPENSES PER CATEGORY FOR ALL YEARS"), "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < e.getColumns().length) {
            currentReport.add(e.getColumns()[o]);
            o++;
        }
        if (!e.isEmpty()) {
            reportTable.setModel(new MyTableModel(e.getColumns(), columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     *
     * report expenses per category for a year
     *
     */
    private void reportExpensesPerCategoryForAYear() {
        String year = (String) reportParametersComboBox.getSelectedItem();
        SelectReportExpensesPerCategoryForAYear e = new SelectReportExpensesPerCategoryForAYear(year);
        currentReport = new ArrayList(e.getColumns().length + 2);
        String reportTitle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT CATEGORY EXPENSES PER YEAR") + year + ")";
        String[] reportName = {reportTitle, "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME")};
        currentReport.add(columnNames);
        String[][] columnData = e.getColumns();
        int o = 0;
        while (o < columnData.length) {
            currentReport.add(columnData[o]);
            o++;
        }
        if (!e.isEmpty()) {
            reportTable.setModel(new MyTableModel(columnData, columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     *
     * report expenses per category between 2 years
     *
     */
    private void reportCompareExpensesPerCategoryFor2Years() {
        String initialYear = (String) reportParametersComboBox.getSelectedItem();
        String finalYear = (String) reportParametersFinalComboBox.getSelectedItem();
        CompareExpensesPerCategoryForTwoYears e = new CompareExpensesPerCategoryForTwoYears(initialYear, finalYear);
        currentReport = new ArrayList(e.getColumns().length);
        String reportTitle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPARE-TWO-YEAR_EXPENCES-PER-CATEGORY") + initialYear + "-" + finalYear + ")";
        String[] reportName = {reportTitle, "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("CATEGORY"), initialYear, finalYear, java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < e.getColumns().length) {
            currentReport.add(e.getColumns()[o]);
            o++;
        }
        if (!e.isEmpty()) {
            reportTable.setModel(new MyTableModel(e.getColumns(), columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     * report total income by month and year
     *
     */
    private void reportTotalIncomeByYear() {
        String year = (String) reportParametersComboBox.getSelectedItem();
        SelectReportIncomeSumsPerYear s = new SelectReportIncomeSumsPerYear(year);
        currentReport = new ArrayList(s.getColumns().length + 2);
        String reportTitle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT TOTAL EXPENSES PER YEAR") + year + ")";
        String[] reportName = {reportTitle, "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAME")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < s.getColumns().length) {
            currentReport.add(s.getColumns()[o]);
            o++;
        }
        if (!s.isEmpty()) {
            reportTable.setModel(new MyTableModel(s.getColumns(), columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }
    }

    /**
     * this method will calculate the income received in a month sutract it from
     * the amount spent at the same month for each month of a year
     *
     */
    private void reportProfitPerMonthByYear() {
        String year = (String) reportParametersComboBox.getSelectedItem();
        SelectProfitPerMonthYear s = new SelectProfitPerMonthYear(year);
        currentReport = new ArrayList(s.getColumns().length + 2);
        String reportTitle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT MONTHLY PROFIT/LOSSES  FOR YEAR") + year + ")";
        String[] reportName = {reportTitle, "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("MONTH")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < s.getColumns().length) {
            currentReport.add(s.getColumns()[o]);
            o++;
        }
        if (!s.isEmpty()) {
            this.plotData(s.returnPlotData());
            reportTable.setModel(new MyTableModel(s.getColumns(), columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }

    }

    /**
     * this method will calculate the income received in a month sutract it from
     * the amount spent at the same month for each month of a year
     *
     */
    private void reportSumIncomePerMonthByYear() {
        String year = (String) reportParametersComboBox.getSelectedItem();
        SelectReportIncomeSumsPerMonthYear s = new SelectReportIncomeSumsPerMonthYear(year);
        String[][] dataCols = s.getColumns();
        currentReport = new ArrayList(dataCols.length + 2);
        String reportTitle = java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("REPORT MONTHLY INCOME FOR YEAR") + year + ")";
        String[] reportName = {reportTitle, "", ""};
        currentReport.add(reportName);
        String[] columnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AMOUNT"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("PERCENTAGE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("MONTH")};
        currentReport.add(columnNames);
        int o = 0;
        while (o < dataCols.length) {
            currentReport.add(dataCols[o]);
            o++;
        }
        if (!s.isEmpty()) {
            this.plotData(s.returnPlotData());
            reportTable.setModel(new MyTableModel(dataCols, columnNames));
            reportTable.setAutoCreateRowSorter(true);//add a primitive sort by column function
        }

    }

    /**
     * this method is used to create a new set of internationalized column names
     * for the report table.
     */
    private void interNReportJtableColNames() {
        String[] jTableDefaultColumnNames = {java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("ID"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("COMPANY NAMES"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("AFM"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("DATE OF ISSUE"), java.util.ResourceBundle.getBundle("i18n/myBillUIBundle").getString("DATE OF PAYMENT")};//the jtable default column names
        String[][] dataCols = {};
        reportTable.setModel(new MyTableModel(dataCols, jTableDefaultColumnNames));
    }

    /**
     *
     * this little method checks if a plot panel is registred with the tabs and
     * removes it in order to draw the new one
     *
     */
    private void removeOldPlotPanel() {
        if (plPanel != null) {
            tabs.remove(plPanel);
        }
    }

    /**
     * method used to export the database into csv's
     *
     * @param filename
     * @param a
     */
    private void writeFile(String filename, ArrayList a) {
        MyFileWriter m = new MyFileWriter();
        m.createFile(filename);
        Iterator i = a.iterator();
        while (i.hasNext()) {
            String nextLine = (String) i.next();
            if (nextLine.length() > 0) {
                System.out.println(nextLine);
                m.writeToFile(nextLine);
            }
        }
        m.closeFile();
    }

    private void writeFile(String filename, String a) {
        MyFileWriter m = new MyFileWriter();
        m.createFile(filename);
        m.writeToFile(a);
        m.closeFile();
    }

    /**
     * this method can be used to write a file in a new separate thread
     *
     * @param filename
     * @param a
     */
    private void writeFileNewThread(String filename, String a) {
        NewThreadFileWriter m = new NewThreadFileWriter(filename, a);
        m.execute();
    }

    /**
     * this method can be used to write a file in a new separate thread
     *
     * @param filename
     * @param a
     */
    private void writeFileNewThread(String filename, ArrayList a) {
        String content = "";
        Iterator i = a.iterator();
        while (i.hasNext()) {
            String nextLine = (String) i.next();
            if (nextLine.length() > 0) {
                content = content + nextLine + "\n";
                System.out.println(nextLine);
            }
        }
        NewThreadFileWriter m = new NewThreadFileWriter(filename, content);
        m.execute();

    }

    public void refreshCatIDCombo() {
        catComboBox.setModel(new javax.swing.DefaultComboBoxModel(this.getCategoriesCombo()));
    }

    private String[] getCategoriesCombo() {
        Categories com = new Categories();
        return com.categoriesNames();
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    /**
     * this private method will check and preform the appropriate action when go
     * button in bills tab is clicked or when the user press enter at the price
     * value of the bill tab
     */
    private void billAction() {
        
    }

    /**
     * this method will be called when the user hits the go button in the income
     * tab or if he hits enter in the amount field
     */
    private void incomeAction() {
        
    }

    /**
     * this method is used by the insert action button or if the user hits enter
     * at the company name textfield
     */
    private void insertCompanyAction() {

    }
}
