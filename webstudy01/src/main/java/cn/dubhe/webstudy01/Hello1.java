package cn.dubhe.webstudy01;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Hello1 implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("2 init 初始化方法");
        System.out.println("HelloServlet 程序的别名是:" + config.getServletName());
        System.out.println("初始化参数 username 的值是:" + config.getInitParameter("username"));
        System.out.println("初始化参数 url 的值是:" + config.getInitParameter("url"));
        System.out.println(config.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Hello Servlet 被访问了");
        //向下转型，调用子接口中的方法
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        //获取请求方式
        String method = httpRequest.getMethod();
        if("GET".equals(method)){
            doGet();
        }
        else {
            doPost();
        }

    }

    private void doPost() {
        System.out.println("POST请求");
    }

    private void doGet() {
        System.out.println("Get请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy销毁方法");
    }
}
