package bean;

// URL:http://localhost:8888/javaweb/counter.jsp
// 実行時エラーとなってしまう
// 原因不明　環境か？

public class CounterBean {
    private int count;

    public CounterBean() {
        count = 0;
    }
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        count ++;
        return count;
    }
}
