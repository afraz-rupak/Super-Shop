class Buy {
    Product item;
    Customer customer;
    Buy(Product item,Customer customer)
    {
        this.item=item;
        this.customer = customer;
    }
    void display()
    {
        if(item.availibility.equals("yes")){
            double cost=item.price;
            cost=cost*102.0/100.0;
            if(customer.type.equals("golden")){
                cost=cost*95.0/100.0;
            }if(customer.type.equals("silver")){
                cost=cost*97.0/100.0;
            }
            System.out.println("Buy item : "+item.name+" at cost : "+cost);
        }else{
            System.out.println("no item available");
        }
        item.display();
        customer.display();
    }
    
}