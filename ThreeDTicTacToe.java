import java.awt.Color;
import java.awt.Font;
import java.util.Random;


import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


/**
 *
 * @author adamv
 */
public class ThreeDTicTacToe extends javax.swing.JFrame {

    int turn = 1;
    char[][] board1 = new char[3][3];
    int time = 0;
    int time1 = 0;
    int time2 = 0;
    int time3 = 0;
    int time4 = 0;
    int time5 = 0;
    int time6 = 0;
    int time7 = 0;
    int time8 = 0;
    boolean isOTurn = false;
    
    TicTacToeLogic ttt = new TicTacToeLogic();
    
    
    
   private void pressRandomButton(int j,int m, java.awt.event.ActionEvent evt) {
	   Random random = new Random();
	   
	   int randomNumber;
	   int rand2;
	  
	   
	   do {
           randomNumber = random.nextInt(3); // Generates a number between 1 and 2
           rand2 = random.nextInt(3);
           
       } while (randomNumber == j && rand2 == m);
	       //System.out.println(" randnumber " + randomNumber + " rand2 " + rand2);
           if(randomNumber == 0 && rand2 == 0)
        	   ZeroZeroActionPerformed(evt);
           if(randomNumber == 0 && rand2 == 1)
        	   ZeroOneActionPerformed(evt);
           if(randomNumber == 0 && rand2 == 2)
        	   ZeroTwoActionPerformed(evt);
           if(randomNumber == 1 && rand2 == 0)
        	   OneZeroActionPerformed(evt);
           if(randomNumber == 1 && rand2 == 1)
        	   OneOneActionPerformed(evt);
           if(randomNumber == 1 && rand2 == 2)
        	   OneTwoActionPerformed(evt);
           if(randomNumber == 2 && rand2 == 0)
        	   TwoZeroActionPerformed(evt);
           if(randomNumber == 2 && rand2 == 1)
        	   TwoOneActionPerformed(evt);
           if(randomNumber == 2 && rand2 == 2)
        	   TwoTwoActionPerformed(evt);
       
	 
	      
	   
 
	   
	   
   }
    
    /*
     * Action method takes in a button, two ints and a char [] [] array as it's 
     * parameters. The whole purpose of this method is to run the tictactoe game
     */

    private void Action(javax.swing.JButton x, java.awt.event.ActionEvent evt,int i, int j, char[][] board) {
        x.setFont(new Font("Serif", Font.PLAIN, 28));
        jButton1.setFont(new Font("Serif", Font.PLAIN, 28));
        jLabel1.setText("GAME Instructions");
        //System.out.println(turn);
       
        if (turn == 1 ) {
        	
            x.setText("X");
            board[i][j] = 'X';
            
            jButton1.setText("Player O pick a spot");
            turn = 2;
            isOTurn = true;
            pressRandomButton(i,j,evt);
            
        } else if (turn == 2 ) {
        	
            x.setText("O");
         
            board[i][j] = 'O';
            jButton1.setText("Player X pick a spot");
            turn = 3;
        } else if (turn == 3 ) {
        	
            x.setText("X");
            board[i][j] = 'X';
            jButton1.setText("Player O pick a spot");
            turn = 4;
            isOTurn = true;
            pressRandomButton(i,j,evt);
        } else if (turn == 4 ) {
        	
            x.setText("O");
            board[i][j] = 'O';
            jButton1.setText("Player X pick a spot");
            turn = 5;
        } else if (turn == 5 ) {
        	
            x.setText("X");
            board[i][j] = 'X';
            //check winner
            if (ttt.isSolved(board)) {
                jButton1.setText("Winner is " + ttt.getWinner());
                jLabel1.setText("Click Below to Go Again");
                turn = 10;
            } else {
                jButton1.setText("Player O pick a spot");
                turn = 6;
                //System.out.println("in 6  i " + i + " j " + j);
                isOTurn = true;
                
                pressRandomButton(i,j,evt);
            }
        } else if (turn == 6 ) {
        	
            x.setText("O");
            board[i][j] = 'O';
            //check winner
            if (ttt.isSolved(board)) {
                jButton1.setText("Winner is " + ttt.getWinner());
                jLabel1.setText("Click Below to Go Again");
                turn = 10;
            } else {
                jButton1.setText("Player X pick a spot");
                turn = 7;
                //System.out.println("in 7  i " + i + " j " + j);
            }
        } else if (turn == 7 ) {
        	
            x.setText("X");
            board[i][j] = 'X';
            //check winner
            if (ttt.isSolved(board)) {
                jButton1.setText("Winner is " + ttt.getWinner());
                jLabel1.setText("Click Below to Go Again");
                turn = 10;
            } else {
            	//System.out.println("in 8  i " + i + " j " + j);
                jButton1.setText("Player O pick a spot");
                turn = 8;
                isOTurn = true;
                pressRandomButton(i,j,evt);
            }
        } else if (turn == 8 ) {
        	
            x.setText("O");
            board[i][j] = 'O';
            //check winner
            if (ttt.isSolved(board)) {
                jButton1.setText("Winner is " + ttt.getWinner());
                jLabel1.setText("Click Below to Go Again");
                turn = 10;
            } else {
                jButton1.setText("Player X pick a spot");
                turn = 9;
            }
        } else if (turn == 9 ) {
        	
            x.setText("X");
            board[i][j] = 'X';
            //check winner
            if (ttt.isSolved(board)) {
                jButton1.setText("Winner is " + ttt.getWinner());
                jLabel1.setText("Click Below to Go Again");
                turn = 10;
            } else {
                jButton1.setText("DRAW!!!");
                jLabel1.setText("Click Below to Go Again");
                turn = 10;
            }
        }
    }

