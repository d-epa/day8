package user;

public class user {

    String name;
    int account;

    int amount;

    public user(String name , int account, int amount) {
        this.name = name;
        this.account = account;
        this.amount = amount;
    }
        public void printer() {
            System.out.println(this.name);
            System.out.println(this.account);
            System.out.println(this.amount);


        }
    }
