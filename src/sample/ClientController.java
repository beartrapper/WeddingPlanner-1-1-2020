package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class ClientController {


    @FXML
    private JFXButton nextButton;

    @FXML
    private ImageView showImage;

    @FXML
    private Text price;

    Collection<File> files;

    void loadVenues(){
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Venues\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<File> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);

    }

    public void selectDress(ActionEvent event) throws IOException
    {

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectDress.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void selectFood(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectFood.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void selectCar(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectCar.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void selectInvite(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectInvite.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void selectVenue(ActionEvent event) throws IOException
    {
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Venues\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<Image> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);
//        Image img = files.stream().findFirst();
        showImage.setImage();
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectVenue.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void ThanksButton(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Thanks.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void PaymentButton(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Payment.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
