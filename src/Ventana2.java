import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana2 extends JFrame {
    private JTextField campoTexto;
    private JButton botonSaludar;
    private JButton botonLimpiar;
    private JLabel etiquetaSaludo;
    private final Usuario usuario = new Usuario();
    private void saludar(){
        String nombre = campoTexto.getText();
        if (nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese su nombre");
            campoTexto.requestFocusInWindow();
        } else {
            etiquetaSaludo.setText("Hola, " + nombre );
        }
    }


    public Ventana2(){
        super("App de saludo ICC490");
        setSize(700,200 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(82,171,92));
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        campoTexto = new JTextField();
        campoTexto.setBounds(270,30,200,25);
        botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270,70,95,25);
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(375,70,95,25);
        etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50,80,200,25);
        add(campoTexto);
        add(botonLimpiar);
        add(botonSaludar);
        add(etiquetaSaludo);
        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e)  {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    botonSaludar.doClick();
                }
            }
        });
        botonSaludar.addActionListener((ActionEvent e) -> {
            saludar();
        });
        botonLimpiar.addActionListener(e -> {
            campoTexto.setText("");
            etiquetaSaludo.setText("");
            campoTexto.requestFocusInWindow();
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ventana2().setVisible(true));
    }
}

