package test;

import user.User;

public class Test {
    public static void main(String args[]) {
        int id = 17;
        User u = new User(id);
        if(u.id == -1){
            UserFunctionality user = u;
            //u.getBalance ERROR
            u.setBalance(100);
        }else {
            User user = u;
            u.setBalance(500);
            int balance = u.getBalance(u.id);
            System.out.println(balance);
        }
    }
}
