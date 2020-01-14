package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
//    @FXML
//    private JFXButton fileAdderDress, fileAdderCar, fileAdderInvite, fileAdderVenue, fileAdderFood ;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton selectVenue;

    @FXML
    private Text warning;

    @FXML
    void fileChooserVenues(ActionEvent event) {
        File dest = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Venues\\");
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        if(selectedFile != null){
            String path = selectedFile.getAbsolutePath();
            File source = new File(path);
            try {
                FileUtils.copyFileToDirectory(source, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.print(path);
        }
    }

    @FXML
    void fileChooserDress(ActionEvent event) {
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Dresses\\");
        FileChooser fc2 = new FileChooser();
        File selectedFile2 = fc2.showOpenDialog(null);
        if(selectedFile2 != null){
            String path = selectedFile2.getAbsolutePath();
            File source2 = new File(path);
            try {
                FileUtils.copyFileToDirectory(source2, dest2);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.print(path);
        }
    }


    @FXML
    void fileChooserFood(ActionEvent event) {
        File dest3 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Food\\");
        FileChooser fc3 = new FileChooser();
        File selectedFile3 = fc3.showOpenDialog(null);
        if(selectedFile3 != null){
            String path = selectedFile3.getAbsolutePath();
            File source3 = new File(path);
            try {
                FileUtils.copyFileToDirectory(source3, dest3);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.print(path);
        }
    }


    @FXML
    void fileChooserCar(ActionEvent event) {
        File dest4 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Cars\\");
        FileChooser fc4 = new FileChooser();
        File selectedFile4 = fc4.showOpenDialog(null);
        if(selectedFile4 != null){
            String path = selectedFile4.getAbsolutePath();
            File source4 = new File(path);
            try {
                FileUtils.copyFileToDirectory(source4, dest4);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.print(path);
        }
    }


    @FXML
    void fileChooserInivte(ActionEvent event) {
        File dest5 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Invites\\");
        FileChooser fc5 = new FileChooser();
        File selectedFile5 = fc5.showOpenDialog(null);
        if(selectedFile5 != null){
            String path = selectedFile5.getAbsolutePath();
            File source5 = new File(path);
            try {
                FileUtils.copyFileToDirectory(source5, dest5);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.print(path);
        }
    }


    public void changeScreenButtonPushed(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("adminSignIn.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void SignInButtonPushed(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("adminCreateDresses.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void CreateDressesButtonPushed(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("adminCreateDresses.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
    public void CreateFoodButtonPushed(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("adminCreateFood.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void CreateInvitationsButtonPushed(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("adminCreateInvitations.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void CreateVenuesButtonPushed(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("adminCreateVenues.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void CreateCarsButtonPushed(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("adminCreateCars.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }




    public void selectVenue(ActionEvent event) throws IOException
    {
        if(email.getText().equals("shaheer@weddingplanner.com") && password.getText().equals("123")) {
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);

            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


            window.setScene(tableViewScene);
            window.show();
        } else {
//            System.out.print(venueImage);
            warning.setOpacity(1.0);

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
