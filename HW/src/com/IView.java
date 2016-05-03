package com;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public interface IView {
	
	final static int WIDTH = 500;
	final static int HEIGHT = 100;
	
	final static int TF_WIDTH = 100;
	final static int TF_HEIGHT = 20;
	
	static JFrame frame = new JFrame("Dijkstra's Algorithm");
	static JPanel panel = new JPanel();
	static JTextField tf = new JTextField();
	
	public JFrame windows();
	public JTextField tf();
	
	public void draw();
	
	
}
