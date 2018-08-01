import java.awt.*;
import javax.swing.*;

class Tabing 
{
public Tabing()
	{
	JFrame f1=new JFrame("Use Of Tabs");
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JMenuBar mb1=new JMenuBar();
	
	JMenu m11=new JMenu("File");
	JMenu  m12=new JMenu("Edit");
	JMenuItem m111=new JMenuItem("Open");
	
	JLabel l11=new JLabel("Name");
	JLabel l12=new JLabel("Class");
	JLabel l13=new JLabel("Roll No");
	
	JLabel l21=new JLabel("Accout No.");
	JLabel l22=new JLabel("IFSC");
	JLabel l23=new JLabel("Amount");

	JTextField t11=new JTextField(10);
	JTextField t12=new JTextField(10);
	JTextField t13=new JTextField(10);

	JTextField t21=new JTextField(10);
	JTextField t22=new JTextField(10);
	JTextField t23=new JTextField(10);

	JButton b11=new JButton("Submit");
	JButton b12=new JButton("Close");

	JButton b21=new JButton("Send Money") ;
	JButton b22=new JButton ("Back");

	JTabbedPane tp=new JTabbedPane();
	
	f1.getContentPane().add(tp);
	
	f1.setJMenuBar(mb1);
	mb1.add(m11);
	mb1.add(m12);
	m11.add(m111);

	tp.addTab("Student",null,p1,"Student Details Section");
	tp.addTab("Account",null,p2,"Account Details Section");
	
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();

		
	p1.setLayout(gbl);
gbc.gridx=1;
gbc.gridy=1;
	p1.add(l11,gbc);
gbc.gridx=5;
	p1.add(t11,gbc);
gbc.gridx=1;
gbc.gridy=2;
	p1.add(l12,gbc);
gbc.gridx=5;
	p1.add(t12,gbc);
gbc.gridx=1;
gbc.gridy=3;
	p1.add(l13,gbc);
gbc.gridx=5;
	p1.add(t13,gbc);
gbc.gridx=2;
gbc.gridy=4;
	p1.add(b11,gbc);
gbc.gridx=4;
	p1.add(b12,gbc);

	p2.setLayout(gbl);
gbc.gridx=1;
gbc.gridy=1;
	p2.add(l21,gbc);
gbc.gridx=5;
	p2.add(t21,gbc);
gbc.gridx=1;
gbc.gridy=2;
	p2.add(l22,gbc);
gbc.gridx=5;
	p2.add(t22,gbc);
gbc.gridx=1;
gbc.gridy=3;
	p2.add(l23,gbc);
gbc.gridx=5;
	p2.add(t23,gbc);
gbc.gridx=2;
gbc.gridy=4;
	p2.add(b21,gbc);
gbc.gridx=4;
	p2.add(b22,gbc);

f1.setSize(1000,1000);
f1.setVisible(true);
	}

	public static void main(String args[])
	{
	Tabing obj=new Tabing();
	}

}