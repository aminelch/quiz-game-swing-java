package qcm.mysql;


public class User {


    private String username;
    private String userpass;
    private int score;

    public User() {
        score=0; 
        username=null;
        userpass=null;
    }

  
    
    public User(String username, String userpass) {
        this.username = username;
        this.userpass = userpass;
    }

  

    public String getUsername() {
        return username;
    }

    public String getUserpass() {
        return userpass;
    }

    public int getScore() {
        return score;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
 public String toString() {
     return "Nom utilisateur =" + this.getUsername() + "\n Mot de passe= " + this.getUserpass() +"\n score= "+ this.getScore();
 }
}
