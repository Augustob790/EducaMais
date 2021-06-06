/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.UsuarioDAO;
import views.TelaPrincipalProf;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Usuario;

/**
 *
 * @author aluno
 */
public class UsuarioController {

    public Usuario procuraUsuario(String nome) {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.procuraUsuario(nome);
        return usuario;
    }

    public ArrayList<Usuario> buscarUsuario() {
        UsuarioDAO dao = new UsuarioDAO();
        ArrayList<Usuario> vetorDeUsuarios = dao.buscaUsuario();
        return vetorDeUsuarios;
    }

    public void CadastrarUsuario(String nome, String tipo, String telefone, String senha) {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario user = new Usuario(nome, tipo, telefone, senha);
        dao.insereUsuario(user);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        UIManager.put ("OptionPane.background", new Color(0,151,204));
        JOptionPane.showMessageDialog(null, "Cadastro Feito com sucesso!!");
    }

    public void AlterarUsuario(int id, String nome, String tipo, String telefone, String senha) {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario user = new Usuario(id, nome, tipo, telefone, senha);
        dao.alteraUsuario(user);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        UIManager.put ("OptionPane.background", new Color(0,151,204));
        JOptionPane.showMessageDialog(null, "Alteração Feito com sucesso!!");
    }

    public void ExcluirUsuario(Integer id) {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario user = new Usuario(id);
        dao.ExcluirUsuario(user);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        UIManager.put ("OptionPane.background", new Color(0,151,204));
        JOptionPane.showMessageDialog(null, "Exclusão Feita com sucesso!!");
    }

}
