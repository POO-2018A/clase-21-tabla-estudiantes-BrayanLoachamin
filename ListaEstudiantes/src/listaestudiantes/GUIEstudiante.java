package listaestudiantes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUIEstudiante extends javax.swing.JFrame {
    //Arreglo Dinámico
    ArrayList<Estudiante> listaEstudiantes = new ArrayList();

    /**
     * Creates new form GUIEstudiante
     */
    public GUIEstudiante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLista = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        textApellido = new javax.swing.JTextField();
        labelNota1 = new javax.swing.JLabel();
        labelNota2 = new javax.swing.JLabel();
        labelNota3 = new javax.swing.JLabel();
        textNota1 = new javax.swing.JTextField();
        textNota2 = new javax.swing.JTextField();
        textNota3 = new javax.swing.JTextField();
        buttonRegistrar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonImprimir = new javax.swing.JButton();
        buttonReiniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelLista.setText("Listado y promedio de  Estudiantes");

        labelNombre.setText("Nombre:");

        labelApellido.setText("Apellido:  ");

        labelNota1.setText("Nota 1:  ");

        labelNota2.setText("Nota 2:");

        labelNota3.setText("Nota 3:");

        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonImprimir.setText("Imprimir");
        buttonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirActionPerformed(evt);
            }
        });

        buttonReiniciar.setText("Reiniciar");
        buttonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReiniciarActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nota1");

        jLabel4.setText("Nota2");

        jLabel5.setText("Nota3");

        jLabel6.setText("Promedio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(buttonRegistrar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNota1)
                                        .addGap(27, 27, 27)
                                        .addComponent(textNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelApellido)
                                        .addComponent(labelNombre)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(labelNota2)
                                                .addGap(18, 18, 18)
                                                .addComponent(textNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                .addComponent(labelNota3)))
                                        .addGap(18, 18, 18)
                                        .addComponent(textNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(buttonCancelar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(buttonImprimir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(labelLista)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(buttonReiniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNota1)
                    .addComponent(textNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNota2)
                    .addComponent(textNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNota3)
                    .addComponent(textNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistrar)
                    .addComponent(buttonImprimir)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonReiniciar))
                .addGap(50, 50, 50)
                .addComponent(labelLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        // TODO add your handling code here:
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String nota1 = textNota1.getText();
        String nota2 = textNota2.getText();
        String nota3 = textNota3.getText();
        
        
        if(nombre.equals("") || apellido.equals("") || nota1.equals("") || nota2.equals("") || nota3.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar todos los campos!");
           
        }else{
            double nota1ToDouble = Double.parseDouble(nota1);
            double nota2ToDouble = Double.parseDouble(nota2);
            double nota3ToDouble = Double.parseDouble(nota3);
            
            double promedio = ((nota1ToDouble+ nota2ToDouble+ nota3ToDouble)/3.0);
            //String promedioToString = String.valueOf(promedio);
            
            //Ahora debo crear un objeto de tipo estudiante e ingresarlo en la lista...
            Estudiante alumno = new Estudiante(nombre, apellido, nota1ToDouble, nota2ToDouble, nota3ToDouble, promedio);
            listaEstudiantes.add(alumno);
            int mensaje = JOptionPane.PLAIN_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, nombre+" "+apellido+" ha sido registrado correctamente", "Información", mensaje);
            
            textNombre.setText("");
            textApellido.setText("");
            textNota1.setText("");
            textNota2.setText("");
            textNota3.setText("");
            
        }
        
        
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImprimirActionPerformed
        // TODO add your handling code here:
        
        for(Estudiante each: listaEstudiantes){ //Para cada estudiante de mi lista de estudiantes...
            
            textArea.setText(listaEstudiantes.toString());
        
        }
    }//GEN-LAST:event_buttonImprimirActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
            textNombre.setText("");
            textApellido.setText("");
            textNota1.setText("");
            textNota2.setText("");
            textNota3.setText("");
            textArea.setText("");
        
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReiniciarActionPerformed
        // TODO add your handling code here:
       int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
       int opcionesAdvertencia = JOptionPane.WARNING_MESSAGE; //Me saldrá con la opcion de Aceptar o canelar
     
       int eleccion = JOptionPane.showConfirmDialog(rootPane, "¿Borrar todo el registro?", "WARNING", opcionesAdvertencia, iconoAdvertencia);
       
       if(eleccion == 0){
           listaEstudiantes.clear();
           textArea.setText("");
           
       }

    }//GEN-LAST:event_buttonReiniciarActionPerformed

    

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
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonImprimir;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelLista;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNota1;
    private javax.swing.JLabel labelNota2;
    private javax.swing.JLabel labelNota3;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNota1;
    private javax.swing.JTextField textNota2;
    private javax.swing.JTextField textNota3;
    // End of variables declaration//GEN-END:variables
}
