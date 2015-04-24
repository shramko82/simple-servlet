package ua.shramko.simpleservlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Controller {

  void proceedRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
  void addNewComment(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
  void deleteComment(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
