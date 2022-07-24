public class Main {
    public static void main(String[] args) {
        long[] sales = {9, 2, 2, 2, 7, 11, 15,};
        SalesManager salesman = new SalesManager(sales);
        System.out.println("Максимальные продажи:  " + salesman.max());
        System.out.println("Минимальные продажи:  " + salesman.min());
        System.out.println("Средние продажи:  " + salesman.averageCut());
    }
}