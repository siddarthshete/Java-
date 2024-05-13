import java.util.Scanner;

class Publication {
    protected String title;
    protected double price;

    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}

class Book extends Publication {
    private int pageCount;

    public Book(String title, double price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

   // @Override
    public void display() {
        super.display();
        System.out.println("Page Count: " + pageCount+ " pages");
    }
}

class Tape extends Publication {
    private int playTime;

    public Tape(String title, double price, int playTime) {
        super(title, price);
        this.playTime = playTime;
    }

  //  @Override
    public void display() {
        super.display();
        System.out.println("Play Time: " + playTime + " minutes");
    }
}

// Main class
class pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        try {
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Enter Book Information");
                System.out.println("2. Enter Cassette Information");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        enterBookInformation();
                        break;
                    case 2:
                        enterCassetteInformation();
                        break;
                    case 0:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } while (choice != 0);
        } catch (Exception e) {
            // Catch any exception and replace values with zeroes
            System.out.println("Exception caught. Resetting values to zero.");
           // e.printStackTrace();
            resetValues();
        } finally {
            scanner.close();
        }
    }

    private static void enterBookInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Book Price: $");
        double price = scanner.nextDouble();

        System.out.print("Enter Page Count: ");
        int pageCount = scanner.nextInt();

        // Create a Book object and display information
        Book book = new Book(title, price, pageCount);
        book.display();
    }

    private static void enterCassetteInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Cassette Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Cassette Price: $");
        double price = scanner.nextDouble();

        System.out.print("Enter Play Time (minutes): ");
        int playTime = scanner.nextInt();

        // Create a Tape object and display information
        Tape tape = new Tape(title, price, playTime);
        tape.display();
    }
    private static void resetValues() {
        // Reset values to zero
        System.out.println("Resetting values to zero.");
    
        Book book = new Book("", 0, 0);
        book.display();
        
        
        Tape tape = new Tape("", 0, 0);
        tape.display();
        
    }
}



