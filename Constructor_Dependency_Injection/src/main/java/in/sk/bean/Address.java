package in.sk.bean;

public class Address {
    private int houseno;
    private String city;
    private int pincode;


    //Contructors Dependency Injection

    public Address(int houseno, String city, int pincode){  //setting values using constructor
        this.houseno=houseno;
        this.city=city;
        this.pincode=pincode;
    }

//    public void setHouseno(int houseno){
//        this.houseno=houseno;
//    }
//
//    public void setCity(String city){
//        this.city=city;
//    }
//
//    public void setPincode(int pincode){
//        this.pincode=pincode;
//    }


    @Override
    public String toString() {
        return "#"+houseno+", "+city+"-"+pincode;
    }
}
