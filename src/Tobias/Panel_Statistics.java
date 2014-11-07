/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tobias;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Tobias
 */
public class Panel_Statistics extends javax.swing.JPanel {

    int score = 0;
    String question;
    String answer;
    String result;
    String tmpResult;

    /**
     * Creates new form Panel_statistics
     */
    public Panel_Statistics() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel1.setText("Game Statistics");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Question", "Answer", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setTable(String[][] personStatistics) {
        for (int i = 0; i < 10; i++) {
            question = personStatistics[0][i];
            answer = personStatistics[1][i];
            result = personStatistics[2][i];
            tmpResult = "";
            switch (result) {
                case "true":
                    tmpResult = "Correct!";
                    break;
                case "false":
                    tmpResult = "Wrong!";
                    break;
                default:
                    tmpResult = result;
                    break;
            }

            jTable1.setValueAt(question, i, 0);
            jTable1.setValueAt(answer, i, 1);
            jTable1.setValueAt(tmpResult, i, 2);
            updateScore(result);
            System.out.println(score);

            /* 
             if(result.equals("true"))
                
             jTable1.setBackground(Color.green);
             if(result.equals("false"))
             jTable1.setBackground(Color.red);
             */
        }

    }

    public void updateScore(String result) {
        System.out.println("result = " + result);
        switch (result) {
            case "true":
                score += 100;
                break;
            case "false":
                score -= 100;
                break;
            default:
                score += 0;
                break;
        } 
    }

    public int getScore() {
        return score;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
