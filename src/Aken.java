import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by kirstin on 02/02/2017.
 */
public class Aken {
    int arv = 70;
    Stage stage = new Stage();
    VBox vbox;
    Scene scene;
    TextField nimi;
    TextField hinne;
    Label label1;
    Label label2;
    Label label3;
    Button button;
    Andmed andmed = new Andmed ();

    public Aken (){
        seadistaaken();
        lisaAndmedJaArvuta();
    }

    private void seadistaaken() {
        vbox = new VBox();
        scene = new Scene (vbox, 500, 500);

        nimi = new TextField();
        nimi.setPromptText("Tudengi nimi");

        hinne =  new TextField();
        hinne.setPromptText("Hinne");

        label1=new Label ();
        label2=new Label ();
        label3=new Label ();

        button=new Button("Salvesta");

        vbox.getChildren().addAll(nimi, hinne, label1, label2, label3,button);
        stage.setScene(scene);
        stage.show();

    }

    private void lisaAndmedJaArvuta() {
        button.setOnAction(event -> {
            if (andmed.tulemusteArv()<arv){
                andmed.lisaandmed(nimi.getText(), hinne.getText());
                label1.setText("Eksami läbis "+andmed.kuiPaljuSaiLabi()+"% tudengitest");
                label2.setText("Eksami raskusaste: "+andmed.raskusAsteSobivus());
                label3.setText(andmed.parimTulemus());
            }
        nimi.clear();
            hinne.clear();
        });

    }
}
