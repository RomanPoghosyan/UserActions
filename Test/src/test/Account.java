package test;

import user.User;

class Account {
    private int balance;
    private int id = 17;
    private boolean authorized = false;
    private boolean frozen = false;

    Account(User user){
        if(user.id == this.id){
            authorized = true;
        }
    }

    private boolean isAuthorized(){
        return !frozen && authorized;
    }

    public int getBalance(){
        return isAuthorized() ? balance : 0;
    }

    public void setBalance(int value) {
        balance += value;
    }

    public int takeBalance(int value){
        if(isAuthorized()) {
            balance -= value;
            return value;
        }
        return 0;
    }

    public void freeze(int userId){
        if(isAuthorized()) {
            frozen = true;
        }
    }
}
