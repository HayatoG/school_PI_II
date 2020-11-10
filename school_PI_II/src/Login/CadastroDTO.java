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
public class CadastroDTO {
    private String login,senha;
    private int id;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
