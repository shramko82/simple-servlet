package ua.shramko.simpleservlet.service;

import ua.shramko.simpleservlet.model.Comment;

import java.util.List;

public interface CommentService {
  List<Comment> getAll();
  Comment getCommentById(Integer id);
  Comment addNewComment(String text);
  void deleteCommentById(Integer commentId);
}
