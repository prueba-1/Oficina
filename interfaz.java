
package javaapplication3;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class interfaz extends JFrame implements ActionListener{

    JLabel titulo;
    JButton aceptar, videojuego;
    JTextField numero;
    public interfaz(){
        this.setSize(300, 250);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        titulo=new JLabel("Ingrese numero de oficina");
        titulo.setBounds(50, 5, 200, 20);
        this.add(titulo);
        
        aceptar=new JButton("Aceptar");
        aceptar.setBounds(70, 90, 100, 20);
        this.add(aceptar);
        aceptar.addActionListener(this);
        
        numero= new JTextField("");
        numero.setBounds(50, 50, 150, 20);
        this.add(numero);
        
//        videojuego=new JButton("Videojuego");
//        videojuego.setBounds(150, 50, 100, 20);
//        this.add(videojuego);
//        videojuego.addActionListener(this);
      
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        interfaz i=new interfaz();
        i.setVisible(true);
        
        
    }
}

