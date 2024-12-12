package simulado_q1;

import java.util.*;

public class UserBase {
    private java.util.LinkedList<User> users;

    public UserBase() {
        this.users = new java.util.LinkedList<User>();
    }

    public User createUser(String name){
        User user = new User(name);
        this.users.add(user);
        return user;
    }

    public User createVerifiedUser(String name, Date date){
        User user = new VerifiedUser(name, date);
        this.users.add(user);
        return user;
    }

    public float tamanhoMedioTweets(){
        float lenght = 0, qtd = 0;
        for(User user : this.users){
            lenght += user.getTweetsLenght();
            qtd += user.getQttTweets();
        }

        if(qtd == 0) return 0;
        return lenght / qtd;
    }

    public float porcentagemVerificados(){
        float n = 0;
        for(User user : users){
            if(user instanceof VerifiedUser) n++;
        }

        if(users.isEmpty()) return 0;
        return n / users.size();
    }
    
}
