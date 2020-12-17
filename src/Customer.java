
public class Customer {

    String custId;
    String name;
    String address;
    String type;
    
    Customer(String custId,String name,String address,String type)
    {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.type = type;
    }
    void display()
    {
        System.out.println(" Customer ID: "+custId+"\n"+" Customer Name: "+name+"\nCustomer address : "+address+"\nCustomer type : "+type);
    }
}