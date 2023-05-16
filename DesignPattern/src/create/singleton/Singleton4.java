package create.singleton;

public class Singleton4 {
    private Singleton4 () {}

    private static class SingletonInner {
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonInner.instance;
    }
}
