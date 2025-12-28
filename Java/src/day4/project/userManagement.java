package day4.project;

import java.util.*;

public class userManagement {
    public static void main(String[] args) {
        Set<String> user1Roles=new HashSet<>(Arrays.asList("admin","user"));

        user user1 = new user(true,"alice", user1Roles);

        List<user> users=new ArrayList<>();
        users.add(user1);

    }
}
