/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AtividadeDao;
import java.awt.Color;
import java.awt.Font;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import model.Atividade;

/**
 *
 * @author rb29
 */
public class AtividadeControler {

 
    public Atividade procuraAtividade(String titulo) {
        AtividadeDao dao = new AtividadeDao();
        Atividade atividade = dao.procuraAtividade(titulo);
        return atividade;
    }

    public ArrayList<Atividade> buscarAtividade() {
        AtividadeDao dao = new AtividadeDao();
        ArrayList<Atividade> vetorDeAtividades = dao.buscaAtividade();
        return vetorDeAtividades;
    }

    public void CadastrarAtividade(String titulo, String descricao, String pergunta, String opcao1, String opcao2, String opcao3, String opcao4, String resposta) {
        AtividadeDao dao = new AtividadeDao();
        Atividade user = new Atividade(titulo, descricao, pergunta, opcao1, opcao2, opcao3, opcao4, resposta);
        dao.insereAtividade(user);
         UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        UIManager.put ("OptionPane.background", new Color(0,151,204));
        JOptionPane.showMessageDialog(null, "Cadastro Feito com sucesso!!");
    }

    public void AlterarAtividade(int id, String titulo, String descricao, String pergunta, String opcao1, String opcao2, String opcao3, String opcao4, String resposta) {
        AtividadeDao dao = new AtividadeDao();
        Atividade user = new Atividade(id, titulo, descricao, pergunta, opcao1, opcao2, opcao3, opcao4, resposta);
        dao.alteraAtividade(user);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        UIManager.put ("OptionPane.background", new Color(0,151,204));
        JOptionPane.showMessageDialog(null, "Alteração Feito com sucesso!!");
    }

    public void ExcluirAtividade(Integer id) {
        AtividadeDao dao = new AtividadeDao();
        Atividade user = new Atividade(id);
        dao.ExcluirAtividade(user);
         UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        UIManager.put ("OptionPane.background", new Color(0,151,204));
        JOptionPane.showMessageDialog(null, "Exclusão Feita com sucesso!!");
    }

}
