package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputDemo {

	public static void main(String[] args) {
		SignupView s = new SignupView();
	}
}
//signup 
//login 

class SignupView extends JFrame implements ActionListener {
	JPanel panel;
	JTextField txtFirstName, txtEmail, txtPassword;
	JButton btnSubmit, btnCanel;
	JLabel lblFn, lblEm, lblPwd;
	Container c;

	public SignupView() {

		c = getContentPane();
		c.setLayout(null);
		lblFn = new JLabel("First Name");
		lblFn.setSize(100, 20);
		lblFn.setLocation(50, 10);

		lblEm = new JLabel("Email");
		lblEm.setSize(100, 20);
		lblEm.setLocation(50, 50);

		lblPwd = new JLabel("Password");
		lblPwd.setSize(100, 20);
		lblPwd.setLocation(50, 90);

		txtFirstName = new JTextField();
		txtFirstName.setColumns(15);
		txtFirstName.setSize(200, 30);
		txtFirstName.setLocation(150, 10);

		txtEmail = new JTextField();
		txtEmail.setColumns(15);
		txtEmail.setSize(200, 30);
		txtEmail.setLocation(150, 50);

		txtPassword = new JTextField();
		txtPassword.setColumns(15);
		txtPassword.setSize(200, 30);
		txtPassword.setLocation(150, 90);

		btnSubmit = new JButton("Signup");
		btnSubmit.addActionListener(this);
		btnSubmit.setSize(150, 30);
		btnSubmit.setLocation(180, 140);

		btnCanel = new JButton("Cancel");

		panel = new JPanel();

		c.add(lblFn);
		c.add(txtFirstName);

		c.add(lblEm);
		c.add(txtEmail);

		c.add(lblPwd);
		c.add(txtPassword);

		c.add(btnSubmit);

//		panel.add(c);
//		add(c); // add panel into frame
		setTitle("Signup");
		setBounds(300, 90, 500, 500);
		setResizable(false);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Signup")) {
			String fn = txtFirstName.getText();
			String em = txtEmail.getText();
			String pwd = txtPassword.getText();

			System.out.println(fn);
			System.out.println(em);
			System.out.println(pwd);

		}
	}

}
