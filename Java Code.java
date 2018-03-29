import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class guidemo extends  java.applet.Applet
{			//Home Page
	MyEvent m;
	JFrame jf;
	JLabel j;
	JButton b1,b2,b3,b12;
			//Search Page
	JTextField jt1;
	JButton b4,b13;
			//Login Page
	JTextField jt2;
	JPasswordField jpf1;
	JButton b5,b6;
	JLabel jl1,jl2;
						//Register Page
	JLabel jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl12,jl13,jl14,jl15,jl28;
	JTextField jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12,jt13;
	JPasswordField jpf2;
	JButton b7,b8;
	ButtonGroup bg,bg1;
	JRadioButton jrb1,jrb2;
	JComboBox jcb;
							//Edit Page
	JLabel jl44,jl45,jl46,jl47,jl48,jl49,jl50,jl51,jl52,jl53,jl54;
	JTextField jt16,jt17,jt18,jt19,jt20,jt21,jt22,jt23,jt24,jt25,jt26;
	JButton b18,b19;
	JRadioButton jrb3,jrb4;
	JComboBox jcb1;

				//About Page
	JLabel jl11,jl55,jl56,jl57,jl58,jl59,jl60;

							//Search Result
	JLabel jl16,jl17,jl18,jl19,jl20,jl21,jl22,jl23,jl24,jl25,jl26,jl27,jl29;			

						//Login Result
	JButton b9,b10,b11,b14; String pass3,passw,rega;
	JLabel jl30,jl31,jl32,jl33,jl34,jl35,jl36,jl37,jl38,jl39,jl40;
	String name2,dad2,mom2,reg2,cgpa2,mob2,email2,course2,gender2,dob2,job2;
	String name3,dad3,mom3,reg3,mob3,email3,course3,gender3,gender,dob3,job3;
	String reg1,name1,mom1,dad1,course1,job1;

									//Password Page
	JButton b20,b21;  JTextField jt15; JPasswordField jpf3,jpf4; JLabel jl41,jl42,jl43;

								//Frames
	JFrame jf1=new JFrame("Alumni Database Management System");
	JFrame jf2=new JFrame("Alumni Database Management System");
	JFrame jf3=new JFrame("Alumni Database Management System");
	JFrame jf4=new JFrame("Alumni Database Management System");
	JFrame jf5=new JFrame("Alumni Database Management System");
	JFrame jf6=new JFrame("Alumni Database Management System");
	JFrame jf7=new JFrame("Alumni Database Management System");
	JFrame jf8=new JFrame("Alumni Database Management System");
guidemo()
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	jf=new JFrame("Alumni Database Management System");
	j=new JLabel(ii);
	jf.setLayout(new BorderLayout());
	jf.setSize(1366,768);
	jf.setIconImage(i.getImage());
	b1=new JButton("Home");
	b2=new JButton("Alumni Search");
	b3=new JButton("Alumni Login");
	b12=new JButton("About");
	jl59=new JLabel("Developed by Saurabh Yadav");
	jl59.setFont(new Font("Arial", Font.BOLD,20));
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	jl59.setBounds(1060,10,300,50);
	jf.add(b1);
	jf.add(b2);
	jf.add(b3);
	jf.add(b12);
	jf.add(jl59);
	jf.add(j);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b2.addActionListener(m);
	b3.addActionListener(m);
	b12.addActionListener(m);
	jf.setVisible(true);
}
public static void main(String[]arg)
{
	new guidemo();
}
class MyEvent implements ActionListener
{	
	public void actionPerformed(ActionEvent e) 
{
if(e.getSource()==b1|e.getSource()==b13)		//Home Button
{
	home();
}
if(e.getSource()==b11)		//Log Out Button
{
	JOptionPane.showMessageDialog(jf6,"Logged Out Successfully");
	home();
}          
if(e.getSource()==b21)		//Log Out Button
{
	JOptionPane.showMessageDialog(jf6,"Password Update Cancelled");
	home();
}
if(e.getSource()==b19)		//Log Out Button
{
	JOptionPane.showMessageDialog(jf6,"Update Profile Cancelled");
	home();
}          
          
if(e.getSource()==b2)		//Alumni_Search Button
{
	alusearchb();	
}
if(e.getSource()==b3)		//Alumni_Login Button
{
	aluloginb();
}
if(e.getSource()==b4)		//Search Button
{	
	searchb();
}
if(e.getSource()==b5)		//Login Button
{
	loginb();
}
if(e.getSource()==b6)		//Register Button
{
	registerb();
}
if(e.getSource()==b8)		//Cancel Button
{
	JOptionPane.showMessageDialog(jf6,"Registration Cancelled");
	home();
}
if(e.getSource()==b12)		//About Button
{
	aboutb();
}
if(e.getSource()==b7)		//Submit Button
{
	submitb();
}
if(e.getSource()==b10)		//Change Password Button
{
	pswrd();
}
if(e.getSource()==b20)		//Change Password Button
{
	sbmtpswrd();
}
if(e.getSource()==b9)		//Change Password Button
{
	editb();
}
if(e.getSource()==b14)		//Delete Button
{
	deleteb();
}
if(e.getSource()==b18)		//Update Button
{
	editpw();
}
}
}

