class CustomStack {
    int i=0 , arr[];
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(i<arr.length){
            arr[i] = x;
            i++;
        }
    }
    
    public int pop() {
        int num = i==0 ?  -1 :  arr[--i];
        return num;
    }
    
    public void increment(int k, int val) {
        if(i<k) k=i;
        for(int j=0 ; j<k ; j++){
            arr[j] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */