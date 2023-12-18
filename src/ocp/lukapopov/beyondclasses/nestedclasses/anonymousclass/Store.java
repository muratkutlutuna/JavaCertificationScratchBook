package ocp.lukapopov.beyondclasses.nestedclasses.anonymousclass;

public class Store {
    abstract class Sale{
        abstract int discount();
    }

    public int newPrice(int oldPrice) {
        Sale sale = new Sale(){//sale is an instance of the anonymous class{...}
                               // with the implementation of discount() method
                               // from abstract class Sale
            int discount(){return 2;}
        };
        return oldPrice - sale.discount();
    }

    interface Procurement{
        int discount();
    }

    public int newCost(int oldCost){
        Procurement procurement = new Procurement(){
           public int discount(){return 2;}//implementation of interface method must be public
        };
        return oldCost - procurement.discount();
    }

}

