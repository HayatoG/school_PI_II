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
public class cadastroDao {

    private final String USUARIO = "root";
    private final String SENHA = "carecapi";
    private final String URL = "jdbc:mysql://localhost:3306/school_pi";
    private Connection con = null;
    private PreparedStatement st;
    private ResultSet rs;

    public Connection iniciar() throws SQLException {
        return con = DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public void inserirEstudante(cadastroEstudanteDTO cadastro, Connection con) throws SQLException {
        try {

            String sql = "INSERT INTO estudante(ra,nome_estudante) "
                    + "VALUES (?,?)";

            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getRa());
            st.setString(2, cadastro.getNome_estudante());
            st.executeUpdate();
            System.out.println("Inserido com sucesso!");

        } finally {
            con.close();
            st.close();
        }
    }

    public void inserirEscola(cadastroEscolaDTO cadastro, Connection con) throws SQLException {
        try {

            String sql = "INSERT INTO escola(nome_escola,endereco) "
                    + "VALUES (?,?)";

            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getNome_escola());
            st.setString(2, cadastro.getEndereco());
            st.executeUpdate();
            System.out.println("Inserido com sucesso!");

        } finally {
            con.close();
            st.close();
        }
    }

    public void inserirResponsavel(cadastroResponsavelDTO cadastro, Connection con) throws SQLException {
        try {

            String sql = "INSERT INTO responsavel(nome_responsavel,cpf) "
                    + "VALUES (?,?)";

            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getNome_responsavel());
            st.setString(2, cadastro.getCpf());
            st.executeUpdate();
            System.out.println("Inserido com sucesso!");

        } finally {
            con.close();
            st.close();
        }
    }

}
