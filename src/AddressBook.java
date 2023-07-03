import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(String name, String phoneNumber, String emailAddress, String address) {
        boolean isAlreadyInUse =false;
        for (Contact contact: contacts){
            if (contact.getEmailAddress().equals(emailAddress)){
               isAlreadyInUse =true ;
               break;
            }

        }
        if(isAlreadyInUse){
            System.out.println("Email Already In Use");
        }
        else{
            contacts.add(new Contact ( name,phoneNumber, emailAddress,address));
        }



    }

    public  String removeContact(String emailAddress) {
        int addressFound =0;
        for (Contact contact : contacts) {
            if (contact.getEmailAddress().equals(emailAddress)) {
                addressFound=1;
                contacts.remove(contact);
            }
        }
        if(addressFound==0){
            return "Contact Not Found";
        }
        else{
            return "Contact  Found" ;
        }
    }
    public void searchContact(String name) {

        ArrayList<Contact> foundList = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().contains(name)) {
                foundList.add(contact);
            }
        }

    }
    public void displayAllContact(){
        for (Contact contact : contacts){
            System.out.println();
            System.out.println("Name : " + contact.getName());
            System.out.println("Phone Number : "+contact.getPhoneNumber());
            System.out.println("Email Address  : "+contact.getEmailAddress());
            System.out.println("Address : "+ contact.getAddress());
            System.out.println();
        }
    }

    // use one function for display

}
