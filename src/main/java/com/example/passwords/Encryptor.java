package com.example.passwords;

import java.io.FileWriter;
import java.io.IOException;

import static com.example.passwords.Main.generateRandomPassword;

public class Encryptor {

    public String getPassword() {
        return password;
    }

    private String password;

    private void generatePassword(int len) {
        password = generateRandomPassword(len);
        System.out.print(password);
    }

    public String encryptPassword() throws IOException {
        generatePassword(15);


        int key = 5;

        System.out.println(" ");

        char[] chars = password.toCharArray();
        for (char c : chars) {
            c += key;
            System.out.print(c);

            password = new String(chars);
            //try(FileWriter writer = new FileWriter("password.txt", false))
            //  {
                // запись всей строки
            //   String text = password;
            //  writer.write(text);
            //   writer.append('\n');
            //    writer.append('E');
            //    writer.write(c);
            //    writer.append('E');
// writer.flush();
            //     writer.flush();
            }
        //catch(IOException ex){


            //FileWriter writer = new FileWriter("password.txt");
            //writer.write(c);
            //writer.append('\n');

            //writer.flush();


        return password;
    }

    }












