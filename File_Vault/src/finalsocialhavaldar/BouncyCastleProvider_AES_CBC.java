/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsocialhavaldar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
//org.bouncycastle.jce.provider.BouncyCastleProvider;
//(new org.bouncycastle.jce.provider.BouncyCastleProvider());
//import org.bouncycastle.jce.provider.BouncyCastleProvider;
/**
 *
 * @author DELL
 */
public class BouncyCastleProvider_AES_CBC {
   // Security.addProvider(new BouncyCastleProvider());
  //  Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
     // The default block size
    public static int blockSize = 16;

    Cipher encryptCipher = null;
    Cipher decryptCipher = null;
    
    // Buffer used to transport the bytes from one stream to another
    byte[] buf = new byte[blockSize];       //input buffer
    byte[] obuf = new byte[512];            //output buffer

    // The key
    byte[] key = null;
    // The initialization vector needed by the CBC mode
    byte[] IV = null;

    public BouncyCastleProvider_AES_CBC(){
        //for a 192 key you must install the unrestricted policy files
        //  from the JCE/JDK downloads page
        key = "SECRET_1SECRET_2".getBytes();
        //default IV value initialized with 0
        IV = new byte[blockSize];
    }

    public BouncyCastleProvider_AES_CBC(String pass, byte[] iv){
        //get the key and the IV
        key = pass.getBytes();
        IV = new byte[blockSize];
        System.arraycopy(iv, 0 , IV, 0, iv.length);
    }
    public BouncyCastleProvider_AES_CBC(byte[] pass, byte[]iv){
        //get the key and the IV
        key = new byte[pass.length];
        System.arraycopy(pass, 0 , key, 0, pass.length);
        IV = new byte[blockSize];
        System.arraycopy(iv, 0 , IV, 0, iv.length);
    }

    public void InitCiphers()
            throws NoSuchAlgorithmException,
            NoSuchProviderException,
            NoSuchProviderException,
            NoSuchPaddingException,
            InvalidKeyException,
            InvalidAlgorithmParameterException{
       //1. create the cipher using Bouncy Castle Provider
       encryptCipher =
               Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
       //2. create the key
       SecretKey keyValue = new SecretKeySpec(key,"AES");
       //3. create the IV
       AlgorithmParameterSpec IVspec = new IvParameterSpec(IV);
       //4. init the cipher
       encryptCipher.init(Cipher.ENCRYPT_MODE, keyValue, IVspec);

       //1 create the cipher
       decryptCipher =
               Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
       //2. the key is already created
       //3. the IV is already created
       //4. init the cipher
       decryptCipher.init(Cipher.DECRYPT_MODE, keyValue, IVspec);
    }

    public void ResetCiphers()
    {
        encryptCipher=null;
        decryptCipher=null;
    }

    public void CBCEncrypt(InputStream fis, OutputStream fos)
            throws IOException,
            ShortBufferException,
            IllegalBlockSizeException,
            BadPaddingException
    {
       //optionally put the IV at the beggining of the cipher file
       fos.write(IV, 0, IV.length);

       byte[] buffer = new byte[blockSize];
       int noBytes = 0;
       byte[] cipherBlock =
               new byte[encryptCipher.getOutputSize(buffer.length)];
       int cipherBytes;
       while((noBytes = fis.read(buffer))!=-1)
       {
           cipherBytes =
                   encryptCipher.update(buffer, 0, noBytes, cipherBlock);
           fos.write(cipherBlock, 0, cipherBytes);
       }
       //always call doFinal
       cipherBytes = encryptCipher.doFinal(cipherBlock,0);
       fos.write(cipherBlock,0,cipherBytes);

       //close the files
       fos.close();
       fis.close();
    }
    public void CBCDecrypt(InputStream fis, OutputStream fos)
            throws IOException,
            ShortBufferException,
            IllegalBlockSizeException,
            BadPaddingException
    {
       // get the IV from the file
       // DO NOT FORGET TO reinit the cipher with the IV
       fis.read(IV,0,IV.length);
        try {
            this.InitCiphers();
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException ex) {
            Logger.getLogger(BouncyCastleProvider_AES_CBC.class.getName()).log(Level.SEVERE, null, ex);
        }

       byte[] buffer = new byte[blockSize];
       int noBytes = 0;
       byte[] cipherBlock =
               new byte[decryptCipher.getOutputSize(buffer.length)];
       int cipherBytes;
       while((noBytes = fis.read(buffer))!=-1)
       {
           cipherBytes =
                   decryptCipher.update(buffer, 0, noBytes, cipherBlock);
           fos.write(cipherBlock, 0, cipherBytes);
       }
       //allways call doFinal
       cipherBytes = decryptCipher.doFinal(cipherBlock,0);
       fos.write(cipherBlock,0,cipherBytes);

       //close the files
       fos.close();
       fis.close();
    }
  /* public static void main(String args[]) throws FileNotFoundException, IOException, ShortBufferException, IllegalBlockSizeException, BadPaddingException
    {  Security.insertProviderAt(new BouncyCastleProvider(), 1);
        BouncyCastleProvider_AES_CBC cb=new BouncyCastleProvider_AES_CBC();
        File f=new File("C:\\Users\\DELL\\Desktop\\SocialHavaldar\\Source Files\\socialhavaldar.txt");
        File f2=new File("C:\\Users\\DELL\\Desktop\\SocialHavaldar\\Source Files\\socialhavaldar1.txt");
       System.out.println("d"+f.getAbsolutePath());
        InputStream inputStream=new FileInputStream(f);
        OutputStream outputStream=new FileOutputStream(f2);
        try {
            cb.InitCiphers();
            System.out.println("init");
            cb.CBCEncrypt(inputStream, outputStream);
            
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException ex) {
            Logger.getLogger(BouncyCastleProvider_AES_CBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
   /* private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }*/
}
