import app.Application;
import factories.GUIFactory;
import factories.MacOsFactory;
import factories.WindowsFactory;

public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            guiFactory = new MacOsFactory();
        } else {
            guiFactory = new WindowsFactory();
        }

        app = new Application(guiFactory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.render();
    }
}