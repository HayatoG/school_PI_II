/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import static Login.cadastroLogin.s;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author olive
 */
public class escolaMetodos {
    
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
            
            System.out.println("\nQuer colocar mais de um email? (S/N)");
            String resposta = s.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                cadastroEscolaEmail();
            }

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
            
            System.out.println("\nQuer colocar mais de um telefone e número celular? (S/N)");
            String resposta = s.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                cadastroEscolaTelefone();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
