package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Autowired
    private  Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: "+  remetente.getNome()
                + "\nE-mail: " + remetente.getEmail()
                + "\nCom telefones de contato: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado.");
    }

}
