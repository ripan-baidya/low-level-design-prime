package checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a Windows variant of a checkbox.
 */
public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox.");
    }
}