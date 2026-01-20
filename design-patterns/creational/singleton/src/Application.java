public class Application {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        System.out.println(s1.hashCode());

        ThreadSafeSingleton s2 = ThreadSafeSingleton.getInstance();
        System.out.println(s2.hashCode());

        // and so on
    }
}
