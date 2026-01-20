import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Break Singleton Pattern
 * 1. Using Reflection
 * 2. Using Serialization
 */
public class BreakSingletonPattern {

    /* Breaking Singleton using Reflection */

    static void breakSingletonUsingReflection() throws Exception {
        // With the help of reflection we are accessing the private constructor
        Constructor<Singleton> constructors = Singleton.class.getDeclaredConstructor();

        // Making the private constructor accessible
        constructors.setAccessible(true);

        // Creating a new instance of Singleton using Singleton class itself
        // and using reflection
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = constructors.newInstance();

        // The hashcode of both the instances will be different
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance2.equals(instance1)); // false
    }

    /* Breaking Singleton using Serialization */

    static void breakSingletonUsingSerialization() throws Exception {

        Singleton instance1 = Singleton.getInstance();

        // Serializing the instance
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"));
        oos.writeObject(instance1);
        oos.close();

        // Deserializing the instance
        ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("file"));
        Singleton instance2 = (Singleton) ooi.readObject();
        ooi.close();

        // The hashcode of both the instances will be different
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance2.equals(instance1)); // false
    }
}

/**
 * Singleton class, Lazy initialization
 * Note: This class implements Serializable to prevent the singleton pattern
 * from being broken using serialization and implements readResolve() to
 * prevent the singleton pattern from being broken using deserialization.
 */

class Singleton implements Serializable {

    private static final long serialVersionUID = 1L;
    private static boolean initialized = false;
    private static Singleton instance;

    // Prevents reflection attack
    private Singleton() {
        if (initialized) {
            throw new RuntimeException("Reflection Attack detected!");
        }
        initialized = true;
    }

    // Prevents deserialization attack
    protected Object readResolve() {
        return instance;
    }

    // Lazy initialization
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}