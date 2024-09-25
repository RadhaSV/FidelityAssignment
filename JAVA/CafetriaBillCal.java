package small.example;

public class CafetriaBillCal {
    public static void main(String[] args){
        int PIZZA_PRICE = 200,PUFF_PRICE = 40,PEPSI_PRICE = 120;
        int NoOfPizzas = 5,NoOfPuffs = 6,NoOfPepsis = 2;

        int TotalcostofPizzas = CalTotalCost(PIZZA_PRICE,NoOfPizzas);
        int TotalcostofPuffs = CalTotalCost(PUFF_PRICE,NoOfPuffs);
        int TotalcostofPepsi = CalTotalCost(PEPSI_PRICE,NoOfPepsis);

        int GrandTotal = TotalcostofPizzas+TotalcostofPuffs+TotalcostofPepsi;
        Displaybill(TotalcostofPizzas,TotalcostofPuffs,TotalcostofPepsi,GrandTotal);

    }

    public static int CalTotalCost(int price,int quantity){
        return price*quantity;
    }

    public static void Displaybill(int pizza,int puffs,int pepsi,int total){
        System.out.println("---------BILL DETAILS--------");
        System.out.println("Total cost of Pizzas : "+ pizza);
        System.out.println("Total cost of Puffs : "+ puffs);
        System.out.println("Total cost of Pepsis : "+ pepsi);
        System.out.println("-------------------------------");
        System.out.println("Grand Total          :" +total);
    }

}
