public class Login {
    private String username;
    private String password;

    

    public Login(String u, String p){
        this.username = u;
        this.password = p;
    }

    public boolean isMatch(){

        return true;
    }

    public void setPassword(String p){

        this.password = p;
    }

    public String getPassword(){

        return this.password;
    }

    public String getUsername(){

        return this.username;
    }

    public String toString(){

        return "Username: "+username + " " +"Password: "+ password;
    }

}
