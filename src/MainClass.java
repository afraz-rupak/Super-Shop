

public class MainClass {

    public static void main(String[]args)
    {
        Shop agora = new Shop("Agora Super Shop");
        Product itm1 = new Product(811,"Meat",750,"yes");
        Product itm2 = new Product(702,"Sos",80,"no");
        Outlet ol  = new Outlet(agora,itm1);
        Customer c = new Customer("122","Rahim","dhanmondi","golden");
        Buy buy= new Buy(itm1,c);
        //Buy buy2= new Buy(itm2,c);
        buy.display();
        //buy2.display();
        //ol.display();
    }
}