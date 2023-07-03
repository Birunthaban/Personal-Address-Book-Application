import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int option ;

        while(true){
            System.out.println("######### Contact System #########");
            System.out.println("1. Add new contact ");
            System.out.println("2. Display all contacts ");
            System.out.println("3. Search contact ");
            System.out.println("4. Delete contact ");
            System.out.println("5. Close contact book  ");
            System.out.println(" What do you want to do (enter the option number)");
            option = scanner.nextInt();
            switch (option){
                case 1 :
                    System.out.println("Name of the Contact :");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Name of the Contact :");
                    String phoneNumber= scanner.next();
                    scanner.nextLine();
                    System.out.println("Name of the Contact :");
                    String emailAddress = scanner.next();
                    scanner.nextLine();
                    System.out.println("Name of the Contact :");
                    String address = scanner.next();
                    scanner.nextLine();
                    addressBook.addContact(name,phoneNumber, emailAddress,address);
                    break;
                case 2:
                    addressBook.displayAllContact();
                    break;
                case 3 :
                    System.out.println("Name of the Contact :");
                    String nameToSearch= scanner.nextLine();

                    addressBook.searchContact(nameToSearch);
                    break ;
                case 4 :
                    System.out.println("Email address of the Contact :");
                    String contactToDelete= scanner.nextLine();
                    addressBook.removeContact(contactToDelete);
                    break ;
                case 5 :
                    System.exit(0);

            }


        }






    }
}