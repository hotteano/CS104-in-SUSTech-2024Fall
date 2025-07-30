import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Java");
        books[1] = new Book("C++");
        books[2] = new Book("Python");
        books[3] = new Book("Javascript");
        books[4] = new Book("C#");
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Please select operation: " +
                            "1. Borrow. 2. Return. 3. Overdue. 0. To Stop the process");
            int op = in.nextInt();
            if (op == 0)
                break;
            switch (op) {
                case 1:
                    borrowBook(in, books);
                    break;
                case 2:
                    returnBook(in, books);
                    break;
                case 3:
                    overdueAll(books);
                    break;
            }
        }
    }
    public static void borrowBook(Scanner in, Book[] books) {
        for(Book b:books)
        {
            if(b.getStatus().equals(BookStatus.IDLE)){
                System.out.println(b.toString());
            }
        }
        System.out.print("Please Enter Book ID:");
        int i=in.nextInt()-1;
        if(books[i].getStatus().equals(BookStatus.IDLE))
        {
            books[i].setStatus(BookStatus.BORROWED);
            System.out.printf("Book %s borrowed successfully.\n",books[i].getName());
        }
        else{
            System.out.printf("Book %s borrowed unsuccessfully.\n",books[i].getName());
        }
    }
    public static void returnBook(Scanner in, Book[] books) {
        for(Book b:books)
        {
            if(b.getStatus().equals(BookStatus.BORROWED)){
                System.out.println(b.toString());
            }
            if(b.getStatus().equals(BookStatus.OVERDUE)){
                System.out.println(b.toString());
            }
        }
        System.out.print("Please Enter Book ID:");
        int i=in.nextInt()-1;
        if(books[i].getStatus().equals(BookStatus.BORROWED)||books[i].getStatus().equals(BookStatus.OVERDUE))
        {
            books[i].setStatus(BookStatus.IDLE);
            System.out.printf("Book %s returned successfully.\n",books[i].toString());
        }
        else{
            System.out.printf("Book %s is not Borrowed.\n",books[i].toString());
        }
    }
    public static void overdueAll(Book[] books) {
        for(Book b:books)
        {
            if(b.getStatus().equals(BookStatus.BORROWED)){
                b.setStatus(BookStatus.OVERDUE);
            }
        }
        System.out.print("Setting all borrowed books to overdue\n");
        for(Book b:books)
        {
            if(b.getStatus().equals(BookStatus.OVERDUE)){
                System.out.print(b.toString()+"\n");
            }
        }
    }
}