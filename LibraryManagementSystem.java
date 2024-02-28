import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LibraryManagementSystem extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Management System");

        // Components
        Label titleLabel = new Label("Welcome to the Library");
        Button borrowButton = new Button("Borrow Book");
        Button returnButton = new Button("Return Book");

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(titleLabel, borrowButton, returnButton);

        // Event handling
        borrowButton.setOnAction(e -> {
            // Add code for borrowing a book
            System.out.println("Borrowing a book");
        });

        returnButton.setOnAction(e -> {
            // Add code for returning a book
            System.out.println("Returning a book");
        });

        // Scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
