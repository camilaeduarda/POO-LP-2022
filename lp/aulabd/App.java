package aulabd;

public class App {
    
    public static void main (String[] args) {
        //abrir uma conexao com um mysql

        ConnectionFactory.createConnection();

        User beto = new User();

        beto.setUsername("beto");
        beto.setPassword("admin");
        beto.setStatus(1);
        beto.setToken(3.1415);

        UserRepository userRepository = new UserRepository();
        UserRepository.save(beto);
    }
}
