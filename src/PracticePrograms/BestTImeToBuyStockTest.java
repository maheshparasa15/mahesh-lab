package PracticePrograms;

public class BestTImeToBuyStockTest {
    public static void main(String[] args) {
        int[] days = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfitToBuy(days));
    }

    private static int maxProfitToBuy(int[] days) {

        int sellOne = 0;
        int holdOne = Integer.MIN_VALUE;
        for (int day : days) {
            sellOne = Math.max(sellOne, holdOne + day);
            holdOne = Math.max(holdOne, -day);
        }
        return sellOne;
    }
        //       int sellOne = 0;
//       int holdOne = Integer.MIN_VALUE;
//       for (int dauy : days) {
//           sellOne = Math.max(sellOne, holdOne + dauy);
//           holdOne = Math.max(holdOne, - dauy);
//       }
//        return sellOne;
//    }
}
