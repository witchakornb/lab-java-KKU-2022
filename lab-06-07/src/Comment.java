// 653380024-8 sec2 วิชชากร บุญประคม
public class Comment {
    private String commentDetail;
    private User user;

    public Comment() {
        commentDetail = "";
        this.user = null;
    }

    public Comment(String commentDetail, User user) {
        this.commentDetail = commentDetail;
        this.user = user;
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
