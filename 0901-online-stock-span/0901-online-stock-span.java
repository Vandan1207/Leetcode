class StockSpanner {
    Stack<Integer> s;
    int currDay =0;
    ArrayList<Integer> stockPrice;
    public StockSpanner() {
        s= new Stack<>();
        stockPrice = new ArrayList<>();
    }
    
    public int next(int price) {
        while(!s.isEmpty() && price>=stockPrice.get(s.peek())){
            s.pop();
        }

        if(s.isEmpty()){
            stockPrice.add(price);
            s.push(currDay);
            return ++currDay;
        }else{
            int span = currDay - s.peek();
            stockPrice.add(price);
            s.push(currDay);
            currDay++;
            return span;
        }

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */