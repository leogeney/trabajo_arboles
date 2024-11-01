
package com.mycompany.arbolbinario;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Arbol arbol = new Arbol();
    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        preOrder = new javax.swing.JButton();
        inOrder = new javax.swing.JButton();
        postOrder = new javax.swing.JButton();
        mostrar_todo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        tittle.setText("EJERCICIO 2");

        add.setBackground(new java.awt.Color(153, 255, 102));
        add.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        preOrder.setBackground(new java.awt.Color(51, 255, 204));
        preOrder.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        preOrder.setText("Preorden");
        preOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preOrderActionPerformed(evt);
            }
        });

        inOrder.setBackground(new java.awt.Color(255, 102, 102));
        inOrder.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        inOrder.setText("Inorden");
        inOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inOrderActionPerformed(evt);
            }
        });

        postOrder.setBackground(new java.awt.Color(0, 0, 204));
        postOrder.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        postOrder.setForeground(new java.awt.Color(255, 255, 255));
        postOrder.setText("Postorden");
        postOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postOrderActionPerformed(evt);
            }
        });

        mostrar_todo.setBackground(new java.awt.Color(0, 0, 255));
        mostrar_todo.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        mostrar_todo.setForeground(new java.awt.Color(255, 255, 255));
        mostrar_todo.setText("mostrar todo");
        mostrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_todoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postOrder)
                    .addComponent(preOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mostrar_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(postOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(preOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mostrar_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        arbol.insertar();
    }//GEN-LAST:event_addActionPerformed

    private void preOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preOrderActionPerformed
        String resultado = arbol.dispararPreorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_preOrderActionPerformed

    private void inOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inOrderActionPerformed
        String resultado = arbol.dispararInorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_inOrderActionPerformed

    private void postOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postOrderActionPerformed
        String resultado = arbol.dispararPostorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_postOrderActionPerformed

    private void mostrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_todoActionPerformed
       arbol.mostrarArbol();
    }//GEN-LAST:event_mostrar_todoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton inOrder;
    private javax.swing.JButton mostrar_todo;
    private javax.swing.JButton postOrder;
    private javax.swing.JButton preOrder;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
