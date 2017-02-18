package com.headfirst.javaobserver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample
{

	JFrame frame;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SwingObserverExample soe=new SwingObserverExample();
		soe.go();
	}
	public void go()
	{
		frame=new JFrame();
		JButton button=new JButton("应不应做？");	
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER,button);
		System.out.println(button);
	}
	class AngelListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			System.out.println("Of course you shouldn't do it ,if do ,you will regret ！");
		}
		
	}
	class DevilListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			System.out.println("Come on ,do it 快活啊 ，反正啊！");
		}
		
	}
}
