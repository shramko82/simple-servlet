package ua.shramko.simpleservlet.servlet;

import ua.shramko.simpleservlet.controller.Controller;
import ua.shramko.simpleservlet.controller.ControllerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontServlet extends HttpServlet {



    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Controller controller = new ControllerImpl();
        controller.proceedRequest(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Controller controller = new ControllerImpl();
        controller.addNewComment(req, resp);
    }

}
