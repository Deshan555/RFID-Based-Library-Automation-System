/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.E_Library;

import Background.Bugs;
import Background.Open_Url;
import Online_Services.Push_Data;
import com.sbix.jnotify.NPosition;
import com.sbix.jnotify.NoticeType;
import com.sbix.jnotify.NoticeWindow;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author whatd
 */
public class movies extends javax.swing.JInternalFrame {

    int value = 0;
    
    public movies() {
        initComponents();
        
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        BasicInternalFrameUI bis = (BasicInternalFrameUI) this.getUI();
        
        bis.setNorthPane(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1174, 430));
        setPreferredSize(new java.awt.Dimension(1205, 498));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Movies Title :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 174, 36));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Genare : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 281, 174, 36));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Rating :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, 174, 36));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Runtime : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, 174, 36));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel6.setText("Director : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, 174, 36));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel7.setText("Released Year : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, 174, 36));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Discription : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 97, 127, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel9.setText("URL : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 29, 127, 36));

        jTextField2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 30, 329, 35));

        jTextField3.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField3.setBorder(null);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 346, 329, 35));

        jTextField4.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 148, 329, 35));

        jTextField5.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 215, 329, 35));

        jTextField7.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jTextField7.setBorder(null);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 30, 329, 35));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 105, 453, 220));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_30px.png"))); // NOI18N
        jLabel1.setText("Save Data");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 218, 37));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_35px.png"))); // NOI18N
        jLabel10.setText("Find Details");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 218, 37));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 66, 329, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 184, 329, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 251, 329, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 384, 329, 10));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G - General Audiences", "PG - Parental Guidance Suggested", "PG -1 3 -  Parents Strongly Cautioned", "R - Restricted", "NC - 17 - Adults Only" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 91, 329, 36));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Comedy", "Crime and mystery", "Fantasy", "Historical", "Historical fiction", "Horror", "Romance", "Satire", "Science fiction", "Cyberpunk and derivatives", "Speculative", "Thriller", "Western", "Other" }));
        jComboBox2.setBorder(null);
        jComboBox2.setFocusable(false);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 281, 329, 36));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 66, 329, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
       
       if(jTextField7.getText().trim().isEmpty())
       {
           value = 0;
       }
       else
       {
           value = 1;
       }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        if(value == 0)
        {
             new NoticeWindow(NoticeType.WARNING_NOTIFICATION,"Warning Message :\n\nURL Field Can''t Be Empty Please Fill It",NoticeWindow.SHORT_DELAY,NPosition.CENTER);
        }
        else
        {
            int choice = JOptionPane.showConfirmDialog(null,"Do You Really Want to Add This Data");
            
            if(choice == 0)
            {
               new NoticeWindow(NoticeType.SUCCESS_NOTIFICATION,"Cloud Upload Starting....",NoticeWindow.SHORT_DELAY,NPosition.BOTTOM_RIGHT);
                
               String year = jTextField3.getText();
            
               String genare = String.valueOf(jComboBox2.getSelectedItem());
            
               String rating = String.valueOf(jComboBox1.getSelectedItem());

               Push_Data.Insert_Movies(jTextField2.getText(),jTextField4.getText(),year,rating,jTextField5.getText(),genare,jTextField7.getText(),jTextArea1.getText());
            }   
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        
        if((jTextField3.getText().matches("^[0-9]*$") && (jTextField3.getText().length()== 4)))
        {
            jTextField3.setForeground(Color.BLACK);
        }
        else
        {
            jTextField3.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        
         if(jTextField3.getText().matches("^[0-9]*$"))
        {
            jTextField3.setForeground(Color.BLACK);
        }
        else
        {
            jTextField3.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
       String search = jTextField2.getText();
       
       search = search.replaceAll("\\s","");
       
        try 
        {
            Open_Url.visit("https://www.google.com/search?q="+search);
        } 
        catch (IOException ex)
        {
            Bugs.exceptions(String.valueOf(ex));
        }
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
