package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.beans.PropertyChangeEvent;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JLabel lblCPF;
	private JTextField txtCPF;
	private JLabel lblNascimento;
	private JLabel lblLogin;
	private JTextField txtLogin;
	private JLabel lblSenha;
	private JTextField txtSenha;
	private JButton btSalvar;
	private JTextField txTelefone;
	private JLabel lblNewLabel;
	private JButton btVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaCliente() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 395);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(179, 199, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(0, 0, 0));
		lblNome.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNome.setBounds(10, 29, 46, 14);
		contentPane.add(lblNome);
		
		txNome = new JTextField();
		txNome.setBackground(new Color(223, 236, 255));
		txNome.setBounds(100, 26, 289, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setForeground(Color.BLACK);
		lblCPF.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblCPF.setBounds(10, 66, 33, 14);
		contentPane.add(lblCPF);
		
		txtCPF = new JTextField();
		txtCPF.setBackground(new Color(223, 236, 255));
		txtCPF.setColumns(10);
		txtCPF.setBounds(100, 63, 289, 20);
		contentPane.add(txtCPF);
		
		lblNascimento = new JLabel("Nascimento");
		lblNascimento.setForeground(Color.BLACK);
		lblNascimento.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNascimento.setBounds(10, 109, 81, 14);
		contentPane.add(lblNascimento);
		
		lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblLogin.setBounds(10, 157, 60, 14);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBackground(new Color(223, 236, 255));
		txtLogin.setColumns(10);
		txtLogin.setBounds(100, 154, 289, 20);
		contentPane.add(txtLogin);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblSenha.setBounds(10, 201, 60, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBackground(new Color(223, 236, 255));
		txtSenha.setColumns(10);
		txtSenha.setBounds(100, 198, 289, 20);
		contentPane.add(txtSenha);
		
		MaskFormatter data = new MaskFormatter("##/##/####");

		JFormattedTextField txtNascimento = new JFormattedTextField(data);
		txtNascimento.setForeground(new Color(128, 128, 255));
		txtNascimento.setBackground(new Color(223, 236, 255));
		txtNascimento.setBounds(98, 107, 291, 20);
		contentPane.add(txtNascimento);
		
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		Cliente c = new Cliente();
		
		btSalvar = new JButton("Salvar");
		btSalvar.setForeground(new Color(0, 0, 0));
		btSalvar.setBackground(new Color(223, 236, 255));
		btSalvar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				c.setNome(txNome.getText());
				c.setCpf(txtCPF.getText());
				c.setDataNascimento(txtNascimento.getText());
				System.out.println(txtNascimento.getText());
				c.setEmail(txtLogin.getText());
				c.setSenha(txtSenha.getText());
				c.setTelefones(txTelefone.getText());
				
				JOptionPane.showMessageDialog(null, "Cliente salvo!\nNome: " + c.getNome() + "\nCpf: " + c.getCpf() + 
						"\nData de nascimento: " + c.getDataNascimento() + "\nLogin: " + c.getLogin() + "\nTelefone: "
						+ c.getTelefones());
				
				cliente.add(c);
			}
		});
		btSalvar.setBounds(273, 291, 116, 23);
		contentPane.add(btSalvar);
		
		JButton btMostrar = new JButton("Ver todos");
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int cont = 0; cont < cliente.size(); cont++) {
					c.mostrarDados();
				}
				
			}
		});
		btMostrar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btMostrar.setForeground(new Color(0, 0, 0));
		btMostrar.setBackground(new Color(223, 236, 255));
		btMostrar.setBounds(10, 325, 116, 23);
		contentPane.add(btMostrar);
		
		JButton btEndereco = new JButton("Novo endereço");
		btEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEndereco endereco = new TelaEndereco();
				
				endereco.setVisible(true);
			}
		});
		btEndereco.setBackground(new Color(223, 236, 255));
		btEndereco.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btEndereco.setBounds(105, 291, 143, 23);
		contentPane.add(btEndereco);
		
		txTelefone = new JTextField();
		txTelefone.setBackground(new Color(223, 236, 255));
		txTelefone.setBounds(100, 249, 289, 20);
		contentPane.add(txTelefone);
		txTelefone.setColumns(10);
		
		lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 251, 81, 14);
		contentPane.add(lblNewLabel);
		
		btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btVoltar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btVoltar.setBackground(new Color(214, 232, 254));
		btVoltar.setBounds(300, 326, 89, 23);
		contentPane.add(btVoltar);
	}
}