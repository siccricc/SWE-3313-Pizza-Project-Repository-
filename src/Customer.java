public class Customer {

    private static int customerID = 0;

    // login
    private String username;
    private String password;
    private int phoneNumber;

    // address
    private String street;
    private String city;
    private String state;
    private int postal;
    private String country;

    

    //Constructors
    Customer() {
        customerID++;
    }

    Customer(String name, int phoneNumber, String password, String street,
        String city, String state, int postal, String country) {
        this.username = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.street = street;
        this.postal = postal;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    //Getters and Setters
    public int getCustomerID() {
		return customerID;
	}

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostal() {
        return this.postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}   
