package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField psSenha;
	private JTextField txLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 291);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbLogin = new JLabel("Login");
		lbLogin.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbLogin.setBounds(47, 49, 46, 14);
		contentPane.add(lbLogin);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(47, 100, 46, 14);
		contentPane.add(lblNewLabel);
		
		psSenha = new JPasswordField();
		psSenha.setBackground(new Color(193, 232, 255));
		psSenha.setBounds(103, 97, 202, 20);
		contentPane.add(psSenha);
		
		txLogin = new JTextField();
		txLogin.setBackground(new Color(193, 232, 255));
		txLogin.setBounds(103, 47, 202, 20);
		contentPane.add(txLogin);
		txLogin.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(193, 232, 255));
		btnNewButton.setBounds(148, 163, 89, 23);
		contentPane.add(btnNewButton);
	}
}
