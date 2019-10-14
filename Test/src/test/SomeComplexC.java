package test;

class SomeComplexC implements PrivateFunctionality, UserFunctionality{
    private int balance;

    public int getBalance(int userId){
        return balance;
    }

    public void setBalance(int value){
        balance += value;
    }

    public int takeBalance(int userId, int value){
        balance -= value;
        return value;
    }
}
