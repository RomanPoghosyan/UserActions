package test;

import user.User;

public class Test {
    public static void main(String args[]) {
        User u = new User(17);

        Account a = new Account(u);
        a.setBalance(500);
        System.out.println(a.getBalance());

        User u2 = new User();

        a = new Account(u2);

        a.setBalance(1000);
        System.out.println(a.getBalance());
    }
}
