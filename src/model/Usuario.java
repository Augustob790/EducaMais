/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class Usuario {

    private Integer id;
    private String nome;
    private String tipo;
    private String telefone;
    private String senha;

    public Usuario(Integer id, String nome, String tipo, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Usuario(String nome, String tipo, String telefone, String senha) {
        this.nome = nome;

        this.tipo = tipo;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Usuario(String tipo, String senha) {
        this.tipo = tipo;
        this.senha = senha;
    }

    public Usuario(Integer id) {
        this.id = id;
    }

   

    public Usuario(JTextField nome, JPasswordField tipo, JTextField telefone, JTextField senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario(JTextField tipo, JPasswordField senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return" Nome:" + nome;
    }

}
