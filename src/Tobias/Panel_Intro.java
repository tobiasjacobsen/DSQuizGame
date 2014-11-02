/**
 * @author Tobias
 */

package Tobias;

import javax.swing.ImageIcon;

public class Panel_Intro extends javax.swing.JPanel {
    
    private final ImageIcon logo = new ImageIcon("./art/images/backgroundImages/cphairport.png");

    public Panel_Intro() {
        initComponents();
        jLabel_logo.setIcon(logo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_logo = new javax.swing.JLabel();

        setOpaque(false);

        jLabel_logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tobias\\Desktop\\Tobias dropbox\\Dropbox\\Datamatiker\\1. semester\\Programming\\JAVA\\Obligatoriske afleveringer\\4_DAT-Service\\DSQuizGame\\art\\images\\backgroundImages\\cphairport.png")); // NOI18N
        jLabel_logo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel_logo)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel_logo)
                .addContainerGap(396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_logo;
    // End of variables declaration//GEN-END:variables
}
