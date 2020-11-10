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
public class estudanteMetodos {
    
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
            
            System.out.println("\nQuer colocar mais de um email? (S/N)");
            String resposta = s.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                cadastroEstudanteEmail();
            }

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
            
            System.out.println("\nQuer colocar mais de um telefone e número celular? (S/N)");
            String resposta = s.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                cadastroEstudanteTelefone();
            }

            dao.inserirEstudantelTelefone(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
