/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author admin
 */
public class homeload extends javax.swing.JFrame {

    /**
     * Creates new form homeload
     */
    public homeload() {
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

        myprogress = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        percent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        myprogress.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("hospital management system");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\pixilart-drawing.png")); // NOI18N
        jLabel2.setText("jLabel2");

        percent.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        percent.setForeground(new java.awt.Color(255, 204, 51));
        percent.setText("%");

        javax.swing.GroupLayout myprogressLayout = new javax.swing.GroupLayout(myprogress);
        myprogress.setLayout(myprogressLayout);
        myprogressLayout.setHorizontalGroup(
            myprogressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myprogressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(myprogressLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myprogressLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(myprogressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myprogressLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myprogressLayout.createSequentialGroup()
                        .addComponent(percent)
                        .addGap(261, 261, 261))))
        );
        myprogressLayout.setVerticalGroup(
            myprogressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myprogressLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myprogress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myprogress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       homeload splash=new homeload();
       splash.setVisible(true);
       try{
           for(int i=0;i<=100;i++){
               Thread.sleep(40);
               splash.progress.setValue(i);
               splash.percent.setText(i+"%");
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       new login().setVisible(true);
       splash.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel myprogress;
    private javax.swing.JLabel percent;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}