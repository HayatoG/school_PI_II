/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIZERABRABO;

import static PIZERABRABO.telaInicialCadastroLogin.s;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author olive
 */
public class responsavelMetodos {

    public static void cadastroResponsavel() {
        operacoesDao dao = new operacoesDao();
        responsavelDTO dto = new responsavelDTO();
        try {
            Connection con = dao.iniciar();
            System.out.println("\nConectado!");

            System.out.println("\nInsira o nome do responsável:");
            String nome = s.next();
            dto.setNome_responsavel(nome);

            System.out.println("\nInsira o cpf do responsável:");
            String cpf = s.next();
            dto.setCpf(cpf);

            dao.inserirResponsavel(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void cadastroResponsavelEmail() {
        operacoesDao dao = new operacoesDao();
        responsavelDTO dto = new responsavelDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o email do responsável:");
            String email = s.next();
            dto.setEmail(email);

            dao.inserirResponsavelEmail(dto, con);

            System.out.println("\nQuer colocar mais de um email? (S/N)");
            String resposta = s.next();

            if (resposta.equalsIgnoreCase("s")) {
                cadastroResponsavelEmail();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void cadastroResponsavelTelefone() {
        operacoesDao dao = new operacoesDao();
        responsavelDTO dto = new responsavelDTO();
        try {
            Connection con = dao.iniciar();

            System.out.println("\nInsira o telefone:");
            String telefone = s.next();
            dto.setTelefone(telefone);

            System.out.println("\nInsira o número celular:");
            String celular = s.next();
            dto.setNumero(celular);

            dao.inserirResponsavelTelefone(dto, con);

            System.out.println("\nQuer colocar mais de um telefone e número celular? (S/N)");
            String resposta = s.next();

            if (resposta.equalsIgnoreCase("s")) {
                cadastroResponsavelTelefone();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void areaResponsavelConsultaEscola() throws URISyntaxException, IOException {
        System.out.println("\nDiga o distrito que quer consultar: ");
        String distrito = s.next();
        if (distrito.equalsIgnoreCase("parelheiros")) {
            escolaMetodos.consultaEscolaParelheiros();
            responsavelMetodos.abrirPagina();
        } else if (distrito.equalsIgnoreCase("dutra")) {
            escolaMetodos.consultaEscolaDutra();
            responsavelMetodos.abrirPagina();
        } else if (distrito.equalsIgnoreCase("grajau")) {
            escolaMetodos.consultaEscolaGrajau();
            responsavelMetodos.abrirPagina();
        }
    }
    
    public static void abrirPagina() throws URISyntaxException, IOException{
        System.out.println("Se interessou por alguma escola? (S)/(N)");
        String dec = s.next();
        if (dec.equalsIgnoreCase("s")) {
            java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://sed.educacao.sp.gov.br/NCA/PreInscricaoOnline/login"));
            areaResponsavel.areaResponsavel();
        }
        else{
            areaResponsavel.areaResponsavel();
        }
    }
}
