package org.system;

public class Desktop extends Computer {
 
	public void desktopSize()
	{
		System.out.println("Size is 20inches");
	}
	public static void main(String[] args) {
		
		Desktop dk=new Desktop();
		dk.desktopSize();
		dk.computerModel();
		
	}
}
