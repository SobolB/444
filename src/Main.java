public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = service.calculate(true, 1100, 100, 1000);
        System.out.println(cost);
    }
}
