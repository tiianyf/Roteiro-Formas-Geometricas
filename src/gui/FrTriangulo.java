/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classes.Ponto;
import classes.Triangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author cristiane
 */
public class FrTriangulo extends javax.swing.JFrame {

    public FrTriangulo() {
        initComponents();
        this.habilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnArea = new javax.swing.JButton();
        btnTipo = new javax.swing.JButton();
        btnDistancia = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        lblEntrada = new javax.swing.JLabel();
        lblPontoA = new javax.swing.JLabel();
        edtAX = new javax.swing.JTextField();
        edtAY = new javax.swing.JTextField();
        lblPontoB = new javax.swing.JLabel();
        edtBX = new javax.swing.JTextField();
        edtBY = new javax.swing.JTextField();
        lblPontoC = new javax.swing.JLabel();
        edtCX = new javax.swing.JTextField();
        edtCY = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CÁLCULO DE TRIÂNGULOS");

        btnArea.setBackground(java.awt.SystemColor.controlHighlight);
        btnArea.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        btnArea.setText("Área");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnTipo.setBackground(java.awt.SystemColor.controlHighlight);
        btnTipo.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        btnTipo.setText("Tipo de Triângulo");
        btnTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoActionPerformed(evt);
            }
        });

        btnDistancia.setBackground(java.awt.SystemColor.controlHighlight);
        btnDistancia.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        btnDistancia.setText("Distância");
        btnDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistanciaActionPerformed(evt);
            }
        });

        btnPerimetro.setBackground(java.awt.SystemColor.controlHighlight);
        btnPerimetro.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        btnPerimetro.setText("Perímetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        lblEntrada.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        lblEntrada.setText("Insira as coordenadas:");

        lblPontoA.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblPontoA.setText("Ponto A");

        edtAX.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        edtAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAXActionPerformed(evt);
            }
        });

        edtAY.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        edtAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAYActionPerformed(evt);
            }
        });

        lblPontoB.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblPontoB.setText("Ponto B");

        edtBX.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N
        edtBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtBXActionPerformed(evt);
            }
        });

        edtBY.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N

        lblPontoC.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblPontoC.setText("Ponto C");

        edtCX.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N

        edtCY.setFont(new java.awt.Font("Roboto Condensed", 0, 16)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(255, 102, 102));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        edtInfo.setEditable(false);
        edtInfo.setColumns(20);
        edtInfo.setRows(5);
        jScrollPane1.setViewportView(edtInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPontoA)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtAX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtAY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPontoB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtBX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtBY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtCX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtCY, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPontoC)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEntrada)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnArea)
                            .addGap(18, 18, 18)
                            .addComponent(btnTipo)
                            .addGap(18, 18, 18)
                            .addComponent(btnDistancia)
                            .addGap(18, 18, 18)
                            .addComponent(btnPerimetro))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArea)
                    .addComponent(btnTipo)
                    .addComponent(btnDistancia)
                    .addComponent(btnPerimetro))
                .addGap(18, 18, 18)
                .addComponent(lblEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPontoC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edtCX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtCY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPontoB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edtBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtBY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPontoA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistanciaActionPerformed
        
        this.habilitarCampos(true);
        this.edtAX.requestFocus();
        this.botaoAcionado = 3;
    }//GEN-LAST:event_btnDistanciaActionPerformed

    private void edtBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtBXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtBXActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        this.habilitarCampos(true);
        this.edtAX.requestFocus();
        this.botaoAcionado = 1;
        
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoActionPerformed
        this.habilitarCampos(true);
        this.edtAX.requestFocus();
        this.botaoAcionado = 2;
    }//GEN-LAST:event_btnTipoActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        this.habilitarCampos(true);
        this.edtAX.requestFocus();
        this.botaoAcionado = 4;
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void edtAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAXActionPerformed
    }//GEN-LAST:event_edtAXActionPerformed

    private void edtAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAYActionPerformed
       
    }//GEN-LAST:event_edtAYActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        if (this.verificaCampoVazio()) {

            this.copiaGuiParaClasse();
            String resultado = "";

            if (this.botaoAcionado == 1) {
                if (this.t.calculoDeterminante(a, b, c) == 0) {

                    resultado = "\nNão é possível calcular a área,\n"
                            + "pois os pontos são colineares!";
                    this.edtInfo.setText(resultado);

                } else {

                    resultado = "\nA área do triângulo é: ";
                    resultado = resultado + this.t.calculoArea(this.a, this.b, this.c);
                    this.edtInfo.setText(resultado);
                }
            } else if (this.botaoAcionado == 2) {

                this.edtInfo.setText(this.t.tipoDeTriangulo(this.a, this.b, this.c));
            } else if (this.botaoAcionado == 3) {

                resultado = "\nA distância entre os pontos A e B é: " + this.a.calculoDistancia(this.a, this.b)
                        + "\nA distância entre os pontos B e C é: " + this.a.calculoDistancia(this.b, this.c)
                        + "\nA distância entre os pontos C e A é: " + this.a.calculoDistancia(this.c, this.a);
                this.edtInfo.setText(resultado);
            } else if (this.botaoAcionado == 4) {

                resultado = "\nO perímetro do triângulo é: " + this.t.calculaPerimetro(this.a, this.b, this.c);
                this.edtInfo.setText(resultado);
            }
        }
        else{
        
            JOptionPane.showMessageDialog(this, "ERRO! Campo vazio.");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnDistancia;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JButton btnTipo;
    private javax.swing.JTextField edtAX;
    private javax.swing.JTextField edtAY;
    private javax.swing.JTextField edtBX;
    private javax.swing.JTextField edtBY;
    private javax.swing.JTextField edtCX;
    private javax.swing.JTextField edtCY;
    private javax.swing.JTextArea edtInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblPontoA;
    private javax.swing.JLabel lblPontoB;
    private javax.swing.JLabel lblPontoC;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Habilitam ou desabilitam os campos da tela GUI.
     * @param flag = true - habilita os campos, false - desabilita
     */
    public void habilitarCampos(boolean flag){
    
        edtAX.setEnabled(flag);
        edtAY.setEnabled(flag);
        edtBX.setEnabled(flag);
        edtBY.setEnabled(flag);
        edtCX.setEnabled(flag);
        edtCY.setEnabled(flag);
        
    }
    
    /**
     * Converte vírgula em ponto.
     */
    public void converte(){
    
        this.edtAX.setText(this.edtAX.getText().replace(',' , '.'));
        this.edtAY.setText(this.edtAY.getText().replace(',', '.'));
        this.edtBX.setText(this.edtBX.getText().replace(',', '.'));
        this.edtBY.setText(this.edtBY.getText().replace(',', '.'));
        this.edtCX.setText(this.edtCX.getText().replace(',', '.'));
        this.edtCY.setText(this.edtCY.getText().replace(',', '.'));
    }
    
    /**
     * Copia os dados dos campos de texto da tela GUI, converse para double (String - Double)
     * e copia para o objeto.
     */
    public void copiaGuiParaClasse(){
        
        this.converte();
        
        this.a.setX(Double.parseDouble(this.edtAX.getText()));
        this.a.setY(Double.parseDouble(this.edtAY.getText()));
        this.b.setX(Double.parseDouble(this.edtBX.getText()));
        this.b.setY(Double.parseDouble(this.edtBY.getText()));
        this.c.setX(Double.parseDouble(this.edtCX.getText()));
        this.c.setY(Double.parseDouble(this.edtCY.getText()));

    }
    
    /**
     * Verifica se todos os campos estão preenchidos
     * @return = true caso algum campo esteja vazio
     */
    public boolean verificaCampoVazio(){
    
        return  (!this.edtAX.getText().isEmpty()
                && !this.edtAY.getText().isEmpty()
                && !this.edtBX.getText().isEmpty()
                && !this.edtBY.getText().isEmpty()
                && !this.edtCX.getText().isEmpty()
                && !this.edtCY.getText().isEmpty());
                
    }
    
    private Ponto a = new Ponto();
    private Ponto b = new Ponto();
    private Ponto c = new Ponto();
    private Triangulo t = new Triangulo();
    private byte botaoAcionado = 0;
    
}