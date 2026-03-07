package Array;

class Stock {
    public static void main(String[] args) {
        Stock ob = new Stock();
        int[] prices = {7,1,5,3,6,4};
        int max = ob.maxProfit(prices);
        System.out.print(max);


    }
    public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for(int price : prices){

                if(price < minPrice){
                    minPrice = price;
                }

                int profit = price - minPrice;

                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }
    }

