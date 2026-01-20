package factories;

import button.Button;
import checkbox.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {

    Button createButton();

    CheckBox createCheckBox();
}