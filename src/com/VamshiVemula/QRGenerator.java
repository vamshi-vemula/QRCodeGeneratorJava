package com.VamshiVemula;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

import net.glxn.qrgen.image.ImageType;
import net.glxn.qrgen.QRCode;

public class QRGenerator {
    public static void main(String[] args) throws Exception {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String to make QR ...");
        str = input.nextLine();
        ByteArrayOutputStream out = QRCode.from(str).to(ImageType.PNG).stream();
        File f = new File("V:\\Vamshi\\Downloads\\qrcode.png");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
        input.close();
    }
    
}
