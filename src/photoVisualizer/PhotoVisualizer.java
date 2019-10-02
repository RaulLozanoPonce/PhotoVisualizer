package photoVisualizer;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

public class PhotoVisualizer extends javax.swing.JFrame {
    
    List<JCheckBox> checkBoxList;
    
    public PhotoVisualizer() {
        checkBoxList = new ArrayList<>();
        initComponents();
        checkBoxList.add(rojocb);
        checkBoxList.add(verdecb);
        checkBoxList.add(azulcb);
        jRadioButton1.setSelected(true);
        setIconPosition(10, 10);
        //verdecb.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        imagePanel1 = new photoVisualizer.ImagePanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        todoscb = new javax.swing.JCheckBox();
        rojocb = new javax.swing.JCheckBox();
        verdecb = new javax.swing.JCheckBox();
        azulcb = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Arriba-Izquierda");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Arriba-Derecha");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Abajo-Izquierda");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Abajo-Derecha");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        todoscb.setText("Todos");
        todoscb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoscbActionPerformed(evt);
            }
        });

        rojocb.setText("Rojo");
        rojocb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojocbActionPerformed(evt);
            }
        });

        verdecb.setText("Verde");
        verdecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdecbActionPerformed(evt);
            }
        });

        azulcb.setText("Azul");
        azulcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulcbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rojocb)
                            .addComponent(todoscb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(azulcb)
                            .addComponent(verdecb))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(todoscb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(rojocb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(verdecb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(azulcb))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        setIconPosition(imagePanel1.getWidth() - 74, 10);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        setIconPosition(10, imagePanel1.getHeight() - 74);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        setIconPosition(imagePanel1.getWidth() - 74, imagePanel1.getHeight() - 74);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        setIconPosition(10, 10);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void todoscbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoscbActionPerformed
        if(todoscb.isSelected()){
            activeAll(checkBoxList);
        }
    }//GEN-LAST:event_todoscbActionPerformed

    private void rojocbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojocbActionPerformed
        if(rojocb.isSelected()){
            enableCheckBox(rojocb,checkBoxList);
        }else{
            if(someCheckBoxEnabled(checkBoxList)){
                disableCheckBox(rojocb,checkBoxList);
            }else{
                rojocb.setSelected(true);
            }
        }
    }//GEN-LAST:event_rojocbActionPerformed

    private void verdecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdecbActionPerformed
        if(verdecb.isSelected()){
            enableCheckBox(verdecb,checkBoxList);
        }else{
            if(someCheckBoxEnabled(checkBoxList)){
                disableCheckBox(rojocb,checkBoxList);
            }else{
                verdecb.setSelected(true);
            }
        }
    }//GEN-LAST:event_verdecbActionPerformed

    private void azulcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulcbActionPerformed
        if(azulcb.isSelected()){
            enableCheckBox(azulcb,checkBoxList);
        }else{
            if(someCheckBoxEnabled(checkBoxList)){
                disableCheckBox(rojocb,checkBoxList);
            }else{
                azulcb.setSelected(true);
            }
        }
    }//GEN-LAST:event_azulcbActionPerformed

    private void setIconPosition(int posX, int posY){
        imagePanel1.setIconX(posX);
        imagePanel1.setIconY(posY);
        repaint();
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhotoVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhotoVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhotoVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhotoVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new PhotoVisualizer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox azulcb;
    private javax.swing.ButtonGroup buttonGroup1;
    private photoVisualizer.ImagePanel imagePanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JCheckBox rojocb;
    private javax.swing.JCheckBox todoscb;
    private javax.swing.JCheckBox verdecb;
    // End of variables declaration//GEN-END:variables

    private void disableCheckBox(JCheckBox checkBox, List<JCheckBox> checkBoxList) {
        for (JCheckBox jCheckBox : checkBoxList) {
            if(jCheckBox != checkBox && jCheckBox.isSelected()){
                checkBox.setSelected(false);
                todoscb.setSelected(false);
                break;
            }
        }
    }

    private void enableCheckBox(JCheckBox checkBox, List<JCheckBox> checkBoxList) {
        for (JCheckBox jCheckBox : checkBoxList) {
            if(!jCheckBox.isSelected()){
                todoscb.setSelected(false);
                break;
            }
            todoscb.setSelected(true);
        }
    }

    private void activeAll(List<JCheckBox> checkBoxList) {
        for (JCheckBox jCheckBox : checkBoxList) {
            jCheckBox.setSelected(true);
        }
    }

    private boolean someCheckBoxEnabled(List<JCheckBox> checkBoxList) {
        for (JCheckBox jCheckBox : checkBoxList) {
            if(jCheckBox.isSelected()){
                return true;
            }
        }
        return false;
    }
}
