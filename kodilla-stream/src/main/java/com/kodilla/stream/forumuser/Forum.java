package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(125933, "adam128", 'M',2000,9,17,1231));
        usersList.add(new ForumUser(237633, "aga675", 'F',1995,4,1,5));
        usersList.add(new ForumUser(478546, "pete344", 'M',1987,2,19,0));
        usersList.add(new ForumUser(747854, "maat543", 'M',1983,10,22,121));
        usersList.add(new ForumUser(123563, "tea666", 'F',2000,1,19,2231));
        usersList.add(new ForumUser(936468, "tomm33", 'M',1999,7,9,131));
        usersList.add(new ForumUser(157546, "leo77", 'M',2002,9,16,123));
        usersList.add(new ForumUser(843866, "evva646", 'F',2005,8,18,231));
        usersList.add(new ForumUser(468453, "gregg22", 'M',1992,11,22,31));
        usersList.add(new ForumUser(378678, "ullaa11", 'F',1998,2,6,12));
        usersList.add(new ForumUser(487788, "ted44", 'M',1988,9,10,0));
        usersList.add(new ForumUser(127485, "ada99", 'F',2000,1,26,12));
        usersList.add(new ForumUser(145933, "adam127", 'M',2000,10,20,12));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);

    }
}
