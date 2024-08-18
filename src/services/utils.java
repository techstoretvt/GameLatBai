/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author tranv
 */
public class utils {
    
    public static ImageIcon layImageIcon(String url, int w, int h) {
        URL imageUrl = null;
        try {
            imageUrl = new URL(url);
        } catch (MalformedURLException ex) {
            System.out.println("loi url");
        }
        ImageIcon originalIcon = new ImageIcon(imageUrl);

        // Thu nhỏ ảnh
        Image scaledImage = originalIcon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        return scaledIcon;
    }
    
}
