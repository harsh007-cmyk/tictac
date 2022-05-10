import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tictac {

	private JFrame frmTicTacToe;
	int clicked=0;
	boolean btn00flag=true;
	boolean btn01flag=true;
	boolean btn02flag=true;
	boolean btn10flag=true;
	boolean btn11flag=true;
	boolean btn12flag=true;
	boolean btn20flag=true;
	boolean btn21flag=true;
	boolean btn22flag=true;
	
	
	JButton bt00 = new JButton("");
	JButton bt01 = new JButton("");
	 JButton bt02 = new JButton("");
	JButton bt10 = new JButton("");
	JButton bt11 = new JButton("");
	JButton bt12 = new JButton("");
	JButton bt20 = new JButton("");
	JButton bt21 = new JButton("");
	JButton bt22 = new JButton("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictac window = new tictac();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tictac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic tac toe");
		frmTicTacToe.setBounds(500, 100, 499, 500);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(null);
		
		
	
		
		bt00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn00flag) {
				if(clicked%2==0) {
					bt00.setLabel("O");
					bt00.setEnabled(false);
				}else {
					bt00.setLabel("X");
					bt00.setEnabled(false);
				}
				btn00flag=false;
				checkWinner();
				}
				
				
			}
		});
		
		
		bt00.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt00.setBounds(10, 0, 160, 160);
		frmTicTacToe.getContentPane().add(bt00);
		
		bt01.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn01flag) {
					if(clicked%2==0) {
						bt01.setLabel("O");
						bt01.setEnabled(false);
					}else {
						bt01.setLabel("X");
						bt01.setEnabled(false);
					}
					btn01flag=false;
					checkWinner();
				}
					
			}
		});
		bt01.setBounds(160, 0, 160, 160);
		frmTicTacToe.getContentPane().add(bt01);
	
		 bt02.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		
		 		clicked++;
				if(btn02flag) {
					if(clicked%2==0) {
						bt02.setLabel("O");
						bt02.setEnabled(false);
					}else {
						bt02.setLabel("X");
						bt02.setEnabled(false);
					}
					btn02flag=false;
					checkWinner();
				}
				
		 		
		 		
		 	}
		 });
		 bt02.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt02.setBounds(320, 0, 160, 160);
		frmTicTacToe.getContentPane().add(bt02);
	
		bt10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn10flag) {
					if(clicked%2==0) {
						bt10.setLabel("O");
						bt10.setEnabled(false);
					}else {
						bt10.setLabel("X");
						bt10.setEnabled(false);
					}
					btn10flag=false;
					checkWinner();
				}
				
			}
		});
		bt10.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt10.setBounds(10, 160, 160, 160);
		frmTicTacToe.getContentPane().add(bt10);
		
		bt11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn11flag) {
					if(clicked%2==0) {
						bt11.setLabel("O");
						bt11.setEnabled(false);
					}else {
						bt11.setLabel("X");
						bt11.setEnabled(false);
					}
					
					btn11flag=false;
					checkWinner();
				}
				
			}
		});
		bt11.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt11.setBounds(160, 160, 160, 160);
		frmTicTacToe.getContentPane().add(bt11);
		
		bt12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn12flag) {
					if(clicked%2==0) {
						bt12.setLabel("O");
						bt12.setEnabled(false);
					}else {
						bt12.setLabel("X");
						bt12.setEnabled(false);
					}
					
				    btn12flag=false;
					checkWinner();
				}
				
			}
		});
		bt12.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt12.setBounds(320, 160, 160, 160);
		frmTicTacToe.getContentPane().add(bt12);
		
		bt20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn20flag) {
					if(clicked%2==0) {
						bt20.setLabel("O");
						bt20.setEnabled(false);
					}else {
						
						bt20.setLabel("X");
						bt20.setEnabled(false);
					}
					
					btn20flag=false;
					checkWinner();
				}
				
			
			
			
			}
		});
		bt20.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt20.setBounds(10, 320,  160, 160);
		frmTicTacToe.getContentPane().add(bt20);
		
		bt21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn21flag) {
					if(clicked%2==0) {
						bt21.setLabel("O");
						bt21.setEnabled(false);
					}else {
						bt21.setLabel("X");
						bt21.setEnabled(false);
					}
					
					btn21flag=false;
					checkWinner();
				}
				
			}
		});
		bt21.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt21.setBounds(160, 320, 160, 160);
		frmTicTacToe.getContentPane().add(bt21);
		
		bt22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn22flag) {
					if(clicked%2==0) {
						bt22.setLabel("O");
						bt22.setEnabled(false);
					}else {
						bt22.setLabel("X");
						bt22.setEnabled(false);
					}
					
					btn22flag=false;
					checkWinner();
				}
				
			}
		});
		bt22.setFont(new Font("Tahoma", Font.PLAIN, 99));
		bt22.setBounds(320, 320, 160, 160);
		frmTicTacToe.getContentPane().add(bt22);
	}
	void checkWinner() {
		if((btn00flag==false)&&(bt00.getText().equals(bt01.getText()))&&(bt01.getText().equals(bt02.getText()))) {
			String winner=bt00.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn10flag==false&&(bt10.getText().equals(bt11.getText()))&&bt11.getText().equals(bt12.getText())) {
			String winner=bt10.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn20flag==false&&(bt20.getText().equals(bt21.getText()))&&bt21.getText().equals(bt22.getText())) {
			String winner=bt20.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn00flag==false&&(bt00.getText().equals(bt10.getText()))&&bt10.getText().equals(bt20.getText())) {
			String winner=bt10.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn01flag==false&&(bt01.getText().equals(bt11.getText()))&&bt11.getText().equals(bt21.getText())) {
			String winner=bt11.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn02flag==false&&(bt02.getText().equals(bt12.getText()))&&bt12.getText().equals(bt22.getText())) {
			String winner=bt12.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn00flag==false&&bt00.getText().equals(bt11.getText())&&bt11.getText().equals(bt22.getText())) {
			String winner=bt00.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn02flag==false&&(bt02.getText().equals(bt11.getText()))&&bt11.getText().equals(bt20.getText())) {
			String winner=bt11.getText();
			JOptionPane.showMessageDialog(null, winner+" is winner ");
		}else if(btn00flag==false&&btn01flag==false&&btn02flag==false&&btn10flag==false&&btn11flag==false&&btn12flag==false&&btn20flag==false&&btn21flag==false&&btn22flag==false) {
			String val="DRAW";
			JOptionPane.showConfirmDialog(null, val);
		}
	}

}
