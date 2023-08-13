import java.awt.*;




import java.awt.event.*;

import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;


public class dbms extends Frame implements ActionListener {

Label l01,l02,l03;

Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24, l25, l26, l27, l28, l29,l30,l31;

TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23;

Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;

Connection con;

Statement st;

ResultSet rs;

TextArea textArea;

public dbms()

{
l01= new Label("-:MAHARAJA SRIRAM CHANDRA BHANJADEO UNIVERSITY, BARIPADA, ODISHA:-");
l02= new Label("STUDENT DATABASE MANAGEMENT SYSTEM");

Font font = new Font("lato", Font.BOLD, 17); // Create a new Font object with a larger size
l01.setFont(font); // Set the new font to label l01

Font font2 = new Font("Tahoma", Font.BOLD, 12); // Create a new Font object with a larger size
l02.setFont(font2); // Set the new font to label l02

// showing notification of any update
l03 = new Label(" ");


Font font3 = new Font("Arial", Font.BOLD, 12); // Create a new Font object with a larger size
l03.setFont(font3); // Set the new font to label l02





//// for showing all data in a text box
textArea = new TextArea();
textArea.setBounds(700, 150, 400, 330);
add(textArea);



ImageIcon logoIcon = new ImageIcon("C:\\Users\\kesha\\Downloads\\logo.png"); // Replace "logo.png" with the path to your image file
JLabel logoLabel = new JLabel(logoIcon);
logoLabel.setBounds(820, 40, logoIcon.getIconWidth(), logoIcon.getIconHeight()); // Adjust the position and size of the logo
add(logoLabel);






l1=new Label ("Sl_No:");
l2=new Label("Roll Number:");
l3=new Label(" Name:");
l4=new Label("Gender:");
l5=new Label("Father Name:");
l6=new Label("Mother Name:");
l7=new Label("D.O.B:");
l8=new Label("Present Address: ");
l9=new Label("Permanent Address:");
l10=new Label("Phone No:");
l11=new Label("E-mail:");
l12=new Label("Department:");
l13=new Label("Academic Year:");
l14=new Label("Current Semester:");
l15=new Label("10th Mark:");
l16=new Label("+2 Mark:");
l17=new Label("+3 Mark:");
l18=new Label("Distinction (+3):");
l19=new Label("First Sem Mark:");
l20=new Label("Second Sem Mark:");
l21=new Label("Third Sem Mark:");
l22=new Label("Forth Sem Mark:");
l23=new Label("Remark:");
l24 = new Label("Guided By:-");
l25 = new Label("Prof. Jibendu kumar Mantri");
l26 = new Label("Keshab Pradhan");
l27 = new Label("Debesh Ku. Das");
l28 = new Label("Debasisha Nayak");
l29 = new Label("Bikash Behera");
l30 = new Label("Team Members:-");
l31= new Label("Dr. S Jayasingh");

t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
t6=new TextField();
t7=new TextField();
t8=new TextField();
t9=new TextField();
t10=new TextField();
t11=new TextField();
t12=new TextField();
t13=new TextField();
t14=new TextField();
t15=new TextField();
t16=new TextField();
t17=new TextField();
t18=new TextField();
t19=new TextField();
t20=new TextField();
t21=new TextField();
t22=new TextField();
t23=new TextField();

b1=new Button("Next");
b2=new Button("Prev");
b3=new Button("First");
b4=new Button("Last");
b5=new Button("Insert");
b6=new Button("Delete");
b7=new Button("Exit");
b8=new Button("Update");
b9=new Button("Search");
b10=new Button("Show");
b11=new Button("Clear");
setLayout(null);



l01.setBounds(100,50,800,20);
l02.setBounds(300,70,800,20);
l03.setBounds(750,600,500,50);





l1.setBounds(100,100,100,20);
l2.setBounds(100,130,100,20);
l3.setBounds(100,160,100,20);
l4.setBounds(100,190,100,20);
l5.setBounds(100,220,100,20);
l6.setBounds(100,250,100,20);
l7.setBounds(100,280,100,20);
l8.setBounds(100,310,100,20);
l9.setBounds(100,340,100,20);
l10.setBounds(100,370,100,20);
l11.setBounds(100,400,100,20);
l12.setBounds(100,430,100,20);
l13.setBounds(100,460,100,20);
l14.setBounds(100,490,100,20);
l15.setBounds(100,520,100,20);
l16.setBounds(100,550,100,20);
l17.setBounds(100,580,100,20);
l18.setBounds(100,610,100,20);
l19.setBounds(100,640,100,20);
l20.setBounds(100,670,100,20);
l21.setBounds(100,700,100,20);
l22.setBounds(100,730,100,20);
l23.setBounds(100,760,100,20);

l24.setBounds(700, 640, 200, 30);
Font font4 = new Font("Arial", Font.BOLD, 13); 
l24.setFont(font4);
l25.setBounds(700, 660, 200, 30);
Font font5 = new Font("Arial", Font.BOLD, 11); 
l25.setFont(font5); 
l26.setBounds(700, 730, 100, 30);
Font font6 = new Font("Arial", Font.BOLD, 11); 
l26.setFont(font6); 
l27.setBounds(700, 750, 100, 30);
Font font7 = new Font("Arial", Font.BOLD, 11); 
l27.setFont(font7); 
l28.setBounds(700, 770, 100, 30);
Font font8 = new Font("Arial", Font.BOLD, 11); 
l28.setFont(font8); 
l29.setBounds(700, 790, 100, 30);
Font font9 = new Font("Arial", Font.BOLD, 11); 
l29.setFont(font9); 

 
l30.setBounds(700, 710, 100, 30);
Font font10 = new Font("Arial", Font.BOLD, 13); 
l30.setFont(font10); 

l31.setBounds(700, 680, 200, 30);
Font font11 = new Font("Arial", Font.BOLD, 11); 
l31.setFont(font11);

t1.setBounds(240,100,400,20);
t2.setBounds(240,130,400,20);
t3.setBounds(240,160,400,20);
t4.setBounds(240,190,400,20);
t5.setBounds(240,220,400,20);
t6.setBounds(240,250,400,20);
t7.setBounds(240,280,400,20);
t8.setBounds(240,310,400,20);
t9.setBounds(240,340,400,20);
t10.setBounds(240,370,400,20);
t11.setBounds(240,400,400,20);
t12.setBounds(240,430,400,20);
t13.setBounds(240,460,400,20);
t14.setBounds(240,490,400,20);
t15.setBounds(240,520,400,20);
t16.setBounds(240,550,400,20);
t17.setBounds(240,580,400,20);
t18.setBounds(240,610,400,20);
t19.setBounds(240,640,400,20);
t20.setBounds(240,670,400,20);
t21.setBounds(240,700,400,20);
t22.setBounds(240,730,400,20);
t23.setBounds(240,760,400,20);



b3.setBounds(800,490,40,20);//first data from database
b5.setBounds(850,490,40,20);//insert into database
b4.setBounds(900,490,40,20);//last data from database
b1.setBounds(800,520,40,20);//next button
b6.setBounds(850,520,40,20);//delete button
b2.setBounds(900,520,40,20);//previous button
b7.setBounds(850,550,40,20);//exit 
b8.setBounds(900,550,40,20);//update record from database
b9.setBounds(800,550,40,20);//`search data from database
b10.setBounds(820,580,40,20);//showing all records from database
b11.setBounds(870,580,40,20);//clear all records from display area





add(l01);add(l02);add(l03);



add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);add(l14);add(l15);add(l16);add(l17);add(l18);add(l19);add(l20);add(l21);add(l22);add(l23);add(l24);
add(l25);
add(l26);
add(l27);
add(l28);
add(l29);
add(l30);
add(l31);
add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(t8);add(t9);add(t10);add(t11);add(t12);add(t13);add(t14);add(t15);add(t16);add(t17);add(t18);add(t19);add(t20);add(t21);add(t22);add(t23);
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);




