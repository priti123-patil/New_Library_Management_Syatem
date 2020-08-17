package Com.main.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddNewBook extends javax.swing.JFrame {
    

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";          //declaration of static variable JDBC_DRIVER and value initialized to it
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_library"; //declaration of static variable DB_URL,databse path initialized to it
    //Database Credentials
    static final String USER = "root";                                  //declaration of static variable USER and value initialized to it
    static final String PASS = "";
    static Connection connection;
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
    public AddNewBook() {
        initComponents();
    }
    public void close(){
     WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     } 
  

    /**
     * Creates new form NewJFrame3
     */
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        ADDButton1 = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        HelpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Modify Book");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("***Add / Modify Book***");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\LibraryManagement\\Images\\lib.jpg")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Book Name:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Author:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("No of Pages:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Publication:");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        ADDButton1.setBackground(new java.awt.Color(51, 255, 0));
        ADDButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ADDButton1.setText("ADD");
        ADDButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDButton1ActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Enter following Book Details before that click on help");

        ClearButton.setBackground(new java.awt.Color(255, 0, 0));
        ClearButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        ModifyButton.setBackground(new java.awt.Color(0, 255, 0));
        ModifyButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ModifyButton.setText("Modify");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Book ID:");

        HelpButton.setBackground(new java.awt.Color(255, 255, 51));
        HelpButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        HelpButton.setText("Help");
        HelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HelpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ADDButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ModifyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitButton)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HelpButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ADDButton1)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ClearButton)
                        .addComponent(ModifyButton)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADDButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDButton1ActionPerformed
        // TODO add your handling code here:
        
        if("".equals(jTextField2.getText().trim()) )
        {
            JOptionPane.showMessageDialog(null,"Please enter valid book name"); //Display dialog box with the message
        }
        else if("".equals(jTextField3.getText().trim()))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid number of pages"); //Display dialog box with the message
        }
        else if("".equals(jTextField5.getText().trim()))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid book author"); //Display dialog box with the message
        }
        else if("".equals(jTextField6.getText().trim()))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid book publication"); //Display dialog box with the message
        }
        else{
        try{
            //String bid=jTextField1.getText().trim();
            String bname=jTextField2.getText().trim();
            String author=jTextField5.getText().trim();
            String pages=jTextField3.getText().trim();
            String publication=jTextField6.getText().trim();
            Statement stmt = null;
            stmt = connection.createStatement();
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO `book` (`bname`, `author`, `pages`,`publication`)  VALUES('" + bname + "','" + author + "','" + pages + "','"+publication+"')";
            //execute a query
            System.out.println("sql " + sql);
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the tbl_account table...");
            
            JOptionPane.showMessageDialog(null,"Values Inserted Successfully!!!"); //Display dialog box with the message
       
            String bids = "Select max(bid) from book";
            ResultSet rs = connection.createStatement().executeQuery(bids);

            while (rs.next()) {
                int bid = rs.getInt(1);
                System.out.println(bname + " your id is : " + bid + "please save it for further used");
                JOptionPane.showConfirmDialog(rootPane, "Your book id is "+bid);
                }
        } //if SQLException occurs in the above statements then this catch statement catches it and prints the exception
        catch (SQLException se) {
            System.out.println(se);
        }
        }
    }//GEN-LAST:event_ADDButton1ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        //new NewJFrame2.setVisible(true);
        close();
        new Menu().setVisible(true);
    
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        // TODO add your handling code here:
        //close();
        
        if(jTextField4.getText()=="")
        {
             JOptionPane.showMessageDialog(null,"Please enter valid Book ID"); //Display dialog box with the message
       
        }
        else{
        try{
            //String bid=jTextField1.getText().trim();
            String bid=jTextField4.getText().trim();
            String bname=jTextField2.getText().trim();
            String author=jTextField5.getText().trim();
            String pages=jTextField3.getText().trim();
            String publication=jTextField6.getText().trim();
            Statement stmt = null;
            stmt = connection.createStatement();
            System.out.println("Updating records into the table...");
            String sql = "UPDATE `book` SET `bname`='" + bname + "',`author`='" + author + "',`pages`='" + pages + "',`publication`='" + publication + "' WHERE bid='" + bid + "'";
            System.out.println("sql " + sql);
            stmt.executeUpdate(sql);
            System.out.println("Updated records into the tbl_account table...");
            JOptionPane.showMessageDialog(null,"Values Updated Successfully!!!"); //Display dialog box with the message
       
            
        } //if SQLException occurs in the above statements then this catch statement catches it and prints the exception
        catch (SQLException se) {
            System.out.println(se);
        }
        }
               
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButtonActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null,"If you want to add new book then don't enter bookid it is not needed for that purpose.But if you want to modify book then you must enter book id"); //Display dialog box with the message
       
    }//GEN-LAST:event_HelpButtonActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
       char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)){
        jTextField2.setEditable(true);
        }else{
        //jTextField2.setText("");
         JOptionPane.showMessageDialog(null,"Please enter valid Book name");
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c) ){
        JOptionPane.showMessageDialog(null,"Please enter number only");
        jTextField4.setText(""); 
        jTextField4.setEditable(true);
        
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
         JOptionPane.showMessageDialog(null,"Please enter number only");
         jTextField3.setText(""); 
         jTextField3.setEditable(true);
         
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c)){
       
            jTextField5.setEditable(true);
        }
        else
        {
           // jTextField5.setText("");
         JOptionPane.showMessageDialog(null,"Please enter valid author ");
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(c)){
       
            jTextField6.setEditable(true);
        }
        else
        {
           // jTextField6.setText("");
         JOptionPane.showMessageDialog(null,"Please enter valid publication name ");
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDButton1;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton HelpButton;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
