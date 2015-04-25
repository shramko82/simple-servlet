package ua.shramko.simpleservlet.data;


import ua.shramko.simpleservlet.model.Comment;

import java.util.*;

public class ApplicationData {
    Integer commentId = 0;
    Map<Integer, Comment> comments = new HashMap<>();

    private static ApplicationData instance;

    private ApplicationData() {
        initializeData();

    }

    private void initializeData() {
        Comment newComment;
        newComment = new Comment(++commentId, "Comment 1", new GregorianCalendar(2014, 11, 25).getTime());
        comments.put(newComment.getId(), newComment);
        newComment = new Comment(++commentId, "Comment 2", new GregorianCalendar(2013, 6, 10).getTime());
        comments.put(newComment.getId(), newComment);
        newComment = new Comment(++commentId, "Comment 3", new GregorianCalendar(2015, 1, 20).getTime());
        comments.put(newComment.getId(), newComment);
    }

    public static ApplicationData getInstance() {
        if (instance == null)
            instance = new ApplicationData();
        return instance;
    }

    public Comment getCommentById(Integer id) {
        return comments.get(id);
    }

    public Comment addComment(String text) {
        Comment newComment = new Comment(++commentId, text, new Date());
        comments.put(newComment.getId(), newComment);
        return newComment;
    }

    public List<Comment> getAllComments() {
        return new ArrayList<>(comments.values());
    }

    public void deleteCommentById(Integer commentId) {
        comments.remove(commentId);
    }


}
