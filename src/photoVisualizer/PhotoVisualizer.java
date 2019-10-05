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
        topLeftRadioButton.setSelected(true);
        setIconPosition(10, 10);
        allCheckBox.setSelected(true);
        allCheckBox.setEnabled(false);
        redCheckBox.setSelected(true);
        greenCheckBox.setSelected(true);
        blueCheckBox.setSelected(true);
        urlTextField.setText("https://www.dictando.com/wp-content/uploads/2018/07/dictado-mi-casa-A1.jpg");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        imagePanel = new photoVisualizer.ImagePanel();
        titleLabel = new javax.swing.JLabel();
        logoPosition = new javax.swing.JPanel();
        topLeftRadioButton = new javax.swing.JRadioButton();
        topRightRadioButton = new javax.swing.JRadioButton();
        downLeftRadioButton = new javax.swing.JRadioButton();
        downRightRadioButton = new javax.swing.JRadioButton();
        colorChannelPanel = new javax.swing.JPanel();
        allCheckBox = new javax.swing.JCheckBox();
        redCheckBox = new javax.swing.JCheckBox();
        greenCheckBox = new javax.swing.JCheckBox();
        blueCheckBox = new javax.swing.JCheckBox();
        imageSelectionPanel = new javax.swing.JPanel();
        urlTextField = new javax.swing.JTextField();
        urlLabel = new javax.swing.JLabel();
        loadLabelButton = new javax.swing.JButton();
        cleanURLButton = new javax.swing.JButton();
        authorsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("PROCESAMIENTO DE IMÁGENES - PHOTO VISUALIZER");

        logoPosition.setBorder(javax.swing.BorderFactory.createTitledBorder("Posición Logotipo"));

        buttonGroup1.add(topLeftRadioButton);
        topLeftRadioButton.setText("Arriba-Izquierda");
        topLeftRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLeftRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(topRightRadioButton);
        topRightRadioButton.setText("Arriba-Derecha");
        topRightRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topRightRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(downLeftRadioButton);
        downLeftRadioButton.setText("Abajo-Izquierda");
        downLeftRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downLeftRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(downRightRadioButton);
        downRightRadioButton.setText("Abajo-Derecha");
        downRightRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downRightRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logoPositionLayout = new javax.swing.GroupLayout(logoPosition);
        logoPosition.setLayout(logoPositionLayout);
        logoPositionLayout.setHorizontalGroup(
            logoPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPositionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topLeftRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topRightRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(downLeftRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(downRightRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPositionLayout.setVerticalGroup(
            logoPositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPositionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topLeftRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topRightRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downLeftRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downRightRadioButton))
        );

        colorChannelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Canales de Color"));
        colorChannelPanel.setPreferredSize(new java.awt.Dimension(127, 122));

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

        javax.swing.GroupLayout colorChannelPanelLayout = new javax.swing.GroupLayout(colorChannelPanel);
        colorChannelPanel.setLayout(colorChannelPanelLayout);
        colorChannelPanelLayout.setHorizontalGroup(
            colorChannelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorChannelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorChannelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(redCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greenCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blueCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        colorChannelPanelLayout.setVerticalGroup(
            colorChannelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorChannelPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(allCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueCheckBox))
        );

        imageSelectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selección de Imagen"));

        urlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlTextFieldActionPerformed(evt);
            }
        });

        urlLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        urlLabel.setText("URL:");

        loadLabelButton.setText("Cargar Imagen");
        loadLabelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadLabelButtonActionPerformed(evt);
            }
        });

        cleanURLButton.setText("Borrar URL");
        cleanURLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanURLButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imageSelectionPanelLayout = new javax.swing.GroupLayout(imageSelectionPanel);
        imageSelectionPanel.setLayout(imageSelectionPanelLayout);
        imageSelectionPanelLayout.setHorizontalGroup(
            imageSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imageSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(urlLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(imageSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(imageSelectionPanelLayout.createSequentialGroup()
                        .addComponent(loadLabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cleanURLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        imageSelectionPanelLayout.setVerticalGroup(
            imageSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imageSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urlLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imageSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadLabelButton)
                    .addComponent(cleanURLButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        authorsLabel.setText("Raúl Lozano Ponce, Pablo Perdomo Falcón");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorChannelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorsLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorChannelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imageSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(authorsLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topRightRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topRightRadioButtonActionPerformed
        setIconPosition(imagePanel.getWidth() - 74, 10);
    }//GEN-LAST:event_topRightRadioButtonActionPerformed

    private void downLeftRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downLeftRadioButtonActionPerformed
        setIconPosition(10, imagePanel.getHeight() - 74);
    }//GEN-LAST:event_downLeftRadioButtonActionPerformed

    private void downRightRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downRightRadioButtonActionPerformed
        setIconPosition(imagePanel.getWidth() - 74, imagePanel.getHeight() - 74);
    }//GEN-LAST:event_downRightRadioButtonActionPerformed

    private void topLeftRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topLeftRadioButtonActionPerformed
        setIconPosition(10, 10);
    }//GEN-LAST:event_topLeftRadioButtonActionPerformed

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
        loadImage();
    }//GEN-LAST:event_urlTextFieldActionPerformed

    private void cleanURLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanURLButtonActionPerformed
        urlTextField.setForeground(Color.black);
        urlTextField.setText("");
    }//GEN-LAST:event_cleanURLButtonActionPerformed

    private void loadLabelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadLabelButtonActionPerformed
        loadImage();
    }//GEN-LAST:event_loadLabelButtonActionPerformed

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
    
    private void loadImage(){
        urlTextField.setForeground(Color.black);
        if(imagePanel.setImage(urlTextField.getText())){
            repaint();
        }else{
            urlTextField.setForeground(Color.red);
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
    private javax.swing.JLabel authorsLabel;
    private javax.swing.JCheckBox blueCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cleanURLButton;
    private javax.swing.JPanel colorChannelPanel;
    private javax.swing.JRadioButton downLeftRadioButton;
    private javax.swing.JRadioButton downRightRadioButton;
    private javax.swing.JCheckBox greenCheckBox;
    private photoVisualizer.ImagePanel imagePanel;
    private javax.swing.JPanel imageSelectionPanel;
    private javax.swing.JButton loadLabelButton;
    private javax.swing.JPanel logoPosition;
    private javax.swing.JCheckBox redCheckBox;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton topLeftRadioButton;
    private javax.swing.JRadioButton topRightRadioButton;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlTextField;
    // End of variables declaration//GEN-END:variables
}
