package com.chinasoft.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * 1.创建JavaEE项目
 * 2.定义一个类,实现Servlet接口
 * 3.重写接口中的抽象方法
 * 4.配置servlet中的web.xml
 *
 */
public class Book implements Servlet {

    /**
     * 初始化方法
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *
     * 工作方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("JAVA");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     */
    @Override
    public void destroy() {

    }
}
