/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author rb29
 */
public class Atividade {
    private Integer id;
    private String titulo;
    private String descricao;
    private String pergunta;
    private String opcao1;
    private String opcao2;
    private String opcao3;
    private String opcao4;
    private String resposta;

    public Atividade(String titulo, String descricao, String pergunta, String opcao1, String opcao2, String opcao3, String opcao4, String resposta) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.pergunta = pergunta;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.resposta = resposta;
    }
   
   
   

   
    public Atividade(Integer id, String titulo, String descricao,String pergunta, String opcao1, String opcao2, String opcao3, String opcao4, String resposta) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.pergunta=pergunta;
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
        this.opcao4 = opcao4;
        this.resposta = resposta;
        
    
    
    
       
    }

    public Atividade(String resposta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the pergunta
     */
   public String getPergunta(){
       return pergunta;
   }
   public void setPergunta(String pergunta){
       this.pergunta=pergunta;
   }

    /**
     * @return the opcao1
     */
    public String getOpcao1() {
        return opcao1;
    }

    /**
     * @param opcao1 the opcao1 to set
     */
    public void setOpcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    /**
     * @return the opcao2
     */
    public String getOpcao2() {
        return opcao2;
    }

    /**
     * @param opcao2 the opcao2 to set
     */
    public void setOpcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    /**
     * @return the opcao3
     */
    public String getOpcao3() {
        return opcao3;
    }

    /**
     * @param opcao3 the opcao3 to set
     */
    public void setOpcao3(String opcao3) {
        this.opcao3 = opcao3;
    }

    /**
     * @return the opcao4
     */
    public String getOpcao4() {
        return opcao4;
    }

    /**
     * @param opcao4 the opcao4 to set
     */
    public void setOpcao4(String opcao4) {
        this.opcao4 = opcao4;
    }

    /**
     * @return the resposta
     */
    public String getResposta() {
        return resposta;
    }

    /**
     * @param resposta the resposta to set
     */
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
     
   

    public Atividade(Integer id) {
        this.id = id;

    }

   

   

   
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   

  
    @Override
    public String toString() {
        return " Titulo:" + titulo;
    }

}
