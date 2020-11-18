/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author olive
 */
public class escolaMetodos {

    public static void consultaEscolaParelheiros() {
        cadastroDao dao = new cadastroDao();
        cadastroEscolaDTO escola = new cadastroEscolaDTO();
        try {
            Connection con = dao.iniciar();
            dao.ListarParelheiros(con);
            List<cadastroEscolaDTO> lista = dao.ListarParelheiros(con);
            for (cadastroEscolaDTO c : lista) {
                System.out.println(c);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
