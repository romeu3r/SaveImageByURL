package application;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class Program {
    public static void main(String[] args) {
        new Program().baixarImagem("url", "filePath");
    }

    public void baixarImagem(String url, String fileSavePath) {
        try {
            URL imageURL = new URL(url);
            BufferedImage saveImage = ImageIO.read(imageURL);
            ImageIO.write(saveImage, "png", new File(fileSavePath));
            System.out.println("Fim");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