try{

Class.forName("com.mysql.jdbc.Driver");  
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mscbu", "root", "mscbu@123");
st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
rs = st.executeQuery("SELECT * FROM std");
 

rs.next();

 }
    catch(Exception e)

  {
    	
  System.out.println(e.getMessage());
  
  }

}




public void actionPerformed(ActionEvent ae)

{
	

try {

String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23;



String s=ae.getActionCommand();


if (ae.getSource().equals( b10)) { // Display all records button
	try{
		   // Clear the text area
        textArea.setText("");

        // Retrieve all records from the database
        rs = st.executeQuery("SELECT * FROM std");

        // Check if the result set has any data
        if (!rs.next()) {
            textArea.append("No records found.");
        } else {
            // Reset the result set cursor to the beginning
            rs.beforeFirst();
            
            int recordCount = 0; // To count the number of records retrieved
      while(rs.next()) {
    	   
    	   recordCount++;
    	   
    	  
    	   textArea.append(String.format("%-50s: %s%n", "sl_no", rs.getString(1)));
    	   textArea.append(String.format("%-50s: %s%n", "roll_no", rs.getString(2)));
    	   textArea.append(String.format("%-48s: %s%n", "name", rs.getString(3)));
    	   textArea.append(String.format("%-48s: %s%n", "gender", rs.getString(4)));
    	   textArea.append(String.format("%-44s: %s%n", "father_name", rs.getString(5)));
    	   textArea.append(String.format("%-42s: %s%n", "mother_name", rs.getString(6)));
    	   textArea.append(String.format("%-50s: %s%n", "dob", rs.getString(7)));
    	   textArea.append(String.format("%-40s: %s%n", "present_address", rs.getString(8)));
    	   textArea.append(String.format("%-37s: %s%n", "permanent_address", rs.getString(9)));
    	   textArea.append(String.format("%-45s: %s%n", "phone_no", rs.getString(10)));
    	   textArea.append(String.format("%-48s: %s%n", "e_mail", rs.getString(11)));
    	   textArea.append(String.format("%-49s: %s%n", "dept", rs.getString(12)));
    	   textArea.append(String.format("%-40s: %s%n", "academic_year", rs.getString(13)));
    	   textArea.append(String.format("%-39s: %s%n", "current_semester", rs.getString(14)));
    	   textArea.append(String.format("%-44s: %s%n", "tenth_mark", rs.getString(15)));
    	   textArea.append(String.format("%-41s: %s%n", "plus_two_mark", rs.getString(16)));
    	   textArea.append(String.format("%-41s: %s%n", "graduation_mark", rs.getString(17)));
    	   textArea.append(String.format("%-46s: %s%n", "distinction", rs.getString(18)));
    	   textArea.append(String.format("%-40s: %s%n", "first_sem_mark", rs.getString(19)));
    	   textArea.append(String.format("%-36s: %s%n", "second_sem_mark", rs.getString(20)));
    	   textArea.append(String.format("%-40s: %s%n", "third_sem_mark", rs.getString(21)));
    	   textArea.append(String.format("%-39s: %s%n", "fourth_sem_mark", rs.getString(22)));
    	   textArea.append(String.format("%-47s: %s%n", "remark", rs.getString(23)));

            textArea.append("----------------------------------------------------------------\n");
     	 }
       
       textArea.append(" Total Number of Records Retrieved: " + recordCount);
       }}
	catch(SQLException e) {
    	   e.printStackTrace();

       
		}
	}
 
else if(s.equals("Next"))

{

rs.next();

t1.setText(""+rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));
t6.setText(rs.getString(6));
t7.setText(rs.getString(7));
t8.setText(rs.getString(8));
t9.setText(rs.getString(9));
t10.setText(rs.getString(10));
t11.setText(rs.getString(11));
t12.setText(rs.getString(12));
t13.setText(rs.getString(13));
t14.setText(rs.getString(14));
t15.setText(rs.getString(15));
t16.setText(rs.getString(16));
t17.setText(rs.getString(17));
t18.setText(rs.getString(17));
t19.setText(rs.getString(19));
t20.setText(rs.getString(20));
t21.setText(rs.getString(21));
t22.setText(rs.getString(22));
t23.setText(""+rs.getString(23));


l03.setText("Showing Next Record.");

Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        l03.setText(""); // Reset the updateLabel text after a certain period of time
    }
}, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label
}




