import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaInicial extends Application {


    @Override
    public void start(Stage primaryStage) {
        // Criação dos botões
        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");
        Button button4 = new Button("Botão 4");
        Button button5 = new Button("Botão 5");

        // Layout para organizar os botões verticalmente
        VBox vbox = new VBox(10); // Espaçamento vertical entre os botões
        vbox.getChildren().addAll(button1, button2, button3, button4, button5);

        // Criação da cena
        Scene scene = new Scene(vbox, 300, 200); // largura x altura da janela

        // Configuração do palco (stage)
        primaryStage.setTitle("Tela com Botões");
        primaryStage.setScene(scene);

        // Exibir a tela
        primaryStage.show();
    }
}
