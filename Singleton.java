public class Singleton{
    private static Singleton ts;
    private Singleton(){

    }
    /**
     * 
     * lazy model
     */
    // public static Singleton getObj(){
    //     if(ts==null){
    //         ts=new Singleton();
    //     }
    //     return ts;
    // }
    /**
     * hungry model
     */
    static{
        ts=new Singleton();
    }
    public static Singleton getObj(){
        return ts;
    }
}