package gato;

import java.awt.Color;
import javax.swing.JLabel;

public class Interfaz extends javax.swing.JFrame {

    private boolean turno = true;

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Space1 = new javax.swing.JLabel();
        Space2 = new javax.swing.JLabel();
        Space3 = new javax.swing.JLabel();
        Space4 = new javax.swing.JLabel();
        Space5 = new javax.swing.JLabel();
        Space6 = new javax.swing.JLabel();
        Space9 = new javax.swing.JLabel();
        Space8 = new javax.swing.JLabel();
        Space7 = new javax.swing.JLabel();
        btnTurno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        Space1.setBackground(new java.awt.Color(255, 255, 255));
        Space1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space1.setForeground(new java.awt.Color(0, 0, 0));
        Space1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space1.setText("O");
        Space1.setOpaque(true);
        Space1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space1MouseClicked(evt);
            }
        });

        Space2.setBackground(new java.awt.Color(255, 255, 255));
        Space2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space2.setForeground(new java.awt.Color(0, 0, 0));
        Space2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space2.setText("O");
        Space2.setOpaque(true);
        Space2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space2MouseClicked(evt);
            }
        });

        Space3.setBackground(new java.awt.Color(255, 255, 255));
        Space3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space3.setForeground(new java.awt.Color(0, 0, 0));
        Space3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space3.setText("O");
        Space3.setOpaque(true);
        Space3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Space3MouseEntered(evt);
            }
        });

        Space4.setBackground(new java.awt.Color(255, 255, 255));
        Space4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space4.setForeground(new java.awt.Color(0, 0, 0));
        Space4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space4.setText("O");
        Space4.setOpaque(true);
        Space4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space4MouseClicked(evt);
            }
        });

        Space5.setBackground(new java.awt.Color(255, 255, 255));
        Space5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space5.setForeground(new java.awt.Color(0, 0, 0));
        Space5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space5.setText("O");
        Space5.setOpaque(true);
        Space5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space5MouseClicked(evt);
            }
        });

        Space6.setBackground(new java.awt.Color(255, 255, 255));
        Space6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space6.setForeground(new java.awt.Color(0, 0, 0));
        Space6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space6.setText("O");
        Space6.setOpaque(true);
        Space6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space6MouseClicked(evt);
            }
        });

        Space9.setBackground(new java.awt.Color(255, 255, 255));
        Space9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space9.setForeground(new java.awt.Color(0, 0, 0));
        Space9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space9.setText("O");
        Space9.setOpaque(true);
        Space9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space9MouseClicked(evt);
            }
        });

        Space8.setBackground(new java.awt.Color(255, 255, 255));
        Space8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space8.setForeground(new java.awt.Color(0, 0, 0));
        Space8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space8.setText("O");
        Space8.setOpaque(true);
        Space8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space8MouseClicked(evt);
            }
        });

        Space7.setBackground(new java.awt.Color(255, 255, 255));
        Space7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        Space7.setForeground(new java.awt.Color(0, 0, 0));
        Space7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Space7.setText("O");
        Space7.setOpaque(true);
        Space7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Space7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Space1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Space2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Space3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Space7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Space4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Space5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Space6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Space8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Space9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Space1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Space2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Space3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Space4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Space5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Space6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Space7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Space8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Space9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnTurno.setText("Cambiar Turno");
        btnTurno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTurnoMouseClicked(evt);
            }
        });
        btnTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnTurno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTurno)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Space1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space1MouseClicked
        cambiarValor(Space1,Space2);
    }//GEN-LAST:event_Space1MouseClicked

    private void Space2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space2MouseClicked
        cambiarValor(Space2,Space3);
    }//GEN-LAST:event_Space2MouseClicked

    private void Space3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Space3MouseEntered

    private void Space3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space3MouseClicked
        cambiarValor(Space3,Space4);
    }//GEN-LAST:event_Space3MouseClicked

    private void Space4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space4MouseClicked
        cambiarValor(Space4,Space5);
    }//GEN-LAST:event_Space4MouseClicked

    private void Space5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space5MouseClicked
        cambiarValor(Space5,Space6);
    }//GEN-LAST:event_Space5MouseClicked

    private void Space6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space6MouseClicked
        cambiarValor(Space6,Space7);
    }//GEN-LAST:event_Space6MouseClicked

    private void Space7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space7MouseClicked
        cambiarValor(Space7,Space8);
    }//GEN-LAST:event_Space7MouseClicked

    private void Space8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space8MouseClicked
        cambiarValor(Space8,Space9);
    }//GEN-LAST:event_Space8MouseClicked

    private void Space9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Space9MouseClicked
        cambiarValor(Space9,Space1);
    }//GEN-LAST:event_Space9MouseClicked

    private void btnTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTurnoActionPerformed

    private void btnTurnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTurnoMouseClicked
        turno = true;
        System.out.println(turno);
        Space1.setBackground(Color.green);
        Space2.setBackground(Color.white);
        Space3.setBackground(Color.white);
        Space4.setBackground(Color.white);
        Space5.setBackground(Color.white);
        Space6.setBackground(Color.white);
        Space7.setBackground(Color.white);
        Space8.setBackground(Color.white);
        Space9.setBackground(Color.white);
    }//GEN-LAST:event_btnTurnoMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Space1;
    private javax.swing.JLabel Space2;
    private javax.swing.JLabel Space3;
    private javax.swing.JLabel Space4;
    private javax.swing.JLabel Space5;
    private javax.swing.JLabel Space6;
    private javax.swing.JLabel Space7;
    private javax.swing.JLabel Space8;
    private javax.swing.JLabel Space9;
    private javax.swing.JButton btnTurno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public void cambiarValor(JLabel lbl1, JLabel lbl2) {

        if (/*turno && */(lbl1.getBackground() == Color.green)){
            if (lbl1.getText().equals("O")) {
                lbl1.setText("X");
            } else if (lbl1.getText().equals("X")) {
                lbl1.setText("O");
            }
            //turno = false;

            lbl1.setBackground(Color.white);
            lbl2.setBackground(Color.green);
        }
        System.out.println(">O");
    }

}
