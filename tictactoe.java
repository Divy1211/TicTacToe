package GUI.TicTacToe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tictactoe {
	JButton b[] = new JButton[9];
	static int a;
	public static void main(String[] ar) {
		new tictactoe();
	}
	public tictactoe() {
		a = 0;
		JFrame f = new JFrame("Tic Tac Toe");
		f.setSize(645, 680);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		JPanel p = new JPanel();
		p.setLayout(null);
		int c = 0;
		int x = 10, y = 10;
		Actionlistener al = new Actionlistener();
		while(c < 9) {
			b[c] = new JButton("");
			b[c].setFont(new Font("AR BLANCA", Font.PLAIN, 150));
			b[c].setBackground(Color.WHITE);
			b[c].setBounds(x, y,200,200);
			x+=210;
			if(x > 430) {
				x = 10;
				y+=210;
			}
			b[c].addActionListener(al);
			p.add(b[c++]);
		}
		f.add(p);
		f.setVisible(true);
	}
	private class Actionlistener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int dec = 0;
			while(dec < 9) {
				if(e.getSource() == b[dec]) {
					int d = 0;
					if(a%2 == 0 && b[dec].getText().equals("")) {
						b[dec].setText("X");
						a++;
					}
					else if(b[dec].getText().equals("")) {
						b[dec].setText("O");
						a++;
					}
					if(b[0].getText().equals(b[1].getText()) && b[1].getText().equals(b[2].getText()) && !(b[0].getText().equals(""))) {
						b[0].setBackground(Color.green);
						b[1].setBackground(Color.green);
						b[2].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[0].getText()+" Wins");
						b[0].setBackground(Color.WHITE);
						b[1].setBackground(Color.WHITE);
						b[2].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(b[3].getText().equals(b[4].getText()) && b[4].getText().equals(b[5].getText()) && !(b[3].getText().equals(""))) {
						b[3].setBackground(Color.green);
						b[4].setBackground(Color.green);
						b[5].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[3].getText()+" Wins");
						b[3].setBackground(Color.WHITE);
						b[4].setBackground(Color.WHITE);
						b[5].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(b[6].getText().equals(b[7].getText()) && b[7].getText().equals(b[8].getText()) && !(b[6].getText().equals(""))) {
						b[6].setBackground(Color.green);
						b[7].setBackground(Color.green);
						b[8].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[6].getText()+" Wins");
						b[6].setBackground(Color.WHITE);
						b[7].setBackground(Color.WHITE);
						b[8].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(b[0].getText().equals(b[3].getText()) && b[3].getText().equals(b[6].getText()) && !(b[0].getText().equals(""))) {
						b[0].setBackground(Color.green);
						b[3].setBackground(Color.green);
						b[6].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[0].getText()+" Wins");
						b[0].setBackground(Color.WHITE);
						b[3].setBackground(Color.WHITE);
						b[6].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(b[1].getText().equals(b[4].getText()) && b[4].getText().equals(b[7].getText()) && !(b[1].getText().equals(""))) {
						b[1].setBackground(Color.green);
						b[4].setBackground(Color.green);
						b[7].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[1].getText()+" Wins");
						b[1].setBackground(Color.WHITE);
						b[4].setBackground(Color.WHITE);
						b[7].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(b[2].getText().equals(b[5].getText()) && b[5].getText().equals(b[8].getText()) && !(b[2].getText().equals(""))) {
						b[2].setBackground(Color.green);
						b[5].setBackground(Color.green);
						b[8].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[2].getText()+" Wins");
						b[2].setBackground(Color.WHITE);
						b[5].setBackground(Color.WHITE);
						b[8].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(b[0].getText().equals(b[4].getText()) && b[4].getText().equals(b[8].getText()) && !(b[0].getText().equals(""))) {
						b[0].setBackground(Color.green);
						b[4].setBackground(Color.green);
						b[8].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[0].getText()+" Wins");
						b[0].setBackground(Color.WHITE);
						b[4].setBackground(Color.WHITE);
						b[8].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(b[2].getText().equals(b[4].getText()) && b[4].getText().equals(b[6].getText()) && !(b[2].getText().equals(""))) {
						b[2].setBackground(Color.green);
						b[4].setBackground(Color.green);
						b[6].setBackground(Color.green);
						JOptionPane.showMessageDialog(null, b[2].getText()+" Wins");
						b[2].setBackground(Color.WHITE);
						b[4].setBackground(Color.WHITE);
						b[6].setBackground(Color.WHITE);
						a = 0;
						while(d < 9)
							b[d++].setText("");
					}
					else if(a > 8) {
						while(d < 9)
							b[d++].setBackground(Color.red);
						d = 0;
						JOptionPane.showMessageDialog(null, "Tie");
						a = 0;
						while(d < 9) {
							b[d].setText("");
							b[d++].setBackground(Color.WHITE);
						}
					}
				}
				dec++;
			}
		}
	}
}