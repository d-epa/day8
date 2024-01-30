package user;

import java.util.HashMap;
import java.util.Map;

public class bank {
    public static void main(String[] args) {
        user u1=new user("raj",122,23);
        user u2=new user("balu",45,89);
        HashMap<Integer,user>list=new HashMap<>();
        list.put(1,u1);
        list.put(2,u2);
        for (Map.Entry<Integer,user>user:list.entrySet()){
            user userData=user.getValue();
            userData.printer();

        }
    }

}
