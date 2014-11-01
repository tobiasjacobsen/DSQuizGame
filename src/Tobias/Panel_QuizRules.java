/**
 * @author Tobias
 */
package Tobias;

import javax.swing.ImageIcon;


public class Panel_QuizRules extends javax.swing.JPanel {
    
    private final ImageIcon arrowRight = new ImageIcon("./art/images/icons/arrow_right.png");
    private final ImageIcon star = new ImageIcon("./art/images/icons/star.png");
    

    public Panel_QuizRules() {
        initComponents();
        jLabel_arrowRight.setIcon(arrowRight);
        jLabel_star.setIcon(star);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2_text2 = new javax.swing.JLabel();
        jLabel1_text1 = new javax.swing.JLabel();
        jLabel4_text4 = new javax.swing.JLabel();
        jLabel5_text5 = new javax.swing.JLabel();
        jLabel6_text6 = new javax.swing.JLabel();
        jLabel8_text8 = new javax.swing.JLabel();
        jLabel3_text3 = new javax.swing.JLabel();
        jLabel7_text7 = new javax.swing.JLabel();
        jLabel_arrowRight = new javax.swing.JLabel();
        jLabel_star = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setOpaque(false);

        jLabel2_text2.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        jLabel2_text2.setText("Welcome to the destination game!");

        jLabel1_text1.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel1_text1.setText("Answer the question to get knowledge about your destination  ");

        jLabel4_text4.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel4_text4.setText("and to collect points to win prices on the plane. ");

        jLabel5_text5.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel5_text5.setText("To get the question click, the icon  that appears on you screen ");

        jLabel6_text6.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel6_text6.setText("- But hurry up! It will disappear within 3 sec.  ");

        jLabel8_text8.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel8_text8.setText("You collect points by clicking the icon ");

        jLabel3_text3.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel3_text3.setText("and answer the questions correctly  ");

        jLabel7_text7.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel7_text7.setText("This is what you should be looking for");

        jLabel_arrowRight.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tobias\\Desktop\\Tobias dropbox\\Dropbox\\Datamatiker\\1. semester\\Programming\\JAVA\\Obligatoriske afleveringer\\4_DAT-Service\\DSQuizGame\\art\\images\\icons\\arrow_right.png")); // NOI18N

        jLabel_star.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tobias\\Desktop\\Tobias dropbox\\Dropbox\\Datamatiker\\1. semester\\Programming\\JAVA\\Obligatoriske afleveringer\\4_DAT-Service\\DSQuizGame\\art\\images\\icons\\star.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5_text5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel2_text2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1_text1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel4_text4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel6_text6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3_text3)
                            .addComponent(jLabel8_text8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel7_text7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_arrowRight)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel_star)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2_text2)
                .addGap(26, 26, 26)
                .addComponent(jLabel1_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4_text4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5_text5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6_text6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel8_text8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3_text3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7_text7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_star)
                            .addComponent(jLabel_arrowRight))
                        .addGap(109, 109, 109))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1_text1;
    private javax.swing.JLabel jLabel2_text2;
    private javax.swing.JLabel jLabel3_text3;
    private javax.swing.JLabel jLabel4_text4;
    private javax.swing.JLabel jLabel5_text5;
    private javax.swing.JLabel jLabel6_text6;
    private javax.swing.JLabel jLabel7_text7;
    private javax.swing.JLabel jLabel8_text8;
    private javax.swing.JLabel jLabel_arrowRight;
    private javax.swing.JLabel jLabel_star;
    // End of variables declaration//GEN-END:variables
}