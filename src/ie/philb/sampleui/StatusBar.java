/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.philb.sampleui;

/**
 *
 * @author philb
 */
public class StatusBar extends javax.swing.JPanel {

    /**
     * Creates new form StatusBar
     */
    public StatusBar() {
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

        lblTime = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTime.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTime.setText("14:55:01");
        lblTime.setName("lblTime"); // NOI18N

        lblStatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblStatus.setText("None");
        lblStatus.setName("lblStatus"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables

    void setStatusMessage(String msg) {
        lblStatus.setText(msg);
    }
}
