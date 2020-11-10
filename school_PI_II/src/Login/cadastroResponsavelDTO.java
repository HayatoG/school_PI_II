/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author olive
 */
public class cadastroResponsavelDTO {
    private String nome_responsavel, cpf;
    private int id_responsavel;

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public String getCpf() {
        return cpf;
    }

    public int getId_responsavel() {
        return id_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setId_responsavel(int id_responsavel) {
        this.id_responsavel = id_responsavel;
    }
    
    
    
}
