/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Tooltip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * FXML Controller class
 *
 * @author aguil
 */
public class FXMLDocumentControllerController implements Initializable {






    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
          JLabel pideMensaje = new JLabel("Dinos algo carajo!!!");
        pideMensaje.setBounds(35, 20, 200, 30);
        JTextField campo = new JTextField(200);
        campo.setBounds(35,60, 180, 30);
        JButton boton = new JButton("Clickeame baby");
        boton.setBounds(35, 140, 150, 30);
        JLabel muestraMensaje = new JLabel();
        muestraMensaje.setBounds(50 ,200, 250, 50);
        ActionListener escuchador = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ex){
                muestraMensaje.setText("Has dicho al importante: "+campo.getText());
            }
        };
                
                boton.addActionListener(escuchador);
                add(muestraMensaje);
                add(pideMensaje);
                add(campo);
                add(boton);
                setSize(400,400);
                setLayout(null);
                //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                setVisible(true);
                setLocationRelativeTo(null);
                
        
        
        Tooltip tooltipPassword = new Tooltip();
            
            tooltipPassword.setText("Esta es un campo de texto");
            
            //campo1(tooltipPassword);
            
            Tooltip tpboton = new Tooltip();
            tpboton.setText("Este es un Boton");
            
            //boton.setToolTipText(text);
        
        
        
    }    

    private void add(JLabel muestraMensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JTextField campo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JButton boton) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
