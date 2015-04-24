package ua.shramko.simpleservlet.service;

import ua.shramko.simpleservlet.dao.CommentDao;
import ua.shramko.simpleservlet.dao.CommentDaoImpl;
import ua.shramko.simpleservlet.model.Comment;

import java.util.List;

public class CommentServiceImpl implements CommentService {
  @Override
  public List<Comment> getAll() {
    CommentDao commentDao = new CommentDaoImpl();
    return commentDao.getAll();
  }

  @Override
  public Comment getCommentById(Integer id) {
    CommentDao commentDao = new CommentDaoImpl();
    return commentDao.getCommentById(id);
  }

  @Override
  public Comment addNewComment(String text) {
    CommentDao commentDao = new CommentDaoImpl();
    return commentDao.add(text);
  }

  @Override
  public void deleteCommentById(Integer commentId) {
    CommentDao commentDao = new CommentDaoImpl();
    commentDao.deleteCommentById(commentId);
  }
}
