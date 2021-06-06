/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsCRUD;

import controle.AtividadeControler;
import dao.AtividadeDao;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Atividade;

/**
 *
 * @author rb29
 */
public class EditarAtividade extends javax.swing.JInternalFrame {

    DefaultComboBoxModel modelo;

    /**
     * Creates new form EditarAtividade
     */
    public EditarAtividade() {
        initComponents();
        modelo = (DefaultComboBoxModel) jComboBoxOption.getModel();
        EditarAtividade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldtitulo = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldPergunta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldOpcao1 = new javax.swing.JTextField();
        jTextFieldOpcao3 = new javax.swing.JTextField();
        jTextFieldResposta = new javax.swing.JTextField();
        jTextFieldOpcao2 = new javax.swing.JTextField();
        jTextFieldOpcao4 = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        nomepassed = new javax.swing.JTextField();
        jComboBoxOption = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Atividade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 40, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Titulo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Descrição");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 170, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Pergunta");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 210, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Resposta");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 250, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Opcão 01");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 300, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Opção 02");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(420, 300, 90, 30);

        jTextFieldtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtituloActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldtitulo);
        jTextFieldtitulo.setBounds(130, 130, 460, 30);
        jPanel1.add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(130, 170, 460, 30);
        jPanel1.add(jTextFieldPergunta);
        jTextFieldPergunta.setBounds(130, 210, 460, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Opcão 03");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 340, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Opção 04");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(420, 340, 90, 30);

        jTextFieldOpcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOpcao1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldOpcao1);
        jTextFieldOpcao1.setBounds(130, 300, 170, 30);
        jPanel1.add(jTextFieldOpcao3);
        jTextFieldOpcao3.setBounds(130, 340, 170, 30);
        jPanel1.add(jTextFieldResposta);
        jTextFieldResposta.setBounds(130, 250, 460, 30);
        jPanel1.add(jTextFieldOpcao2);
        jTextFieldOpcao2.setBounds(520, 300, 160, 30);

        jTextFieldOpcao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOpcao4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldOpcao4);
        jTextFieldOpcao4.setBounds(520, 340, 160, 30);

        jTextFieldId.setEnabled(false);
        jPanel1.add(jTextFieldId);
        jTextFieldId.setBounds(130, 90, 40, 30);

        confirmar.setBackground(new java.awt.Color(255, 255, 255));
        confirmar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmar.setText("confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(confirmar);
        confirmar.setBounds(340, 380, 140, 30);
        jPanel1.add(nomepassed);
        nomepassed.setBounds(130, 50, 370, 30);

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
        jPanel1.add(jComboBoxOption);
        jComboBoxOption.setBounds(650, 50, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Digite o Titulo da Atividade");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(224, 10, 250, 30);

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("Procura");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(520, 50, 110, 30);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 920, 545);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOptionItemStateChanged

        Atividade atividade = (Atividade) modelo.getSelectedItem();

        jTextFieldtitulo.setText(atividade.getTitulo());
        jTextFieldDescricao.setText(atividade.getDescricao());
        jTextFieldPergunta.setText(atividade.getPergunta());
        jTextFieldOpcao1.setText(atividade.getOpcao1());
        jTextFieldOpcao2.setText(atividade.getOpcao2());
        jTextFieldOpcao3.setText(atividade.getOpcao3());
        jTextFieldOpcao4.setText(atividade.getOpcao4());
        jTextFieldResposta.setText(atividade.getResposta());
        jTextFieldId.setText(atividade.getId() + "");
    }//GEN-LAST:event_jComboBoxOptionItemStateChanged

    private void jComboBoxOptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxOptionMouseReleased

    }//GEN-LAST:event_jComboBoxOptionMouseReleased

    private void jComboBoxOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOptionActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        AtividadeControler controle = new AtividadeControler();
        Atividade atividade = controle.procuraAtividade(nomepassed.getText());
        if (atividade != null) {

            jTextFieldtitulo.setText(atividade.getTitulo());
            jTextFieldDescricao.setText(atividade.getDescricao());
            jTextFieldPergunta.setText(atividade.getPergunta());
            jTextFieldOpcao1.setText(atividade.getOpcao1());
            jTextFieldOpcao2.setText(atividade.getOpcao2());
            jTextFieldOpcao3.setText(atividade.getOpcao3());
            jTextFieldOpcao4.setText(atividade.getOpcao4());
            jTextFieldResposta.setText(atividade.getResposta());
            jTextFieldId.setText(atividade.getId() + "");
        JOptionPane.showMessageDialog(null, "Atividade Confirmado!!");
      
        } else {
            JOptionPane.showMessageDialog(null, "Atividade não Confirmado!!");
        }
    }//GEN-LAST:event_searchActionPerformed
    public void EditarAtividade() {
        AtividadeControler controle = new AtividadeControler();
        ArrayList<Atividade> vetorDeAtividades = controle.buscarAtividade();
        for (Atividade u : vetorDeAtividades) {
            modelo.addElement(u);
        }
    }
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        AtividadeControler controle = new AtividadeControler();
        int idUser = Integer.parseInt(jTextFieldId.getText());

        String TituloUser = ((Atividade) modelo.getSelectedItem()).getTitulo();
        controle.AlterarAtividade(idUser, jTextFieldtitulo.getText(), jTextFieldDescricao.getText(), jTextFieldPergunta.getText(), jTextFieldOpcao1.getText(), jTextFieldOpcao2.getText(), jTextFieldOpcao3.getText(), jTextFieldOpcao4.getText(), jTextFieldResposta.getText());


    }//GEN-LAST:event_confirmarActionPerformed

    private void jTextFieldOpcao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOpcao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOpcao4ActionPerformed

    private void jTextFieldOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOpcao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOpcao1ActionPerformed

    private void jTextFieldtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldOpcao1;
    private javax.swing.JTextField jTextFieldOpcao2;
    private javax.swing.JTextField jTextFieldOpcao3;
    private javax.swing.JTextField jTextFieldOpcao4;
    private javax.swing.JTextField jTextFieldPergunta;
    private javax.swing.JTextField jTextFieldResposta;
    private javax.swing.JTextField jTextFieldtitulo;
    private javax.swing.JTextField nomepassed;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}