void alusearchb()
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf1.setLayout(new BorderLayout());
	jf1.setSize(1366,768);
	jf1.setIconImage(i.getImage());
	jt1=new JTextField();
	b1=new JButton("Home");
	b2=new JButton("Alumni Search");
	b3=new JButton("Alumni Login");
	b4=new JButton("Search");
	b12=new JButton("About");
	jt1.setBounds(100,440,316,30);
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	b4.setBounds(419,440,80,30);
	jf1.add(b1);
	jf1.add(b2);
	jf1.add(b3);
	jf1.add(b4);
	jf1.add(b12);
	jf1.add(jt1);
	jf1.add(j);
	jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b1.addActionListener(m);
	b3.addActionListener(m);
	b4.addActionListener(m);
	b12.addActionListener(m);
	jf.setVisible(false);
	jf2.setVisible(false);
	jf3.setVisible(false);
	jf4.setVisible(false);
	jf5.setVisible(false);
	jf6.setVisible(false);
	jf7.setVisible(false);
	jf8.setVisible(false);
	jf1.setVisible(true);
}

void aluloginb()
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf2.setLayout(new BorderLayout());
	jf2.setSize(1366,768);
	jf2.setIconImage(i.getImage());
	jt2=new JTextField();
	jpf1=new JPasswordField("");
	jl1=new JLabel("Username:");
	jl2=new JLabel("Password:");
	b5=new JButton("Login");
	b6=new JButton("Register");
	b1=new JButton("Home");
	b2=new JButton("Alumni Search");
	b3=new JButton("Alumni Login");
	b12=new JButton("About");
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	b5.setBounds(220,450,70,30);
	b6.setBounds(295,450,90,30);
	jl1.setBounds(174,360,70,30);
	jt2.setBounds(249,360,200,30);
	jl2.setBounds(174,400,70,30);
	jpf1.setBounds(249,400,200,30);
	jf2.add(b1);
	jf2.add(b2);
	jf2.add(b3);
	jf2.add(b12);
	jf2.add(jl1); 
	jf2.add(jt2);
	jf2.add(jl2); 
	jf2.add(jpf1);
	jf2.add(b5);
	jf2.add(b6);
	jf2.add(j);
	jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b1.addActionListener(m);
	b2.addActionListener(m);
	b5.addActionListener(m);
	b6.addActionListener(m);
	b12.addActionListener(m);
	jf.setVisible(false);
	jf1.setVisible(false);
	jf3.setVisible(false);
	jf4.setVisible(false);
	jf5.setVisible(false);
	jf6.setVisible(false);
	jf7.setVisible(false);
	jf8.setVisible(false);
	jf2.setVisible(true);
}

