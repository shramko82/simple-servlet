package ua.shramko.simpleservlet.dao;

import ua.shramko.simpleservlet.data.ApplicationData;
import ua.shramko.simpleservlet.model.Comment;

import java.util.List;

public class CommentDaoImpl implements CommentDao {
  @Override
  public Comment getCommentById(Integer id) {
    ApplicationData appData = ApplicationData.getInstance();
    return appData.getCommentById(id);
  }

  @Override
  public List<Comment> getAll() {
    ApplicationData appData = ApplicationData.getInstance();
    return appData.getAllComments();
  }

  @Override
  public Comment add(String text) {
    ApplicationData appData = ApplicationData.getInstance();
    return appData.addComment(text);
  }

  @Override
  public void deleteCommentById(Integer commentId) {
    ApplicationData appData = ApplicationData.getInstance();
    appData.deleteCommentById(commentId);
  }
}
