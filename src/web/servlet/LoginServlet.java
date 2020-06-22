package web.servlet;


import dao.UserDao;
import domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


@WebServlet("/loginServlet")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
     /*   String username = req.getParameter("username");
        String password = req.getParameter("password");
        User LoginUser = new User();
        LoginUser.setUsername(username);
        LoginUser.setPassword(password);*/

     //获取所有请求参数
        Map<String, String[]> map = req.getParameterMap();
        //创建User对象
        User LoginUser = new User();
        //使用BeanUtils封装
       /* BeanUtils.populate(Object obj,Map map):将map集合的键值对信息，封装到对应的JavaBean对象中
                                          map键为对象属性，map值为对象属性值*/

        try {
            BeanUtils.populate(LoginUser,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }



        UserDao dao = new UserDao();
        User user = dao.login(LoginUser);
        if(user==null){
            //登陆失败
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }else {
            //登陆成功
            req.setAttribute("user",user);//存储数据
            req.getRequestDispatcher("/successServlet").forward(req,resp);//转发
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
