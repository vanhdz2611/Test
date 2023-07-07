module oop.ooanquan3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
            
                            
    opens oop.ooanquan3 to javafx.fxml;
    opens oop.ooanquan3.UI.Controller to javafx.fxml;
    exports oop.ooanquan3;
}