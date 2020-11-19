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
public class escolaDTO {

    private String DiretoriaEnsino, NomeEscola, Municipio, Bairro, Distrito, Complemento, Endereco, Email;
    private int id_escola, CEP, Ddd, Fone1, Fone2, Numero;

    public String getDiretoriaEnsino() {
        return DiretoriaEnsino;
    }

    public String getNomeEscola() {
        return NomeEscola;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getDistrito() {
        return Distrito;
    }

    public String getComplemento() {
        return Complemento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public int getId_escola() {
        return id_escola;
    }

    public int getCEP() {
        return CEP;
    }

    public int getDdd() {
        return Ddd;
    }

    public int getFone1() {
        return Fone1;
    }

    public int getFone2() {
        return Fone2;
    }

    public void setDiretoriaEnsino(String DiretoriaEnsino) {
        this.DiretoriaEnsino = DiretoriaEnsino;
    }

    public void setNomeEscola(String NomeEscola) {
        this.NomeEscola = NomeEscola;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setId_escola(int id_escola) {
        this.id_escola = id_escola;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public void setDdd(int Ddd) {
        this.Ddd = Ddd;
    }

    public void setFone1(int Fone1) {
        this.Fone1 = Fone1;
    }

    public void setFone2(int Fone2) {
        this.Fone2 = Fone2;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    @Override
    public String toString() {
        return "\n--------------------"+ "\nEscola nº" + id_escola + "\n" +"\nDiretoria de Ensino: " + DiretoriaEnsino + "\nNome da Escola: " + NomeEscola + "\nMunicipio:" + Municipio + "\nBairro:" + Bairro + 
                "\nDistrito: " + Distrito + "\nComplemento: " + Complemento + "\nEndereco: " + Endereco + 
                "\nEmail: " + Email + "\nCEP: " + CEP + "\nDdd: " + Ddd + "\nFone1: " + Fone1 + "\nFone2: " + Fone2 + "\nNúmero: " + Numero + "\n--------------------\n";
    }
    
}
