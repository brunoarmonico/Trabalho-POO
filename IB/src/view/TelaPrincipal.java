package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import controller.ControleIB;
import model.Conta;

public class TelaPrincipal implements ActionListener {
	private static TelaPrincipal tela = new TelaPrincipal();
	private static JFrame janela;
	private JPanel telaLogin;
	private JPanel telaCadastro;
	private JPanel telaEscolha;
	private ControleIB controle = new ControleIB();
	private JTextField login;
	private JPasswordField senha;

	public static void main(String[] args) {
		janela = new JFrame("Banco do HUE");
		tela.telaLogin();
		janela.setVisible(true);
		janela.setResizable(false);
		janela.setSize(900, 550);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void telaLogin() {
		Font fonte = new Font("Segoe UI", Font.PLAIN, 12);

		JLabel lbLogin = new JLabel("Login:");
		lbLogin.setFont(fonte);
		login = new JTextField(20);
		login.setFont(fonte);
		JPanel painelLogin = new JPanel();
		painelLogin.add(lbLogin);
		painelLogin.add(login);

		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setFont(fonte);
		senha = new JPasswordField(20);
		senha.setFont(fonte);
		JPanel painelSenha = new JPanel();
		painelSenha.add(lbSenha);
		painelSenha.add(senha);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(fonte);
		JButton btnCadastro = new JButton("Primeiro Acesso");
		btnCadastro.setFont(fonte);
		JPanel painelBotao = new JPanel();
		painelBotao.add(btnLogin);
		painelBotao.add(btnCadastro);

		JPanel dadosLogin = new JPanel(new GridLayout(3, 1));
		dadosLogin.add(painelLogin);
		dadosLogin.add(painelSenha);
		dadosLogin.add(painelBotao);

		telaLogin = new JPanel(new GridLayout(3, 1));
		telaLogin.add(new JPanel());
		telaLogin.add(dadosLogin);
		telaLogin.add(new JPanel());
		
		btnLogin.addActionListener(this);
		btnCadastro.addActionListener(this);
		janela.setContentPane(telaLogin);
	}

	public void telaCad() {
		JLabel lbNome = new JLabel("Nome Completo:");
		JTextField nome = new JTextField(20);
		JPanel painelNome = new JPanel();
		painelNome.add(lbNome);
		painelNome.add(nome);

		JLabel lbLogin = new JLabel("Login:");
		login = new JTextField(20);
		JPanel painelLogin = new JPanel();
		painelLogin.add(lbLogin);
		painelLogin.add(login);

		JLabel lbSenha = new JLabel("Senha:");
		senha = new JPasswordField(20);
		JPanel painelSenha = new JPanel();
		painelSenha.add(lbSenha);
		painelSenha.add(senha);

		JLabel lbCpf = new JLabel("CPF:");
		JTextField cpf = new JTextField(16);
		JPanel painelCpf = new JPanel();
		painelCpf.add(lbCpf);
		painelCpf.add(cpf);

		// JLabel lbBanco = new JLabel("Banco:");
		// JTextField banco = new JTextField(5);
		JPanel painelBanco = new JPanel(new GridLayout(1, 2));
		// painelBanco.add(lbBanco);
		// painelBanco.add(banco);

		JLabel lbConta = new JLabel("Conta:");
		JTextField conta = new JTextField(10);
		JPanel painelConta = new JPanel();
		painelConta.add(lbConta);
		painelConta.add(conta);

		JLabel lbAgencia = new JLabel("Agencia:");
		JTextField agencia = new JTextField(5);
		JPanel painelAgencia = new JPanel();
		painelAgencia.add(lbAgencia);
		painelAgencia.add(agencia);

		painelBanco.add(painelAgencia);
		painelBanco.add(painelConta);

		NumberFormatter valorFormatado = new NumberFormatter();
		JLabel lbValor = new JLabel("Saldo da Conta:");
		JFormattedTextField valor = new JFormattedTextField(valorFormatado);
		valor.setColumns(10);
		JPanel painelValor = new JPanel();
		painelValor.add(lbValor);
		painelValor.add(valor);

		JButton btnCadastro = new JButton("Cadastrar");
		JButton btnVoltar = new JButton("Voltar");
		JPanel painelBotao = new JPanel(new GridLayout(1, 2));
		painelBotao.add(btnCadastro);
		painelBotao.add(btnVoltar);

		JPanel dadosLogin = new JPanel(new GridLayout(10, 1));
		dadosLogin.add(painelNome);
		dadosLogin.add(painelLogin);
		dadosLogin.add(painelSenha);
		dadosLogin.add(painelCpf);
		dadosLogin.add(painelBanco);
		// dadosLogin.add(painelAgencia);
		// dadosLogin.add(painelConta);
		dadosLogin.add(painelValor);
		dadosLogin.add(painelBotao);

		telaCadastro = new JPanel();
		telaCadastro.add(new JPanel());
		telaCadastro.add(dadosLogin);
		telaCadastro.add(new JPanel());

		btnCadastro.addActionListener(this);
	}

	public void telaEscolha() {
		telaEscolha = new JPanel(new GridLayout(6, 1));

		JLabel titulo = new JLabel("Bem vindo ao banco HUE");
		titulo.setFont(new Font("Segoe UI", Font.BOLD, 28));
		JPanel painelTitulo = new JPanel();
		painelTitulo.add(titulo);

		JButton tranferencia = new JButton("Transferencia");
		JButton extrato = new JButton("Extrato");
		JPanel ext = new JPanel();
		ext.add(tranferencia, BorderLayout.EAST);
		ext.add(extrato, BorderLayout.WEST);

		JButton pagamento = new JButton("Pagamento");
		JButton deposito = new JButton("Deposito");
		JPanel dep = new JPanel();
		dep.add(pagamento, BorderLayout.EAST);
		dep.add(deposito, BorderLayout.WEST);

		JPanel painelInferior = new JPanel();
		JButton btnSair = new JButton("Sair");
		painelInferior.add(btnSair);
		btnSair.addActionListener(this);
		

		telaEscolha.add(painelTitulo);
		telaEscolha.add(new JPanel());
		telaEscolha.add(ext);
		telaEscolha.add(dep);
		telaEscolha.add(new JPanel());
		telaEscolha.add(painelInferior);
	}
	
	public void telaTransferencia() {
		
	}
	
	public boolean fazerLogin() {
		Conta conta = new Conta();
		System.out.println("TESTE LOGIN " +login.getText());
		conta.setLogin(login.getText());
		System.out.println("TESTE senha " +senha.getPassword());
		conta.setSenha(senha.toString());
		controle.acessoConta(conta);
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String cmd = event.getActionCommand();
		if ("Login".equals(cmd)) {
			boolean aprovado;
			aprovado = fazerLogin();
			if (aprovado = false) {
				JOptionPane.showMessageDialog(null, "LOGIN OU SENHA INVALIDO");
			} else {
				telaEscolha();
				telaLogin.setVisible(false);
				janela.setContentPane(telaEscolha);
				telaEscolha.setVisible(true);
				janela.invalidate();
				janela.revalidate();
				janela.repaint();
			}
		} else if ("Primeiro Acesso".equals(cmd)) {
			telaCad();
			telaLogin.setVisible(false);
			janela.setContentPane(telaCadastro);
			telaCadastro.setVisible(true);
			janela.invalidate();
			janela.revalidate();
			janela.repaint();
		}
		if ("Sair".equals(cmd)){
			telaLogin();
			telaEscolha.setVisible(false);
			janela.setContentPane(telaLogin);
			telaLogin.setVisible(true);
			janela.invalidate();
			janela.revalidate();
			janela.repaint();
		}
	}
}
