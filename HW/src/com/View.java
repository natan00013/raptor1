package com;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class View implements IView {
	
	public View() {
	
		this.windows();
		draw();
		panel.add(tf);
		this.windows().getContentPane().add(panel);
	
	}   
	 
	@Override
	public JFrame windows() {
		
		Dimension d = new Dimension(WIDTH,  HEIGHT); frame.setPreferredSize(d);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.pack();
		frame.setVisible(true);
		return frame;
	
	}

	@Override
	public JTextField tf() {
		tf.setText("default");
		Dimension d = new Dimension(TF_WIDTH, TF_HEIGHT);
		tf.setPreferredSize(d); 
		return tf;
	}

	@Override
	public void draw() {
		tf();
		
	}
	
}
