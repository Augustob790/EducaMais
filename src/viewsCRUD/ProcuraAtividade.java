/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsCRUD;

import controle.AtividadeControler;
import dao.AtividadeDao;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import model.Atividade;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author rb29
 */
public class ProcuraAtividade extends javax.swing.JInternalFrame {

    DefaultComboBoxModel modelo;

    /**
     * Creates new form ProcuraAtividade
     */
    public ProcuraAtividade() {
        initComponents();
        
        modelo = (DefaultComboBoxModel) jComboBoxOption.getModel();
        buscarAtividade();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldResposta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldPergunta = new javax.swing.JTextField();
        jTextFieldDescriçao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldOpcao1 = new javax.swing.JTextField();
        jTextFieldOpcao2 = new javax.swing.JTextField();
        jTextFieldOpcao3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldOpcao4 = new javax.swing.JTextField();
        jComboBoxOption = new javax.swing.JComboBox<>();
        nomepassed = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procurar Atividade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procurar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldResposta.setEditable(false);
        jTextFieldResposta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldResposta.setEnabled(false);
        jTextFieldResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespostaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Resposta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 267, 90, 30));

        jTextFieldId.setEditable(false);
        jTextFieldId.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setEnabled(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 30));

        jTextFieldPergunta.setEditable(false);
        jTextFieldPergunta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPergunta.setEnabled(false);
        jTextFieldPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPerguntaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 250, 30));

        jTextFieldDescriçao.setEditable(false);
        jTextFieldDescriçao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDescriçao.setEnabled(false);
        jTextFieldDescriçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriçaoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDescriçao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Titulo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Descrição");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Pergunta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 30));

        jTextFieldTitulo.setEditable(false);
        jTextFieldTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTitulo.setEnabled(false);
        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Opção01");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Opção02");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Opção03");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 80, 30));

        jTextFieldOpcao1.setEnabled(false);
        jPanel1.add(jTextFieldOpcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 240, 30));

        jTextFieldOpcao2.setEnabled(false);
        jPanel1.add(jTextFieldOpcao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 240, 30));

        jTextFieldOpcao3.setEnabled(false);
        jPanel1.add(jTextFieldOpcao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 240, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Opção04");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 80, 30));

        jTextFieldOpcao4.setEnabled(false);
        jTextFieldOpcao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOpcao4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldOpcao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 240, 30));

        jComboBoxOption.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOptionItemStateChanged(evt);
            }
        });
        jComboBoxOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxOptionMouseReleased(evt);
            }
        });
        jComboBoxOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOptionActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 160, 32));

        nomepassed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomepassedActionPerformed(evt);
            }
        });
        jPanel1.add(nomepassed, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 350, 30));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("procurar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Digite o Titulo da Atividade");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 856, 504);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        AtividadeControler controle = new AtividadeControler();
        Atividade atividade = controle.procuraAtividade(nomepassed.getText());
        if (atividade != null) {

            jTextFieldTitulo.setText(atividade.getTitulo());
            jTextFieldDescriçao.setText(atividade.getDescricao());
            jTextFieldPergunta.setText(atividade.getPergunta());
            jTextFieldOpcao1.setText(atividade.getOpcao1());
            jTextFieldOpcao2.setText(atividade.getOpcao2());
            jTextFieldOpcao3.setText(atividade.getOpcao3());
            jTextFieldOpcao4.setText(atividade.getOpcao4());
            jTextFieldResposta.setText(atividade.getResposta());

            jTextFieldId.setText(atividade.getId() + "");
            JOptionPane.showMessageDialog(null, "Usuário Confirmado!!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não Confirmado!!");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jComboBoxOptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOptionItemStateChanged

        Atividade atividade = (Atividade) modelo.getSelectedItem();
        jTextFieldTitulo.setText(atividade.getTitulo());
        jTextFieldDescriçao.setText(atividade.getDescricao());
        jTextFieldPergunta.setText(atividade.getPergunta());
        jTextFieldOpcao1.setText(atividade.getOpcao1());
        jTextFieldOpcao2.setText(atividade.getOpcao2());
        jTextFieldOpcao3.setText(atividade.getOpcao3());
        jTextFieldOpcao4.setText(atividade.getOpcao4());
        jTextFieldResposta.setText(atividade.getResposta());
        jTextFieldId.setText(atividade.getId() + "");

    }//GEN-LAST:event_jComboBoxOptionItemStateChanged
    public void buscarAtividade() {
        AtividadeControler controle = new AtividadeControler();
        ArrayList<Atividade> vetorDeAtividades = controle.buscarAtividade();
        for (Atividade u : vetorDeAtividades) {
            modelo.addElement(u);
        }
    }
    private void jComboBoxOptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxOptionMouseReleased

    }//GEN-LAST:event_jComboBoxOptionMouseReleased

    private void jComboBoxOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOptionActionPerformed

    private void jTextFieldRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespostaActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPerguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPerguntaActionPerformed

    private void jTextFieldDescriçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriçaoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescriçaoActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void nomepassedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomepassedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomepassedActionPerformed

    private void jTextFieldOpcao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOpcao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOpcao4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldDescriçao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldOpcao1;
    private javax.swing.JTextField jTextFieldOpcao2;
    private javax.swing.JTextField jTextFieldOpcao3;
    private javax.swing.JTextField jTextFieldOpcao4;
    private javax.swing.JTextField jTextFieldPergunta;
    private javax.swing.JTextField jTextFieldResposta;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField nomepassed;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
