package design.patterns;

/** SINGLETON
 * Problems
   - Ensure that a class has a single instance.
   - Provide global access point to instance.

 * Design Considerations
   - Responsible for lifecycle
   - Static in nature
   - Needs to be thread safe
   - Private instance
   - Private Constructor
   - No parameters required for construction

 **/

public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
        if(instance != null) { // To avoid reflection
            throw new RuntimeException("Use getInstance() method.");
        }
    }

    public static Singleton getInstance() {

        if(instance == null) { // Lazy loading
            synchronized (Singleton.class) { // Sync. class
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
