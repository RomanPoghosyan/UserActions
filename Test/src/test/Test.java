package test;

import user.User;

public class Test {
    public static void main(String args[]) {
        Account a = new Account();
        User u = new User(17);
        User u2 = new User(45);

        a.setBalance(u,500);
        System.out.println(a.getBalance(u));
        a.setBalance(u2,1000);
        a.takeBalance(u2,700);
        System.out.println(a.getBalance(u2));

    }
}
