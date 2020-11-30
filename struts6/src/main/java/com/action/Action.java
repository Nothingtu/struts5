package com.action;

public class Action {
    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        System.out.println(name+"---"+password);
        if("zhangsan".equals(name) && "123".equals(password)){
            return "1";
        }else{
            return "2";
        }
    }
}
