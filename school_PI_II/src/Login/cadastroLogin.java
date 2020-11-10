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
public class cadastroLogin {

    static Scanner s = new Scanner(System.in);

    public static void telaInicial() {
        Scanner s = new Scanner(System.in);
        System.out.println(" \n(1) Fazer login | (2) Cadastrar-se");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
                cadastroLogin.login();
            case 2:
                cadastroLogin.direcaoCadastro();
        }
    }

    public static void direcaoCadastro() {
        cadastroDao dao = new cadastroDao();

        System.out.println("\nVocê é: (1) Escola | (2) Estudante | (3) Responsável");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
                escolaMetodos.cadastroEscola();
                escolaMetodos.cadastroEscolaEmail();
                escolaMetodos.cadastroEscolaTelefone();
                telaInicial();
            case 2:
                estudanteMetodos.cadastroEstudante();
                estudanteMetodos.cadastroEstudanteEmail();
                estudanteMetodos.cadastroEstudanteTelefone();
                telaInicial();
            case 3:
                responsavelMetodos.cadastroResponsavel();
                responsavelMetodos.cadastroResponsavelEmail();
                responsavelMetodos.cadastroResponsavelTelefone();
                telaInicial();

        }
    }
    
    public static void login() {

    }
}
