package ua.shramko.simpleservlet.controller;

import ua.shramko.simpleservlet.model.Comment;
import ua.shramko.simpleservlet.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ControllerImpl implements Controller {
    @Override
    public void proceedRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String page = "/index.jsp";
        CommentService commentService = new CommentServiceImpl();
        List<Comment> comments = commentService.getAll();

        req.setAttribute("comments", comments);

        RequestDispatcher dispatcher = req.getRequestDispatcher(page);
        dispatcher.forward(req, resp);
    }

    @Override
    public void addNewComment(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = "/index.jsp";
        try {
            String newComment = req.getParameter("newComment");
            if (!newComment.equals("")) {
                    CommentService commentService = new CommentServiceImpl();
                    commentService.addNewComment(newComment);
            }
        } catch (NumberFormatException e) {
            resp.sendRedirect("/error");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher(page);
        dispatcher.forward(req, resp);
    }

    @Override
    public void deleteComment(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer commentId = 0;
        String page = "/index.jsp";
        try {
            commentId = Integer.parseInt(req.getParameter("commentId"));
            if (commentId > 0) {
                CommentService commentService = new CommentServiceImpl();
                commentService.deleteCommentById(commentId);
            }
        } catch (NumberFormatException e) {
            resp.sendRedirect("/error");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher(page);
        dispatcher.forward(req, resp);
    }
}




