public class BestTimeToBuySellStock {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        int minPrice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                maxprofit=Math.max(maxprofit,prices[i]-minPrice);
            }
        }
        System.out.println("MAX profit:"+maxprofit);
    }
}