else if(s.equals("Clear"))

{

rs.next();
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
t12.setText("");
t13.setText("");
t14.setText("");
t15.setText("");
t16.setText("");
t17.setText("");
t18.setText("");
t19.setText("");
t20.setText("");
t21.setText("");
t22.setText("");
t23.setText("");
l03.setText("  ");

Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        l03.setText(""); // Reset the updateLabel text after a certain period of time
    }
}, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label


}




else if(s.equals("Prev"))

{

rs.previous();
 

t1.setText(""+rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));
t6.setText(rs.getString(6));
t7.setText(rs.getString(7));
t8.setText(rs.getString(8));
t9.setText(rs.getString(9));
t10.setText(rs.getString(10));
t11.setText(rs.getString(11));
t12.setText(rs.getString(12));
t13.setText(rs.getString(13));
t14.setText(rs.getString(14));
t15.setText(rs.getString(15));
t16.setText(rs.getString(16));
t17.setText(rs.getString(17));
t18.setText(rs.getString(18));
t19.setText(rs.getString(19));
t20.setText(rs.getString(20));
t21.setText(rs.getString(21));
t22.setText(rs.getString(22));
t23.setText(""+rs.getString(23));
l03.setText("Showing Previous Record.");

Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        l03.setText(""); // Reset the updateLabel text after a certain period of time
    }
}, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label
}

else if(s.equals("First"))

