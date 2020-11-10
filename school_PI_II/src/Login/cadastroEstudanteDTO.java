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
public class cadastroEstudanteDTO {
    private String ra, nome_estudante;
    private int id_estudante;

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setId_estudante(int id_estudante) {
        this.id_estudante = id_estudante;
    }

    public void setNome_estudante(String nome_estudante) {
        this.nome_estudante = nome_estudante;
    }

    public String getRa() {
        return ra;
    }

    public String getNome_estudante() {
        return nome_estudante;
    }

    public int getId() {
        return id_estudante;
    }
}
