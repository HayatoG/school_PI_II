/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIZERABRABO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
//import javafx.scene.control.PasswordField;

/**
 *
 * @author olive
 */
public class telaInicialCadastroLogin {

    static Scanner s = new Scanner(System.in);

    public static void telaInicial() throws URISyntaxException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.println(" _____       _                                  /\\/|                       __    _       _   _                               __          _   _       \n"
                + " | ____|   __| |  _   _    ___    __ _    ___   |/\\/_    ___      _ __    _/_/_  | |__   | | (_)   ___    __ _       _       / _|   ___  | | (_)  ____\n"
                + " |  _|    / _` | | | | |  / __|  / _` |  / __|  / _` |  / _ \\    | '_ \\  | | | | | '_ \\  | | | |  / __|  / _` |    _| |_    | |_   / _ \\ | | | | |_  /\n"
                + " | |___  | (_| | | |_| | | (__  | (_| | | (__  | (_| | | (_) |   | |_) | | |_| | | |_) | | | | | | (__  | (_| |   |_   _|   |  _| |  __/ | | | |  / / \n"
                + " |_____|  \\__,_|  \\__,_|  \\___|  \\__,_|  \\___|  \\__,_|  \\___/    | .__/   \\__,_| |_.__/  |_| |_|  \\___|  \\__,_|     |_|     |_|    \\___| |_| |_| /___|\n"
                + "                                          )_)                    |_|                                                                                  ");
        System.out.println(" \n(1) Fazer login | (2) Cadastrar-se");
        int decisao = s.nextInt();

        if (decisao == 1) {
            telaInicialCadastroLogin.login();
        }
        if (decisao == 2) {
            telaInicialCadastroLogin.direcaoCadastro();
        }
    }

    public static void direcaoCadastro() throws URISyntaxException, IOException {
        operacoesDao dao = new operacoesDao();

        System.out.println("\nVocê é:(1) Estudante | (2) Responsável | (3) Voltar");
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

            case 3:
                telaInicialCadastroLogin.telaInicial();

        }
    }

    public static void login() throws URISyntaxException, IOException {

        System.out.println("\nLogin: ");
        String login = s.next();

        System.out.println("\nSenha:");
        String senha = s.next();

        if (login.equals("adm") && senha.equals("123")) {
            System.out.println("\nLogado!");
            PIZERABRABO.areaResponsavel.areaResponsavel();
        }
        if (login.equals("res") && senha.equals("123")) {
            System.out.println("\nLogado!");
            PIZERABRABO.areaResponsavel.areaResponsavel();
        } else {
            System.out.println("\nLogin ou senha inválidos");
            telaInicialCadastroLogin.login();
        }
    }
}

/*   public static String readPassword(String prompt) {
        EraserThread et = new EraserThread(prompt);
        Thread mask = new Thread(et);
        mask.start();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String password = "";

        try {
            password = in.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        // stop masking
        et.stopMasking();
        // return the password entered by the user
        return password;
    }
}*/
