package jFrame_Project;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class meuFrame extends JFrame implements ActionListener {
	public meuFrame() {
		
		super ("Meu frame");
		
		JButton botao = new JButton("Clique");
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new meuFrame();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Você clicou!");
	}
}
