public class Singleton {
    private volatile static Singleton uniqueInstance;

    //other useful instance variable here

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }

        }
        return uniqueInstance;
    }

    //other useful methods here
}
