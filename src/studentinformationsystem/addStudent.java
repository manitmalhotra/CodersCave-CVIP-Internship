/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author manit
 */
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class addStudent extends javax.swing.JFrame {

    /**
     * Creates new form addStudent
     */
    public addStudent() throws ParseException {
        initComponents();
        this.setTitle("Add Student");
        this.setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        ImageIcon backgroundImage = new ImageIcon("C:/Manit/Java/NetBeansProjects/StudentInformationSystem/src/st.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        add(backgroundLabel);
        s_class.removeAllItems();
        sub1.removeAllItems();
        sub2.removeAllItems();
        sub3.removeAllItems();
        sub4.removeAllItems();
        sub5.removeAllItems();
        fillCombo();
        
        String dateValue = "2001-09-09";  // must be in (yyyy- mm- dd ) format
        Date date = new SimpleDateFormat("yyyy-mm-dd").parse(dateValue);
        dob.setDate(date);
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        rollno = new javax.swing.JTextField();
        father_name = new javax.swing.JTextField();
        mother_name = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        aadhar = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        b_group = new javax.swing.JTextField();
        l11 = new javax.swing.JLabel();
        s_class = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        submit1 = new javax.swing.JButton();
        submit2 = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        l12 = new javax.swing.JLabel();
        address1 = new javax.swing.JTextField();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        sub1 = new javax.swing.JComboBox<>();
        sub2 = new javax.swing.JComboBox<>();
        sub3 = new javax.swing.JComboBox<>();
        sub4 = new javax.swing.JComboBox<>();
        sub5 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD STUDENT");

        l1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l1.setText("Name");

        l2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l2.setText("Father's Name");

        l3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l3.setText("Student ID");

        l4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l4.setText("Roll No.");

        l5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l5.setText("Mobile No.");

        l6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l6.setText("Aadhar No.");

        l7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l7.setText("Mother's Name");

        l8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l8.setText("Password");

        l9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l9.setText("DOB");

        l10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l10.setText("Blood Group");

        aadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharActionPerformed(evt);
            }
        });

        l11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l11.setText("Class");

        s_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        s_class.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s_classItemStateChanged(evt);
            }
        });
        s_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_classActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        submit1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit1.setText("CANCEL");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });

        submit2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit2.setText("BACK");
        submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit2ActionPerformed(evt);
            }
        });

        l12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l12.setText("Address ");

        address1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address1ActionPerformed(evt);
            }
        });

        l13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l13.setText("Subject 1");

        l14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l14.setText("Subject 5");

        l15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l15.setText("Subject 3");

        l16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l16.setText("Subject 4");

        l17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l17.setText("Subject 2");

        sub1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1ActionPerformed(evt);
            }
        });

        sub2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub2ActionPerformed(evt);
            }
        });

        sub3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub3ActionPerformed(evt);
            }
        });

        sub4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub4ActionPerformed(evt);
            }
        });

        sub5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sub5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(449, 449, 449))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s_id)
                                    .addComponent(name)
                                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(rollno)
                                    .addComponent(b_group))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s_class, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(father_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mother_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(b_group, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mother_name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(sub5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(s_class, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submit)
                            .addComponent(submit1)
                            .addComponent(submit2))
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_classActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
      try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student_info","root","manit");
            
            String student_id=s_id.getText();
            String sname= name.getText();
            String srollno=rollno.getText();
            
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            
            String date=sdf.format(dob.getDate());
            
            String bloodgroup=b_group.getText();
            String aadharno=aadhar.getText();
            String classname=(String) s_class.getSelectedItem();
            String father=father_name.getText();
            String mother= mother_name.getText();
            String mobileno=mobile.getText();
            String addresses=address.getText();
            String pass=address1.getText();
            String subject1=(String) sub1.getSelectedItem();
            String subject2=(String) sub2.getSelectedItem();
            String subject3=(String) sub3.getSelectedItem();
            String subject4=(String) sub4.getSelectedItem();
            String subject5=(String) sub5.getSelectedItem();
            Statement stm=con.createStatement();
            if("".equals(s_id) || "".equals(name) || "".equals(rollno)|| "".equals(b_group)|| "".equals(aadhar)|| "".equals(father_name)|| "".equals(mother_name)|| "".equals(mobile)|| "".equals(address) )
            {
                JOptionPane.showMessageDialog(this,"Please fill all fields");
            }
                    
                    
                    
            else
            {

                String sql="insert into student values('"+student_id+"','"+sname+"','"+srollno+"','"+date+"','"+bloodgroup+"','"+aadharno+"','"+classname+"','"+father+"','"+mother+"','"+mobileno+"','"+addresses+"','"+pass+"')";
                
                String sql1="create table "+student_id+"(subject_name varchar(50) unique,class varchar(45),lectureattended varchar(10),totallecture varchar(10),attendance varchar(10),marksobtained varchar(10),totalMarks varchar(10),marks varchar(10));";
                String sql2="insert into "+student_id+" values('"+subject1+"','"+classname+"',NULL,NULL,NULL,NULL,NULL,NULL)";
                String sql3="insert into "+student_id+" values('"+subject2+"','"+classname+"',NULL,NULL,NULL,NULL,NULL,NULL)";
                String sql4="insert into "+student_id+" values('"+subject3+"','"+classname+"',NULL,NULL,NULL,NULL,NULL,NULL)";
                String sql5="insert into "+student_id+" values('"+subject4+"','"+classname+"',NULL,NULL,NULL,NULL,NULL,NULL)";
                String sql6="insert into "+student_id+" values('"+subject5+"','"+classname+"',NULL,NULL,NULL,NULL,NULL,NULL)";
                
                String sub1c=subject1+"_"+classname.replaceAll("\\s","");
                String sub2c=subject2+"_"+classname.replaceAll("\\s","");
                String sub3c=subject3+"_"+classname.replaceAll("\\s","");
                String sub4c=subject4+"_"+classname.replaceAll("\\s","");
                String sub5c=subject5+"_"+classname.replaceAll("\\s","");
                
                String sql7="insert into "+sub1c+" values('"+student_id+"');";
                String sql8="insert into "+sub2c+" values('"+student_id+"');";
                String sql9="insert into "+sub3c+" values('"+student_id+"');";
                String sql10="insert into "+sub4c+" values('"+student_id+"');";
                String sql11="insert into "+sub5c+" values('"+student_id+"');";
                
                try{
                    
                        
                    int row2= stm.executeUpdate(sql1);
                    int row3=stm.executeUpdate(sql2);
                    int row4=stm.executeUpdate(sql3);
                    int row5=stm.executeUpdate(sql4);
                    int row6=stm.executeUpdate(sql5);
                    int row7=stm.executeUpdate(sql6);
                    int row8=stm.executeUpdate(sql7);
                    int row9=stm.executeUpdate(sql8);
                    int row10=stm.executeUpdate(sql9);
                    int row11=stm.executeUpdate(sql10);
                    int row12=stm.executeUpdate(sql11);
                    int row=stm.executeUpdate(sql);
                    
                    
                    if(row>0 && row2==0 && row3>0&& row4>0&& row5>0&& row6>0&& row7>0 && row8>0 && row9>0 && row10>0 && row11>0 && row12>0)
                    JOptionPane.showMessageDialog(this,"Successfully Added");
                    else
                    JOptionPane.showMessageDialog(this,"Error Occured");
                    dispose();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                    dispose();
                }
                manageStudent bk=new manageStudent();
                dispose();
                bk.show();
                con.close();}
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_submit1ActionPerformed

    private void submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit2ActionPerformed
        // TODO add your handling code here:
        manageStudent bk=new manageStudent();
        dispose();
        bk.show();
    }//GEN-LAST:event_submit2ActionPerformed

    private void sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub1ActionPerformed

    private void sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub2ActionPerformed

    private void sub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub3ActionPerformed

    private void sub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub4ActionPerformed

    private void sub5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub5ActionPerformed

    private void s_classItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s_classItemStateChanged
        // TODO add your handling code here:
        sub1.removeAllItems();
        sub2.removeAllItems();
        sub3.removeAllItems();
        sub4.removeAllItems();
        sub5.removeAllItems();
        fillCombo1();
    }//GEN-LAST:event_s_classItemStateChanged

    private void address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address1ActionPerformed

    private void aadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadharActionPerformed

    /**
     * @param args the command line arguments
     */
    private void fillCombo()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student_info","root","manit");
            Statement stm=con.createStatement();
            String sql="select name from classes";
           
            
            ResultSet rs = stm.executeQuery(sql);
            
            
            while(rs.next())
            {
                String name=rs.getString("name");
                s_class.addItem(name);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    private void fillCombo1()
    {
        try
        {   
            String classname=(String) s_class.getSelectedItem();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student_info","root","manit");
            Statement stm=con.createStatement();
            
            String sql2="select subject_name from subject where class='"+classname+"'";
           
            ResultSet rs1=stm.executeQuery(sql2);
            while(rs1.next())
            {
                String name1=rs1.getString("subject_name");
                sub1.addItem(name1);
                sub2.addItem(name1);
                sub3.addItem(name1);
                sub4.addItem(name1);
                sub5.addItem(name1);
                
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new addStudent().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(addStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar;
    private javax.swing.JTextField address;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField b_group;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField father_name;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField mother_name;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rollno;
    private javax.swing.JComboBox<String> s_class;
    private javax.swing.JTextField s_id;
    private javax.swing.JComboBox<String> sub1;
    private javax.swing.JComboBox<String> sub2;
    private javax.swing.JComboBox<String> sub3;
    private javax.swing.JComboBox<String> sub4;
    private javax.swing.JComboBox<String> sub5;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit1;
    private javax.swing.JButton submit2;
    // End of variables declaration//GEN-END:variables
}
