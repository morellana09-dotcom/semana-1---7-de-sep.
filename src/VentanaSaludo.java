import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSaludo {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("App de saludo ICC490");
        ventana.setSize(700,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.getContentPane().setBackground(new Color(82,171,92));


        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(270,30,200,25);

        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270,10,200,25);
        botonSaludar.setBackground(new Color(13,97,22));

        JLabel etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50,80,200,25);

        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();
            if (nombre.isEmpty()){
                JOptionPane.showMessageDialog(null, "Porfavor ingrese su nombre");
            } else {
                etiquetaSaludo.setText("Hola, " + nombre);
            }
        });

        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e)  {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    botonSaludar.doClick();
                }
            }
        });
        ventana.add(campoTexto);
        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
