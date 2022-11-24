package aulabd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    //DAO = data access object = antigamente
    //DAO = CRUD
    //C: create (insert into) 
    //R: read   (select from)
    //U: update (update set)
    //D: delete (delete from)

    private Connection conn = null;

    public UserRepository(){
        this.conn = ConnectionFactory.createConnection();
    }

    public void save (User _user){
        String uSql = "INSERT INTO tb_user (username, password, status, token) VALUES (?, ?, ?, ?)";

    try {
        PreparedStatement ps = connprepareStatement(uSql);
        ps.setString(1, _user.getUsername());
        ps.setString(2, _user.getPassword());
        ps.setInt(3, _user.getStatus());
        ps.setDouble(4, _user.getToken());

        ps.executeUpdate(); //insert, update e delete

        System.out.println("INFO: Usuário cadastrado!");

    }catch (SQLException e) {
        System.out.println("Não foi possível inserir o usuário.");
    }
    }

    public void selectAll (){}

    public void update (User _user){}

    public void delete (User _user){}
}