{

rs.first();

t1.setText(""+rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));
t6.setText(rs.getString(6));
t7.setText(rs.getString(7));
t8.setText(rs.getString(8));
t9.setText(rs.getString(9));
t10.setText(rs.getString(10));
t11.setText(rs.getString(11));
t12.setText(rs.getString(12));
t13.setText(rs.getString(13));
t14.setText(rs.getString(14));
t15.setText(rs.getString(15));
t16.setText(rs.getString(16));
t17.setText(rs.getString(17));
t18.setText(rs.getString(18));
t19.setText(rs.getString(19));
t20.setText(rs.getString(20));
t21.setText(rs.getString(21));
t22.setText(rs.getString(22));
t23.setText(""+rs.getString(23));
l03.setText("Showing First Record from MSCBU Database.");

Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        l03.setText(""); // Reset the updateLabel text after a certain period of time
    }
}, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label

}

else if(s.equals("Last"))

{

rs.last();

t1.setText(""+rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));
t6.setText(rs.getString(6));
t7.setText(rs.getString(7));
t8.setText(rs.getString(8));

t9.setText(rs.getString(9));
t10.setText(rs.getString(10));
t11.setText(rs.getString(11));
t12.setText(rs.getString(12));
t13.setText(rs.getString(13));
t14.setText(rs.getString(14));
t15.setText(rs.getString(15));
t16.setText(rs.getString(16));
t17.setText(rs.getString(17));
t18.setText(rs.getString(18));
t19.setText(rs.getString(19));
t20.setText(rs.getString(20));
t21.setText(rs.getString(21));
t22.setText(rs.getString(22));
t23.setText(""+rs.getString(23));
l03.setText("Showing Last Record From MSCBU Database.");

Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        l03.setText(""); // Reset the updateLabel text after a certain period of time
    }
}, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label

}

else if(s.equals("Insert"))

{

s1=t1.getText();
s2=t2.getText();
s3=t3.getText();

s4=t4.getText();
s5=t5.getText();
s6=t6.getText();

s7=t7.getText();
s8=t8.getText();
s9=t9.getText();


s10=t10.getText();
s11=t11.getText();
s12=t12.getText();

s13=t13.getText();
s14=t14.getText();
s15=t15.getText();

s16=t16.getText();
s17=t17.getText();
s18=t18.getText();

s19=t19.getText();
s20=t20.getText();
s21=t21.getText();
s22=t22.getText();
s23=t23.getText();


//st.executeUpdate("Insert in to std values("+n1+",'"+s2+" ',"+n2+")"); 
st.executeUpdate("INSERT INTO std VALUES('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "','" + s7 + "','" + s8 + "','" + s9 + "','" + s10 + "','" + s11 + "','" + s12 + "','" + s13 + "','" + s14 + "','" + s15 + "','" + s16 + "','" + s17 + "','" + s18 + "','" + s19 + "','" + s20 + "','" + s21 + "','" + s22 + "','"+s23+"')"); 
rs=st.executeQuery("select * from std");
rs.next();
System.out.println("Student Record Added Successfully");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
t12.setText("");
t13.setText("");
t14.setText("");
t15.setText("");
t16.setText("");
t17.setText("");
t18.setText("");
t19.setText("");
t20.setText("");
t21.setText("");
t22.setText("");
t23.setText("");
l03.setText("Insertion Successful...!");

    
    b10.getActionListeners()[0].actionPerformed(new ActionEvent(b10, ActionEvent.ACTION_PERFORMED, null));


Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        l03.setText(""); // Reset the updateLabel text after a certain period of time
    }
}, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label
}

else if(s.equals("Delete"))