void registerb()
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf3.setLayout(new BorderLayout());
	jf3.setSize(1366,768);
	jf3.setIconImage(i.getImage());



					//TextField, Password
	jt3=new JTextField();
	jt4=new JTextField();
	jt5=new JTextField();
	jt6=new JTextField();
	jt7=new JTextField();
	jt8=new JTextField();
	jt9=new JTextField();
	jt10=new JTextField("DD");
	jt11=new JTextField();
	jt12=new JTextField("MM");
	jt13=new JTextField("YYYY");
	jpf2=new JPasswordField();
	String[] s={"B.Tech(CSE)","B.Tech(ECE)","B.Tech(EEE)","B.Tech(CE)","B.Tech(ME)","B.Tech(AE)","B.Tech(IT)"};
	jcb=new JComboBox(s);
	
					//Labels
	jl3=new JLabel("Name:");
	jl4=new JLabel("Father's Name:");
	jl5=new JLabel("Mother's Name:");
	jl6=new JLabel("Registration No:");
	jl7=new JLabel("Email ID:");
	jl8=new JLabel("Password:");
	jl9=new JLabel("Course:");
	jl10=new JLabel("Gender:");
	jl12=new JLabel("CGPA:");
	jl13=new JLabel("Mobile No:");
	jl14=new JLabel("Date of Birth:");
	jl15=new JLabel("Job Company:");
	jl28=new JLabel("All Field are necessary");
	jl28.setForeground(Color.RED);
	
					//Buttons
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	b7=new JButton("Submit");
	b8=new JButton("Cancel");
	jrb1=new JRadioButton("Male");
	jrb2=new JRadioButton("Female");
	bg=new ButtonGroup();
	bg.add(jrb1); bg.add(jrb2);


					//Bounds
	jl3.setBounds(670,115,70,30);
	jl4.setBounds(670,150,200,30);
	jl5.setBounds(670,185,200,30);
	jl6.setBounds(670,220,220,30);
	jl12.setBounds(670,255,100,30);
	jl13.setBounds(670,290,110,30);
	jl7.setBounds(670,325,90,30);
	jl8.setBounds(670,360,90,30);
	jl9.setBounds(670,395,90,30);
	jl10.setBounds(670,430,90,30);
	jl14.setBounds(670,465,130,30);
	jl15.setBounds(670,500,100,30);
	jl28.setBounds(700,75,300,30);
	jl28.setFont(new Font("Arial", Font.BOLD, 20));
	b7.setBounds(800,535,100,30);
	b8.setBounds(905,535,100,30);
	jt3.setBounds(760,115,316,30);
	jt4.setBounds(760,150,316,30);
	jt5.setBounds(760,185,316,30);
	jt6.setBounds(760,220,316,30);
	jt7.setBounds(760,255,316,30);
	jt8.setBounds(760,290,316,30);
	jt9.setBounds(760,325,316,30);
	jt10.setBounds(760,465,50,30);
	jt12.setBounds(820,465,50,30);
	jt13.setBounds(880,465,100,30);
	jt11.setBounds(760,500,316,30);
	jpf2.setBounds(760,360,316,30);
	jrb1.setBounds(760,430,80,30);
	jrb2.setBounds(845,430,80,30);
	jcb.setBounds(760,395,100,30);
	
			//Adding
	jf3.add(jl28);
	jf3.add(b1);
	jf3.add(b2);
	jf3.add(b3);
	jf3.add(b12);
	jf3.add(b7);
	jf3.add(b8);
	jf3.add(jl3);
	jf3.add(jl4);
	jf3.add(jl5);
	jf3.add(jl6);
	jf3.add(jl7);
	jf3.add(jl8);
	jf3.add(jl9);
	jf3.add(jl15);
	jf3.add(jl10);
	jf3.add(jl12);
	jf3.add(jl13);
	jf3.add(jl14);
	jf3.add(jt3);
	jf3.add(jt4);
	jf3.add(jt5);
	jf3.add(jt6);
	jf3.add(jt7);
	jf3.add(jt8);
	jf3.add(jt10);
	jf3.add(jt12);
	jf3.add(jt13);
	jf3.add(jt11);
	jf3.add(jt9);
	jf3.add(jpf2);
	jf3.add(jrb1);
	jf3.add(jrb2);
	jf3.add(jcb);
	jf3.add(j);

	

	jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b1.addActionListener(m);
	b2.addActionListener(m);
	b3.addActionListener(m);
	b7.addActionListener(m);
	b8.addActionListener(m);
	b12.addActionListener(m);
	jf2.setVisible(false);
	jf3.setVisible(true);
}
	void aboutb()
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf4.setLayout(new BorderLayout());
	jf4.setSize(1366,768);
	jf4.setIconImage(i.getImage());
	jl11=new JLabel("This app is  designed for the management of the details");
	jl55=new JLabel("of Alumni, Alumnus are availd with authorizations to ");
	jl56=new JLabel("create and manage their accounts. They can Register");
	jl57=new JLabel("their account and update their informations. They can");
	jl58=new JLabel("also change there password and delete their.");
	jl58.putClientProperty("html",null);	
	b1=new JButton("Home");
	b2=new JButton("Alumni Search");
	b3=new JButton("Alumni Login");
	b12=new JButton("About");
	jl11.setFont(new Font("Times New Roman", Font.BOLD, 15));
	jl55.setFont(new Font("Times New Roman", Font.BOLD, 15));
	jl56.setFont(new Font("Times New Roman", Font.BOLD, 15));
	jl57.setFont(new Font("Times New Roman", Font.BOLD, 15));
	jl58.setFont(new Font("Times New Roman", Font.BOLD, 15));
	
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	jl58.setBounds(120,460,400,30);
	jl57.setBounds(120,420,400,30);
	jl56.setBounds(120,380,400,30);
	jl55.setBounds(120,340,400,30);
	jl11.setBounds(120,300,400,30);
	
	jf4.add(b1);
	jf4.add(b2);
	jf4.add(b3);
	jf4.add(b12);
	jf4.add(jl11);
	jf4.add(jl55);
	jf4.add(jl56);
	jf4.add(jl57);
	jf4.add(jl58);
	jf4.add(j);
	jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	m=new MyEvent();
	b1.addActionListener(m);
	b2.addActionListener(m);
	b3.addActionListener(m);
	jf.setVisible(false);
	jf1.setVisible(false);
	jf2.setVisible(false);
	jf3.setVisible(false);
	jf5.setVisible(false);
	jf6.setVisible(false);
	jf7.setVisible(false);
	jf8.setVisible(false);
	jf4.setVisible(true);
}
void loginb()			//Login Button
{
	Connection c2;
	Statement s2;
	ResultSet r2;
try
{	
	Class.forName("com.mysql.jdbc.Driver");
	c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/adm" , "root", "1234");
	s2=c2.createStatement();
	String regd=jt2.getText();
	passw=jpf1.getText();
	String str3="select *from password where reg="+Integer.parseInt(regd)+"";
	String str4="select *from loginview where reg="+Integer.parseInt(regd)+"";
	r2=s2.executeQuery(str3);
while(r2.next())
{
	rega=r2.getString("reg");
	pass3=r2.getString("password");
}
	r2=s2.executeQuery(str4);
	while(r2.next())
{
	reg2=r2.getString("reg");
	name2=r2.getString("name");
	mom2=r2.getString("mom");
	dad2=r2.getString("dad");
	course2=r2.getString("course");
	job2=r2.getString("job_cmpny");
	gender2=r2.getString("gender");
	cgpa2=r2.getString("cgpa");
	email2=r2.getString("email");
	mob2=r2.getString("mob");
	dob2=r2.getString("dob");
}	
if(passw.equals(pass3))
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf6.setLayout(new BorderLayout());
	jf6.setSize(1366,768);
	jf6.setIconImage(i.getImage());
	b1=new JButton("Home");
	b2=new JButton("Alumni Search");
	b3=new JButton("Alumni Login");
	b12=new JButton("About");
	b9=new JButton("Edit Info");
	b10=new JButton("Change Password");
	b11=new JButton("Log Out");
	b14=new JButton("Delete Account");
					//Labels
	jl3=new JLabel("Name:");
	jl4=new JLabel("Father's Name:");
	jl5=new JLabel("Mother's Name:");
	jl6=new JLabel("Registration No:");
	jl7=new JLabel("Email ID:");
	jl8=new JLabel("Course:");
	jl9=new JLabel("Date of Birth:");
	jl10=new JLabel("Gender:");
	jl12=new JLabel("CGPA:");
	jl13=new JLabel("Mobile No:");
	jl14=new JLabel("Company Name:");
	jl30=new JLabel(name2);
	jl31=new JLabel(dad2);
	jl32=new JLabel(mom2);
	jl33=new JLabel(reg2);
	jl34=new JLabel("0"+cgpa2);
	jl35=new JLabel(mob2);
	jl36=new JLabel(email2);
	jl37=new JLabel(course2);
	jl38=new JLabel(dob2);
	jl39=new JLabel(gender2);
	jl40=new JLabel(job2);
	jl30.setOpaque(true);
	jl31.setOpaque(true);
	jl32.setOpaque(true);
	jl33.setOpaque(true);
	jl34.setOpaque(true);
	jl35.setOpaque(true);
	jl36.setOpaque(true);
	jl37.setOpaque(true);
	jl38.setOpaque(true);
	jl39.setOpaque(true);
	jl40.setOpaque(true);
					//Buttons
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	b9.setBounds(670,550,90,30);
	b10.setBounds(761,550,140,30);
	b11.setBounds(902,550,100,30);
	b14.setBounds(1003,550,120,30);


					//Bounds
	jl3.setBounds(670,135,70,30);
	jl4.setBounds(670,170,200,30);
	jl5.setBounds(670,205,200,30);
	jl6.setBounds(670,240,220,30);
	jl12.setBounds(670,275,100,30);
	jl13.setBounds(670,310,110,30);
	jl7.setBounds(670,345,90,30);
	jl8.setBounds(670,380,90,30);
	jl9.setBounds(670,415,90,30);
	jl10.setBounds(670,450,90,30);
	jl14.setBounds(670,485,130,30);
	
	jl30.setBounds(800,135,300,30);
	jl31.setBounds(800,170,300,30);
	jl32.setBounds(800,205,300,30);
	jl33.setBounds(800,240,300,30);
	jl34.setBounds(800,275,300,30);
	jl35.setBounds(800,310,300,30);
	jl36.setBounds(800,345,300,30);
	jl37.setBounds(800,380,300,30);	
	jl38.setBounds(800,415,300,30);
	jl39.setBounds(800,450,300,30);
	jl40.setBounds(800,485,300,30);
	
					//Adding
	jf6.add(b1);
	jf6.add(b2);
	jf6.add(b3);
	jf6.add(b9);
	jf6.add(b10);
	jf6.add(b11);
	jf6.add(b12);
	jf6.add(b14);
	jf6.add(jl3);
	jf6.add(jl4);
	jf6.add(jl5);
	jf6.add(jl6);
	jf6.add(jl7);
	jf6.add(jl8);
	jf6.add(jl9);
	jf6.add(jl10);
	jf6.add(jl12);
	jf6.add(jl13);
	jf6.add(jl14);
	jf6.add(jl30);
	jf6.add(jl31);
	jf6.add(jl32);
	jf6.add(jl33);
	jf6.add(jl34);
	jf6.add(jl35);
	jf6.add(jl36);
	jf6.add(jl37);
	jf6.add(jl38);
	jf6.add(jl39);
	jf6.add(jl40);
	jf6.add(j);

	jf6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b1.addActionListener(m);
	b2.addActionListener(m);
	b3.addActionListener(m);
	b10.addActionListener(m);
	b9.addActionListener(m);
	b11.addActionListener(m);
	b12.addActionListener(m);
	b12.addActionListener(m);
	b14.addActionListener(m);
	jf2.setVisible(false);
	jf6.setVisible(true);
}
else
{
	JOptionPane.showMessageDialog(jf2, "Wrong Credentials, Enter Again");
}
}
catch(Exception aee)
{
	JOptionPane.showMessageDialog(jf2, "Incorrect Registration Number");
}
}
void searchb()			//Search Button
{
	Connection c1;
	Statement s1;
	ResultSet r1;
try
{	
	
	Class.forName("com.mysql.jdbc.Driver");
	c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/adm" , "root", "1234");
	s1=c1.createStatement();
	String regd=jt1.getText();
	String str3="select *from normaluser where reg="+Integer.parseInt(regd)+"";
	r1=s1.executeQuery(str3);
	while(r1.next())

{
	reg1=r1.getString("reg");
	name1=r1.getString("name");
	mom1=r1.getString("mom");
	dad1=r1.getString("dad");
	course1=r1.getString("course");
	job1=r1.getString("job_cmpny");
}
if(regd.equals(reg1))
{	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf5.setLayout(new BorderLayout());
	jf5.setSize(1366,768);
	jf5.setIconImage(i.getImage());
	b1=new JButton("Home");
	b2=new JButton("Alumni Search");
	b3=new JButton("Alumni Login");
	b12=new JButton("About");
	b13=new JButton("Back");
	
	jl16=new JLabel("Registration No:");
	jl17=new JLabel("Name:");
	jl18=new JLabel("Mother's Name:");
	jl19=new JLabel("Father's Name:");
	jl20=new JLabel("Course:");
	jl21=new JLabel("Company Name:");

	jl22=new JLabel(reg1);
	jl23=new JLabel(name1);
	jl24=new JLabel(mom1);
	jl25=new JLabel(dad1);
	jl26=new JLabel(course1);
	jl27=new JLabel(job1);
	jl29=new JLabel("Search Result  >>>>");
	jl29.setFont(new Font("Times New Roman", Font.BOLD, 30));
	jl22.setOpaque(true);
	jl23.setOpaque(true);
	jl24.setOpaque(true);
	jl25.setOpaque(true);
	jl26.setOpaque(true);
	jl27.setOpaque(true);

	jl16.setBounds(600,300,90,30);
	jl17.setBounds(600,335,90,30);
	jl18.setBounds(600,370,90,30);
	jl19.setBounds(600,405,90,30);
	jl20.setBounds(600,440,90,30);
	jl21.setBounds(600,475,130,30);	
	jl22.setBounds(710,300,200,30);
	jl23.setBounds(710,335,200,30);
	jl24.setBounds(710,370,200,30);
	jl25.setBounds(710,405,200,30);
	jl26.setBounds(710,440,200,30);
	jl27.setBounds(710,475,200,30);
	
	jl29.setBounds(240,400,440,60);
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	b13.setBounds(680,515,90,30);

	jf5.add(b1);
	jf5.add(b2);
	jf5.add(b3);
	jf5.add(b12);
	jf5.add(b13);
	jf5.add(jl29);
	jf5.add(jl16);
	jf5.add(jl17);
	jf5.add(jl18);
	jf5.add(jl19);
	jf5.add(jl20);
	jf5.add(jl21);
	jf5.add(jl22); 
	jf5.add(jl23);
	jf5.add(jl24);
	jf5.add(jl25); 
	jf5.add(jl26);
	jf5.add(jl27);
	jf5.add(j);
	jf1.setVisible(false);
	jf5.setVisible(true);
	jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b1.addActionListener(m);
	b3.addActionListener(m);
	b2.addActionListener(m);
	b12.addActionListener(m);
	b13.addActionListener(m);
}
else
{
	JOptionPane.showMessageDialog(jf3, "User Not Found in Database");
}
}
catch(Exception a1)
{
	JOptionPane.showMessageDialog(jf3, "User Not Found in Database");
}
}

