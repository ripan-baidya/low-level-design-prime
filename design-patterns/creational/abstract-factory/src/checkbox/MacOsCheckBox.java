package checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a checkbox.
 */
public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckBox.");
    }
}