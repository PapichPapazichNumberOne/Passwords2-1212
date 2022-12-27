package com.example.passwords;

import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static String generateRandomPassword(int len) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        Encryptor encryptor = new Encryptor();
        encryptor.encryptPassword();

        //Decryptor decryptor = new Decryptor();
        //decryptor.decryptPassword(5, encryptor.encryptPassword());



    }
}


