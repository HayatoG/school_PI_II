/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIZERABRABO;

/**
 *
 * @author olive
 */
public class estudanteDTO {

    private String ra, nome_estudante, email, telefone, numero;
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

    public String getEmail() {
        return email;
    }

    public int getId_estudante() {
        return id_estudante;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
