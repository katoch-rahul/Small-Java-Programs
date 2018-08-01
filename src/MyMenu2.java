//Menu Using Swing

import java.awt.*;
import javax.swing.*;

public class MyMenu2
{
	
	JFrame frame1;
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2;
	JPasswordField ps1;
	JRadioButton r1,r2;
	JCheckBox c3,c4,c5,c6;
	JComboBox ch1;
	JList li1;
	JButton b1,b2;
	JMenuBar mb;
	JMenu fl,ed,fnt,stl,clr;
	JMenuItem fo1,fo2,fo3,fo4,s1,s2,s3,s4,clr1,clr2,clr3,clr4,fl1,fl2,fl3;

	public MyMenu2()
	{
	frame1=new JFrame("MenuTrial");

	p1=new JPanel();
		l1=new JLabel("Name");
		t1=new JTextField(10);
		l2=new JLabel("Age");
		t2=new JTextField(10);
		l3=new JLabel("Password");
		ps1=new JPasswordField(10);

		r1=new JRadioButton("Male",true);
		r2=new JRadioButton("Female",false);
		
		c3=new JCheckBox("Graduate");
		c4=new JCheckBox("Post Graduate");
		c5=new JCheckBox("PHD");
		c6=new JCheckBox("Uneducated");

		String cource[]={"c++","Java","PHP"};
		ch1=new JComboBox(cource);

		String timing[]={"10-11","12-14","17-19"};
		li1=new JList(timing);
		

		b1=new JButton("Submit");
		b2=new JButton("Back");
		
		GridBagLayout gbl=new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		frame1.getContentPane().add(p1); 
		p1.setLayout(gbl);

		gbc.gridx=1;
		gbc.gridy=1;
		p1.add(l1,gbc);

		gbc.gridx=5;
		gbc.gridy=1;
		p1.add(t1,gbc); 

		gbc.gridx=1;
		gbc.gridy=2;
		p1.add(l2,gbc); 

gbc.gridx=5;
gbc.gridy=2;
p1.add(t2,gbc);

gbc.gridx=1;
gbc.gridy=3;
p1.add(l3,gbc); 

gbc.gridx=5;
gbc.gridy=3;
p1.add(ps1,gbc); 

gbc.gridx=2;
gbc.gridy=4;
p1.add(r1,gbc);
gbc.gridx=4;
gbc.gridy=4;
 p1.add(r2,gbc);

gbc.gridx=1;
gbc.gridy=9;
p1.add(c3,gbc);
gbc.gridx=3;
gbc.gridy=9;
 p1.add(c4,gbc);
gbc.gridx=5;
gbc.gridy=9;
 p1.add(c5,gbc); 
gbc.gridx=7;
gbc.gridy=9;
p1.add(c6,gbc);

gbc.gridx=4;
gbc.gridy=11;
p1.add(ch1,gbc); 

gbc.gridx=4;
gbc.gridy=14;
p1.add(li1,gbc);

 gbc.gridx=3;
gbc.gridy=20;
 p1.add(b1,gbc); 
gbc.gridx=6;
gbc.gridy=40;
p1.add(b2,gbc);	

	mb=new JMenuBar();
	
	fl=new JMenu("File");
	ed=new JMenu("Edit");
	fnt=new JMenu("Font Size");
	stl=new JMenu("Font Style");
	clr=new JMenu("Font Color");

	fo1=new JMenuItem("10");
	fo2=new JMenuItem("12");
	fo3=new JMenuItem("14");
	fo4=new JMenuItem("16");

	s1=new JMenuItem("Arial");
	s2=new JMenuItem("Times New Roman");
	s3=new JMenuItem("Calligraphy");
	s4=new JMenuItem("Verdana");

	clr1=new JMenuItem("Red");
	clr2=new JMenuItem("Blue");
	clr3=new JMenuItem("Green");
	clr4=new JMenuItem("Black");

	fl1=new JMenuItem("Open");
	fl2=new JMenuItem("Save");
	fl3=new JMenuItem("Close");

	frame1.setJMenuBar(mb);
	frame1.setVisible(true);
	frame1.setSize(800,800);
	mb.add(fl);
	mb.add(ed);

	fl.add(fl1);
	fl.add(fl2);
	fl.addSeparator();
	fl.add(fl3);
	
	ed.add(fnt);
		fnt.add(fo1);
		fnt.add(fo2);
		fnt.add(fo3);
		fnt.add(fo4);
	ed.add(stl);
		stl.add(s1);
		stl.add(s2);
		stl.add(s3);
		stl.add(s4);
	ed.add(clr);
		clr.add(clr1);
		clr.add(clr2);
		clr.add(clr3);
		clr.add(clr4);
	}	
	

	public static void main(String args[])
	{
		MyMenu2 obj=new MyMenu2();
	}

}