package aulabd;

import java.util.List;

public class App {

    public static void main (String[] args) throws Exception {
        //abrir uma conexao com um mysql

        ConectionFactory.createConnection();

        User beto = new User();

        beto.setUsername("beto");
        beto.setPassword("admin");
        beto.setStatus(1);
        beto.setToken(3.1415);

        UserRepository userRepository = new UserRepository();
        UserRepository.save(beto);

        List<User> usuarios = userRepository.selectAll();
    }
}
