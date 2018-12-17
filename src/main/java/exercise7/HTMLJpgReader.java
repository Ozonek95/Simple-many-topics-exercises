package exercise7;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HTMLJpgReader {

    String url ;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    List<Image> images = new ArrayList<>();

    public void addToImages() throws IOException {
        BufferedReader bufferedReader = null;
        try {
          bufferedReader  = new BufferedReader(new FileReader(new File(url)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("src img=\"(.*?)\"");
        String result ="";
        while ((result=bufferedReader.readLine())!=null){
            Matcher matcher = pattern.matcher(result);
            if(matcher.find()){
                File file = new File(matcher.group(1));
                Image image = ImageIO.read(file);
                images.add(image);
            }
        }
    }
}
