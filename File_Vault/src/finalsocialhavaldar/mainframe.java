/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsocialhavaldar;

import static finalsocialhavaldar.signupframe1.count;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static javafx.application.Platform.exit;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.spi.FileTypeDetector;
import javax.swing.table.DefaultTableModel;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.imageio.ImageIO;
import javax.swing.*;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
/**
 *
 * @author DELL
 */
public class mainframe extends javax.swing.JFrame {

    //for reset gua
    static int count=0,vcount=0,bcount=0,noclicksFtry=0,noclicksStry=0,i;            //button count,count as index, variable count i.e c1 or c2
   Point[] c1=new Point[20];
  // static Point[] c2=new Point[10];
   boolean confirmpassword=true;
   //file declarations
 FileOutputStream fout;
    /**
     * Creates new form GUA
     */
   ImageIcon img;
    //ends here reset gua
    /**
     * Creates new form mainframe
     */
    public mainframe() throws IOException {
        initComponents();
     //reset gua
        BufferedImage image1 = loadImage();
        
        img=new ImageIcon(image1.getScaledInstance(image123.getWidth(),image123.getHeight(),BufferedImage.SCALE_SMOOTH));
        image123.setIcon(img);
        guanext.setVisible(false);
        guaconfirm.setVisible(false);
        image123.addMouseListener(new MouseAdapter()
	{
      
	public void mouseClicked(MouseEvent e) {
   // int x=e.getX();
    //int y=e.getY();
           
            c1[count]=new Point(e.getX(),e.getY());
           
             
               
            Graphics imggraphics=image123.getGraphics();
            imggraphics.setColor(Color.red);
            imggraphics.fillOval(c1[count].x,c1[count].y,15,15);
            imggraphics.drawString(Integer.toString(count+1-noclicksFtry),c1[count].x,c1[count].y);
           // imggraphics.dispose();
          
	//int record=0;
	//record++;
    System.out.println(c1[count].x+" "+c1[count].y+"  "+count);//these co-ords are relative to the component
    count++;
    if(count>4 && bcount==0)
    {
          guanext.setVisible(true);
          
    }      
    else if(count>4 && bcount>0)
    {   
        guaconfirm.setVisible(true);
        if(count>noclicksFtry*2)
        {
              // jLabel1.removeMouseListener();
            JOptionPane.showMessageDialog(null,"Exceeded number of clicks!" );
            
        }
    }
        else
    {
            guaconfirm.setVisible(false);
            guanext.setVisible(false);
    }
    
    
}	
	});
        //ends here
        
    }
    //load function for image
    private BufferedImage loadImage()
    {
        BufferedImage image = null;
        String fileName = "\\DSC_0812.jpg";
        try
        {
            URL url = getClass().getResource(fileName);
            image = ImageIO.read(url);
        }
        catch(MalformedURLException mue)
        {
            System.err.println("url: " + mue.getMessage());
        }	
        catch(IllegalArgumentException iae)
        {
            System.err.println("arg: " + iae.getMessage());
        }
        catch(IOException ioe)
        {
            System.err.println("read: " + ioe.getMessage());
        }
        if(image == null)
        {
            image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
            System.out.println("unable to load image, returning default");
        }
        return image;
    }
    //ends here load function
    //variables for wallet
    String[] arr=null;
    static int jwallet=0,wshow=4;
    BufferedReader br = null;
    //for change pwd
    static String username;
       static  String email;
    
