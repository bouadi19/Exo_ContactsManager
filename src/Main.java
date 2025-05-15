public class Main {
    public static void main(String[] args){
        ContactsManager  myContactsManager = new ContactsManager();

        Contact contact = new Contact();
        contact.name = "Corine";
        contact.phoneNumber = "0766889651";
        myContactsManager.addContact(contact);

        Contact contact1 = new Contact();
        contact1.name = "Stephie";
        contact1.phoneNumber = "0700987211";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Mamie";
        contact2.phoneNumber = "0256437898";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Emmanuella";
        contact3.phoneNumber = "0890986433";
        myContactsManager.addContact(contact3);

        Contact phone = myContactsManager.searchContact("Emmanuella");

        System.out.println(phone.phoneNumber);
    }
}