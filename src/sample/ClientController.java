package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Collection;


public class ClientController {


    int count;
    static int cartTotal = 0;

    @FXML
    private JFXButton nextButton;

    @FXML
    private ImageView showImage;

    @FXML
    private Text price;

    @FXML
    private Text priceTag;

    @FXML
    private Text priceTagDresses;

    @FXML
    private ImageView venueImage;

    @FXML
    private JFXTextField textField;

    Collection<File> files;



    class ImageFilter{
        String GIF = "gif";
        String PNG = "png";
        String JPG = "jpg";
        String BMP = "bmp";
        String JPEG = "jpeg";
        public boolean accept(File file) {
            if(file != null) {
                if(file.isDirectory())
                    return false;
                String extension = getExtension(file);
                if(extension != null && isSupported(extension))
                    return true;
            }
            return false;
        }
        private String getExtension(File file) {
            if(file != null) {
                String filename = file.getName();
                int dot = filename.lastIndexOf('.');
                if(dot > 0 && dot < filename.length()-1)
                    return filename.substring(dot+1).toLowerCase();
            }
            return null;
        }
        private boolean isSupported(String ext) {
            return ext.equalsIgnoreCase(GIF) || ext.equalsIgnoreCase(PNG) ||
                    ext.equalsIgnoreCase(JPG) || ext.equalsIgnoreCase(BMP) ||
                    ext.equalsIgnoreCase(JPEG);
        }
    }


    @FXML
    public void addToCartVenues(ActionEvent event){
        int amount = Integer.parseInt(priceTag.getText());
        cartTotal+= amount;
        System.out.print(cartTotal);
    }

    @FXML
    public void addToCartDresses(ActionEvent event){
        int amount = Integer.parseInt(priceTagDresses.getText());
        cartTotal+= amount;
//        System.out.print();
        System.out.print(cartTotal);

    }

    @FXML
    private Text priceTagInvite;

    @FXML
    public void addToCartInvites(ActionEvent event){
        int amount = Integer.parseInt(priceTagInvite.getText());
        cartTotal+= amount;
    }

    @FXML
    private Text priceTagFood;

    @FXML
    public void addToCartFood(ActionEvent event){
        int amount = Integer.parseInt(priceTagFood.getText());
        cartTotal+= amount;
    }

    @FXML
    private Text priceTagCars;

    @FXML
    public void addToCartCars(ActionEvent event){
        int amount = Integer.parseInt(priceTagCars.getText());
        cartTotal+= amount;
    }

