import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Mosaic {

    public static void main(String[] args) throws IOException {


        URL url1 = new URL("http://onlytravelersleftalive.com/wp-content/uploads/2018/07/norge-1024x768.jpg");
        URL url2 = new URL("http://tapety-na-plochu.luksoft.cz/1024x768/gepard.jpg");
        URL url3 = new URL("http://www.tapetynaplochu.org/tapety/tapetynaplochu-org-1280x1024-11082008203156.jpg");
        URL url4 = new URL("http://www.tapetynaplochu.org/tapety/tapetynaplochu-org-1280x1024-24072008122921.jpg");


        BufferedImage image1 = ImageIO.read(url1);
        BufferedImage image2 = ImageIO.read(url2);
        BufferedImage image3 = ImageIO.read(url3);
        BufferedImage image4 = ImageIO.read(url4);

        JFrame frame = new JFrame("Mosaic");
        frame.setVisible(true);
        frame.setSize(4096, 4096);


        JPanel p1 = new JPanel();
        JLabel label1 = new JLabel(new ImageIcon(image1));
        p1.add(label1);
        label1.setSize(2048, 2048);


        JPanel p2 = new JPanel();
        JLabel label2 = new JLabel(new ImageIcon(image2));
        p2.add(label2);
        p2.setSize(2048, 2048);

        JPanel p3 = new JPanel();
        JLabel label3 = new JLabel(new ImageIcon(image3));
        p3.add(label3);
        p3.setSize(2048, 2048);

        JPanel p4 = new JPanel();
        JLabel label4 = new JLabel(new ImageIcon(image4));
        p4.add(label4);
        p4.setSize(2048, 2048);

        frame.getContentPane().setLayout(new GridLayout(2, 2));

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);

        p1.setBackground(Color.white);
        p2.setBackground(Color.white);
        p3.setBackground(Color.white);
        p4.setBackground(Color.white);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

}