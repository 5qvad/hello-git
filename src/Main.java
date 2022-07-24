public class Main {
    public static void main (String [] args){
        int [] sales = {6, 4, 2, 2, 7, 4, 5};
        SalesManager salesman = new SalesManager(sales);
        System.out.println("Максимальные продажи:  " + salesman.max());
        System.out.println("Минимальные продажи:  " + salesman.min());
        System.out.println("Средние продажи:  " + salesman.averageCut());
    }
}