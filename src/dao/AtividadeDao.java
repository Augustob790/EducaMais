/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;

import model.Atividade;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rb29
 */
public class AtividadeDao extends ConnectionFactory {

    private Connection connection;

    public AtividadeDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void insereAtividade(Atividade atividade) {
        String sql = "INSERT INTO atividades(titulo,descricao,pergunta, opcao1,opcao2,opcao3,opcao4,resposta) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, atividade.getTitulo());
            stmt.setString(2, atividade.getDescricao());
            stmt.setString(3, atividade.getPergunta());
            stmt.setString(4, atividade.getOpcao1());
            stmt.setString(5, atividade.getOpcao2());
            stmt.setString(6, atividade.getOpcao3());
            stmt.setString(7, atividade.getOpcao4());
            stmt.setString(8, atividade.getResposta());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void alteraAtividade(Atividade atividade) {
        String sql = "UPDATE atividades set titulo=?,descricao=?,pergunta=?,opcao1=?,opcao2=?,opcao3=?,opcao4=?,resposta=? " + "where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, atividade.getTitulo());
            stmt.setString(2, atividade.getDescricao());
            stmt.setString(3, atividade.getPergunta());
            stmt.setString(4, atividade.getOpcao1());
            stmt.setString(5, atividade.getOpcao2());
            stmt.setString(6, atividade.getOpcao3());
            stmt.setString(7, atividade.getOpcao4());
            stmt.setString(8, atividade.getResposta());
            stmt.setInt(9, atividade.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void ExcluirAtividade(Atividade atividade) {
        String sql = "Delete FROM  atividades where id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, atividade.getId());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public Atividade procuraAtividade(Integer id) {
        String sql = "SELECT * FROM atividades WHERE id = ?";
        Atividade atividade = null;

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                //InputStream bin=rs.getBinaryStream("imagem");

                atividade = new Atividade(rs.getInt("id"), rs.getString("titulo"), rs.getString("descricao"), rs.getString("pergunta"), rs.getString("opcao1"), rs.getString("opcao2"), rs.getString("opcao3"), rs.getString("opcao4"), rs.getString("resposta"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return atividade;
    }

    public Atividade procuraAtividade(String titulo) {
        String sql = "SELECT * FROM atividades WHERE titulo = ?";
        Atividade atividade = null;

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, titulo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                atividade = new Atividade(rs.getInt("id"), rs.getString("titulo"), rs.getString("descricao"), rs.getString("pergunta"), rs.getString("opcao1"), rs.getString("opcao2"), rs.getString("opcao3"), rs.getString("opcao4"), rs.getString("resposta"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return atividade;
    }

    public ArrayList<Atividade> buscaAtividade() {
        String sql = " SELECT * FROM atividades";
        Atividade atividade = null;
        ArrayList<Atividade> vetorDeAtividade = new ArrayList<Atividade>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            //stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                atividade = new Atividade(rs.getInt("id"), rs.getString("titulo"), rs.getString("descricao"), rs.getString("pergunta"), rs.getString("opcao1"), rs.getString("opcao2"), rs.getString("opcao3"), rs.getString("opcao4"), rs.getString("resposta"));
                vetorDeAtividade.add(atividade);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vetorDeAtividade;
    }


    //public Atividade verificaAtividade(Atividade u) {
       // String sql = "SELECT * FROM atividades WHERE opcao = ? and resposta = ?";
        //Atividade atividade = null;

        //try {
           
            //PreparedStatement stmt = connection.prepareStatement(sql);
            //stmt.setString(1, u.getOpcao1());
            //stmt.setString(2, u.getResposta());
           // ResultSet rs = stmt.executeQuery();
           // if (rs.next()) {
             //   atividade = new Atividade(rs.getInt("id"), rs.getString("titulo"), rs.getString("descricao"), rs.getString("pergunta"), rs.getString("opcao1"), rs.getString("opcao2"), rs.getString("opcao3"), rs.getString("opcao4"), rs.getString("resposta"));
            //}
            //rs.close();
            //stmt.close();
        //} catch (SQLException e) {
         //   throw new RuntimeException(e);
        //}
        //return atividade;
   // }
}
