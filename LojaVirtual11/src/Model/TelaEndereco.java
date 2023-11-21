package Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField txCidade;
	private JTextField txBairro;
	private JTextField txRua;
	private JTextField txNumero;
	private JTextField txComplemento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEndereco frame = new TelaEndereco();
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
	public TelaEndereco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(179, 199, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbRua = new JLabel("Rua");
		lbRua.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbRua.setBounds(10, 30, 46, 14);
		contentPane.add(lbRua);
		
		JLabel lbBairro = new JLabel("Bairro");
		
		lbBairro.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbBairro.setBounds(10, 66, 46, 14);
		contentPane.add(lbBairro);
		
		JLabel lbCidade = new JLabel("Cidade");
		lbCidade.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbCidade.setBounds(10, 101, 46, 14);
		contentPane.add(lbCidade);
		
		JLabel lbUF = new JLabel("UF");
		lbUF.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbUF.setBounds(10, 135, 46, 14);
		contentPane.add(lbUF);
		
		JComboBox cbUF = new JComboBox();
		cbUF.setBackground(new Color(214, 232, 254));
		cbUF.setBounds(66, 132, 56, 22);
		cbUF.setModel(new DefaultComboBoxModel (new String[] {"--", "AC", "AL", "AP", "AM",
				"BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", 
				"PE", "PI", "RJ", "RN", "RO", "RR", "SC", "SP", "SE", "TO"}));
		contentPane.add(cbUF);
		
		txCidade = new JTextField();
		txCidade.setBackground(new Color(214, 232, 254));
		txCidade.setBounds(66, 99, 339, 20);
		contentPane.add(txCidade);
		txCidade.setColumns(10);
		
		txBairro = new JTextField();
		txBairro.setBackground(new Color(214, 232, 254));
		txBairro.setText("");
		txBairro.setBounds(66, 64, 339, 20);
		contentPane.add(txBairro);
		txBairro.setColumns(10);
		
		txRua = new JTextField();
		txRua.setBackground(new Color(214, 232, 254));
		txRua.setBounds(66, 28, 339, 20);
		contentPane.add(txRua);
		txRua.setColumns(10);
		
		JLabel lbNumero = new JLabel("Número");
		lbNumero.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbNumero.setBounds(197, 136, 74, 14);
		contentPane.add(lbNumero);
		
		txNumero = new JTextField();
		txNumero.setBackground(new Color(214, 232, 254));
		txNumero.setBounds(257, 133, 148, 20);
		contentPane.add(txNumero);
		txNumero.setColumns(10);
		
		JLabel lbComplemento = new JLabel("Complemento");
		lbComplemento.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lbComplemento.setBounds(10, 173, 104, 14);
		contentPane.add(lbComplemento);
		
		txComplemento = new JTextField();
		txComplemento.setBackground(new Color(214, 232, 254));
		txComplemento.setBounds(112, 171, 293, 45);
		contentPane.add(txComplemento);
		txComplemento.setColumns(10);
		
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Endereco en = new Endereco();
				en.setRua(txRua.getText());
				en.setBairro(txBairro.getText());
				en.setCidade(txCidade.getText());
				en.setUf(cbUF.getSelectedItem().toString());
				en.setNumero(txNumero.getText());
				en.setIdentificacao(txComplemento.getText());
				
				JOptionPane.showMessageDialog(null, "Endereço salvo!\nRua: " + en.getRua() + "\nBairro: " + 
				en.getBairro() + "\nCidade: " + en.getCidade() + "\nUF: " + en.getNumero() + "\nComplemento: " +
				en.getIdentificacao());
			}
		});
		btSalvar.setBackground(new Color(214, 232, 254));
		btSalvar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btSalvar.setBounds(316, 227, 89, 23);
		contentPane.add(btSalvar);
		
		JButton btVoltar = new JButton("Voltar");
		btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btVoltar.setBackground(new Color(214, 232, 254));
		btVoltar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btVoltar.setBounds(207, 228, 89, 23);
		contentPane.add(btVoltar);
	}
}
