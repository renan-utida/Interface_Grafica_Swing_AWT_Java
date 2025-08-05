import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    private JFrame frame;
    private JPanel panel;
    private JTextField nomeField;
    private JTextArea comentarioArea;
    private JCheckBox interesseAWS;
    private JRadioButton radioSim;
    private JRadioButton radioNao;
    private JButton enviarButton;

    public static void main(String[] args) {
        Main app = new Main();
        app.inicializarAplicacao();
    }

    private void inicializarAplicacao() {
        criarFrame();
        criarPainel();
        criarComponentes();
        adicionarComponentesAoPainel();
        configurarEventos();
        finalizarConfiguracao();
    }

    private void criarFrame() {
        frame = new JFrame("Formulário de Contato");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void criarPainel() {
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
    }

    private void criarComponentes() {
        // Labels
        JLabel nomeLabel = new JLabel("Nome: ");
        JLabel comentarioLabel = new JLabel("Comentário: ");

        // Campos de entrada
        nomeField = new JTextField(20);
        comentarioArea = new JTextArea(5, 20);

        // CheckBox
        interesseAWS = new JCheckBox("Tem interesse em AWS? ");

        // RadioButtons
        criarRadioButtons();

        // Botão
        enviarButton = new JButton("Enviar");

        // Adicionar os labels ao painel também
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(comentarioLabel);
    }

    private void criarRadioButtons() {
        radioSim = new JRadioButton("Sim");
        radioNao = new JRadioButton("Não");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioSim);
        grupo.add(radioNao);
    }

    private void adicionarComponentesAoPainel() {
        panel.add(comentarioArea);
        panel.add(interesseAWS);
        panel.add(radioSim);
        panel.add(radioNao);
        panel.add(enviarButton);
    }

    private void configurarEventos() {
        configurarActionListener();
        configurarMouseListener();
    }

    private void configurarActionListener() {
        enviarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String comentario = comentarioArea.getText();
            System.out.println("Nome: " + nome + ", Comentário: " + comentario);
        });
    }

    private void configurarMouseListener() {
        enviarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                enviarButton.setText("Clique para Enviar");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                enviarButton.setText("Enviar");
            }
        });
    }

    private void finalizarConfiguracao() {
        frame.add(panel);
        frame.setVisible(true);
    }
}

