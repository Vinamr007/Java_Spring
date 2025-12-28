package day5;
class library{
    int availablebook=3;
    public void bookborrow(int bookRequested){
        try{
            int[] books={101,102,103};
            System.out.println("book requested:"+books[bookRequested]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception occured, you requested a book that do not found");
        }
        finally {
            System.out.println("finally block");
        }
    }

}


public class libraryManagement {
    public static void main(String[] args) {
library library=new library();
library.bookborrow(2);

    }
}
