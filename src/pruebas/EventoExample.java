package pruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.IntStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class EventoExample extends JFrame{

    private Object campo1;
    
    
    public EventoExample(){
        JLabel pideMensaje = new JLabel("Dinos algo carajo!!!");
        pideMensaje.setBounds(35, 20, 200, 30);
        JTextField campo = new JTextField(200);
        campo.setBounds(35,60, 180, 30);
        JButton boton = new JButton("Clickeame baby");
        boton.setBounds(35, 140, 150, 30);
        JLabel muestraMensaje = new JLabel();
        muestraMensaje.setBounds(50 ,200, 250, 50);
        
        //se implementa el escuchador del boton
        /*ActionListener es un interfaz abstracta por lo que de ley hay que implementar todos los
        metodos donde solo tiene uno que es el actionPermerd
        **luego aqui se utiliza segun lo que parece una clase anidada para hacer esto
        */
        ActionListener escuchador = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ex){
                muestraMensaje.setText("Has dicho al importante: "+campo.getText());
            }
        };
                /*
                boton.addActionListener(escuchador);
                add(muestraMensaje);
                add(pideMensaje);
                add(campo);
                add(boton);
                setSize(400,400);
                setLayout(null);
                setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                setVisible(true);
                setLocationRelativeTo(null);
                */
                
                
                
                //creano un boton auto programado
                JLabel pideMensaje1 = new JLabel("Dinos algo carajo!!!");
        pideMensaje1.setBounds(35, 20, 200, 30);
        JTextField campo1 = new JTextField(200);
        campo1.setBounds(35,60, 180, 30);
        JButton boton1 = new JButton("Clickeame baby");
        boton1.setBounds(35, 140, 150, 30);
        JLabel muestraMensaje1 = new JLabel();
        muestraMensaje1.setBounds(50 ,200, 250, 50);
        muestraMensaje1.setBounds(50 ,200, 250, 50);
        JLabel mensaje = new JLabel("Diana Almeida");
        mensaje.setBounds(170, 20, 200, 30);
        
      ActionListener escuchador2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                muestraMensaje1.setText("Has dicho: "+campo1.getText());
            }
        };
            
        boton1.addActionListener(escuchador2);
         add(mensaje);
         
         
                add(muestraMensaje1);
                add(pideMensaje1);
                add(campo1);
                add(boton1);
                setSize(400,400);
                setLayout(null);
                setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                setVisible(true);
                setLocationRelativeTo(null);
        
        //metodo para poner sugerencias en javafx
                
      
                
                
                
                
                
                
                
 
        
    }
    public static void main(String[] args) {
        new EventoExample();
        
    }

    
}
