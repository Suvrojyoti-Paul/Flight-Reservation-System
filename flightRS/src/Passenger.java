public class Passenger {

    private static int idCounter = 0;
    private int id;

    private Contact contact;
    private  Address address;

    private static class Address{
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact{
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public Passenger(String street, String city, String state, String name, String phone, String email){
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressDetails(){

        return  "Street :" + address.street + ", City :" + address.city + ", State : " + address.state;

    }

    public String getContactDetails(){

        return  "Name :" + contact.name + ", Phone :" + contact.phone + ", Email : " + contact.email;

    }

    public static int getPassengerCount(){
        return  idCounter;
    }

    @Override
    public String toString() {
        String s = "Passenger{" +
                "id=" + id +
                ", contact=" + contact +
                ", address=" + address +
                '}';
        return s;
    }
}
