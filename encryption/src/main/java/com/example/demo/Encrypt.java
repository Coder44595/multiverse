package com.example.demo;


import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.AES256TextEncryptor;

public class Encrypt {

    public static void main (String[] args) {

        AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
        textEncryptor.setPassword("Crypt321");
        String myEncryptedText = textEncryptor.encrypt("hello");


        System.out.println(myEncryptedText);

        String myDecryptText = textEncryptor.decrypt("sUYLD3EsU7QVRJM7XZaI2sHWqjk/4IdHtFnJ6utsqB1yvhpm4hUaioTg7zIsu4cJ");
        System.out.println(myDecryptText);


    }


    
}
