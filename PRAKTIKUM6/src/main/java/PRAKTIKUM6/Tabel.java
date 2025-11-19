package PRAKTIKUM6;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Tabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        tabel.setPlaceholder(new Label("Belum ada data!"));
        TableColumn<Mahasiswa, String> kolomnama = new TableColumn<>("NAMA");
        TableColumn<Mahasiswa, String> kolomnim = new TableColumn<>("NIM");

        kolomnama.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );
        kolomnim.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );

        tabel.getColumns().addAll(kolomnim, kolomnama);
        tabel.getItems().add(new Mahasiswa("Trisna Cahya Permadi", "2210817210021", 1));
        tabel.getItems().add(new Mahasiswa("Akhmad Raihan Ridha", "2210817110001", 2));
        tabel.getItems().add(new Mahasiswa("Ryan Muhammad Irfan", "2210817310013",3));
        tabel.getItems().add(new Mahasiswa("Hafizh Pratama Budiman", "2210817310007",4));
        tabel.getItems().add(new Mahasiswa("Kevin Maleakhi", "2210817210031", 5));
        tabel.getItems().add(new Mahasiswa("Bima Sanjaya", "2210817210008",6));
        tabel.getItems().add(new Mahasiswa("Ahmad Reza Alfayet", "2210817210016",7));
        tabel.getItems().add(new Mahasiswa("M.Daffa Az-Zikra", "2210917310011",8));
        tabel.getItems().add(new Mahasiswa("Riyo Aurora Guison", "2210817310016",9));
        tabel.getItems().add(new Mahasiswa("Ady T. Adilang", "2210817710001",10));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setMinWidth(350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}