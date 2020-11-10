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
public class loginMetodos {

    static Scanner s = new Scanner(System.in);

    public static void telaInicial() {
        Scanner s = new Scanner(System.in);
        System.out.println(" (1) Fazer login | (2) Cadastrar-se");
        int decisao = s.nextInt();

        switch (decisao) {
            case 1:
                loginMetodos.login();
            case 2:
                loginMetodos.cadastro();
        }
    }

    public static void login() {

    }

    public static void cadastro() {
        CadastroDao dao = new CadastroDao();
        CadastroDTO dto = new CadastroDTO();

        System.out.println("Você é: (1) Escola | (2) Estudante | (3) Responsável");
        int decisao = s.nextInt();

        try {
            Connection con = dao.iniciar();
            System.out.println("Conectado!");

            System.out.println("Insira o login:");
            String login = s.next();
            dto.setLogin(login);

            System.out.println("Insira a senha:");
            String senha = s.next();
            dto.setSenha(senha);

            dao.inserir(dto, con);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
