package PIZERABRABO;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Scanner;

public class javaMailApp {

    public static void Enviar() throws IOException, URISyntaxException {
            Scanner s = new Scanner(System.in);

            Properties props = new Properties();
            /** Parâmetros de conexão com servidor Gmail */
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication()
                        {
                            return new PasswordAuthentication("pisenacprojeto2020@gmail.com\n",
                                    "pisenacemailbrabo");
                        }
                    });

            /** Ativa Debug para sessão */
            //session.setDebug(true);

            try {
                String assunto = null;
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("pisenacprojeto2020@gmail.com"));
                //Remetente

                Address[] toUser = InternetAddress //Destinatário(s)
                        .parse("pisenacprojeto2020escola@gmail.com");

                message.setRecipients(Message.RecipientType.TO, toUser);
                System.out.println("(1) - Problemas com login\n" +
                        "\n" +
                        "(2) - Problemas com matricula\n" +
                        "\n" +
                        "(3) - Problemas com acesso as aulas\n" +
                        "\n" +
                        "(4) - Outros");
                System.out.print("Com o que podemos te ajudar? : ");
                int escolhaAssunto = s.nextInt();
                if (escolhaAssunto == 1){
                    assunto = "Problemas com Login";
                }else if (escolhaAssunto == 2){
                    assunto = "Problemas com matricula";
                }else if (escolhaAssunto == 3){
                    assunto = "Problemas com acesso as aulas";
                }else if (escolhaAssunto == 4){
                    assunto = "Outros";
                }else{
                    javaMailApp.Enviar();
                }
                message.setSubject(assunto);//Assunto

                System.out.print("Descreva seu problema: ");
                s.nextLine();
                String corpoEmail = s.nextLine();
                message.setText(corpoEmail);
                /**Método para enviar a mensagem criada*/
                Transport.send(message);

                System.out.println("Feito! Email enviado com sucesso!");

                areaResponsavel.areaResponsavel();

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
    }
}
