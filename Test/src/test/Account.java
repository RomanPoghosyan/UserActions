package test;

import user.User;

import java.util.Arrays;

class Account {
    private int balance;
    private Integer ids[] = {5,45,88};
    private boolean authorized = false;
    private boolean frozen = false;


    private boolean isAuthorized(User u){
        int index = Arrays.asList(ids).indexOf(u.id);
        if(!frozen && index != -1){
            return true;
        } else {
            return false;
        }
    }

    public int getBalance(User u){
        return isAuthorized(u) ? balance : 0;
    }

    public void setBalance(User u, int value) {
        if(isAuthorized(u)) {
            balance += value;
        }
    }

    public int takeBalance(User u, int value){
        if(isAuthorized(u)) {
            balance -= value;
            return value;
        }
        return 0;
    }

    public void freeze(User u, int userId){
        if(isAuthorized(u)) {
            frozen = true;
        }
    }
}
