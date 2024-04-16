public class Customer{

    Customer(){}
    private String name;
    private int ID;
    private int phone_number;
    private String password;
    private String street;
    private String city;
    private String state;
    private int postal;
    private String country;

    Customer(String name, int ID, int phone_number,String password,String street,String city,String state,int postal,String country){
        this.name=name;
        this.phone_number=phone_number;
        this.ID=ID;
        this.password=password;
        this.street=street;
        this.postal=postal;
        this.city=city;
        this.state=state;
        this.country=country;
    }

}
