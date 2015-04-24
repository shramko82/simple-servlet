package ua.shramko.simpleservlet.dao;

import ua.shramko.simpleservlet.model.Comment;

import java.util.List;

public interface CommentDao {
  Comment getCommentById(Integer id);

  List<Comment> getAll();

  Comment add(String text);

  void deleteCommentById(Integer commentId);
}
