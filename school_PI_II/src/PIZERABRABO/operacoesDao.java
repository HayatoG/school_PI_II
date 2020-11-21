/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIZERABRABO;

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
public class operacoesDao {

    private final String USUARIO = "root";
    private final String SENHA = "carecapi";
    private final String URL = "jdbc:mysql://localhost:3306/school_pi?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private Connection con = null;
    private PreparedStatement st;
    private ResultSet rs;

    public Connection iniciar() throws SQLException {
        return con = DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public void inserirEstudante(estudanteDTO cadastro, Connection con) throws SQLException {
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

    public void inserirEstudantelEmail(estudanteDTO cadastro, Connection con) throws SQLException {
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

    public void inserirEstudantelTelefone(estudanteDTO cadastro, Connection con) throws SQLException {
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

    public void inserirResponsavel(responsavelDTO cadastro, Connection con) throws SQLException {
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

    public void inserirResponsavelEmail(responsavelDTO cadastro, Connection con) throws SQLException {
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

    public void inserirResponsavelTelefone(responsavelDTO cadastro, Connection con) throws SQLException {
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

    public List<escolaDTO> ListarParelheiros(Connection con) throws SQLException {

        List<escolaDTO> lista = new ArrayList<escolaDTO>();
        try {

            String sql = "SELECT * FROM escola WHERE Distrito = \"Parelheiros\"";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();

            escolaDTO escola;

            while (rs.next()) {
                escola = new escolaDTO();
                escola.setId_escola(rs.getInt("ID_Escola"));
                escola.setDiretoriaEnsino(rs.getString("DiretoriaEnsino"));
                escola.setNomeEscola(rs.getString("NomeEscola"));
                escola.setMunicipio(rs.getString("Municipio"));
                escola.setBairro(rs.getString("Bairro"));
                escola.setDistrito(rs.getString("Distrito"));
                escola.setCEP(rs.getInt("CEP"));
                escola.setComplemento(rs.getString("Complemento"));
                escola.setEndereco(rs.getString("Endereco"));
                escola.setNumero(rs.getInt("Numero"));
                escola.setDdd(rs.getInt("Ddd"));
                escola.setFone1(rs.getInt("Fone1"));
                escola.setFone2(rs.getInt("Fone2"));
                escola.setEmail(rs.getString("Email"));
                lista.add(escola);
            }
        } finally {
        }
        return lista;
    }

    public List<escolaDTO> ListarDutra(Connection con) throws SQLException {

        List<escolaDTO> listaD = new ArrayList<escolaDTO>();

        try {

            String sql = "SELECT * FROM escola WHERE Distrito = \"CIDADE DUTRA\"";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();

            escolaDTO escolaD;

            while (rs.next()) {
                escolaD = new escolaDTO();
                escolaD.setId_escola(rs.getInt("ID_Escola"));
                escolaD.setDiretoriaEnsino(rs.getString("DiretoriaEnsino"));
                escolaD.setNomeEscola(rs.getString("NomeEscola"));
                escolaD.setMunicipio(rs.getString("Municipio"));
                escolaD.setBairro(rs.getString("Bairro"));
                escolaD.setDistrito(rs.getString("Distrito"));
                escolaD.setCEP(rs.getInt("CEP"));
                escolaD.setComplemento(rs.getString("Complemento"));
                escolaD.setEndereco(rs.getString("Endereco"));
                escolaD.setNumero(rs.getInt("Numero"));
                escolaD.setDdd(rs.getInt("Ddd"));
                escolaD.setFone1(rs.getInt("Fone1"));
                escolaD.setFone2(rs.getInt("Fone2"));
                escolaD.setEmail(rs.getString("Email"));
                listaD.add(escolaD);
            }
        } finally {
        }
        return listaD;
    }

    public List<escolaDTO> ListarGrajau(Connection con) throws SQLException {

        List<escolaDTO> listaG = new ArrayList<escolaDTO>();

        try {

            String sql = "SELECT * FROM escola WHERE Distrito = \"GRAJAU\"";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();

            escolaDTO escolaG;

            while (rs.next()) {
                escolaG = new escolaDTO();
                escolaG.setId_escola(rs.getInt("ID_Escola"));
                escolaG.setDiretoriaEnsino(rs.getString("DiretoriaEnsino"));
                escolaG.setNomeEscola(rs.getString("NomeEscola"));
                escolaG.setMunicipio(rs.getString("Municipio"));
                escolaG.setBairro(rs.getString("Bairro"));
                escolaG.setDistrito(rs.getString("Distrito"));
                escolaG.setCEP(rs.getInt("CEP"));
                escolaG.setComplemento(rs.getString("Complemento"));
                escolaG.setEndereco(rs.getString("Endereco"));
                escolaG.setNumero(rs.getInt("Numero"));
                escolaG.setDdd(rs.getInt("Ddd"));
                escolaG.setFone1(rs.getInt("Fone1"));
                escolaG.setFone2(rs.getInt("Fone2"));
                escolaG.setEmail(rs.getString("Email"));
                listaG.add(escolaG);
            }
        } finally {
        }
        return listaG;
    }
}