void submitb()			//Submit Button
{
	Connection c2;
	Statement s2;
try
{
	Class.forName("com.mysql.jdbc.Driver");
	c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/adm" , "root", "1234");
	s2=c2.createStatement();
	String name=jt3.getText();
	String dad=jt4.getText();
	String mom=jt5.getText();
	int reg=Integer.parseInt(jt6.getText());
	float cgpa= Float.parseFloat(jt7.getText());
	String mob=jt8.getText();
	String email=jt9.getText();
	String pass=jpf2.getText();
	String course=(String)jcb.getSelectedItem();
	if(jrb1.isSelected())
	{
	gender="Male";
	}
	else if(jrb2.isSelected())
	{
	gender="Female";
	}
	String dob=jt13.getText()+jt12.getText()+jt10.getText();	
	String job=jt11.getText();
	String str="insert into details values('"+reg+"','"+name+"','"+mom+"','"+dad+"','"+course+"','"+cgpa+"','"+job+"','"+pass+"','"+mob+"','"+email+"','"+gender+"','"+dob+"')";	
	s2.executeUpdate(str);
	JOptionPane.showMessageDialog(jf3, "Registered Successfully");
	home();
}
catch(Exception ae)
{
	JOptionPane.showMessageDialog(jf3, "Fill all the options Correctly");
}
}
void home()			
{
	jf1.setVisible(false);
	jf2.setVisible(false);
	jf3.setVisible(false);
	jf4.setVisible(false);
	jf5.setVisible(false);
	jf6.setVisible(false);
	jf7.setVisible(false);
	jf8.setVisible(false);
	new guidemo();
}
void pswrd()
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf7.setLayout(new BorderLayout());
	jf7.setSize(1366,768);
	jf7.setIconImage(i.getImage());
	jt15=new JTextField(reg2);
	jt15.setEditable(false);
	jpf3=new JPasswordField("");
	jpf4=new JPasswordField("");
	jl41=new JLabel("Username:");
	jl42=new JLabel("New Password:");
	jl43=new JLabel("Re- Enter Password");
	b20=new JButton("Submit");
	b21=new JButton("Cancel");
	b1=new JButton("Home");
	b2=new JButton("Alumni Search");
	b3=new JButton("Alumni Login");
	b12=new JButton("About");
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	b21.setBounds(850,432,80,30);
	b20.setBounds(755,432,90,30);
	jl41.setBounds(670,325,70,30);
	jl42.setBounds(670,360,130,30);
	jl43.setBounds(670,395,130,30);
	jt15.setBounds(805,325,250,30);
	jpf3.setBounds(805,360,250,30);
	jpf4.setBounds(805,395,250,30);
	jf7.add(b1);
	jf7.add(b2);
	jf7.add(b3);
	jf7.add(b12);
	jf7.add(jl41); 
	jf7.add(jt15);
	jf7.add(jl42);
	jf7.add(jl43); 
	jf7.add(jpf3);
	jf7.add(jpf4);
	jf7.add(b20);
	jf7.add(b21);
	jf7.add(j);
	jf7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b1.addActionListener(m);
	b2.addActionListener(m);
	b20.addActionListener(m);
	b21.addActionListener(m);
	b12.addActionListener(m);
	jf6.setVisible(false);
	jf7.setVisible(true);
}
void sbmtpswrd()
{
	Connection c3;
	Statement s3;
	ResultSet r3;
try
{	
	Class.forName("com.mysql.jdbc.Driver");
	c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/adm" , "root", "1234");
	s3=c3.createStatement();
	String str=jpf3.getText();
	String strr=jpf4.getText();
if(str.length()>0)
{
if(str.equals(strr))
{
	String str5="update details set password='"+str+"' where reg="+reg2+"";
	s3.executeUpdate(str5);
	JOptionPane.showMessageDialog(jf3,"Updated Successfully");
	home();
}
else
{
	JOptionPane.showMessageDialog(jf3,"Password not matched, Fill same password");
}
}
else
{
	JOptionPane.showMessageDialog(jf3,"Password can't be Empty");
}
}
catch(Exception ae)
{}
}
void deleteb()
{
	Connection c3;
	Statement s3;
	ResultSet r3;
try
{	
	Class.forName("com.mysql.jdbc.Driver");
	c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/adm" , "root", "1234");
	s3=c3.createStatement();
	String str5="delete from details where reg="+reg2+"";
	s3.executeUpdate(str5);
	JOptionPane.showMessageDialog(jf3,"Deleted Successfully");
	home();
}
catch(Exception ae)
{}
}
void editb()
{
	ImageIcon ii=new ImageIcon("lpu9.jpg");
	ImageIcon i=new ImageIcon("2.jpg");
	j=new JLabel(ii);
	jf8.setLayout(new BorderLayout());
	jf8.setSize(1366,768);
	jf8.setIconImage(i.getImage());
					//TextField, Password
	jt16=new JTextField(name2);
	jt17=new JTextField(dad2);
	jt18=new JTextField(mom2);
	jt19=new JTextField(reg2);
	jt19.setEditable(false);
	jt20=new JTextField(email2);
	jt21=new JTextField(cgpa2);
	jt22=new JTextField(mob2);
	jt23=new JTextField("DD");
	jt24=new JTextField("MM");
	jt25=new JTextField("YYYY");
	jt26=new JTextField(job2);
	String[] ss={"B.Tech(CSE)","B.Tech(ECE)","B.Tech(EEE)","B.Tech(CE)","B.Tech(ME)","B.Tech(AE)","B.Tec(IT)"};
	jcb1=new JComboBox(ss);
				//Labels
	jl44=new JLabel("Name:");
	jl45=new JLabel("Father's Name:");
	jl46=new JLabel("Mother's Name:");
	jl47=new JLabel("Registration No:");
	jl48=new JLabel("Email ID:");
	jl49=new JLabel("Course:");
	jl50=new JLabel("Gender:");
	jl51=new JLabel("CGPA:");
	jl52=new JLabel("Mobile No:");
	jl53=new JLabel("Date of Birth:");
	jl54=new JLabel("Job Company:");
						//Buttons
	b1.setBounds(100,500,70,30);
	b2.setBounds(173,500,120,30);
	b3.setBounds(296,500,120,30);
	b12.setBounds(419,500,80,30);
	b18=new JButton("Submit");
	b19=new JButton("Cancel");
	jrb3=new JRadioButton("Male");
	jrb4=new JRadioButton("Female");
	bg1=new ButtonGroup();
	bg1.add(jrb3); bg1.add(jrb4);
					//Bounds
	jl44.setBounds(670,135,70,30);
	jl45.setBounds(670,170,200,30);
	jl46.setBounds(670,205,200,30);
	jl47.setBounds(670,240,220,30);
	jl48.setBounds(670,275,100,30);
	jl49.setBounds(670,310,110,30);
	jl50.setBounds(670,345,90,30);
	jl51.setBounds(670,380,90,30);
	jl52.setBounds(670,415,90,30);
	jl53.setBounds(670,450,90,30);
	jl54.setBounds(670,485,130,30);
	b18.setBounds(800,525,100,30);
	b19.setBounds(905,525,100,30);
	jt16.setBounds(760,135,316,30);
	jt17.setBounds(760,170,316,30);
	jt18.setBounds(760,205,316,30);
	jt19.setBounds(760,240,316,30);
	jt20.setBounds(760,275,316,30);
	jcb1.setBounds(760,310,316,30);
	jrb3.setBounds(760,345,100,30);
	jrb4.setBounds(865,345,100,30);
	jt21.setBounds(760,380,316,30);
	jt22.setBounds(760,415,316,30);
	jt23.setBounds(760,450,60,30);
	jt24.setBounds(825,450,60,30);
	jt25.setBounds(890,450,100,30);
	jt26.setBounds(760,485,316,30);
				//Adding
	jf8.add(b1);
	jf8.add(b2);
	jf8.add(b3);
	jf8.add(b12);
	jf8.add(b18);
	jf8.add(b19);
	jf8.add(jl44);
	jf8.add(jl45);
	jf8.add(jl46);
	jf8.add(jl47);
	jf8.add(jl48);
	jf8.add(jl49);
	jf8.add(jl50);
	jf8.add(jl51);
	jf8.add(jl52);
	jf8.add(jl53);
	jf8.add(jl54);
	jf8.add(jt16);
	jf8.add(jt17);
	jf8.add(jt18);
	jf8.add(jt19);
	jf8.add(jt20);
	jf8.add(jt21);
	jf8.add(jt22);
	jf8.add(jt23);
	jf8.add(jt24);
	jf8.add(jt25);
	jf8.add(jt26);
	jf8.add(jrb3);
	jf8.add(jrb4);
	jf8.add(jcb1);
	jf8.add(j);
	jf8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m=new MyEvent();
	b1.addActionListener(m);
	b2.addActionListener(m);
	b3.addActionListener(m);
	b18.addActionListener(m);
	b19.addActionListener(m);
	b12.addActionListener(m);
	jf6.setVisible(false);
	jf8.setVisible(true);
}