    /**
     * Creates new form ThreeDTicTacToe
     */
    public ThreeDTicTacToe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        title = new javax.swing.JLabel();
        ZeroZero = new javax.swing.JButton();
        ZeroOne = new javax.swing.JButton();
        ZeroTwo = new javax.swing.JButton();
        OneZero = new javax.swing.JButton();
        OneOne = new javax.swing.JButton();
        OneTwo = new javax.swing.JButton();
        TwoZero = new javax.swing.JButton();
        TwoOne = new javax.swing.JButton();
        TwoTwo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setText("Tic Tac Toe");
        title.setForeground(Color.WHITE);

        ZeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroZeroActionPerformed(evt);
            }
        });

        ZeroOne.setToolTipText("");
        ZeroOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroOneActionPerformed(evt);
            }
        });

        ZeroTwo.setToolTipText("");
        ZeroTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroTwoActionPerformed(evt);
            }
        });

        OneZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneZeroActionPerformed(evt);
            }
        });

        OneOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneOneActionPerformed(evt);
            }
        });

        OneTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneTwoActionPerformed(evt);
            }
        });

        TwoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoZeroActionPerformed(evt);
            }
        });

        TwoOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoOneActionPerformed(evt);
            }
        });

        TwoTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoTwoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Player X pick a Spot");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("GAME Instructions");
        jLabel1.setForeground(Color.white);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(234)
        					.addComponent(title, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(82)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(TwoZero, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
        										.addGap(69)
        										.addComponent(TwoOne, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
        									.addGroup(layout.createSequentialGroup()
        										.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        											.addComponent(OneZero, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        											.addComponent(ZeroZero, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
        										.addGap(70)
        										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        											.addComponent(ZeroOne, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        											.addComponent(OneOne, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        							.addGap(46)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(ZeroTwo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(TwoTwo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(OneTwo, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))))))
        			.addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(title, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        			.addGap(91)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(ZeroTwo, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        				.addComponent(ZeroZero, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        				.addComponent(ZeroOne, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
        			.addGap(78)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(OneZero, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        				.addComponent(OneOne, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(OneTwo, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
        			.addGap(97)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(TwoZero, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        				.addComponent(TwoOne, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        				.addComponent(TwoTwo, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
        			.addGap(60))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        
    
    private void ZeroZeroActionPerformed(java.awt.event.ActionEvent evt) {   
    	
        if(time == 0)
        {
         Action(ZeroZero,evt, 0, 0, board1);
         time=1;
         //pressRandomButton(1,evt);
        }
        else
        {
        	//pressRandomButton(1,evt);
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied 0 0");
        	else
        		pressRandomButton(0,0,evt);
        }

    }                                        

    private void ZeroOneActionPerformed(java.awt.event.ActionEvent evt) {  
    	//System.out.println("time1 " + time1);
		if (time1 == 0) {
			Action(ZeroOne, evt, 0, 1, board1);
			time1=1;
			//pressRandomButton(2,evt);
		}
		else
		{
			if(isOTurn == false)
				jLabel1.setText("Space occupied 0 1");
			else
        		pressRandomButton(0,1,evt);
			
		}
        

    }                                       

    private void ZeroTwoActionPerformed(java.awt.event.ActionEvent evt) {   
    	//System.out.println("time2 " + time2);
        if(time2 == 0)
        {
        	Action(ZeroTwo, evt,0, 2, board1);
        	time2=1;
        	
        }
        else
		{
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied 0 2");
        	else
        		pressRandomButton(0,2,evt);
		}

    }                                       

    private void OneZeroActionPerformed(java.awt.event.ActionEvent evt) {  
    	//System.out.println(" time 3 " + time3);
        if(time3 == 0)
        {
        	Action(OneZero, evt, 1, 0, board1);
        	time3=1;
        	//pressRandomButton(4,evt);
        }
        else
		{
        	//pressRandomButton(4,evt);
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied 1 0");
        	else
        		pressRandomButton(1,0,evt);
		}

    }                                       

    private void OneOneActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(time4 == 0)
        {
        	Action(OneOne, evt, 1, 1, board1);
        	time4=1;
        	//pressRandomButton(5,evt);
        }
        else
		{
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied 1 1");
        	else
        		pressRandomButton(1,1,evt);
		}

    }                                      

    private void OneTwoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(time5 == 0)
        {
         Action(OneTwo, evt, 1, 2, board1);
         time5=1;
         //pressRandomButton(6,evt);
        }
        else
        {
        	//pressRandomButton(6,evt);
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied  1 2");
        	else
        		pressRandomButton(1,2,evt);
        }
    }                                      

    private void TwoZeroActionPerformed(java.awt.event.ActionEvent evt) { 
    	//System.out.println("time 6 " + time6);
        if(time6 == 0)
        {
        	Action(TwoZero, evt, 2, 0, board1);
        	time6 = 1;
        	//pressRandomButton(7,evt);
        }
        else
        {
        	//pressRandomButton(7,evt);
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied 2 0");
        	else
        		pressRandomButton(2,0,evt);
        }

    }                                       

    private void TwoOneActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        if(time7 == 0)
        {
        	Action(TwoOne, evt, 2, 1, board1);
        	time7= 1;
        	//pressRandomButton(8,evt);
        }
        else
        {
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied 2 1");
        	else
        		pressRandomButton(2,1,evt);
        }

    }                                      

    private void TwoTwoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(time8 == 0)
        {
        	Action(TwoTwo, evt, 2, 2, board1);
        	time8= 1;
        	//pressRandomButton(9,evt);
        }
        else
        {
        	if(isOTurn == false)
        		jLabel1.setText("Space occupied 2 2");
        	else
        		pressRandomButton(2,2,evt);
        }

    }                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        /*
         * once clicked on turn 10, it will dispose of the current window 
         * and create a new one
         */
    	 if (turn == 10) {
    		 jLabel1.setText("Fart");
            dispose();
            String[] args = null;
            main(args);

        }
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThreeDTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreeDTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreeDTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreeDTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreeDTicTacToe().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel title;
    private javax.swing.JButton OneOne;
    private javax.swing.JButton OneTwo;
    private javax.swing.JButton OneZero;
    private javax.swing.JButton TwoOne;
    private javax.swing.JButton TwoTwo;
    private javax.swing.JButton TwoZero;
    private javax.swing.JButton ZeroOne;
    private javax.swing.JButton ZeroTwo;
    private javax.swing.JButton ZeroZero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}

