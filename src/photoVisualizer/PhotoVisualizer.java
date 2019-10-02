package photoVisualizer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

public class PhotoVisualizer extends javax.swing.JFrame {
    
    List<JCheckBox> checkBoxList;
    
    public PhotoVisualizer() {
        checkBoxList = new ArrayList<>();
        initComponents();
        checkBoxList.add(redCheckBox);
        checkBoxList.add(greenCheckBox);
        checkBoxList.add(blueCheckBox);
        jRadioButton1.setSelected(true);
        setIconPosition(10, 10);
        allCheckBox.setSelected(true);
        allCheckBox.setEnabled(false);
        redCheckBox.setSelected(true);
        greenCheckBox.setSelected(true);
        blueCheckBox.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        imagePanel = new photoVisualizer.ImagePanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        allCheckBox = new javax.swing.JCheckBox();
        redCheckBox = new javax.swing.JCheckBox();
        greenCheckBox = new javax.swing.JCheckBox();
        blueCheckBox = new javax.swing.JCheckBox();
        urlTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        allCheckBox.setText("Todos");
        allCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allCheckBoxActionPerformed(evt);
            }
        });

        redCheckBox.setText("Rojo");
        redCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCheckBoxActionPerformed(evt);
            }
        });

        greenCheckBox.setText("Verde");
        greenCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenCheckBoxActionPerformed(evt);
            }
        });

        blueCheckBox.setText("Azul");
        blueCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueCheckBoxActionPerformed(evt);
            }
        });

        urlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redCheckBox)
                            .addComponent(allCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blueCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(greenCheckBox)
                                .addGap(69, 69, 69)
                                .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(allCheckBox))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(redCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(greenCheckBox)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(blueCheckBox))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        setIconPosition(imagePanel.getWidth() - 74, 10);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        setIconPosition(10, imagePanel.getHeight() - 74);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        setIconPosition(imagePanel.getWidth() - 74, imagePanel.getHeight() - 74);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        setIconPosition(10, 10);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void allCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allCheckBoxActionPerformed
        if(allCheckBox.isSelected()){
            activeAllCheckBox(checkBoxList);
            unlockAllCheckBox(checkBoxList);
            allCheckBox.setEnabled(false);
        }
        imagePanel.invertMode(redCheckBox.isSelected(), greenCheckBox.isSelected(), blueCheckBox.isSelected());
    }//GEN-LAST:event_allCheckBoxActionPerformed

    private void redCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCheckBoxActionPerformed
        changeCheckBoxState(redCheckBox, checkBoxList);
        imagePanel.invertMode(redCheckBox.isSelected(), greenCheckBox.isSelected(), blueCheckBox.isSelected());
    }//GEN-LAST:event_redCheckBoxActionPerformed

    private void greenCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenCheckBoxActionPerformed
        changeCheckBoxState(greenCheckBox, checkBoxList);
        imagePanel.invertMode(redCheckBox.isSelected(), greenCheckBox.isSelected(), blueCheckBox.isSelected());
    }//GEN-LAST:event_greenCheckBoxActionPerformed

    private void blueCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueCheckBoxActionPerformed
        changeCheckBoxState(blueCheckBox, checkBoxList);
        imagePanel.invertMode(redCheckBox.isSelected(), greenCheckBox.isSelected(), blueCheckBox.isSelected());
    }//GEN-LAST:event_blueCheckBoxActionPerformed

    private void urlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlTextFieldActionPerformed
        if(imagePanel.setImage(urlTextField.getText())){
            repaint();
        }else{
            urlTextField.setForeground(Color.red);
        }
    }//GEN-LAST:event_urlTextFieldActionPerformed

    private void setIconPosition(int posX, int posY){
        imagePanel.setIconX(posX);
        imagePanel.setIconY(posY);
        repaint();
    }
    
    private void changeCheckBoxState(JCheckBox checkBox, List<JCheckBox> checkBoxList) {
        if(checkBox.isSelected()){
            unlockAllCheckBox(checkBoxList);
            if(isAllEnabled(checkBoxList)){
                allCheckBox.setSelected(true);
                allCheckBox.setEnabled(false);
            }
        }else{
            allCheckBox.setSelected(false);
            allCheckBox.setEnabled(true);
            JCheckBox jcb = lockCheckBox(checkBoxList);
            if(jcb != null){
                jcb.setEnabled(false);
            }
        }
    }
    
    private void activeAllCheckBox(List<JCheckBox> checkBoxList) {
        for (JCheckBox jCheckBox : checkBoxList) {
            jCheckBox.setSelected(true);
        }
    }

    private boolean isAllEnabled(List<JCheckBox> checkBoxList) {
        for (JCheckBox jCheckBox : checkBoxList) {
            if(!jCheckBox.isSelected()){
                return false;
            }
        }
        return true;
    }

    private JCheckBox lockCheckBox(List<JCheckBox> checkBoxList) {
        JCheckBox toBlock = null;
        for (JCheckBox jCheckBox : checkBoxList) {
            if(jCheckBox.isSelected()){
                if(toBlock == null){
                    toBlock = jCheckBox;
                }else{
                    return null;
                }
            }
        }
        return toBlock;
    }

    private void unlockAllCheckBox(List<JCheckBox> checkBoxList) {
        for (JCheckBox jCheckBox : checkBoxList) {
            jCheckBox.setEnabled(true);
        }
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
    private javax.swing.JCheckBox allCheckBox;
    private javax.swing.JCheckBox blueCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox greenCheckBox;
    private photoVisualizer.ImagePanel imagePanel;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JTextField urlTextField;
    // End of variables declaration//GEN-END:variables
}
