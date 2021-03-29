package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); // мало ли, вдруг понадобиться ¯\_(ツ)_/¯

        // -------------------------------------------------------------- создание основных объектов
        Label label = new Label("Добро пожаловать");
        Text text1 = new Text("Email"); // создание метки(обычного текста)
        Text text2 = new Text("Password");

        TextField textField1 = new TextField(); // создание ввода данных и для ввода пароля
        PasswordField textField2 = new PasswordField();

        //создание кнопок
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");

        //--------------------------------------------------------------- Создание панели
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200); //размеры панели
        gridPane.setPadding(new Insets(10, 10, 10, 10)); //отступы

        //сколько ячеек по вертикале и горизонтали
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER); //Рсположение объектов, по центру

        //-------------------------------------------------------- добавление всех объектов на панель
        gridPane.add(label, 1, 0);
        gridPane.add(text1, 0, 1);
        gridPane.add(textField1, 1, 1);
        gridPane.add(text2, 0, 2);
        gridPane.add(textField2, 1, 2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);

        // ------------------------------------------------------------------------ Стили CSS
        // 1 способ прописывать стили
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); // заливка (darkslateblue), цвет текста (white)
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        text1.setStyle("-fx-font: normal bold 20px 'serif' "); // настройка обычного текста(метки)
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE;");// заливка панели

        // действия при наведении мышки (hover)
        button1.setOnMouseEntered(event -> { // наведение
            button1.setStyle("-fx-background-color: gold; -fx-text-fill: black;");
        });
        button1.setOnMouseExited(event -> { // увести мышку
            button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        });
        button1.setOnMousePressed(event -> { // нажать
            button1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        });
        button1.setOnMouseClicked(event -> { // сделать клик мышки
            button1.setStyle("-fx-background-color: gold; -fx-text-fill: white;");
        });

        //всё тоже самое, но для 2 кнопки
        button2.setOnMouseEntered(event -> {// наведение
            button2.setStyle("-fx-background-color: gold; -fx-text-fill: black;");
        });
        button2.setOnMouseExited(event -> {// увести мышку
            button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        });
        button2.setOnMousePressed(event -> {// нажать
            button2.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        });
        button2.setOnMouseClicked(event -> {// сделать клик мышки
            button2.setStyle("-fx-background-color: gold; -fx-text-fill: white;");
        });

        //-------------------------------------------------------------- настройка формы
        primaryStage.setTitle("CSS Пример"); // заголовок формы(окна)
        Scene scene = new Scene(gridPane); // создание сцены
        //подключение CSS файл
        scene.getStylesheets().add(getClass().getResource("myCss.css").toExternalForm()); // 2 способ прописывать стили
        textField1.getStyleClass().add("myStyleTextField"); // добавление стилий через метки
        textField2.getStyleClass().add("myStyleTextField");
        // setUserAgentStylesheet - удаление старых стилей
        primaryStage.setScene(scene);//добавить панель на форму
        primaryStage.show(); // отобразить
    }


    public static void main(String[] args) {
        launch(args);
    }
}
