package OOP;

public class Hospital {

    public Hospital() {}


    public Hospital(String  name,String address)
    {
        this.name= name;
        this.address= address;
    }

    private String name;
    private String address;


    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public void setName(String name){
        this.name= name;
    }
    public void setAddress(String address){
        this.address= address;
    }


    public void updateDetails(String name, String address) {
        this.name = name;
        this.address = address;
    }




}
