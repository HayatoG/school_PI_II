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
public class consultaTeste {
    public static void teste() {
        Scanner s = new Scanner(System.in);
        System.out.println("MENU DO RESPONSÁVEL");
        System.out.println("(1) Consultar Escola");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
                System.out.println("Diga o distrito que quer consultar: ");
                String distrito = s.next();
                if (distrito.equalsIgnoreCase("parelheiros")) {
                    escolaMetodos.consultaEscolaParelheiros();
                }
        }
    }
}
