public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] intsList = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(intsList));
    }

    public static int maxProfit(int[] prices) {
        int sellOne = 0;
        int holdOne = Integer.MIN_VALUE;
        for (final int price : prices ) {
            sellOne = Math.max(sellOne, holdOne + price);
            holdOne = Math.max(holdOne, -price);
        }

        return sellOne;
    }

}
