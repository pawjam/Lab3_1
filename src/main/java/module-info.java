module pl.lublin.wsei.java.cwiczenia.lab3_1.lab3_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens pl.lublin.wsei.java.cwiczenia.lab3_1.lab3_1 to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.lab3_1.lab3_1;
}