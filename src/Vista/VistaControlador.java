package Vista;

import Controlador.Principal;
import java.awt.Color;
import java.util.Locale;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VistaControlador extends javax.swing.JFrame {
    
    //motor de javaScript
    ScriptEngineManager sen = new ScriptEngineManager();
    //instancia para que coga le motor de javascript
    ScriptEngine se = sen.getEngineByName("JavaScript");
    
    
    
    
    public VistaControlador() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }   
    //////////operaciones
    public void addNumber(String digito){
        //permitir ver lo que ya obtenemos y lo que ponemos primero get y luego "digito"
        txtOperacion.setText(txtOperacion.getText()+digito);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btnIcono = new javax.swing.JButton();
        jLabel1Azul = new javax.swing.JLabel();
        jLabel2Naranja = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btnBorradoDigito = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btbCero = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 320, 22));

        txtResultado.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 320, 32));

        btnIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/btn_modulo (3).png"))); // NOI18N
        btnIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIconoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 50, 20));

        jLabel1Azul.setFont(new java.awt.Font("Century", 0, 90)); // NOI18N
        jLabel1Azul.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1Azul.setText(".");
        jLabel1Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1AzulMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1Azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -70, 30, 90));

        jLabel2Naranja.setFont(new java.awt.Font("Century", 0, 90)); // NOI18N
        jLabel2Naranja.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2Naranja.setText(".");
        jLabel2Naranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2NaranjaMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2Naranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 30, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUno.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnUno.setText("1");
        btnUno.setFocusPainted(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btnPorcentaje.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setFocusPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_C.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1.png"))); // NOI18N
        btn_C.setText("C");
        btn_C.setFocusPainted(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        jPanel2.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btnBorradoDigito.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnBorradoDigito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1.png"))); // NOI18N
        btnBorradoDigito.setText("CE");
        btnBorradoDigito.setFocusPainted(false);
        btnBorradoDigito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorradoDigito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnBorradoDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorradoDigitoActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorradoDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnDivision.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btnMulti.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1.png"))); // NOI18N
        btnMulti.setText("X");
        btnMulti.setFocusPainted(false);
        btnMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        jPanel2.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btnNueve.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnNueve.setText("9");
        btnNueve.setFocusPainted(false);
        btnNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btnSiete.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnSiete.setText("7");
        btnSiete.setFocusPainted(false);
        btnSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btnOcho.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnOcho.setText("8");
        btnOcho.setFocusPainted(false);
        btnOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel2.add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btnResta.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btnSeis.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnSeis.setText("6");
        btnSeis.setFocusPainted(false);
        btnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btnCinco.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnCinco.setText("5");
        btnCinco.setFocusPainted(false);
        btnCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btnCuatro.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setFocusPainted(false);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btnSuma.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btnTres.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnTres.setText("3");
        btnTres.setFocusPainted(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        btnIgual.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton3Resultado.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 50, 50));

        btnDos.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnDos.setText("2");
        btnDos.setFocusPainted(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btbCero.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btbCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btbCero.setText("0");
        btbCero.setFocusPainted(false);
        btbCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btbCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btbCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btbCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 50));

        btnPunto.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton2.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/boton1_presionado.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 320, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        addNumber("1");
        btnIgual.doClick();
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");


    }//GEN-LAST:event_btn_CActionPerformed

    private void btnBorradoDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorradoDigitoActionPerformed
        //lo que dice le substring para cortar String: que empieza desde 0 y que corte la longitud menos 1
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btnIgual.doClick();
        
                
        



        //ejemplos corta casi lo iniciales
        //System.out.println(txtOperacion.getText().substring(2));
        //System.out.println(txtOperacion.getText().substring(3));
    }//GEN-LAST:event_btnBorradoDigitoActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        addNumber("/");

    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        addNumber("9");
        btnIgual.doClick();
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        addNumber("7");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        addNumber("8");
        btnIgual.doClick();
    }//GEN-LAST:event_btnOchoActionPerformed
    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        addNumber("6");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        addNumber("5");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        addNumber("4");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        addNumber("3");
        btnIgual.doClick();
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
       //evaluamos operacion con el motor de javascript
        try {
            
       String resultado = se.eval(txtOperacion.getText()).toString();
            System.out.println("cuanto esta: "+txtOperacion.getText());
       txtResultado.setText(resultado);
       
       
        } catch (Exception e) {
            //aqui se evalua que no este los numero asi: 5*+5 que es algo ilogico y que muestre con logica los operadores
            //btnIgual.doClick();
            //txtOperacion.setText("Error crucial");
            
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        addNumber("2");
        btnIgual.doClick();
    }//GEN-LAST:event_btnDosActionPerformed

    private void btbCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCeroActionPerformed
        addNumber("0");
        btnIgual.doClick();
    }//GEN-LAST:event_btbCeroActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        addNumber(".");
        //el metodo doClick() sirve para borrar la que esta en pantalla despues de la operacion realizada
        //sole se implementa en lo numeros no en lo operadores
        btnIgual.doClick();
    }//GEN-LAST:event_btnPuntoActionPerformed

    boolean modoOscuro = false;
    
    private void btnIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIconoActionPerformed
        if (!modoOscuro){
            
        jPanel1.setBackground(Color.decode("#212b42"));
jPanel2.setBackground(Color.decode("#2e3851"));
//cambiar el display
txtResultado.setForeground(Color.decode("#0db387"));
txtOperacion.setForeground(Color.decode("#0db387"));

        cambiarColorBtnDark1(btbCero);
        cambiarColorBtnDark1(btnUno);
        cambiarColorBtnDark1(btnDos);
        cambiarColorBtnDark1(btnTres);
        cambiarColorBtnDark1(btnCuatro);
        cambiarColorBtnDark1(btnCinco);
        cambiarColorBtnDark1(btnSeis);
        cambiarColorBtnDark1(btnSiete);
        cambiarColorBtnDark1(btnOcho);
        cambiarColorBtnDark1(btnNueve);
        cambiarColorBtnDark1(btnPunto);
        cambiarColorBtnDark2(btnSuma);
        cambiarColorBtnDark2(btnResta);
        cambiarColorBtnDark2(btnMulti);
        cambiarColorBtnDark2(btnDivision);
        cambiarColorBtnDark2(btnPorcentaje);
        cambiarColorBtnDark2(btnBorradoDigito);
        cambiarColorBtnDark2(btn_C);
        //jPanel1.set(Color.red);
    
    btnIcono.setIcon(new ImageIcon(getClass().getResource("/recursos/btn_modulo (1).png")));
    btnIgual.setIcon(new ImageIcon(getClass().getResource("/recursos/btnIgual_dark.png")));
    btnIgual.setPressedIcon(new ImageIcon(getClass().getResource("/recursos/btnIgual_dark.png")));
    btnIgual.setRolloverIcon(new ImageIcon(getClass().getResource("/recursos/btnIgual_dark (4).png")));
    btnIgual.setForeground(Color.decode("#2e3851"));
    
    modoOscuro = true;
        }else{
           VistaControlador p = new VistaControlador();
           this.dispose();
           p.setVisible(true);
        }    
    
    }//GEN-LAST:event_btnIconoActionPerformed

    private void jLabel2NaranjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2NaranjaMouseClicked
       this.dispose();
    }//GEN-LAST:event_jLabel2NaranjaMouseClicked

    private void jLabel1AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1AzulMouseClicked
       //para minimizar
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel1AzulMouseClicked

    
    //cambiar botones
    public void cambiarColorBtnDark1(JButton btn){
    //boton por defecto
    btn.setIcon(new ImageIcon(getClass().getResource("/recursos/2botonNumeros.png")));
    //presionado
    btn.setPressedIcon(new ImageIcon(getClass().getResource("/recursos/2botonNumeros.png")));
    //rollover al pasar por el mouse
    btn.setRolloverIcon(new ImageIcon(getClass().getResource("/recursos/2btn_pressed.png")));
    //letra
    btn.setForeground(Color.decode("#96a8a0"));
    }
    public void cambiarColorBtnDark2(JButton btn){
    //boton por defecto
    btn.setIcon(new ImageIcon(getClass().getResource("/recursos/2botonOperadores.png")));
    //presionado
    btn.setPressedIcon(new ImageIcon(getClass().getResource("/recursos/2botonOperadores.png")));
    //rollover 
    btn.setRolloverIcon(new ImageIcon(getClass().getResource("/recursos/2btn_pressed.png")));
    //letra
    btn.setForeground(Color.decode("#14dbae"));  
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaControlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaControlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaControlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaControlador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaControlador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCero;
    private javax.swing.JButton btnBorradoDigito;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIcono;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1Azul;
    private javax.swing.JLabel jLabel2Naranja;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
