import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Add extends JFrame implements ActionListener, MouseListener {
    JLabel lblinfo, lblno1, lblno2, lblno3, lblno4, lblno5;
    JTextField txtno1, txtno2, txtno3, txtno4, txtno5;
    Statement stmt;
    Connection cn;
    int co_id, co_duration, co_fee1, co_fee, k;
    String co_name, sql;
    JComboBox<String> c1;
    JButton b, b1, b2, b3, b4;
    DefaultTableModel model = new DefaultTableModel();
    JTable tabGrid = new JTable(model);
    JScrollPane scrlPane = new JScrollPane(tabGrid);

    public Add() {
        setSize(1500, 1500);
        setTitle("Course Record");
        setLayout(null);

        Font f = new Font("Times New Roman", Font.BOLD, 35);
        Font f1 = new Font("Algerian", Font.ITALIC, 20);

        lblinfo = new JLabel("Add Record");
        add(lblinfo);
        lblinfo.setBounds(450, 20, 300, 50);
        lblinfo.setFont(f);
        lblinfo.setForeground(Color.RED);
        lblinfo.setOpaque(true);

        lblno1 = new JLabel("Course Id:");
        add(lblno1);
        lblno1.setFont(f1);
        lblno1.setBounds(100, 100, 150, 20);

        txtno1 = new JTextField(20);
        add(txtno1);
        txtno1.setFont(f1);
        txtno1.setBounds(250, 100, 100, 20);

        lblno2 = new JLabel("Course Name:");
        add(lblno2);
        lblno2.setFont(f1);
        lblno2.setBounds(100, 200, 200, 20);

        txtno2 = new JTextField(20);
        add(txtno2);
        txtno2.setFont(f1);
        txtno2.setBounds(300, 200, 100, 20);

        lblno3 = new JLabel("Course Period:");
        add(lblno3);
        lblno3.setFont(f1);
        lblno3.setBounds(100, 300, 200, 20);

        txtno3 = new JTextField(20);
        add(txtno3);
        txtno3.setFont(f1);
        txtno3.setBounds(320, 300, 100, 20);

        lblno4 = new JLabel("One-time Fees:");
        add(lblno4);
        lblno4.setFont(f1);
        lblno4.setBounds(100, 400, 200, 20);

        txtno4 = new JTextField(20);
        add(txtno4);
        txtno4.setFont(f1);
        txtno4.setBounds(320, 400, 100, 20);

        lblno5 = new JLabel("Installment Fees:");
        add(lblno5);
        lblno5.setFont(f1);
        lblno5.setBounds(100, 500, 200, 20);

        txtno5 = new JTextField(20);
        add(txtno5);
        txtno5.setFont(f1);
        txtno5.setBounds(320, 500, 100, 20);

        b = new JButton("New");
        add(b);
        b1 = new JButton("Save");
        add(b1);
        b2 = new JButton("Update");
        add(b2);
        b3 = new JButton("Delete");
        add(b3);
        b4 = new JButton("Display All");
        add(b4);

        b.setBounds(250, 550, 80, 30);
        b1.setBounds(350, 550, 80, 30);
        b2.setBounds(450, 550, 80, 30);
        b3.setBounds(550, 550, 80, 30);
        b4.setBounds(650, 550, 120, 30);

        scrlPane.setBounds(50, 600, 627, 200);
        add(scrlPane);
        tabGrid.setFont(new Font("Verdana", 0, 13));

        model.addColumn("C_ID");
        model.addColumn("C_Name");
        model.addColumn("C_Period");
        model.addColumn("O_FEE");
        model.addColumn("I_FEE");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/institute", "root", "");
            stmt = cn.createStatement();
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "" + e1);
        }

        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setVisible(true);
        tabGrid.addMouseListener(this);
    }

    public static void main(String[] args) {
        new Add();
    }

    @Override
    public void actionPerformed(ActionEvent e3) {
        if (b == e3.getSource()) {
            try {
                stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT co_id from course");
                rs = stmt.executeQuery("select max(co_id) from Course");
                int i = 1;

                while (rs.next()) {
                    i = Integer.parseInt(rs.getString("co_id"));
                }
                i++;
                txtno1.setText("");
                txtno2.setText("");
                txtno3.setText("");
                txtno4.setText("");
                txtno5.setText("");
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "" + e1);
            }
        }

        if (b1 == e3.getSource()) {
            try {
                co_id = Integer.parseInt(txtno1.getText());
                co_name = txtno2.getText();
                co_duration = Integer.parseInt(txtno3.getText());
                co_fee1 = Integer.parseInt(txtno4.getText());
                co_fee = Integer.parseInt(txtno5.getText());
                sql = "Insert into course values(" + co_id + ",'" + co_name + "'," + co_duration + "," + co_fee1 + ","
                        + co_fee + ")";
                stmt = cn.createStatement();
                k = stmt.executeUpdate(sql);
                if (k > 0)
                    JOptionPane.showMessageDialog(null, "Save Successfully");
                else
                    JOptionPane.showMessageDialog(null, "Error");
                stmt.close();
                txtno1.setText("");
                txtno2.setText("");
                txtno3.setText("");
                txtno4.setText("");
                txtno5.setText("");
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "" + e1);
            }
        }

        if (b3 == e3.getSource()) {
            try {
                co_id = Integer.parseInt(txtno1.getText());
                sql = "delete from course where co_id=" + co_id + " ";
                stmt = cn.createStatement();
                k = stmt.executeUpdate(sql);

                if (k > 0)
                    JOptionPane.showMessageDialog(null, "Delete Successfully");
                else
                    JOptionPane.showMessageDialog(null, "Error");
                stmt.close();
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "" + e1);
            }
        }

        if (b2 == e3.getSource()) {
            try {
                co_id = Integer.parseInt(txtno1.getText());
                co_name = txtno2.getText();
                co_duration = Integer.parseInt(txtno3.getText());
                co_fee1 = Integer.parseInt(txtno4.getText());
                co_fee = Integer.parseInt(txtno5.getText());

                sql = "update course set co_name='" + co_name + "', co_duration=" + co_duration + ", co_fee1=" + co_fee1
                        + ", co_fee=" + co_fee + " where co_id=" + co_id + "";
                stmt = cn.createStatement();
                k = stmt.executeUpdate(sql);
                if (k > 0)
                    JOptionPane.showMessageDialog(null, "Updated Successfully");
                else
                    JOptionPane.showMessageDialog(null, "Error");
                stmt.close();
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "" + e1);
            }
        }

        if (b4 == e3.getSource()) {
            int r = 0;
            Statement stmt;
            model.setRowCount(0);
            try {
                stmt = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("SELECT * from course");
                while (rs.next()) {
                    model.insertRow(r++, new Object[] { rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                            rs.getInt(5) });
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        DefaultTableModel dtm = (DefaultTableModel) tabGrid.getModel();
        int selectedRowIndex = tabGrid.getSelectedRow();
        int co_id = (Integer) dtm.getValueAt(selectedRowIndex, 0);
        try {
            Statement stmt = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * from course where co_id=" + co_id + "");
            while (rs.next()) {
                txtno1.setText("");
                txtno2.setText("");
                txtno3.setText("");
                txtno4.setText("");
                txtno5.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // Other methods from MouseListener interface
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
