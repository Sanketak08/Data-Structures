package Array;

public class Problem_II_20 {
    public static void main(String[] args) {
        int[] arr = { 2, 30, 15, 10, 8, 25, 80 };
        System.out.println("Result -> " + maxProfit(arr));
    }
    
    static int maxProfit(int[] arr) {
        // Going from left to right and finding out max profit => if stock sold today on which day it 
        // should be purchased
        int maxProfitTillTodaySold = 0; // To save max profit
        int leastValueTillToday = arr[0]; // Stock value
        int[] storeMaxProfitSold = new int[arr.length]; // To store all the max profits of last transactions

        for (int i = 1; i < arr.length; i++) {
            leastValueTillToday = Math.min(leastValueTillToday, arr[i]);
            maxProfitTillTodaySold = arr[i] - leastValueTillToday;

            // Storing max value to the current index of store
            if (maxProfitTillTodaySold > storeMaxProfitSold[i - 1]) {
                storeMaxProfitSold[i] = maxProfitTillTodaySold;
            } else {
                storeMaxProfitSold[i] = storeMaxProfitSold[i - 1];
            }
        }

        // Going from right to left and finding out max profit => if stock bought today on which day it 
        // should be sold

        int maxProfitTillTodayBought = 0; // To save max profit
        int maxValueAfterToday = arr[arr.length - 1]; // Max Stock value after today
        int[] storeMaxProfitBought = new int[arr.length];

        // Looping in reverse order from 2nd last element
        for (int i = arr.length - 2; i >= 0; i--) {
            maxValueAfterToday = Math.max(maxValueAfterToday, arr[i]);
            maxProfitTillTodayBought = maxValueAfterToday - arr[i];

            // Storing max value to the current index of store
            if (maxProfitTillTodayBought > storeMaxProfitBought[i + 1]) {
                storeMaxProfitBought[i] = maxProfitTillTodayBought;
            } else {
                storeMaxProfitBought[i] = storeMaxProfitBought[i + 1];
            }
        }

        int overallProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            overallProfit = Math.max(overallProfit, (storeMaxProfitBought[i] - storeMaxProfitSold[i]));
        }
        return overallProfit;
    }
}
