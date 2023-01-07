// 653380024-8 sec2 วิชชากร บุญประคม

import java.util.ArrayList;

public class Post {
    private String postDetail;
    private User user;
    private ArrayList<Comment> comments;

    public Post(String postDetail, User user) {
        this.postDetail = postDetail;
        this.user = user;
        this.comments = new ArrayList<>();
    }

    public Post() {
        this.postDetail = "";
        this.user = null;
        this.comments = new ArrayList<>();
    }

    public void Show() {
        if (user == null) {
            System.out.println("Error the User is Null");
        } else {
            System.out.println("name " + user.getName());
            System.out.println("Post " + postDetail);
            System.out.println("---comment---");
            System.out.println(comments.size() + " comment");
            for (Comment comment : comments) {
                System.out.println("comment =" + comment.getCommentDetail());
                System.out.println("\t\tBy = " + comment.getUser().getName());
            }
        }
    }

    public String getPostDetail() {
        return postDetail;
    }

    public void setPostDetail(String postDetail) {
        this.postDetail = postDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(String comments, User user) {
        this.comments.add(new Comment(comments, user));
    }
}
