package task_01_03;

public class MainIterratorr<T>{
    private T[] t;

    private int cnt;

    public MainIterratorr(T[] t) {
        this.t = t;
    }

    public  boolean hasNext(){
        return cnt < t.length && t[cnt] != null;
    }

    public  T next(){
        if(hasNext()){
        return t[cnt++];}
        return null;
    }
}
