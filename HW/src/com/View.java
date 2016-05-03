package com;

import java.awt.Dimension;

import javax.swing.JFrame;

public class View implements IView {

	JFrame frame;
	
	public View() {
	
		this.windows();
		
	}   
	 
	@Override
	public JFrame windows() {
		frame = new JFrame("Dijkstra's Algorithm");
		Dimension d = new Dimension(100,  100);
		frame.setPreferredSize(d);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.pack();
		frame.setVisible(true);
		return frame; 
	}
	
	 
	 

}
