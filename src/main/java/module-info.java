module fr.limoges.valadon.bibliotheque {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens fr.limoges.valadon.bibliotheque to javafx.fxml;
    exports fr.limoges.valadon.bibliotheque;
}