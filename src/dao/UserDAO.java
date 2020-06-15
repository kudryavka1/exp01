package dao;

import java.util.HashMap;

public class UserDAO {
    static HashMap<String,String> users = new HashMap<>();
    static {
        users.put("zhangsan","123456");
        users.put("zhanghao","556778");

    }

    public static boolean register(String name,String password){
        if(users.containsKey(name)||name.trim().isEmpty()){
            System.out.println("注册失败");
            return false;
        }
        users.put(name,password);
        System.out.println("注册成功");
        return true;
    }

    public static boolean login(String name,String password){
        if(users.get(name)==null){
            System.out.println("该用户名不存在");
            return false;
        }

        if(!users.get(name).equals(password)){
            System.out.println("密码错误");
            return false;
        }
        System.out.println("登陆成功");
        return true;
    }

    private static boolean updatePassword(String name,String oldPassword,String password){
        if(!login(name,oldPassword)){
            System.out.println("旧密码错误");
            return false;
        }
        users.put(name,password);
        System.out.println("修改成功");
        return true;
    }

    public static void main(String[] args) {
        register("haha","123");//注册成功
        register("zh","5567786");//注册成功
        login("zh","5567786");//登陆成功
        login("zh1","5567786");//该用户名不存在
        login("zh","556778611");//密码错误
        updatePassword("zh","5567786","123");//登陆成功 修改成功
        login("zh","123");//登陆成功

    }

}
