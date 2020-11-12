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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author olive
 */
public class cadastroDao {

    private final String USUARIO = "root";
    private final String SENHA = "carecapi";
    private final String URL = "jdbc:mysql://localhost:3306/school_pi?useTimezone=true&serverTimezone=UTC&useSSL=false";
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

        } finally {
            con.close();
            st.close();
        }
    }

    public void inserirEstudantelEmail(cadastroEstudanteDTO cadastro, Connection con) throws SQLException {
        try {

            String sql = "INSERT INTO email(email)"
                    + "VALUES (?)";

            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getEmail());
            st.executeUpdate();

            String sqlEmail = "INSERT INTO estudanteemail(id_estudanteemail,id_email)"
                    + "VALUES (DEFAULT,LAST_INSERT_ID())";

            st = con.prepareStatement(sqlEmail);
            st.executeUpdate();
        } finally {
            con.close();
            st.close();
        }
    }

    public void inserirEstudantelTelefone(cadastroEstudanteDTO cadastro, Connection con) throws SQLException {
        try {

            String sql = "INSERT INTO telefone(telefone,numero)"
                    + "VALUES (?,?)";

            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getTelefone());
            st.setString(2, cadastro.getNumero());
            st.executeUpdate();
            System.out.println("\nInserido com sucesso!");

            String sqlEmail = "INSERT INTO estudantetelefone(id_estudantetelefone,id_telefone)"
                    + "VALUES (DEFAULT,LAST_INSERT_ID())";

            st = con.prepareStatement(sqlEmail);
            st.executeUpdate();
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

        } finally {
            con.close();
            st.close();
        }
    }

    public void inserirResponsavelEmail(cadastroResponsavelDTO cadastro, Connection con) throws SQLException {
        try {

            String sql = "INSERT INTO email(email)"
                    + "VALUES (?)";

            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getEmail());
            st.executeUpdate();

            String sqlEmail = "INSERT INTO responsavelemail(id_responsavelemail,id_email)"
                    + "VALUES (DEFAULT,LAST_INSERT_ID())";

            st = con.prepareStatement(sqlEmail);
            st.executeUpdate();
        } finally {
            con.close();
            st.close();
        }
    }

    public void inserirResponsavelTelefone(cadastroResponsavelDTO cadastro, Connection con) throws SQLException {
        try {

            String sql = "INSERT INTO telefone(telefone,numero)"
                    + "VALUES (?,?)";

            st = con.prepareStatement(sql);
            st.setString(1, cadastro.getTelefone());
            st.setString(2, cadastro.getNumero());
            st.executeUpdate();
            System.out.println("\nInserido com sucesso!");

            String sqlEmail = "INSERT INTO responsaveltelefone(id_responsaveltelefone,id_telefone)"
                    + "VALUES (DEFAULT,LAST_INSERT_ID())";

            st = con.prepareStatement(sqlEmail);
            st.executeUpdate();
        } finally {
            con.close();
            st.close();
        }
    }
}