void editpw()
{
	Connection c4;
	Statement s4;
	ResultSet r4;
try
{	
	Class.forName("com.mysql.jdbc.Driver");
	c4=DriverManager.getConnection("jdbc:mysql://localhost:3306/adm" , "root", "1234");
	s4=c4.createStatement();
	name3=jt16.getText();
	dad3=jt17.getText();
	mom3=jt18.getText();
	email3=jt20.getText();
	course3=(String)jcb1.getSelectedItem();
	if(jrb3.isSelected())
	{
	gender3="Male";
	}
	else
	{
	gender3="Female";
	}
	float cgpa3=Float.parseFloat(jt21.getText());
	mob3=jt22.getText();
	dob3=jt25.getText()+jt24.getText()+jt23.getText();
	job3=jt26.getText();
	String str6="update details set name='"+name3+"', dad='"+dad3+"', mom='"+mom3+"', email='"+email3+"', course='"+course3+"', cgpa='"+cgpa3+"', mob='"+mob3+"', dob='"+dob3+"', job_cmpny='"+job3+"', gender='"+gender3+"'  where reg="+reg2+"";	
	s4.executeUpdate(str6);
	System.out.println("Updated Successfully");
	JOptionPane.showMessageDialog(jf3, "Profile Updated Successfully");
	home();
}
catch(Exception ae)
{
	JOptionPane.showMessageDialog(jf3, "Fill the options Correctly");
	System.out.println(ae);
}
}
}