module com.example.passwords {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.testng;
    requires junit;

    opens com.example.passwords to javafx.fxml;
    exports com.example.passwords;
}