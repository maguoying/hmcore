package ren.maguoying.action.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private final String USERNAME = "maguoying";
    private final String PASSWORD = "123456";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String uname = req.getParameter("uname");
        String pword = req.getParameter("pword");
        PrintWriter pw = resp.getWriter();
        if(USERNAME.equals(uname) && PASSWORD.equals(pword))
        {
            pw.write("username and password is right!");
        }else
        {
            pw.write("username or password is wrong!");
        }
    }

}
