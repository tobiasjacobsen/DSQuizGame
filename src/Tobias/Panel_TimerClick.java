/**
 * @author Tobias
 */

package Tobias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;

import Andreas.QuizGUI2;
import javax.swing.ImageIcon;


public class Panel_TimerClick extends javax.swing.JPanel {
    
    SoundPlayer player1 = new SoundPlayer();
    Round round = new Round();
    ImageOverlay imageoverlay = new ImageOverlay();
    String bg_fileName; 
    String star_fileName; 
    Random pos = new Random(); 
    int posX;
    int posY;
    
    
    private JLabel label;
    private Timer timer;
    private final int COUNT_TIME = 4;
    private int counter; // the duration
    private final int DELAY = 1000; // every 1 second
    private boolean timeUp = false;
    
    public Panel_TimerClick() {
        initComponents();
        
        //-Place star randomly on screen
        jLabel_star.setLocation(randomPosX(), randomPosY());
        
        //- Change background image
        bg_fileName = "./art/images/backgroundImages/bg_london.jpg";
        ImageIcon background = new ImageIcon(bg_fileName);
        jLabel_background.setIcon(background);
        //----------------------------------------------
        
        //-Change star image
        star_fileName = "./art/images/icons/star.png";
        ImageIcon star = new ImageIcon(star_fileName);
        jLabel_star.setIcon(star);
        //---------------------------------------------
        
        //-start countdown
        setCountDown();
        
        /*player1.loadSound("./art/sound/ItsBeenSoLong.wav");
        player1.playSound();
        player1.stopSound(); */
    }
    
    public void setCountDown() {
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                timeUp = false;
                System.out.println("TimeUp is: " + timeUp);
                if (counter == 0) {
                    round.subtractRound(-1);
                    timeUp = true;
                    System.out.println("TimeUp is: " + timeUp);
                    jLabel_countDown.setText("Time is up!");
                    jLabel_star.setLocation(randomPosX(), randomPosY());
                    counter = COUNT_TIME;
                    
                } else {
                    jLabel_countDown.setText(counter-1 + "sec");
                    counter--;
                }
            System.out.println("Counter is: " + counter);  
            } 
        };
        
        counter = COUNT_TIME;
        timer = new Timer(DELAY, action);   
        timer.setInitialDelay(0);
        timer.setRepeats(true);
        timer.start();
        setVisible(true);
    }
    
    public int randomPosX() {
        posX = pos.nextInt(700)+30;
        return posX;
    }
    
    public int randomPosY() {
        posY = pos.nextInt(500)+30;
        return posY;
    }
    
    public void timeIsUp() {
        //jLabel_star.setLocation(randomPosX(), randomPosY());
        timer.stop();
        timeUp = false;
        //timer.restart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_star = new javax.swing.JLabel();
        jLabel_countDown = new javax.swing.JLabel();
        jLabel_background = new javax.swing.JLabel();

        setLayout(null);

        jLabel_star.setIcon(new javax.swing.ImageIcon("E:\\Dropbox\\Datamatiker\\1. semester\\Programming\\JAVA\\Obligatoriske afleveringer\\4_DAT-Service\\DSQuizGame\\art\\images\\icons\\star.png")); // NOI18N
        jLabel_star.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_starMouseClicked(evt);
            }
        });
        add(jLabel_star);
        jLabel_star.setBounds(370, 250, 60, 70);

        jLabel_countDown.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_countDown.setFont(new java.awt.Font("Tunga", 0, 24)); // NOI18N
        jLabel_countDown.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_countDown.setText("countdown");
        jLabel_countDown.setOpaque(true);
        add(jLabel_countDown);
        jLabel_countDown.setBounds(690, 550, 100, 30);

        jLabel_background.setIcon(new javax.swing.ImageIcon("E:\\Dropbox\\Datamatiker\\1. semester\\Programming\\JAVA\\Obligatoriske afleveringer\\4_DAT-Service\\DSQuizGame\\art\\images\\backgroundImages\\bg_london.jpg")); // NOI18N
        add(jLabel_background);
        jLabel_background.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_starMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_starMouseClicked
        System.out.println("Star clicked!");
        QuizGUI2 quiz = new QuizGUI2();
        quiz.setVisible(true);
    }//GEN-LAST:event_jLabel_starMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_background;
    private javax.swing.JLabel jLabel_countDown;
    private javax.swing.JLabel jLabel_star;
    // End of variables declaration//GEN-END:variables
}
