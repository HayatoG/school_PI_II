/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIZERABRABO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author olive
 */
public class escolaMetodos {

    public static void consultaEscolaParelheiros() {
        operacoesDao dao = new operacoesDao();
        escolaDTO escola = new escolaDTO();
        try {
            Connection con = dao.iniciar();
            dao.ListarParelheiros(con);
            List<escolaDTO> lista = dao.ListarParelheiros(con);
            for (escolaDTO c : lista) {
                System.out.println(c);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     public static void consultaEscolaDutra() {
        operacoesDao dao = new operacoesDao();
        escolaDTO escola = new escolaDTO();
        try {
            Connection con = dao.iniciar();
            dao.ListarDutra(con);
            List<escolaDTO> lista = dao.ListarDutra(con);
            for (escolaDTO c : lista) {
                System.out.println(c);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     
     public static void consultaEscolaGrajau() {
        operacoesDao dao = new operacoesDao();
        escolaDTO escola = new escolaDTO();
        try {
            Connection con = dao.iniciar();
            dao.ListarGrajau(con);
            List<escolaDTO> lista = dao.ListarGrajau(con);
            for (escolaDTO c : lista) {
                System.out.println(c);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
