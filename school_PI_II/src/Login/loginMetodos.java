/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author olive
 */
public class loginMetodos {

    static Scanner s = new Scanner(System.in);

    public static void telaInicial() {
        Scanner s = new Scanner(System.in);
        System.out.println(" \n(1) Fazer login | (2) Cadastrar-se");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
                loginMetodos.login();
            case 2:
                loginMetodos.direcaoCadastro();
        }
    }

    public static void login() {

    }

    public static void direcaoCadastro() {
        cadastroDao dao = new cadastroDao();

        System.out.println("\nVocê é: (1) Escola | (2) Estudante | (3) Responsável");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
                cadastroEscola();
                cadastroEscolaEmail();
                cadastroEscolaTelefone();
                telaInicial();
            case 2:
                cadastroEstudante();
                cadastroEstudanteEmail();
                cadastroEstudanteTelefone();
                telaInicial();
            case 3:
                cadastroResponsavel();
                cadastroResponsavelEmail();
                cadastroResponsavelTelefone();
                telaInicial();

        }
    }

    public static void cadastroEstudante() {
        cadastroDao dao = new cadastroDao();
        cadastroEstudanteDTO dto = new cadastroEstudanteDTO();
        try {
            Connection con = dao.iniciar();
            System.out.println("\nConectado!");

            System.out.println("\nInsira o RA:");
            String ra = s.next();
            dto.setRa(ra);

            System.out.println("\nInsira o nome");
            String nomeEstudante = s.next();
            dto.setNome_estudante(nomeEstudante);

            dao.inserirEstudante(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void cadastroEstudanteEmail() {
        cadastroDao dao = new cadastroDao();
        cadastroEstudanteDTO dto = new cadastroEstudanteDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o email:");
            String email = s.next();
            dto.setEmail(email);

            dao.inserirEstudantelEmail(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void cadastroEstudanteTelefone() {
        cadastroDao dao = new cadastroDao();
        cadastroEstudanteDTO dto = new cadastroEstudanteDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o telefone:");
            String telefone = s.next();
            dto.setTelefone(telefone);

            System.out.println("\nInsira o número celular:");
            String celular = s.next();
            dto.setNumero(celular);

            dao.inserirEstudantelTelefone(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void cadastroEscola() {
        cadastroDao dao = new cadastroDao();
        cadastroEscolaDTO dto = new cadastroEscolaDTO();
        try {
            Connection con = dao.iniciar();
            System.out.println("\nConectado!");

            System.out.println("\nInsira o nome da escola:");
            String nome = s.next();
            dto.setNome_escola(nome);

            System.out.println("\nInsira a região:");
            String endereço = s.next();
            dto.setEndereco(endereço);

            dao.inserirEscola(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void cadastroEscolaEmail() {
        cadastroDao dao = new cadastroDao();
        cadastroEscolaDTO dto = new cadastroEscolaDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o email da escola:");
            String email = s.next();
            dto.setEmail(email);

            dao.inserirEscolaEmail(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public static void cadastroEscolaTelefone() {
        cadastroDao dao = new cadastroDao();
        cadastroEscolaDTO dto = new cadastroEscolaDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o telefone:");
            String telefone = s.next();
            dto.setTelefone(telefone);

            System.out.println("\nInsira o número celular:");
            String celular = s.next();
            dto.setNumero(celular);

            dao.inserirEscolaTelefone(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
   

    public static void cadastroResponsavel() {
        cadastroDao dao = new cadastroDao();
        cadastroResponsavelDTO dto = new cadastroResponsavelDTO();
        try {
            Connection con = dao.iniciar();
            System.out.println("\nConectado!");

            System.out.println("\nInsira o nome do responsável:");
            String nome = s.next();
            dto.setNome_responsavel(nome);

            System.out.println("\nInsira o cpf do responsável:");
            String cpf = s.next();
            dto.setCpf(nome);

            dao.inserirResponsavel(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void cadastroResponsavelEmail() {
        cadastroDao dao = new cadastroDao();
        cadastroResponsavelDTO dto = new cadastroResponsavelDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o email do responsável:");
            String email = s.next();
            dto.setEmail(email);

            dao.inserirResponsavelEmail(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void cadastroResponsavelTelefone() {
        cadastroDao dao = new cadastroDao();
        cadastroResponsavelDTO dto = new cadastroResponsavelDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o telefone:");
            String telefone = s.next();
            dto.setTelefone(telefone);

            System.out.println("\nInsira o número celular:");
            String celular = s.next();
            dto.setNumero(celular);

            dao.inserirResponsavelTelefone(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
