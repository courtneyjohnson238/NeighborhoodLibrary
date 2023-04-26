import java.util.Scanner;

public class NeighborhoodLibrary {

    private static Book[] books = new Book[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book(123, "21345", "Behold a Pale Horse");
        Book book2 = new Book(456, "21144", "Rich Dad Poor Dad");
        Book book3 = new Book(789, "54321", "The Secret");
        Book book4 = new Book(101, "34567", "Eve in Exile");
        Book book5 = new Book(345, "89103", "Mere Christianity");

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;


        boolean checkedOut = false;
        while (!checkedOut) {
            System.out.println("Pick an option");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("Exit - Close out of application");

            int command = scanner.nextInt();
            switch (command){
                case 1:
                    for (int i = 0; i < books.length; i++) {
                        System.out.println(books[i].getId()+ " " + books[i].getIsbn() + " " + books [i].getTitle());

            }
                    System.out.println("Select one option");
                    System.out.println("Select one to choose a book");
                    System.out.println("Press 2 to exit to home screen");

                    String Scanner = scanner.next();
                    if (Scanner.equals("1")) {
                        System.out.println("Please enter your name");
                    String userName = scanner.next();
                        System.out.println("Select a book");
                        int selectBook = scanner.nextInt();

                        for (int i = 0; i < books.length; i++) {
                            if (selectBook == books[i].getId()){
                                books[i].checkOut(userName);
                                System.out.println("Book" + books[i].getTitle() + "Has been checked out by" + userName);
                            }


                        }
                    }
                    if (Scanner.equals(("2")))
                    break;


        }
}}
    {
    }
}






