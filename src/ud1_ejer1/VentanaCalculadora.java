/*
 * LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 * Lista de paquetes:
 */
package ud1_ejer1;

/**
 * Clase que implementa el ejercicio UD1-1
 * Crea un programa que permita sumar o restar dos números similar a la siguiente:
 * Configurar las acciones de los botones al ser pulsados, y el resultado debe actualizarse en un label(etiqueta) concreto.
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class VentanaCalculadora extends javax.swing.JFrame {


    //ATRIBUTOS
    /**
     * Primer operando de la operacion
     */
    double operando1;
    
    /**
     * Segundo operando de la operacion
     */
    double operando2;
    
    
    /**
     * Constructor
     */
    public VentanaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputOperador1 = new javax.swing.JTextField();
        inputOperador2 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        lbResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        inputOperador1.setText("0");

        inputOperador2.setText("0");

        btnSumar.setText("SUMAR");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setText("RESTAR");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        lbResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRestar)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(inputOperador1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputOperador2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputOperador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputOperador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestar)
                    .addComponent(btnSumar))
                .addGap(18, 18, 18)
                .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Accion ejecutada al pulsar el boton restar
     * @param evt  Evento recibido
     */
    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        //si se recogen los datos bien hacemos la operacion
        if (this.recogerDatos()){
        this.mostrarResultado(this.operando1-this.operando2);
        }else{
            //Si NO se recogen bien mostramos mensaje de error
            this.mostrarError();
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    /**
     * Accion ejecutada al pulsar el boton sumar
     * @param evt Evento recibido
     */
    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        //si los datos se recogen bien hacemos la operacion
        if (this.recogerDatos()){
        this.mostrarResultado(this.operando1+this.operando2);
        }else{
            //Si NO se recogen bien mostramos mensaje de error
            this.mostrarError();
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    
    /**
     * Muestra un resultado
     * @param resultado El resultado a mostrar
     */
    private void mostrarResultado(Double resultado){
        this.lbResultado.setText("El resultado de la operación es: "+resultado.toString());
    }
    
    /**
     * Recoge los datos introducidos en los campos
     * 
     * @return  true si los ha recogido correctamente, false si ha habido algun error
     */
    private boolean recogerDatos(){
        try{
            this.operando1 = Double.parseDouble(this.inputOperador1.getText());
            this.operando2 = Double.parseDouble(this.inputOperador2.getText());
            return true;
        }catch(NullPointerException|NumberFormatException e){
            return false;
        }
    }
    
    /**
     * Muestra el mensaje de error
     */
    private void mostrarError() {
        this.lbResultado.setText("Los operandos no son válidos");
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaCalculadora vc=new VentanaCalculadora();
                vc.setLocationRelativeTo(null);
                vc.setVisible(true);
            }
        });
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JTextField inputOperador1;
    private javax.swing.JTextField inputOperador2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbResultado;
    // End of variables declaration//GEN-END:variables

}// fin Ejer1VentanaCalculadora
