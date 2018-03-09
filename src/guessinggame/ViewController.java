/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author llamathedark
 */
public class ViewController extends javax.swing.JFrame {

    // this is where I declare my global variables
    // note that this is whithin the class but outside
    // of any method. That means that I can't run any code
    // here, except to declare (and initialize) variables.
    
    Model model;
    
    
    public ViewController(Model model) {
        initComponents();
        
        this.model = model;
        
        System.out.println("View controller constructed.");
        
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Guess = new javax.swing.JButton();
        txtGuess = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Quit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        newGame = new javax.swing.JButton();
        guessStatus = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Guess.setText("GUESS");
        Guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuessActionPerformed(evt);
            }
        });

        txtGuess.setText("Enter your guess");
        txtGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuessActionPerformed(evt);
            }
        });

        jLabel1.setText("Guess a number from 1 to 100:");

        Quit.setText("QUIT");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        newGame.setText("NEW GAME");

        guessStatus.setText("Please enter a number.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(newGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Quit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGuess, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(guessStatus)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Guess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(guessStatus)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGame)
                    .addComponent(Quit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuessActionPerformed
        //this code will run when I click my button
        System.out.println("Button clicked!");
        model.test(txtGuess.getText());
        
        try{
            int guess = Integer.parseInt(txtGuess.getText());
            
            // give the guess to the model
            // model.processUserGuess(guess);
            
            // and updtate out status
            guessStatus.setText(model.getStatus(guess));
        } catch (NumberFormatException e) {
            guessStatus.setText("Please enter a number.");
        } finally {
            txtGuess.setText("");
        }
    }//GEN-LAST:event_GuessActionPerformed

    private void txtGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuessActionPerformed
        
    }//GEN-LAST:event_txtGuessActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_QuitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guess;
    private javax.swing.JButton Quit;
    private javax.swing.JLabel guessStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newGame;
    private javax.swing.JTextField txtGuess;
    // End of variables declaration//GEN-END:variables
}
