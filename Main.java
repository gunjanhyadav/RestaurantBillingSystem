public class Main {
    public static void main(String[] args) {
        //dish and cost are in same order
        String[] dish = {"Sandwich","Coffee","French Fries","Salad"};
        double[] cost = {6.5,3.2,4.0,3.5};
        Bill myBill = new Bill();
        //pass copies of array references
        myBill.addOrder("Sandwich",2,dish,cost);
        myBill.addOrder("Coffee",1,dish,cost);
        myBill.addOrder("French Fries",1,dish,cost);
        myBill.addOrder("salad",1,dish,cost);
        myBill.getOrder();
        System.out.println(myBill.getTotal());


    }
}