{

s1=t1.getText();

s2=t2.getText();

s3=t3.getText();
s4=t5.getText();
s6=t6.getText();
s7=t7.getText();
s8=t8.getText();
s9=t9.getText();
s10=t10.getText();
s11=t11.getText();
s12=t12.getText();
s13=t13.getText();
s14=t14.getText();
s15=t15.getText();
s16=t16.getText();
s17=t17.getText();
s18=t18.getText();
s19=t19.getText();
s20=t20.getText();
s21=t21.getText();
s22=t22.getText();
s23=t23.getText();

st.executeUpdate("DELETE FROM std WHERE sl_no = '" + s1 + "'");
rs=st.executeQuery("select * from std"); 
rs.next();
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
t12.setText("");
t13.setText("");
t14.setText("");
t15.setText("");
t16.setText("");
t17.setText("");
t18.setText("");
t19.setText("");
t20.setText("");
t21.setText("");
t22.setText("");
t23.setText("");
l03.setText("Deletion Successful...!");

b10.getActionListeners()[0].actionPerformed(new ActionEvent(b10, ActionEvent.ACTION_PERFORMED, null));

Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        l03.setText(""); // Reset the updateLabel text after a certain period of time
    }
}, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label

}
 else if (s. equals("Update")){


 s1=t1.getText();
 s2=t2.getText();
 s3=t3.getText();

 s4=t4.getText();
 s5=t5.getText();
 s6=t6.getText();

 s7=t7.getText();
 s8=t8.getText();
 s9=t9.getText();


 s10=t10.getText();
 s11=t11.getText();
 s12=t12.getText();

 s13=t13.getText();
 s14=t14.getText();
 s15=t15.getText();

 s16=t16.getText();
 s17=t17.getText();
 s18=t18.getText();

 s19=t19.getText();
 s20=t20.getText();
 s21=t21.getText();
 s22=t22.getText();
 s23=t23.getText();


 String query="UPDATE std SET sl_no='"+s1+"', name= '" + s3 + "',gender=  '" + s4 + "',father_name='" +s5+"',mother_name='"+s6+"',dob='"+s7+"',present_address='"+s8+"',permanent_address='"+s9+"',phone_no='"+s10+"',e_mail='"+s11+"',dept='"+s12+"',academic_year='"+s13+"',current_semester='"+s14+"',tenth_mark='"+s15+"',plus_two_mark='"+s16+"',graduation_mark='"+s17+"',distinction='"+s18+"',first_sem_mark='"+s19+"',second_sem_mark='"+s20+"',third_sem_mark='"+s21+"',fourth_sem_mark='"+s22+"',remark='"+s23+"' WHERE(roll_no =" + s2 + ")";
 st.executeUpdate(query);

 rs = st.executeQuery("SELECT * FROM std");
 rs.next();
System.out.println("update successful");
 t1.setText("");
 t2.setText("");
 t3.setText("");
 t4.setText("");
 t5.setText("");
 t6.setText("");
 t7.setText("");
 t8.setText("");
 t9.setText("");
 t10.setText("");
 t11.setText("");
 t12.setText("");
 t13.setText("");
 t14.setText("");
 t15.setText("");
 t16.setText("");
 t17.setText("");
 t18.setText("");
 t19.setText("");
 t20.setText("");
 t21.setText("");
 t22.setText("");
 t23.setText("");
 l03.setText("Updatition Successful..!");

 b10.getActionListeners()[0].actionPerformed(new ActionEvent(b10, ActionEvent.ACTION_PERFORMED, null));
 
 Timer timer = new Timer();
 timer.schedule(new TimerTask() {
     @Override
     public void run() {
         l03.setText(""); // Reset the updateLabel text after a certain period of time
     }
 }, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label
 }

 else if (s.equals("Search")) {
	    s2 = t2.getText();
	 rs= st.executeQuery("select * from std where (roll_no="+s2+")");
	    rs.next();
	  
	        t1.setText(""+rs.getString(1));
	        t2.setText(rs.getString(2));
	        t3.setText(rs.getString(3));
	        t4.setText(rs.getString(4));
	        t5.setText(rs.getString(5));
	        t6.setText(rs.getString(6));
	        t7.setText(rs.getString(7));
	        t8.setText(rs.getString(8));
	        t9.setText(rs.getString(9));
	        t10.setText(rs.getString(10));
	        t11.setText(rs.getString(11));
	        t12.setText(rs.getString(12));
	        t13.setText(rs.getString(13));
	        t14.setText(rs.getString(14));
	        t15.setText(rs.getString(15));
	        t16.setText(rs.getString(16));
	        t17.setText(rs.getString(17));
	        t18.setText(rs.getString(18));
	        t19.setText(rs.getString(19));
	        t20.setText(rs.getString(20));
	        t21.setText(rs.getString(21));
	        t22.setText(rs.getString(22));
	        t23.setText(""+rs.getString(23));
	        l03.setText("Showing Search Record..");

	        Timer timer = new Timer();
	        timer.schedule(new TimerTask() {
	            @Override
	            public void run() {
	                l03.setText(""); // Reset the updateLabel text after a certain period of time
	            }
	        }, 3500); // Change the delay (in milliseconds) to the desired duration before resetting the label
	}
 

else if(s.equals("Exit"))

     {

       System.exit(0);

     }


  }
  catch(Exception e)

  {
   System.out.println(e.getMessage());
  }

}
    
 
 
public static void main(String args[])

{

dbms oa=new dbms();
 

oa.setSize(1200,1000);


oa.setBackground(Color.cyan);


oa.setTitle("MAHARAJA SRIRAM CHANDRA BHANJADEO UNIVERSITY STUDENT MANAGEMENT SYSTEM");

oa.setVisible(true);




}

}