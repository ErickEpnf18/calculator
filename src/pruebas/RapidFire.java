package pruebas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.stream.IntStream;

public class RapidFire extends Application {
    private static int nClicks = 0;
    
    private static int numero =0;

    @Override
    public void start(Stage stage) throws IOException {
        // setup button and action handler.
        Button button = new Button("Clickeame");
        button.setOnAction(event -> 
        {
            nClicks++;
            System.out.println("Clicked " + nClicks + " times.");
        });
        
        
        button.setPadding(new Insets(10));
        button.setPrefWidth(100);

        // show the button.
        stage.setScene(new Scene(button));
        stage.show();
        
        
        // fire the button a few times in succession.
        IntStream.range(0, 4).forEach(i -> button.fire());
        IntStream.range(0, 2).forEach((i -> button.fire()));

        
        
        
        
        
        /*
        //creacion de un boton
        Button button1 = new Button("Hey pibe");
        //realiza el evento de la pulsación cuando se pulsa el boton mando  aque se imprime en pantalla
        button1.setOnAction(event ->
        {
            numero++;
            System.out.println("numero "+numero+" veces pulsado");
        });
        //se recorre un botton y se manda cuantas pulsaciones se requierrre hacer automaticamente
        IntStream.range(0, 5).forEach((i -> button1.fire()));
        
        //amuestra el boton
        stage.setScene(new Scene(button1));
        */

        
    }

   public static void main(String[] args) {
        launch(args);
        
        
        Stage stage = null;
        //creacion de un boton
        Button button1 = new Button("Hey pibe");
        //realiza el evento de la pulsación cuando se pulsa el boton mando  aque se imprime en pantalla
        button1.setOnAction(event ->
        {
            numero++;
            System.out.println("numero "+numero+" veces pulsado");
        });
        IntStream.range(0, 5).forEach((i -> button1.fire()));
        
        IntStream.range(0, 5).forEach((i -> button1.fire()));
    }
}