package aulabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    //DAO = data access object = antigamente
    //DAO = CRUD
    //C: create (insert into) 
    //R: read   (select from)
    //U: update (update set)
    //D: delete (delete from)

    private Connection conn = null;

    public UserRepository(){
        this.conn = ConectionFactory.createConnection();
    }

    public void save (User _user){
        String uSql = "INSERT INTO tb_user (username, password, status, token) VALUES (?, ?, ?, ?)";

    try {
        PreparedStatement ps = conn.prepareStatement(uSql);
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

    public User getOne (int id){
        String sql = "SELECT * FROM tb_user WHERE id = ?";
        return null;
    }

    public List<User> selectAll(){
        String sql = "SELECT * FROM tb_user";

        List<User> users = new ArrayList<User>();
    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                //System.out.println(rs.getInt(1) + " - " + rs.getString("username"));
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setToken(rs.getDouble("token"));
            }

            System.out.println(rs);

            ps.executeQuery();

        }catch (SQLException e){
            System.out.println("Erro! Não foi possível buscar os usuários.");
            e.printStackTrace();
        }
    }

    public void update (User _user){}

    public void delete (User _user){}
}
