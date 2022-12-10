// 653380024-8 วิชชากร บุญประคม sec 2
public class Book {
    //[Task-05]
    private String BookID;
    private String BookName;
    private String BookColor;
    private double BookPrice;

    public Book(){
        this.BookID = "";
        this.BookName = "";
        this.BookColor = "";
        this.BookPrice = 0.0;
    }
    public Book(String BookID , String BookName,String BookColor,double BookPrice){
        this.BookID = BookID;
        this.BookName = BookName;
        this.BookColor = BookColor;
        this.BookPrice = BookPrice;
    }
    public String getBookID(){
        return this.BookID;
    }
    public String getBookName(){
        return this.BookName;
    }
    public String getBookColor(){
        return this.BookColor;
    }
    public double getBookPrice(){
        return this.BookPrice;
    }
    public void setBookID(String bookID){
        this.BookID = bookID;
    }
    public void setBookName(String bookName){
        this.BookName = bookName;
    }
    public void setBookColor(String bookColor){
        this.BookColor = bookColor;
    }
    public void setBookPrice(double bookPrice){
        this.BookPrice = bookPrice;
    }
}
