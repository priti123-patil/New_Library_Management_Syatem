/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.main.view;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ReturnBookRecords extends javax.swing.JFrame {
     static final String DB_URL = "jdbc:mysql://localhost:3306/db_library"; //declaration of static variable DB_URL,databse path initialized to it
    //Database Credentials
    static final String USER = "root";                                  //declaration of static variable USER and value initialized to it
    static final String PASS = "";
    static  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";          //declaration of static variable JDBC_DRIVER and value initialized to it
    static Connection connection=null;
    static Scanner s;
    static java.sql.Date date;
    static {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println(" done ");
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println(" connected ");
                s = new Scanner(System.in);
                Calendar calendar = Calendar.getInstance();
                date = new java.sql.Date(calendar.getTime().getTime());
                System.out.println("date: " + date);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void close(){
     WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    } 
  
    /**
     * Creates new form NewJFrame12
     */
    public ReturnBookRecords() {
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

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ShowAllBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ExitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        ClrBtn = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Return Book Records");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\LibraryManagement\\Images\\lib.jpg")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("***Return Book Records***");

        ShowAllBtn.setBackground(new java.awt.Color(0, 255, 0));
        ShowAllBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ShowAllBtn.setText("Show All");
        ShowAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SID", "SName", "BID", "BName", "author", "pages", "ReturnDate"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ExitBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Student ID:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Book ID:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        SearchBtn.setBackground(new java.awt.Color(0, 255, 0));
        SearchBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        ClrBtn.setBackground(new java.awt.Color(255, 0, 0));
        ClrBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ClrBtn.setText("Clear All");
        ClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClrBtn)
                                .addGap(27, 27, 27)
                                .addComponent(ExitBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchBtn)
                                .addGap(131, 131, 131)
                                .addComponent(ShowAllBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowAllBtn)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitBtn)
                    .addComponent(ClrBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllBtnActionPerformed
        // TODO add your handling code here:
        try{
            //String bid=jTextField1.getText().trim();
            Statement stmt = null;
            stmt = connection.createStatement();
            System.out.println("Selecting records into the table...");
            String sql ="SELECT * FROM `returnbook`";
            System.out.println("sql " + sql);
            ResultSet rs=stmt.executeQuery(sql);
            String bid,bname,pages,author,publication,sid,sname;
            while(rs.next()){
            bid=String.valueOf(rs.getInt("bid"));
            bname=rs.getString("bname");
            pages=String.valueOf(rs.getInt("pages"));
            author=rs.getString("author");
            publication=rs.getString("returndate");
            sid=String.valueOf(rs.getInt("sid"));
            sname=rs.getString("sname");
            
            String tbdata[]={sid,sname,bid,bname,author,pages,publication};
            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
            
            //DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
            tblModel.addRow(tbdata);
            }
            } //if SQLException occurs in the above statements then this catch statement catches it and prints the exception
        catch (SQLException se) {}
    }//GEN-LAST:event_ShowAllBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        close();
        new Menu().setVisible(true);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
         String sid=jTextField2.getText().trim();
         String bid=jTextField1.getText().trim();
         if("".equals(jTextField2.getText().trim()) )
        {
            JOptionPane.showMessageDialog(null,"Please enter Student ID"); //Display dialog box with the message
        }
        else if("".equals(jTextField1.getText().trim()))
        {
            JOptionPane.showMessageDialog(null,"Please enter Book ID"); //Display dialog box with the message
        }
        else{
        try{
            //String bid=jTextField1.getText().trim();
            Statement stmt = null;
            stmt = connection.createStatement();
           
            System.out.println("Selecting records into the table...");
            String sql ="SELECT * FROM `returnbook` WHERE sid='" + sid + "' AND bid='" + bid + "'" ;
            System.out.println("sql " + sql);
            ResultSet rs=stmt.executeQuery(sql);
            String bname1,pages1,author1,date1,sname1;
            
            while(rs.next()){
            bname1=rs.getString("bname");
            pages1=String.valueOf(rs.getInt("pages"));
            author1=rs.getString("author");
            date1=rs.getString("returndate");
            sname1=rs.getString("sname");
            String tbdata[]={sid,sname1,bid,bname1,author1,pages1,date1};
            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
            
            //DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
            tblModel.addRow(tbdata);
            }
            } //if SQLException occurs
           catch(SQLException e)
           {
           }
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void ClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrBtnActionPerformed
        // TODO add your handling code here:
         jTextField1.setText("");
         jTextField2.setText("");
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            System.out.println("I am here");
            model.setRowCount(0);
            System.out.println("I am here 1");
       
    }//GEN-LAST:event_ClrBtnActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c) ){
        JOptionPane.showMessageDialog(null,"Please enter number only");
        jTextField2.setText(""); 
        jTextField2.setEditable(true);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c) ){
        JOptionPane.showMessageDialog(null,"Please enter number only");
        jTextField1.setText(""); 
        jTextField1.setEditable(true);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBookRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClrBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ShowAllBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}