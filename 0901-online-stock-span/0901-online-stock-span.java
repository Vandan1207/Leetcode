class StockSpanner {
    
    ArrayList<Integer> stockPrices;
    Stack<Integer> prevHigh;
    Integer currDay;

    public StockSpanner() {
        currDay=0;
        stockPrices = new ArrayList<>();
        prevHigh = new Stack<>();
    }
    
    public int next(int price) {
        while(!prevHigh.isEmpty()&& stockPrices.get(prevHigh.peek())<= price){
            prevHigh.pop();
        }
        if(prevHigh.isEmpty()){
            int span = currDay+1;
            stockPrices.add(price);
            prevHigh.push(currDay++);
            return span;
        }else{
            int span = currDay - prevHigh.peek();
            stockPrices.add(price);
            prevHigh.push(currDay++);
            return span;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */