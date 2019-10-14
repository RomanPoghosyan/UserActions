package test;

public class Admin extends SomeComplexC{
    private int id = 17;
    boolean frozen = false;

    private boolean isValid(int userId){
        return !frozen && userId == id;
    }

    public int getBalance(int userId){
        return isValid(userId) ? super.getBalance(userId) : 0;
    }

    public int takeBalance(int userId, int value){
        return isValid(userId) ? super.takeBalance(userId, value) : 0;
    }

    public void freeze(int userId){
        if(isValid(userId)) {
            frozen = true;
        }
    }
}
