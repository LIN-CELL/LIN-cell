package com.app.user;

public interface UserService {
    public int login(UserLnfo userLnfo);

    public Boolean register(UserLnfo userLnfo);

    public String FindPassword(String name);
}
