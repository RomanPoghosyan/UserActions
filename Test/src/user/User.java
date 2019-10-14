package user;

import test.Admin;

public class User extends Admin {
    public int id;
    public User(int id){
        this.id = id;
    }
    public User(){
        id = -1;
    }
}
