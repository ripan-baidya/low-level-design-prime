/**
 * Double-Checked Singleton
 */
public class DoubleCheckedSingleton {

    // Making the instance volatile to ensure visibility of
    // changes across threads
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        // First check (not synchronized) to improve performance
        if (instance == null) {
            // Synchronize on the class object
            synchronized (DoubleCheckedSingleton.class) {
                // Second check (synchronized) to ensure thread safety
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }

        return instance;
    }
}