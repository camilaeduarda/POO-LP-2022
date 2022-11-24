package aulabd;
public class User {
    private int id;
    private String username;
    private String password;
    private int status; //0 = inativo, 1 = ativo
    private double token;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getToken() {
        return this.token;
    }

    public void setToken(double token) {
        this.token = token;
    }

}
