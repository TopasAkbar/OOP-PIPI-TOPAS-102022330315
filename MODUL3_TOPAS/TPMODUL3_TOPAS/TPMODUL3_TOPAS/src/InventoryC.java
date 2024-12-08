import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryC {

    @FXML
    private TableView<Album> tableView;

    @FXML
    private TextField albumNameField, artistField, totalField, availableField, rentedField;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    void handleAdd(ActionEvent event) {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());
            int rented = Integer.parseInt(rentedField.getText());

            albumList.add(new Album(albumName, artist, total, available, rented));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Album Added");
            alert.setContentText("Album berhasil ditambahkan.");
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Input");
            alert.setContentText("Harap masukkan data yang valid!");
            alert.showAndWait();
        }
    }
}