    void loadVenues(){
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Venues\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<File> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);

    }

    public void selectDress(ActionEvent event) throws IOException
    {
        count = 1;

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectDress.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void selectFood(ActionEvent event) throws IOException
    {
        count = 1;

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectFood.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void selectCar(ActionEvent event) throws IOException
    {
        count = 1;

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectCar.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void selectInvite(ActionEvent event) throws IOException
    {
        count = 1;
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("selectInvite.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private ImageView venueImageChange;

    @FXML
    public void selectVenue(ActionEvent event) throws IOException
    {
        count = 1;

        //        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch(InterruptedException ex)
//        {
//            Thread.currentThread().interrupt();
//        }

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

    @FXML
    private Text numError;

    @FXML
    private Text cvvError;


    @FXML
    private JFXTextField cardNumberField;

    @FXML
    private JFXTextField cvvField;

    @FXML
    private Text successMessage;

    @FXML
    private Text totalTag;

    public void Payment(ActionEvent event){
        String cardNum = cardNumberField.getText();
        String CVV = cvvField.getText();
        if(cardNum.length() !=12){
            numError.setOpacity(1);
        } else if(CVV.length() !=3) {
            numError.setOpacity(0);
            cvvError.setOpacity(1);
        }
        else {
            successMessage.setOpacity(1);
            numError.setOpacity(0);
            cvvError.setOpacity(0);
        }

    }

    @FXML
    void nextVenue(ActionEvent event) {
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Venues\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<Image> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);


        final ImageFilter imageFilter = new ImageFilter();
        final File dir = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Venues\\");
        File[] imagesArray = new File[6];
        int i=0;

        for(final File imgFile : dir.listFiles()) {
            if(imageFilter.accept(imgFile)){

//                doSomethingWithImgFile(imgFile);
//                System.out.println((imgFile));
                imagesArray[i] = imgFile;
                i++;
            }
        }
        String fileLocation = imagesArray[count].toURI().toString();
        Image imageToUpload = new Image(fileLocation);
//        System.out.print(venueImageChange);
        venueImageChange.setImage(imageToUpload);
System.out.print(imageToUpload);
        priceTag.setText(imagesArray[count].getName().replaceFirst("[.][^.]+$", ""));
        count++;

    }



    @FXML
    private ImageView inviteImageChange;

    @FXML
    void nextInvite(ActionEvent event) {
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Invites\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<Image> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);


        final ImageFilter imageFilter = new ImageFilter();
        final File dir = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Invites\\");
        File[] imagesArray = new File[6];
        int i=0;

        for(final File imgFile : dir.listFiles()) {
            if(imageFilter.accept(imgFile)){
                imagesArray[i] = imgFile;
                i++;
            }
        }
        String fileLocation = imagesArray[count].toURI().toString();
        Image imageToUpload = new Image(fileLocation);
//        System.out.print(inviteImageChange);
        inviteImageChange.setImage(imageToUpload);
//        System.out.print(imageToUpload);
        priceTagInvite.setText(imagesArray[count].getName().replaceFirst("[.][^.]+$", ""));
        count++;

    }


    @FXML
    private ImageView foodImageChange;

//    @FXML
//    private Text priceTagFood;


    @FXML
    void nexrFood(ActionEvent event) {
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Food\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<Image> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);


        final ImageFilter imageFilter = new ImageFilter();
        final File dir = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Food\\");
        File[] imagesArray = new File[6];
        int i=0;

        for(final File imgFile : dir.listFiles()) {
            if(imageFilter.accept(imgFile)){
                imagesArray[i] = imgFile;
                i++;
            }
        }
        String fileLocation = imagesArray[count].toURI().toString();
        Image imageToUpload = new Image(fileLocation);
//        System.out.print(inviteImageChange);
        foodImageChange.setImage(imageToUpload);
//        System.out.print(imageToUpload);
        priceTagFood.setText(imagesArray[count].getName().replaceFirst("[.][^.]+$", ""));
        count++;
    }

    @FXML
    private ImageView dressImageChange;


    @FXML
    void nextDress(ActionEvent event) {
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Dresses\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<Image> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);


        final ImageFilter imageFilter = new ImageFilter();
        final File dir = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Dresses\\");
        File[] imagesArray = new File[6];
        int i=0;

        for(final File imgFile : dir.listFiles()) {
            if(imageFilter.accept(imgFile)){
                imagesArray[i] = imgFile;
                i++;
            }
        }
        String fileLocation = imagesArray[count].toURI().toString();
        Image imageToUpload = new Image(fileLocation);
//        System.out.print(inviteImageChange);
        dressImageChange.setImage(imageToUpload);
//        System.out.print(imageToUpload);
        priceTagDresses.setText(imagesArray[count].getName().replaceFirst("[.][^.]+$", ""));
        count++;
    }

    @FXML
    private ImageView carImageChange;


    @FXML
    void nextCar(ActionEvent event) {
        File dest2 = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Cars\\");
//        FileUtils.listFiles(dest2, new RegexFileFilter(product.id + "[-]*[0-9]*\\.(.+)");
        Collection<Image> files = FileUtils.listFiles(dest2,
                new String[] {"png", "jpg", "jpeg"}, true);


        final ImageFilter imageFilter = new ImageFilter();
        final File dir = new File("C:\\Users\\okay\\IdeaProjects\\WeddingPlanner-1-1-2020\\src\\sample\\images\\Cars\\");
        File[] imagesArray = new File[6];
        int i=0;

        for(final File imgFile : dir.listFiles()) {
            if(imageFilter.accept(imgFile)){
                imagesArray[i] = imgFile;
                i++;
            }
        }
        String fileLocation = imagesArray[count].toURI().toString();
        Image imageToUpload = new Image(fileLocation);
//        System.out.print(inviteImageChange);
        carImageChange.setImage(imageToUpload);
//        System.out.print(imageToUpload);
        priceTagCars.setText(imagesArray[count].getName().replaceFirst("[.][^.]+$", ""));
        count++;
    }


    @FXML
    void showTotal(ActionEvent event) {
        totalTag.setText(Integer.toString(cartTotal));
        totalTag.setOpacity(1);
    }

    @FXML
    public void PaymentButton(ActionEvent event) throws IOException
    {

//        int cardNumber = Integer.parseInt(cardNum);
//        System.out.print(cardNum);
//            totalTag.setText(Integer.toString(cartTotal));
        System.out.print(totalTag);
//            totalTag.setOpacity(1);
    Parent tableViewParent = FXMLLoader.load(getClass().getResource("Payment.fxml"));
    Scene tableViewScene = new Scene(tableViewParent);

    //This line gets the Stage information
    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(tableViewScene);
                    window.show();
                    }

                    }




