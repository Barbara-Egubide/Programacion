/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Excepciones.*;
import ejercicio1.Ejercicio1;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class VLogIn extends javax.swing.JFrame {

   private String numerosCLave="";
    
    public VLogIn() {
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

        jLabel1 = new javax.swing.JLabel();
        tfNif = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bBoton1 = new javax.swing.JButton();
        bBoton2 = new javax.swing.JButton();
        bBoton3 = new javax.swing.JButton();
        bBoton4 = new javax.swing.JButton();
        bBoton5 = new javax.swing.JButton();
        bBoton6 = new javax.swing.JButton();
        bBoton7 = new javax.swing.JButton();
        bBoton8 = new javax.swing.JButton();
        bBoton9 = new javax.swing.JButton();
        bBoton10 = new javax.swing.JButton();
        bEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pfClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NIF");

        tfNif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNifActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Clave");

        bBoton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton1ActionPerformed(evt);
            }
        });

        bBoton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton2ActionPerformed(evt);
            }
        });

        bBoton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton3ActionPerformed(evt);
            }
        });

        bBoton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton4ActionPerformed(evt);
            }
        });

        bBoton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton5ActionPerformed(evt);
            }
        });

        bBoton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton6ActionPerformed(evt);
            }
        });

        bBoton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton7ActionPerformed(evt);
            }
        });

        bBoton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton8ActionPerformed(evt);
            }
        });

        bBoton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton9ActionPerformed(evt);
            }
        });

        bBoton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBoton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoton10ActionPerformed(evt);
            }
        });

        bEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sin puntos, guiones o blancos");

        pfClave.setEditable(false);
        pfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bBoton6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(bBoton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bBoton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(bBoton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bBoton3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(bBoton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bBoton4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(bBoton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bBoton10, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(bBoton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(tfNif)
                            .addComponent(pfClave))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNif)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bBoton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bBoton2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                    .addComponent(bBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBoton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBoton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBoton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBoton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBoton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBoton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBoton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void  numeros(){
        
    }
    private void bBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton1ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton1.getText());
        numerosCLave+=bBoton1.getText();
    }//GEN-LAST:event_bBoton1ActionPerformed

    private void bBoton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton4ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton4.getText());
        numerosCLave+=bBoton4.getText();
    }//GEN-LAST:event_bBoton4ActionPerformed

    private void bBoton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton5ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton5.getText());
        numerosCLave+=bBoton5.getText();
    }//GEN-LAST:event_bBoton5ActionPerformed

    private void bBoton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton8ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton8.getText());
        numerosCLave+=bBoton8.getText();
    }//GEN-LAST:event_bBoton8ActionPerformed

    private void bBoton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton9ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton9.getText());
        numerosCLave+=bBoton9.getText();
    }//GEN-LAST:event_bBoton9ActionPerformed

    private void bBoton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton10ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton10.getText());
        numerosCLave+=bBoton10.getText();
    }//GEN-LAST:event_bBoton10ActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        try{
            Pattern p= Pattern.compile("^[0-9]{8}[A-Z]{1}$");
            Matcher m=p.matcher(tfNif.getText());
                if(!m.matches())
                    throw new DatoNoValido("Nif o contraseña incorrecta");
                if(pfClave.getText().isEmpty())
                    throw new DatoNoValido("Nif o contraseña incorrecta");
                if(!Ejercicio1.validar(tfNif.getText(),numerosCLave))
                    throw new DatoNoValido("Nif o contraseña incorrecta");
                
            Ejercicio1.operaciones();
        }
        catch(DatoNoValido e){
            JOptionPane.showMessageDialog(this, e.getMensage());
            tfNif.setEnabled(true);
            tfNif.requestFocus();

        }
        
    }//GEN-LAST:event_bEntrarActionPerformed

    private void bBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton2ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton2.getText());
        numerosCLave+=bBoton2.getText();
    }//GEN-LAST:event_bBoton2ActionPerformed

    private void bBoton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton3ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton3.getText());
        numerosCLave+=bBoton3.getText();
    }//GEN-LAST:event_bBoton3ActionPerformed

    private void bBoton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton6ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton6.getText());
        numerosCLave+=bBoton6.getText();
    }//GEN-LAST:event_bBoton6ActionPerformed

    private void bBoton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBoton7ActionPerformed
        pfClave.setText(pfClave.getText()+bBoton7.getText());
        numerosCLave+=bBoton7.getText();
    }//GEN-LAST:event_bBoton7ActionPerformed

    private void tfNifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNifActionPerformed
        validarNif();        
               
        ArrayList<Integer> numerosAleatorios=new ArrayList();
        for(int x=0;x<10;x++){
            int numero = (int) (Math.random()*10);
            if(!numerosAleatorios.contains(numero))
                numerosAleatorios.add(numero);
            else
                x=x-1;
        }        
        bBoton1.setText(""+numerosAleatorios.get(0));
        bBoton2.setText(""+numerosAleatorios.get(1));
        bBoton3.setText(""+numerosAleatorios.get(2));
        bBoton4.setText(""+numerosAleatorios.get(3));
        bBoton5.setText(""+numerosAleatorios.get(4));
        bBoton6.setText(""+numerosAleatorios.get(5));
        bBoton7.setText(""+numerosAleatorios.get(6));
        bBoton8.setText(""+numerosAleatorios.get(7));
        bBoton9.setText(""+numerosAleatorios.get(8));
        bBoton10.setText(""+numerosAleatorios.get(9));
    }//GEN-LAST:event_tfNifActionPerformed

    private void pfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfClaveActionPerformed
      
    }//GEN-LAST:event_pfClaveActionPerformed

    private void validarNif(){

        try{
            if(tfNif.getText().isEmpty())
                throw new DatoNoValido("El Nif es obligatorio");

            tfNif.setEnabled(false);           

        }
        catch(DatoNoValido e){
            JOptionPane.showMessageDialog(this, e.getMensage());
            tfNif.requestFocus();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            tfNif.requestFocus();
        }

        
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
            java.util.logging.Logger.getLogger(VLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBoton1;
    private javax.swing.JButton bBoton10;
    private javax.swing.JButton bBoton2;
    private javax.swing.JButton bBoton3;
    private javax.swing.JButton bBoton4;
    private javax.swing.JButton bBoton5;
    private javax.swing.JButton bBoton6;
    private javax.swing.JButton bBoton7;
    private javax.swing.JButton bBoton8;
    private javax.swing.JButton bBoton9;
    private javax.swing.JButton bEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pfClave;
    private javax.swing.JTextField tfNif;
    // End of variables declaration//GEN-END:variables
}
