// 653380024-8 วิชชากร บุญประคม sec 2
public class Main {
    public static void main(String[] args) {
        //[Task-02]
        Student paul = new Student("Paul Lee",3.5);
        Student Peter = new Student("Peter Tan",3.9);
//        System.out.println(paul.getName());

        Peter.setGPA(4.00);
        System.out.println(Peter.getGPA());
        Student[] std_arr = new Student[2];
        std_arr[0] = paul;
        std_arr[1] = Peter;

        System.out.println(std_arr[0].getName());
        System.out.println(std_arr[1].getName());
        //[Task-04]
        Person james = new Person("james B",123456,"Male");
        Person jaapy = new Person("jaapy J",654321,"Male");
        System.out.println(james.getID() +" " + james.getNane() + " " + james.getGender());
        System.out.println(jaapy.getID() +" " + jaapy.getNane() + " " + jaapy.getGender());
        System.out.println();
        //[Task-06]
        Book book1 = new Book("0345","AI for ALL","blue",250.30);
        Book book2 = new Book("0111","The Funny math","Green",110.55);
        Book book3 = new Book("0277","The Moon","Yellow",1287.9);
        Book[] books = {book1,book2,book3};

        for (Book book : books) {
            System.out.print("ID = " + book.getBookID() + "\tName =  " + book.getBookName() + "\tColor =  " + book.getBookColor() + "\tPrice = " + book.getBookPrice());
            System.out.println();
        }

    }
}