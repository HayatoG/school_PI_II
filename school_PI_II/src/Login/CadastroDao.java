/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author olive
 */
public class CadastroDao {
    
    private final String USUARIO = "root";
    private final String SENHA = "carecapi";
    private final String URL = "jdbc:mysql://localhost:3306/school_pi";
    private Connection con = null;
    private PreparedStatement st;
    private ResultSet rs;
    
    public Connection iniciar() throws SQLException {
        return con = DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
     public void inserir(CadastroDTO cadastro, Connection con) throws SQLException {
        try {
            String sql = "INSERT INTO login(login,senha) "
                    + "VALUES (?,?)";
            
            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getLogin());
            st.setString(2, cadastro.getSenha());
            st.executeUpdate();
            System.out.println("Inserido com sucesso!");
            
        } finally {
            con.close();
            st.close();
        }
    }
    
}
