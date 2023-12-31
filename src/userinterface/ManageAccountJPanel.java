/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.AccountDirectory;
import javax.swing.JPanel;

/**
 *
 * @author kwali
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    private JPanel DisplayPanel;
    private AccountDirectory accountDirectory;
    
    public ManageAccountJPanel() {
        initComponents();
        this.DisplayPanel = DisplayPanel;
        this.accountDirectory = accountDirectory;
    }

    ManageAccountJPanel(JPanel DisplayPanel, AccountDirectory accountDirectory) {
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateAccbtn = new javax.swing.JButton();
        ManageAccBtn = new javax.swing.JButton();

        CreateAccbtn.setText("Create Account");
        CreateAccbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccbtnActionPerformed(evt);
            }
        });

        ManageAccBtn.setText("Manage Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ManageAccBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateAccbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(CreateAccbtn)
                .addGap(49, 49, 49)
                .addComponent(ManageAccBtn)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccbtnActionPerformed
        CreateAccJPanel panel = new CreateAccJPanel(DisplayPanel, accountDirectory);
        
    }//GEN-LAST:event_CreateAccbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccbtn;
    private javax.swing.JButton ManageAccBtn;
    // End of variables declaration//GEN-END:variables
}
