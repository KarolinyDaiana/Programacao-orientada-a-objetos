package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class TelaProdutoa extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txModelo;
	private JTextField txPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProdutoa frame = new TelaProdutoa();
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
	public TelaProdutoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBackground(new Color(179, 199, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome do produto");
		lblNome.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNome.setBounds(10, 29, 121, 14);
		contentPane.add(lblNome);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCategoria.setBounds(10, 64, 92, 14);
		contentPane.add(lblCategoria);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setBackground(new Color(223, 236, 255));
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"----------", "Calçados", "Roupas", "Acessórios", "Infantil"}));
		cbCategoria.setBounds(129, 60, 92, 22);
		contentPane.add(cbCategoria);
		
		txNome = new JTextField();
		txNome.setForeground(new Color(0, 0, 0));
		txNome.setBackground(new Color(223, 236, 255));
		txNome.setBounds(129, 27, 225, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblModelo.setBounds(10, 93, 92, 14);
		contentPane.add(lblModelo);
		
		txModelo = new JTextField();
		txModelo.setForeground(new Color(0, 0, 0));
		txModelo.setBackground(new Color(223, 236, 255));
		txModelo.setColumns(10);
		txModelo.setBounds(129, 90, 225, 20);
		contentPane.add(txModelo);
		
		JLabel lblPreo = new JLabel("Preço");
		lblPreo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblPreo.setBounds(10, 125, 92, 14);
		contentPane.add(lblPreo);
		
		txPreco = new JTextField();
		txPreco.setForeground(new Color(0, 0, 0));
		txPreco.setBackground(new Color(223, 236, 255));
		txPreco.setColumns(10);
		txPreco.setBounds(129, 121, 225, 20);
		contentPane.add(txPreco);
		
		JLabel lblAvaliao = new JLabel("Avaliação");
		lblAvaliao.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblAvaliao.setBounds(10, 159, 92, 14);
		contentPane.add(lblAvaliao);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setBackground(new Color(223, 236, 255));
		textArea.setBounds(129, 153, 225, 80);
		contentPane.add(textArea);
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btSalvar.setBackground(new Color(223, 236, 255));
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto p = new Produto();
				p.setNome(txNome.getText());
				p.setCategoria(cbCategoria.getSelectedIndex());
				p.setAvaliacao(textArea.getText());
				p.setModelo(txModelo.getText());
				p.setPreco(txPreco.getText()); 
				
				JOptionPane.showMessageDialog(null, "Produto salvo! \nNome: " + p.getNome() + "\nPreço: " + p.getPreco() + 
						"\nModelo: " + p.getModelo() + "\nCategoria: " + p.getCategoria() + "\nAvaliação: " + p.getAvaliacao());
				//categgoria.getSelectedItem().toString()
				produtos.add(p);
			}
		});
		btSalvar.setBounds(335, 265, 89, 23);
		contentPane.add(btSalvar);
		
		JButton btProdutos = new JButton("Ver produtos");
		btProdutos.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btProdutos.setBackground(new Color(223, 236, 255));
		btProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int cont = 0; cont < produtos.size(); cont++) {
					JOptionPane.showMessageDialog(null, produtos.get(cont).getNome() + "\n" + produtos.get(cont).getPreco() +  "\n" +
							produtos.get(cont).getCategoria() + "\n" + produtos.get(cont).getModelo() + "\n" + produtos.get(cont).getAvaliacao());
				}
			}
		});
		btProdutos.setBounds(167, 265, 146, 23);
		contentPane.add(btProdutos);
	}
}