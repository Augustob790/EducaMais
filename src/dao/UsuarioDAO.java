/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import model.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void insereUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios(nome,tipo,telefone,senha) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());

            stmt.setString(2, usuario.getTipo());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getSenha());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void alteraUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios set nome=?,tipo=?,telefone=?,senha=? " + "where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());

            stmt.setString(2, usuario.getTipo());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, usuario.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void ExcluirUsuario(Usuario usuario) {
        String sql = "Delete FROM  usuarios where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, usuario.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public Usuario procuraUsuario(Integer id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        Usuario usuario = null;

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"), rs.getString("telefone"), rs.getString("senha"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    public Usuario procuraUsuario(String nome) {
        String sql = "SELECT * FROM usuarios WHERE nome = ?";
        Usuario usuario = null;

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"), rs.getString("telefone"), rs.getString("senha"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    public ArrayList<Usuario> buscaUsuario() {
        String sql = "SELECT * FROM usuarios";
        Usuario usuario = null;
        ArrayList<Usuario> vetorDeUsuario = new ArrayList<Usuario>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"), rs.getString("telefone"), rs.getString("senha"));
                vetorDeUsuario.add(usuario);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vetorDeUsuario;
    }

    public Usuario verificaUsuario(Usuario u) {
        String sql = "SELECT * FROM usuarios WHERE tipo = ? and senha = ?";
        Usuario usuario = null;

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, u.getTipo());
            stmt.setString(2, u.getSenha());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"), rs.getString("telefone"), rs.getString("senha"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }
}