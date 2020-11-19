/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIZERABRABO;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author olive
 */
public class areaResponsavel {
    
    public static void areaResponsavel() throws URISyntaxException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("\n    __                                _             ____                                                 __                   _ \n" +
"   /_/    _ __    ___    __ _      __| |   ___     |  _ \\    ___   ___   _ __     ___    _ __    ___    /_/_  __   __   ___  | |\n" +
"   /_\\   | '__|  / _ \\  / _` |    / _` |  / _ \\    | |_) |  / _ \\ / __| | '_ \\   / _ \\  | '_ \\  / __|  / _` | \\ \\ / /  / _ \\ | |\n" +
"  / _ \\  | |    |  __/ | (_| |   | (_| | | (_) |   |  _ <  |  __/ \\__ \\ | |_) | | (_) | | | | | \\__ \\ | (_| |  \\ V /  |  __/ | |\n" +
" /_/ \\_\\ |_|     \\___|  \\__,_|    \\__,_|  \\___/    |_| \\_\\  \\___| |___/ | .__/   \\___/  |_| |_| |___/  \\__,_|   \\_/    \\___| |_|\n" +
"                                                                        |_|                                                     ");
        System.out.println("(1) Consultar Escola | (2) Enviar Chamado | (3) Voltar | (4) Sair");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
               responsavelMetodos.areaResponsavelConsultaEscola();
            case 2:
                break;
            case 3:
                telaInicialCadastroLogin.telaInicial();
            case 4:
                System.exit(0);
        }
    }
}
