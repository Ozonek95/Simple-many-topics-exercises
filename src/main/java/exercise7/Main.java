package exercise7;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HTMLJpgReader htmlJpgReader = new HTMLJpgReader();
        htmlJpgReader.setUrl("C:\\Users\\kacpe\\Desktop\\htmlImg.txt");
        try {
            htmlJpgReader.addToImages();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Image> images = new ArrayList<>();
        images = htmlJpgReader.getImages();
        JFrame frame = new JFrame();
        frame.setSize(2560, 1080);
        JLabel label = new JLabel(new ImageIcon(images.get(0)));
        frame.add(label);
        frame.setVisible(true);
    }
}
