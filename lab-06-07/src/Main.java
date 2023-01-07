// 653380024-8 sec2 วิชชากร บุญประคม
public class Main {
    public static void main(String[] args) {
        User user = new User("0001", "james");
        User u2 = new User("0002", "kkk");
        Post Post = new Post("Hello world", user);
        Post.setComments("good1", u2);
        Post.setComments("good2", user);
        Post.setComments("good3", user);
        Post.Show();
    }
}