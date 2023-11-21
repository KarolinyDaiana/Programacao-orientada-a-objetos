package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(179, 199, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bemvindo = new JLabel("Bem vindo!");
		bemvindo.setBackground(new Color(240, 240, 240));
		bemvindo.setFont(new Font("Arial Black", Font.PLAIN, 20));
		bemvindo.setBounds(152, 21, 140, 40);
		contentPane.add(bemvindo);
		
		JButton btCadastro = new JButton("Cadastrar-se");
		btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCliente cadastro;
				try {
					cadastro = new TelaCliente();
					cadastro.setVisible(true);
				} catch (ParseException e1) {
					System.out.println("Erro ao mostrar a tela de cliente!");
				}
			}
		});
		btCadastro.setBackground(new Color(223, 236, 255));
		btCadastro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btCadastro.setBounds(152, 86, 131, 40);
		contentPane.add(btCadastro);
		
		JButton btLogin = new JButton("Fazer login");
		btLogin.setBackground(new Color(223, 236, 255));
		btLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btLogin.setBounds(152, 137, 131, 40);
		contentPane.add(btLogin);
		
		JButton btCadastroPorduto = new JButton("Cadastrar produto");
		btCadastroPorduto.setBackground(new Color(223, 236, 255));
		btCadastroPorduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btCadastroPorduto.setBounds(152, 188, 131, 40);
		contentPane.add(btCadastroPorduto);
		
		JLabel lbIcone = new JLabel("");
		lbIcone.setIcon(new ImageIcon("C:\\Users\\Karoliny Daiana\\Downloads\\3507742-cart-ecommerce-grocery-iconoteka-shop-shopping-store_107693_resized.png"));
		lbIcone.setBounds(319, 148, 140, 113);
		contentPane.add(lbIcone);
	}
}
