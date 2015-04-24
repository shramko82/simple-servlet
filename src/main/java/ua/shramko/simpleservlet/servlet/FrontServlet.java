package ua.shramko.simpleservlet.servlet;

import ua.shramko.simpleservlet.controller.Controller;
import ua.shramko.simpleservlet.controller.ControllerImpl;
import ua.shramko.simpleservlet.util.Operation;
import ua.shramko.simpleservlet.util.OperationType;
import ua.shramko.simpleservlet.util.UrlParser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Controller projectController = new ControllerImpl();
        projectController.proceedRequest(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();
        Operation operation = new UrlParser().parse(url);
        Controller controller = new ControllerImpl();
        if (operation.getOperationType() == OperationType.ADD_ITEM) {
            controller.addNewComment(req, resp);
        } else if (operation.getOperationType() == OperationType.DELETE_ITEM) {
            controller.deleteComment(req, resp);
        }
    }

}
