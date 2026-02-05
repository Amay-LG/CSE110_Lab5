module edu.ucsd.spendingtracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;
    requires javafx.graphics;

    opens edu.ucsd.spendingtracker to javafx.fxml;
    exports edu.ucsd.spendingtracker;
}
