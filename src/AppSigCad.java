import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AppSigCad extends JFrame {

    // Construtor da Classe
    public AppSigCad() {
        super();
        setTitle("Sistema de Gerenciamento de Cliente, Produtos e Fornecedores");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JTabbedPane tbPanel = new JTabbedPane();
        tbPanel.setSize(545, 350);
        tbPanel.setLocation(20, 10);
        add(tbPanel);

        // Aba do painel Cliente
        JPanel pnlCliente = new JPanel();
        pnlCliente.setLayout(null);
        tbPanel.addTab("Cliente", pnlCliente);

        // Aba do painel Produto
        JPanel pnlProduto = new JPanel();
        pnlProduto.setLayout(null);
        tbPanel.addTab("Produto", pnlProduto);

        // Aba do painel Fornecedor
        JPanel pnlFornecedor = new JPanel();
        pnlFornecedor.setLayout(null);
        tbPanel.addTab("Fornecedor", pnlFornecedor);

        // Painel de cadastro de Clientes
        JPanel pnlCadCli = new JPanel();
        pnlCliente.add(pnlCadCli);

        pnlCadCli.setSize(520, 118);
        pnlCadCli.setLocation(10, 150);
        pnlCadCli.setLayout(null);
        Border borda = BorderFactory.createLineBorder(new Color(128, 128, 128), 1);

        pnlCadCli.setBorder(borda);

        //Declaração dos Labels
        JLabel lblCodigo = new JLabel("Matricula: ");
        lblCodigo.setSize(70, 20);
        lblCodigo.setLocation(10, 20);
        pnlCadCli.add(lblCodigo);

        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setSize(50, 20);
        lblNome.setLocation(120, 20);
        pnlCadCli.add(lblNome);

        JLabel lblFone = new JLabel("Telefone: ");
        lblFone.setSize(100, 20);
        lblFone.setLocation(10, 60);
        pnlCadCli.add(lblFone);

        JLabel lblEmail = new JLabel("Email: ");
        lblEmail.setSize(50, 20);
        lblEmail.setLocation(170, 60);
        pnlCadCli.add(lblEmail);

        //Declaração dos JTextFields
        JTextField jtfCodigo = new JTextField();
        jtfCodigo.setSize(50, 25);
        jtfCodigo.setLocation(70, 20);
        pnlCadCli.add(jtfCodigo);

        JTextField jtfNome = new JTextField();
        jtfNome.setSize(230, 25);
        jtfNome.setLocation(160, 20);
        pnlCadCli.add(jtfNome);

        JTextField jtfFone = new JTextField();
        jtfFone.setSize(90, 25);
        jtfFone.setLocation(70, 60);
        pnlCadCli.add(jtfFone);

        JTextField jtfEmail = new JTextField();
        jtfEmail.setSize(180, 25);
        jtfEmail.setLocation(210, 60);
        pnlCadCli.add(jtfEmail);

        // Painel de cadastro de Produto
        JPanel pnlCadPro = new JPanel();
        pnlProduto.add(pnlCadPro);

        pnlCadPro.setSize(520, 118);
        pnlCadPro.setLocation(10, 150);
        pnlCadPro.setLayout(null);
        Border borda1 = BorderFactory.createLineBorder(new Color(128, 128, 128), 1);

        pnlCadPro.setBorder(borda1);

        //Declaração dos Labels
        JLabel lblCodigo1 = new JLabel("Matricula: ");
        lblCodigo1.setSize(70, 20);
        lblCodigo1.setLocation(10, 20);
        pnlCadPro.add(lblCodigo1);

        JLabel lblNome1 = new JLabel("Nome: ");
        lblNome1.setSize(50, 20);
        lblNome1.setLocation(120, 20);
        pnlCadPro.add(lblNome1);

        JLabel lblFone1 = new JLabel("Telefone: ");
        lblFone1.setSize(100, 20);
        lblFone1.setLocation(10, 60);
        pnlCadPro.add(lblFone1);

        JLabel lblEmail1 = new JLabel("Email: ");
        lblEmail1.setSize(50, 20);
        lblEmail1.setLocation(170, 60);
        pnlCadPro.add(lblEmail1);

        //Declaração dos JTextFields
        JTextField jtfCodigo1 = new JTextField();
        jtfCodigo1.setSize(50, 25);
        jtfCodigo1.setLocation(70, 20);
        pnlCadPro.add(jtfCodigo1);

        JTextField jtfNome1 = new JTextField();
        jtfNome1.setSize(230, 25);
        jtfNome1.setLocation(160, 20);
        pnlCadPro.add(jtfNome1);

        JTextField jtfFone1 = new JTextField();
        jtfFone1.setSize(90, 25);
        jtfFone1.setLocation(70, 60);
        pnlCadPro.add(jtfFone1);

        JTextField jtfEmail1 = new JTextField();
        jtfEmail1.setSize(180, 25);
        jtfEmail1.setLocation(210, 60);
        pnlCadPro.add(jtfEmail1);

        // Painel de cadastro de Fornecedor
        JPanel pnlCadFor = new JPanel();
        pnlFornecedor.add(pnlCadFor);

        pnlCadFor.setSize(520, 118);
        pnlCadFor.setLocation(10, 150);
        pnlCadFor.setLayout(null);
        Border borda2 = BorderFactory.createLineBorder(new Color(128, 128, 128), 1);

        pnlCadFor.setBorder(borda2);

        //Declaração dos Labels
        JLabel lblCodigo2 = new JLabel("Matricula: ");
        lblCodigo2.setSize(70, 20);
        lblCodigo2.setLocation(10, 20);
        pnlCadFor.add(lblCodigo2);

        JLabel lblNome2 = new JLabel("Nome: ");
        lblNome2.setSize(50, 20);
        lblNome2.setLocation(120, 20);
        pnlCadFor.add(lblNome2);

        JLabel lblFone2 = new JLabel("Telefone: ");
        lblFone2.setSize(100, 20);
        lblFone2.setLocation(10, 60);
        pnlCadFor.add(lblFone2);

        JLabel lblEmail2 = new JLabel("Email: ");
        lblEmail2.setSize(50, 20);
        lblEmail2.setLocation(170, 60);
        pnlCadFor.add(lblEmail2);

        //Declaração dos JTextFields
        JTextField jtfCodigo2 = new JTextField();
        jtfCodigo2.setSize(50, 25);
        jtfCodigo2.setLocation(70, 20);
        pnlCadFor.add(jtfCodigo2);

        JTextField jtfNome2 = new JTextField();
        jtfNome2.setSize(230, 25);
        jtfNome2.setLocation(160, 20);
        pnlCadFor.add(jtfNome2);

        JTextField jtfFone2 = new JTextField();
        jtfFone2.setSize(90, 25);
        jtfFone2.setLocation(70, 60);
        pnlCadFor.add(jtfFone2);

        JTextField jtfEmail2 = new JTextField();
        jtfEmail2.setSize(180, 25);
        jtfEmail2.setLocation(210, 60);
        pnlCadFor.add(jtfEmail2);

        setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        AppSigCad form = new AppSigCad();
    }
}