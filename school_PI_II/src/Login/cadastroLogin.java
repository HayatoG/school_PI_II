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

        System.out.println("\nVocê é:(1) Estudante | (2) Responsável");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
                estudanteMetodos.cadastroEstudante();
                estudanteMetodos.cadastroEstudanteEmail();
                estudanteMetodos.cadastroEstudanteTelefone();
                telaInicial();
            case 2:
                responsavelMetodos.cadastroResponsavel();
                responsavelMetodos.cadastroResponsavelEmail();
                responsavelMetodos.cadastroResponsavelTelefone();
                telaInicial();

        }
    }

    public static void login() {
        
        System.out.println("Login: ");
        String login = s.next();
        
        System.out.println("Senha: ");
        String senha = s.next();
        
        if (login.equals("adm") && senha.equals("123")) {
            System.out.println("Logado!");
            responsavelConsulta.consultaTeste.teste();
        }
    }
}
