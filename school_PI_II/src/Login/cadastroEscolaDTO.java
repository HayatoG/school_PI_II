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
public class cadastroEscolaDTO {
    private String  nome_escola,endereco;
    private int id_escola;

    public String getNome_escola() {
        return nome_escola;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getId_escola() {
        return id_escola;
    }

    public void setNome_escola(String nome_escola) {
        this.nome_escola = nome_escola;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId_escola(int id_escola) {
        this.id_escola = id_escola;
    }
    
    
    
}