    //end of wallet declaration
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        parentpanel = new javax.swing.JPanel();
        encrypt = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        file_path1 = new javax.swing.JTextField();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        setting = new javax.swing.JPanel();
        SettingsBtn1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        wallet = new javax.swing.JPanel();
        cardno = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        cvv = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        decrypt = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser("C:\\EncryptFiles\\");
            Pwdchange = new javax.swing.JPanel();
            oldpwd = new javax.swing.JTextField();
            newpwd = new javax.swing.JTextField();
            newpwd1 = new javax.swing.JTextField();
            changepasswordbtn = new javax.swing.JButton();
            old = new javax.swing.JLabel();
            newp = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            guapanelup = new javax.swing.JPanel();
            image123 = new javax.swing.JLabel();
            guanext = new javax.swing.JButton();
            guaconfirm = new javax.swing.JButton();
            guaretry = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(255, 204, 204));
            jPanel1.setForeground(new java.awt.Color(255, 255, 255));
            jPanel1.setPreferredSize(new java.awt.Dimension(110, 433));
            jPanel1.setLayout(null);

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/ecptbtnn.png"))); // NOI18N
            jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton1);
            jButton1.setBounds(10, 110, 90, 30);

            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/decryptbtn.png"))); // NOI18N
            jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton2);
            jButton2.setBounds(10, 170, 90, 30);

            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/walletbtn.png"))); // NOI18N
            jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton3);
            jButton3.setBounds(10, 230, 90, 30);

            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/settings.png"))); // NOI18N
            jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton4);
            jButton4.setBounds(10, 290, 90, 30);

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/mainjpanelf.png"))); // NOI18N
            jPanel1.add(jLabel4);
            jLabel4.setBounds(0, 0, 110, 433);

            getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

            parentpanel.setBackground(new java.awt.Color(255, 153, 102));
            parentpanel.setLayout(new java.awt.CardLayout());

            encrypt.setBackground(new java.awt.Color(255, 255, 255));
            encrypt.setPreferredSize(new java.awt.Dimension(623, 380));
            encrypt.setLayout(null);

            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/addtovault.png"))); // NOI18N
            jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });
            encrypt.add(jButton5);
            jButton5.setBounds(390, 110, 150, 30);
            jButton5.setDropTarget(new DropTarget() {
                public synchronized void drop(DropTargetDropEvent evt) {
                    try {
                        evt.acceptDrop(DnDConstants.ACTION_COPY);
                        List<File> droppedFiles = (List<File>) evt
                        .getTransferable().getTransferData(
                            DataFlavor.javaFileListFlavor);
                        for (File file : droppedFiles) {
                            /*
                            * NOTE:
                            *  When I change this to a println,
                            *  it prints the correct path
                            */
                            file_path1.setText(file.getAbsolutePath());
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/chhose.png"))); // NOI18N
            jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });
            encrypt.add(jButton6);
            jButton6.setBounds(390, 60, 150, 30);
            jButton4.setDropTarget(new DropTarget() {
                public synchronized void drop(DropTargetDropEvent evt) {
                    try {
                        evt.acceptDrop(DnDConstants.ACTION_COPY);
                        List<File> droppedFiles = (List<File>) evt
                        .getTransferable().getTransferData(
                            DataFlavor.javaFileListFlavor);
                        for (File file : droppedFiles) {
                            /*
                            * NOTE:
                            *  When I change this to a println,
                            *  it prints the correct path
                            */
                            file_path1.setText(file.getAbsolutePath());
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

            file_path1.setBackground(new java.awt.Color(112, 97, 116));
            file_path1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            file_path1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    file_path1ActionPerformed(evt);
                }
            });
            encrypt.add(file_path1);
            file_path1.setBounds(70, 60, 250, 30);
            file_path1.setDropTarget(new DropTarget() {
                public synchronized void drop(DropTargetDropEvent evt) {
                    try {
                        evt.acceptDrop(DnDConstants.ACTION_COPY);
                        List<File> droppedFiles = (List<File>) evt
                        .getTransferable().getTransferData(
                            DataFlavor.javaFileListFlavor);
                        for (File file : droppedFiles) {
                            /*
                            * NOTE:
                            *  When I change this to a println,
                            *  it prints the correct path
                            */
                            file_path1.setText(file.getAbsolutePath());
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

            cb3.setBackground(new java.awt.Color(93, 88, 120));
            cb3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
            cb3.setForeground(new java.awt.Color(255, 255, 255));
            cb3.setText("Hidden");
            cb3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cb3ActionPerformed(evt);
                }
            });
            encrypt.add(cb3);
            cb3.setBounds(70, 120, 100, 29);

            cb4.setBackground(new java.awt.Color(93, 88, 120));
            cb4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
            cb4.setForeground(new java.awt.Color(255, 255, 255));
            cb4.setText("Read Only");
            cb4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cb4ActionPerformed(evt);
                }
            });
            encrypt.add(cb4);
            cb4.setBounds(200, 120, 120, 29);

            jLabel1.setBackground(new java.awt.Color(255, 204, 204));
            jLabel1.setForeground(new java.awt.Color(51, 51, 51));
            jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
            encrypt.add(jLabel1);
            jLabel1.setBounds(110, 199, 400, 230);
            jLabel1.setDropTarget(new DropTarget() {
                public synchronized void drop(DropTargetDropEvent evt) {
                    try {
                        evt.acceptDrop(DnDConstants.ACTION_COPY);
                        List<File> droppedFiles = (List<File>) evt
                        .getTransferable().getTransferData(
                            DataFlavor.javaFileListFlavor);
                        for (File file : droppedFiles) {
                            /*
                            * NOTE:
                            *  When I change this to a println,
                            *  it prints the correct path
                            */
                            file_path1.setText(file.getAbsolutePath());
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/encryptwindow.png"))); // NOI18N
            encrypt.add(jLabel8);
            jLabel8.setBounds(0, 0, 613, 433);

            parentpanel.add(encrypt, "card2");

            setting.setBackground(new java.awt.Color(255, 255, 0));

            SettingsBtn1.setText("Reset Password");
            SettingsBtn1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SettingsBtn1ActionPerformed(evt);
                }
            });

            jButton10.setText("Reset Picture Password");
            jButton10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton10ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout settingLayout = new javax.swing.GroupLayout(setting);
            setting.setLayout(settingLayout);
            settingLayout.setHorizontalGroup(
                settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addGroup(settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton10)
                        .addComponent(SettingsBtn1))
                    .addContainerGap(268, Short.MAX_VALUE))
            );
            settingLayout.setVerticalGroup(
                settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(SettingsBtn1)
                    .addGap(37, 37, 37)
                    .addComponent(jButton10)
                    .addContainerGap(207, Short.MAX_VALUE))
            );

            parentpanel.add(setting, "card5");

            wallet.setBackground(new java.awt.Color(204, 204, 204));
            wallet.setPreferredSize(new java.awt.Dimension(603, 366));
            wallet.setLayout(null);

            cardno.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
            cardno.setForeground(new java.awt.Color(255, 255, 255));
            wallet.add(cardno);
            cardno.setBounds(230, 160, 280, 30);

            month.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
            month.setForeground(new java.awt.Color(255, 255, 255));
            wallet.add(month);
            month.setBounds(240, 190, 70, 30);

            cvv.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
            cvv.setForeground(new java.awt.Color(255, 255, 255));
            wallet.add(cvv);
            cvv.setBounds(250, 220, 60, 30);

            jButton9.setIcon(new javax.swing.ImageIcon("E:\\vault pictures\\walletbtn.jpg")); // NOI18N
            jButton9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton9ActionPerformed(evt);
                }
            });
            wallet.add(jButton9);
            jButton9.setBounds(440, 360, 150, 30);

            jLabel2.setFont(new java.awt.Font("Bell MT", 1, 21)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Add new Card to your Wallet here");
            wallet.add(jLabel2);
            jLabel2.setBounds(40, 0, 316, 34);
            wallet.add(jLabel6);
            jLabel6.setBounds(220, 130, 210, 30);

            jButton7.setBackground(new java.awt.Color(255, 204, 102));
            jButton7.setForeground(new java.awt.Color(255, 204, 102));
            jButton7.setIcon(new javax.swing.ImageIcon("E:\\vault pictures\\21-5121.png")); // NOI18N
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton7ActionPerformed(evt);
                }
            });
            wallet.add(jButton7);
            jButton7.setBounds(390, 0, 83, 47);

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/finalredone.png"))); // NOI18N
            wallet.add(jLabel3);
            jLabel3.setBounds(30, 70, 550, 250);

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/backwallet.jpg"))); // NOI18N
            wallet.add(jLabel5);
            jLabel5.setBounds(0, 0, 613, 433);

            parentpanel.add(wallet, "card4");

            decrypt.setLayout(null);

            jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jFileChooser1ActionPerformed(evt);
                }
            });
            decrypt.add(jFileChooser1);
            jFileChooser1.setBounds(10, 11, 582, 397);

            parentpanel.add(decrypt, "card3");

            Pwdchange.setLayout(null);

            oldpwd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    oldpwdActionPerformed(evt);
                }
            });
            Pwdchange.add(oldpwd);
            oldpwd.setBounds(320, 100, 200, 30);
            Pwdchange.add(newpwd);
            newpwd.setBounds(320, 160, 200, 30);
            Pwdchange.add(newpwd1);
            newpwd1.setBounds(320, 230, 200, 30);

            changepasswordbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/confirmsetpwd.png"))); // NOI18N
            changepasswordbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            changepasswordbtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    changepasswordbtnActionPerformed(evt);
                }
            });
            Pwdchange.add(changepasswordbtn);
            changepasswordbtn.setBounds(360, 300, 110, 30);
            Pwdchange.add(old);
            old.setBounds(375, 128, 115, 20);
            Pwdchange.add(newp);
            newp.setBounds(375, 166, 95, 20);

            jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/setpwd.png"))); // NOI18N
            Pwdchange.add(jLabel9);
            jLabel9.setBounds(0, 0, 613, 433);

            parentpanel.add(Pwdchange, "card6");

            guapanelup.setPreferredSize(new java.awt.Dimension(603, 433));
            guapanelup.setLayout(null);

            image123.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    image123MouseClicked(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    image123MousePressed(evt);
                }
            });
            guapanelup.add(image123);
            image123.setBounds(50, 50, 380, 220);

            guanext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/confirm.png"))); // NOI18N
            guanext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            guanext.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    guanextActionPerformed(evt);
                }
            });
            guapanelup.add(guanext);
            guanext.setBounds(250, 320, 90, 30);

            guaconfirm.setText("Confirm");
            guaconfirm.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    guaconfirmActionPerformed(evt);
                }
            });
            guapanelup.add(guaconfirm);
            guaconfirm.setBounds(430, 378, 69, 23);

            guaretry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/retryf.png"))); // NOI18N
            guaretry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            guaretry.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    guaretryActionPerformed(evt);
                }
            });
            guapanelup.add(guaretry);
            guaretry.setBounds(130, 320, 90, 30);

            jLabel7.setIcon(new javax.swing.ImageIcon("E:\\vault pictures\\resetguaf.png")); // NOI18N
            guapanelup.add(jLabel7);
            jLabel7.setBounds(-6, -6, 500, 380);

            parentpanel.add(guapanelup, "card3");

            getContentPane().add(parentpanel, java.awt.BorderLayout.CENTER);

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        parentpanel.removeAll();
        parentpanel.add(encrypt);
        parentpanel.repaint();
        parentpanel.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         parentpanel.removeAll();
         parentpanel.add(decrypt);
        parentpanel.repaint();
        parentpanel.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        parentpanel.removeAll();
         parentpanel.add(wallet);
        parentpanel.repaint();
        parentpanel.revalidate();
        try {
            initWallet();
        } catch (IOException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        parentpanel.removeAll();
         parentpanel.add(setting);
        parentpanel.repaint();
        parentpanel.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        BouncyCastleProvider_AES_CBC cb=new BouncyCastleProvider_AES_CBC();
        File f=new File(file_path1.getText());
        Path p=Paths.get(file_path1.getText());
        String fname=p.getFileName().toString();
        File fout;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        String extension=getFileExtension(f).toLowerCase();
        if(extension.equals("jpg") || extension.equals("jpeg") || extension.equals("png") || extension.equals("tiff") || extension.equals("gif") || extension.equals("bmp") || extension.equals("exif"))
        {
            fout=new File("C:\\EncryptFiles\\Images\\"+fname);
        }
        else if(extension.equals("webm") || extension.equals("mkv") || extension.equals("flv") || extension.equals("vob") || extension.equals("ogv") || extension.equals("ogg") || extension.equals("drc") ||
 extension.equals("gif") || extension.equals("gifv") || extension.equals("mng") || extension.equals("avi") || extension.equals("mov") || extension.equals("qt") || extension.equals("wmv") || extension.equals("yuv") ||
 extension.equals("rm") || extension.equals("rmvb") || extension.equals("asf") || extension.equals("mp4") || extension.equals("mp4p") || extension.equals("m4v") || extension.equals("mpg") || extension.equals("mp2") ||
 extension.equals("mpeg4") || extension.equals("mpe") || extension.equals("svi") || extension.equals("3gp") || extension.equals("3g2") || extension.equals("mxf") || extension.equals("roq") || extension.equals("nsv") ||
 extension.equals("flv") || extension.equals("f4v") || extension.equals("f4p") || extension.equals("f4b") )
        {
          fout=new File("C:\\EncryptFiles\\Videos\\"+fname);  
        }
        else if( extension.equals("doc") || extension.equals("docx") || extension.equals("log") || extension.equals("msg") || 
                extension.equals("pages") || extension.equals("rtf") || extension.equals("txt") || extension.equals("wpd") || extension.equals("wps") || extension.equals("csv") || extension.equals("dat") || extension.equals("efx") || extension.equals("grb") || extension.equals("key") || extension.equals("pps") || extension.equals("ppt") || extension.equals("pptx") || extension.equals("sdf") || extension.equals("tax2010") || extension.equals("vcf") || extension.equals("xml"))
        {
            fout=new File("C:\\EncryptFiles\\Documents\\"+fname);  
        }
        else if(extension.equals("3gp") || extension.equals("act") || extension.equals("aiff") || extension.equals("aac") || extension.equals("amr") || extension.equals("ape") || extension.equals("au") || extension.equals("awb") || extension.equals("dct") || extension.equals("dss") ||
 extension.equals("dvf") || extension.equals("flac") || extension.equals("gsm") || extension.equals("iklax") || extension.equals("ivs") || extension.equals("m4a") || extension.equals("m4p") || extension.equals("mmf") || extension.equals("mp3") || extension.equals("mpc") ||
 extension.equals("msv") || extension.equals("ogg") || extension.equals("oga") || extension.equals("opus") || extension.equals("ra") || extension.equals("rm") || extension.equals("raw") || extension.equals("sln") || extension.equals("tta") || extension.equals("vox") || extension.equals("wav") || extension.equals("wma") || extension.equals("wv") || extension.equals("webm"))
        {
            fout=new File("C:\\EncryptFiles\\Audio\\"+fname);  
        }                
        else
        {
            fout=new File("C:\\EncryptFiles\\Others\\"+fname);  
        }
        
        try {
            inputStream = new FileInputStream(f);
            outputStream=new FileOutputStream(fout);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            cb.InitCiphers();
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cb.CBCEncrypt(inputStream,outputStream);
        } catch (IOException | ShortBufferException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fout.exists()){
            String str=fout.getAbsolutePath();
            File file=new File(str);
            if(cb3.isSelected()==true && cb4.isSelected()==true){
                if(file.exists()){
                    try{Path path1=FileSystems.getDefault().getPath(str);
                        DosFileAttributeView view = Files.getFileAttributeView(path1,
                            DosFileAttributeView.class);

                        DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);
                        view.setHidden(true);
                        boolean bval=file.setReadOnly();
                        JOptionPane.showMessageDialog(null,"File Permission Changed");

                    }catch(Exception ae){
                        JOptionPane.showMessageDialog(null,ae);

                    }
                }else{JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                    cb3.setSelected(false);
                }
            }
            else if(cb3.isSelected()==true && cb4.isSelected()==false){
                if(file.exists()){
                    try{Path path1=FileSystems.getDefault().getPath(str);
                        DosFileAttributeView view = Files.getFileAttributeView(path1,
                            DosFileAttributeView.class);

                        DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);
                        view.setHidden(true);

                        boolean bval=file.setWritable(true);
                        JOptionPane.showMessageDialog(null,"File Permission Changed");

                    }catch(Exception ae){
                        JOptionPane.showMessageDialog(null,ae);

                    }
                }else{JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                    cb3.setSelected(false);
                }
            }
            else if(cb3.isSelected()==false && cb4.isSelected()==true){
                if(file.exists()){
                    try{Path path1=FileSystems.getDefault().getPath(str);
                        DosFileAttributeView view = Files.getFileAttributeView(path1,
                            DosFileAttributeView.class);

                        DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);
                        view.setHidden(false);

                        boolean bval=file.setReadOnly();
                        JOptionPane.showMessageDialog(null,"File Permission Changed");

                    }catch(Exception ae){
                        JOptionPane.showMessageDialog(null,ae);

                    }
                }else{JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                    cb3.setSelected(false);
                }
            }
            else{
                if(file.exists()){
                    try{Path path1=FileSystems.getDefault().getPath(str);
                        DosFileAttributeView view = Files.getFileAttributeView(path1,
                            DosFileAttributeView.class);

                        DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);
                        view.setHidden(false);

                        boolean bval=file.setWritable(true);
                        JOptionPane.showMessageDialog(null,"File Permission Changed");

                    }catch(Exception ae){
                        JOptionPane.showMessageDialog(null,ae);

                    }
                }else{//JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                    cb3.setSelected(false);
                }

            }
            //DefaultTableModel model=(DefaultTableModel) Permission_table.getModel();
            if(file.exists()){
                //model.addRow(new Object[]{file_path3.getText(),cb3.isSelected(),cb4.isSelected() });
                //file_path3.setText("");
                cb3.setSelected(false);
                cb4.setSelected(false);
            }else{JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                cb3.setSelected(false);
                cb4.setSelected(false);
                //file_path3.setText("");
            }
            // model.addRow(new Object[]{file_path1.getText(),path});
            file_path1.setText("");
            // file1.delete();HERE IT IS DELETED
            //EncryptPass.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"File Does Not Exist!");
            file_path1.setText("");
            // EncryptPass.setText("");
        }
        f.delete();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        file_path1.setText(f.getAbsolutePath());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void file_path1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_path1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_path1ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
        /* String str1=file_path3.getText();
        File file1=new File(str1);
        if(cb3.isSelected()==true){
            if(file1.exists()){
                try{Path path=FileSystems.getDefault().getPath(str1);
                    DosFileAttributeView view = Files.getFileAttributeView(path,
                        DosFileAttributeView.class);

                    DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);
                    view.setHidden(true);
                    JOptionPane.showMessageDialog(null,"File Hidden");
                    file_path3.setText("");
                    cb3.setSelected(false);
                }catch(Exception ae){
                    JOptionPane.showMessageDialog(null,ae);

                }
            }else{JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                cb3.setSelected(false);
            }

        }
        else
        { if(file1.exists()){
            try{Path path=FileSystems.getDefault().getPath(str1);
                DosFileAttributeView view = Files.getFileAttributeView(path,
                    DosFileAttributeView.class);

                DosFileAttributes attrs = Files.readAttributes(path, DosFileAttributes.class);
                view.setHidden(false);
                JOptionPane.showMessageDialog(null,"File Visible");
                file_path3.setText("");
                cb3.setSelected(false);
            }catch(Exception ae){
                JOptionPane.showMessageDialog(null,ae);

            }

        }
        else{JOptionPane.showMessageDialog(null,"File Does Not Exist!");
            cb3.setSelected(false);
        }
        }*/
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        /* TODO add your handling code here:
        String str=file_path3.getText();
        File file=new File(str);
        if(cb4.isSelected()==true){
            if(file.exists()){
                boolean bval=file.setReadOnly();
                JOptionPane.showMessageDialog(null,"File ReadOnly");
                file_path3.setText("");
                cb4.setSelected(false);
            }
            else
            {JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                cb4.setSelected(false);
            }
        }
        else{
            if(file.exists()){
                boolean bval=file.setWritable(true);
                JOptionPane.showMessageDialog(null,"File Writable");
                cb4.setSelected(false);
                file_path3.setText("");
            }
            else{JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                cb4.setSelected(false);
            }
        }*/
    }//GEN-LAST:event_cb4ActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        File file2=jFileChooser1.getSelectedFile();
        //file_path2.setText(f.getAbsolutePath());
        //File file2 = new File(file_path2.getText());
        //String st3=file2.getAbsolutePath();
        String str1=file2.getName();
        BouncyCastleProvider_AES_CBC cb=new BouncyCastleProvider_AES_CBC();
       

        String path=new String("c://DecryptFiles//");

        path=path.concat(str1);

        try{
            FileInputStream file = new FileInputStream(file2.getAbsolutePath());

            FileOutputStream outStream = new FileOutputStream(path);
            cb.InitCiphers();
            cb.CBCDecrypt(file, outStream);
            JOptionPane.showMessageDialog(null,"File Decrypted!");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"File Does Not Exist!");
        }
        if(file2.exists()){
            //model.addRow(new Object[]{file_path2.getText(),path});
            //file_path2.setText("");
            file2.delete();
            // DecryptPass.setText("");
        }

        else{ JOptionPane.showMessageDialog(null,"File Does Not Exist!");
            //file_path1.setText("");
            //DecryptPass.setText("");
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Wallet w=new Wallet();
        w.setVisible(true);
        try {
            reinitwallet();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SettingsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsBtn1ActionPerformed
        // TODO add your handling code here:
        parentpanel.removeAll();
        parentpanel.add(Pwdchange);
        parentpanel.repaint();
        parentpanel.revalidate();
        
        
    }//GEN-LAST:event_SettingsBtn1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        cardno.setText(arr[wshow]);
        cvv.setText(arr[wshow+1]);
        month.setText(arr[wshow+2]+"/"+arr[wshow+3]);
        wshow+=4;
        if(wshow==jwallet)
        wshow=0;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        File file1 = new File("gua.txt");
        if(file1.exists())
        {
            file1.delete();         
        }
        parentpanel.removeAll();
        parentpanel.add(guapanelup);
        parentpanel.repaint();
        parentpanel.revalidate();
        
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void guanextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guanextActionPerformed
        // TODO add your handling code here:
        //jLabel1=null;
        // jLabel1.setIcon(img);

        image123.repaint();
        if(vcount==0)
        {
            //c1=p;
            vcount++;
            bcount++;
            noclicksFtry=count;

            guanext.setVisible(false);
            for(i=0;i<noclicksFtry;i++)
            System.out.println(c1[i].x+"equal"+c1[i].y);

        }
    }//GEN-LAST:event_guanextActionPerformed

    private void guaconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guaconfirmActionPerformed
        // TODO add your handling code here:
        // c2=p;
        /*for(i=0;i<noclicksFtry;i++)
        {
            // System.out.println(c2[i].x+" array 2 "+c2[i].y);
            System.out.println(c1[i].x+" array 1 "+c1[i].y);
        }*/
        String str,str2,str3,str4,str5;
        for(i=0;i<noclicksFtry;i++)
        {
            if(c1[i+noclicksFtry].x<=c1[i].x+5 && c1[i+noclicksFtry].x>=c1[i].x-5 && c1[i+noclicksFtry].y<=c1[i].y+5 && c1[i+noclicksFtry].y>=c1[i].y-5)
            System.out.println(c1[i].x+"equal"+c1[noclicksFtry+i].x);
            else
            confirmpassword=false;

        }
        if(confirmpassword==true)
        {
            System.out.println("Entered code");
            try {
                fout= new FileOutputStream("gua.txt");
                //File f10=new File("gua.txt");

            } catch (FileNotFoundException ex) {
                //Logger.getLogger(G.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"File not found!" );
            }
            try
            {
                str3=" ";
                str4=Integer.toString(noclicksFtry);
                byte b3[]=str3.getBytes();
                byte b4[]=str4.getBytes();
                fout.write(b4);
                fout.write(b3);
            }
            catch(IOException ex)
            {
                Logger.getLogger(signupframe1.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(i=0;i<noclicksFtry;i++)
            {
                str=Integer.toString(c1[i].x);
                str2=Integer.toString(c1[i].y);
                str5=" ";
                str4=Integer.toString(noclicksFtry);
                byte b1[]= str.getBytes();
                byte b2[]=str2.getBytes();
                byte b3[]=str5.getBytes();
                //byte b4[]=str4.getBytes();
                try {

                    fout.write(b1);
                    fout.write(b3);
                    fout.write(b2);
                    fout.write(b3);
                } catch (IOException ex) {
                    Logger.getLogger(signupframe1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(signupframe1.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainframe mf = null;
            try {
                mf = new mainframe();
            } catch (IOException ex) {
                Logger.getLogger(signupframe1.class.getName()).log(Level.SEVERE, null, ex);
            }
            mf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_guaconfirmActionPerformed
    }
    private void guaretryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guaretryActionPerformed
        // TODO add your handling code here:
        count=noclicksFtry+1;
        image123.repaint();
    }//GEN-LAST:event_guaretryActionPerformed

    private void image123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image123MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_image123MouseClicked

    private void image123MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image123MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_image123MousePressed

    private void changepasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordbtnActionPerformed
        // TODO add your handling code here:
       String str="Encryptedsignup.txt";
                File file=new File(str);
                try{Path path1=FileSystems.getDefault().getPath(str);
                    DosFileAttributeView view = Files.getFileAttributeView(path1,
                        DosFileAttributeView.class);

                    DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);
                    view.setHidden(false);
                    //boolean bval=file.setReadOnly();
                    file.setWritable(true);
                    //JOptionPane.showMessageDialog(null,"File Permission Changed");

                }catch(Exception ae){
                    JOptionPane.showMessageDialog(null,ae);

                }
        
        String oldpassword1=oldpwd.getText();
        
        String pass1=newpwd.getText();
        String pass2=newpwd1.getText();
        File file1 =new File("signup.txt");
        File file2 =new File("Encryptedsignup.txt");
        
        try{ BouncyCastleProvider_AES_CBC cb=new BouncyCastleProvider_AES_CBC();
        //
        //Path p=Paths.get("C:\\Users\\user\\Desktop\\FinalSocialHavaldarf\\signup.txt");
        //String fname=p.getFileName().toString();
        //File fout1=new File(fi);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        
           
        
        
        try {
            inputStream = new FileInputStream(file2);
            outputStream=new FileOutputStream(file1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            cb.InitCiphers();
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cb.CBCDecrypt(inputStream,outputStream);
        } catch (IOException | ShortBufferException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
            //file1.delete();

        }catch(Exception e){
            // JOptionPane.showMessageDialog(null,"File Does Not Exist!");
        }

        BufferedReader br = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!

        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("signup.txt"));

            int i=0;
            int flag=0;

            while ((sCurrentLine = br.readLine()) != null && flag!=1) {
                String[] arr = sCurrentLine.split(" ");
                if(oldpassword1.equals(arr[1]))
                {old.setText("old pwd match");
                 if(pass1.equals(pass2))  {
                     newp.setText("new Password Confirmed");
                     username=arr[0];
                email=arr[2];
                    flag=1;
                 }
                 else
                 { JOptionPane.showMessageDialog(null,"new password not same" );
                     
                 }
                
                }

                //Now if you want to enter them into separate arrays
                // characters[i] = arr[0];
                // and you can do the same with
                // names[1] = arr[1]
                //etc

                i++;
            }

            if(flag==1)
            {
                try{//file1.createNewFile();
                FileOutputStream fout= new FileOutputStream("signup.txt");
                String s1= username;
                s1=s1.concat(" ");
                String s2= newpwd.getText();
                s2=s2.concat(" ");
                String s3= email;
                s3=s3.concat(""
                    + "");

                byte b1[]= s1.getBytes();
                byte b2[]= s2.getBytes();
                byte b3[]= s3.getBytes();
                fout.write(b1);
                fout.write(b2);
                fout.write(b3);
                fout.close();
                JOptionPane.showMessageDialog(null,"Sign up completed" );
                oldpwd.setText("");
                newpwd.setText("");
                newpwd1.setText("");
                old.setText("");
                newp.setText("");
                //String path=new String("Encryptedsignup.txt");
                //String source=file1.getAbsolutePath();
                //JOptionPane.showMessageDialog(null,path);
               try{
                    BouncyCastleProvider_AES_CBC cb=new BouncyCastleProvider_AES_CBC();
        //
        //Path p=Paths.get("C:\\Users\\user\\Desktop\\FinalSocialHavaldarf\\signup.txt");
        //String fname=p.getFileName().toString();
        //File fout1=new File(fi);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        
           
        
        
        try {
            inputStream = new FileInputStream(file1);
            outputStream=new FileOutputStream(file2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            cb.InitCiphers();
        } catch (NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cb.CBCEncrypt(inputStream,outputStream);
        } catch (IOException | ShortBufferException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
            file1.delete();
                }catch(Exception e){
                    //JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                }
               // String str="Encryptedsignup.txt";
               // File file=new File(str);
                try{Path path1=FileSystems.getDefault().getPath(str);
                    DosFileAttributeView view = Files.getFileAttributeView(path1,
                        DosFileAttributeView.class);

                    DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);
                    view.setHidden(true);
                    boolean bval=file.setReadOnly();
                    //JOptionPane.showMessageDialog(null,"File Permission Changed");

                }catch(Exception ae){
                    JOptionPane.showMessageDialog(null,ae);

                }

            }
            catch(Exception e){
                System.out.println("e");
            }
                

            }
            else{ 
                file1.delete();
                JOptionPane.showMessageDialog(null,"new password not same" );
                try{Path path1=FileSystems.getDefault().getPath(str);
                    DosFileAttributeView view = Files.getFileAttributeView(path1,
                        DosFileAttributeView.class);

                    DosFileAttributes attrs = Files.readAttributes(path1, DosFileAttributes.class);
                    view.setHidden(true);
                    boolean bval=file.setReadOnly();
                    //file.setWritable(true);
                    //JOptionPane.showMessageDialog(null,"File Permission Changed");

                }catch(Exception ae){
                    JOptionPane.showMessageDialog(null,ae);

                }
                oldpwd.setText("");
                newpwd.setText("");
                newpwd1.setText("");
                old.setText("");
                newp.setText("");
                
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                if (br != null)br.close();
                file1.delete();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_changepasswordbtnActionPerformed

    private void oldpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpwdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Security.insertProviderAt(new BouncyCastleProvider(), 1);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    new mainframe().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pwdchange;
    private javax.swing.JButton SettingsBtn1;
    private javax.swing.JLabel cardno;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JButton changepasswordbtn;
    private javax.swing.JLabel cvv;
    private javax.swing.JPanel decrypt;
    private javax.swing.JPanel encrypt;
    private javax.swing.JTextField file_path1;
    private javax.swing.JButton guaconfirm;
    private javax.swing.JButton guanext;
    private javax.swing.JPanel guapanelup;
    private javax.swing.JButton guaretry;
    private javax.swing.JLabel image123;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel month;
    private javax.swing.JLabel newp;
    private javax.swing.JTextField newpwd;
    private javax.swing.JTextField newpwd1;
    private javax.swing.JLabel old;
    private javax.swing.JTextField oldpwd;
    private javax.swing.JPanel parentpanel;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel wallet;
    // End of variables declaration//GEN-END:variables

    private void initWallet() throws IOException {
       
      // String rec[]=null;int jc=0;
       try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("walllet.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                arr = sCurrentLine.split(" ");
       System.out.println(arr[0]);
               
            } jwallet=arr.length;
        System.out.println(jwallet);
           //System.arraycopy(arr, 0, rec, 0, jwallet);
            cardno.setText(arr[0]);
            cvv.setText(arr[1]);
            month.setText(arr[2]+""+arr[3]);
            //year.setText(arr[3]);
            
            
            
            
       }catch (IOException e) {
            e.printStackTrace();
        }
       finally {
            try {

                if (br != null)br.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        
    }
    }
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

    private void reinitwallet() throws FileNotFoundException {
        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("walllet.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                arr = sCurrentLine.split(" ");
        jwallet=arr.length;
                System.out.println(arr[0]);
            }
            cardno.setText(arr[0]);
            cvv.setText(arr[1]);
            month.setText(arr[2]+""+arr[3]);
        
    }catch (IOException e) {
            e.printStackTrace();
        }
       finally {
            try {

                if (br != null)br.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        
    }

    }
}