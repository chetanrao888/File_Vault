/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsocialhavaldar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static finalsocialhavaldar.signupframe1.count;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
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
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
/**
 *
 * @author DELL
 */
public class signupframe1 extends javax.swing.JFrame {

    /**
     * Creates new form signupframe1
     */File f;
    //for signuppanel
    Boolean gua=FALSE;
    String fileNameGua;
     //prelogin
    static int precount=0,prenoclicksFtry=0,prei;
    Point[] prec1=new Point[10];
    Point[] prec2=new Point[10];
  // static Point[] c2=new Point[10];
   boolean preconfirmpassword=true;
   ImageIcon preimg;
   //end prelogin
     
     static int count1=0;
     static String emailto;
     //for gua
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
   //gua ends
   //camera
   Dimension[] nonStandardResolutions = new Dimension[] {
			WebcamResolution.PAL.getSize(),
			WebcamResolution.HD720.getSize(),
			new Dimension(2000, 1000),
			new Dimension(1000, 500),
		};
   //camera ends
    
    public signupframe1() {
        initComponents();
        pattern = Pattern.compile(USERNAME_PATTERN);
        pattern2 = Pattern.compile(EMAIL_PATTERN);
       // pattern3 = Pattern.compile(PASSWORD_PATTERN);
        File file1 =new File("Encryptedsignup.txt");
        if(file1.exists())
        {
            JOptionPane.showMessageDialog(null,"Application Already Has A Signed Up User!" );
           parentpanel.removeAll();
        parentpanel.add(loginpanel);
        parentpanel.repaint();
       parentpanel.revalidate();

        }else
        {parentpanel.removeAll();
        parentpanel.add(signuppanel);
        parentpanel.repaint();
       parentpanel.revalidate();
            
        }
        
        //for gua
        
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
            JOptionPane.showMessageDialog(null,"Exceeded number of clicks, Please try again!" );
             if(bcount==0)
        {
            count=0;
            image123.repaint();
        }else
        {
        count=noclicksFtry;
        image123.repaint();
        }
            
        }
    }
        else
    {
            guaconfirm.setVisible(false);
            guanext.setVisible(false);
    }
    
    
}	
	});
        //prelogin code
        
        preloginbtn1.setVisible(false);
        preloginimage.addMouseListener(new MouseAdapter()
	{
      
	public void mouseClicked(MouseEvent e) {
   // int x=e.getX();
    //int y=e.getY();
           
            prec1[precount]=new Point(e.getX(),e.getY());
           
             
               
            Graphics imggraphics=preloginimage.getGraphics();
            imggraphics.setColor(Color.red);
            imggraphics.fillOval(prec1[precount].x,prec1[precount].y,15,15);
            imggraphics.drawString(Integer.toString(precount+1),prec1[precount].x,prec1[precount].y);
           // imggraphics.dispose();
          
	//int record=0;
	//record++;
    System.out.println(prec1[precount].x+" "+prec1[precount].y+"  "+precount);//these co-ords are relative to the component
    precount++;
    if(precount>4 )
    {
          preloginbtn1.setVisible(true);
          
    }      
    else if(precount>4 )
    {   
        //jButton2.setVisible(true);
        if(precount>prenoclicksFtry*2)
        {
              // jLabel1.removeMouseListener();
            JOptionPane.showMessageDialog(null,"Exceeded number of clicks!" );
        }
    }
        else
    {
           // jButton2.setVisible(false);
            preloginbtn1.setVisible(false);
    }
    
    
}	
	});//pre login code ends here
    }

    private BufferedImage loadImage()
    {
        BufferedImage image = null;
        //String fileName = "\\DSC_0812.jpg";
        try
        {
            //URL url = getClass().getResource(fileNameGua);
            image = ImageIO.read(f);
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
    private Pattern pattern;
private Pattern pattern2;
//private Pattern pattern3;
static boolean t=FALSE,t2=FALSE,t3=FALSE,t4=FALSE;
	  private Matcher matcher;
           //private Matcher matcher2;
 
	  private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
	  private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentpanel = new javax.swing.JPanel();
        prelogin = new javax.swing.JPanel();
        preloginimage = new javax.swing.JLabel();
        preloginbtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        loginbtn1 = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        signuppanel = new javax.swing.JPanel();
        signuptxt1 = new javax.swing.JTextField();
        usernameb = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        pass2 = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        signupbtn1 = new javax.swing.JButton();
        signuptxt2 = new javax.swing.JPasswordField();
        signuptxt4 = new javax.swing.JPasswordField();
        signuptxt3 = new javax.swing.JTextField();
        signupbtn = new javax.swing.JButton();
        photosignup = new javax.swing.JLabel();
        guapanelup = new javax.swing.JPanel();
        image123 = new javax.swing.JLabel();
        guanext = new javax.swing.JButton();
        guaconfirm = new javax.swing.JButton();
        guaretry = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentpanel.setLayout(new java.awt.CardLayout());

        prelogin.setPreferredSize(new java.awt.Dimension(603, 366));
        prelogin.setLayout(null);
        prelogin.add(preloginimage);
        preloginimage.setBounds(120, 70, 380, 220);

        preloginbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/confirm.png"))); // NOI18N
        preloginbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        preloginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preloginbtn1ActionPerformed(evt);
            }
        });
        prelogin.add(preloginbtn1);
        preloginbtn1.setBounds(360, 310, 90, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/retryf.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        prelogin.add(jButton1);
        jButton1.setBounds(180, 310, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/guasignup.png"))); // NOI18N
        prelogin.add(jLabel4);
        jLabel4.setBounds(0, 0, 603, 366);

        parentpanel.add(prelogin, "card5");

        loginpanel.setLayout(null);

        loginbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/lbtnf.png"))); // NOI18N
        loginbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtn1ActionPerformed(evt);
            }
        });
        loginpanel.add(loginbtn1);
        loginbtn1.setBounds(120, 230, 160, 30);

        username.setBackground(new java.awt.Color(112, 97, 116));
        username.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        loginpanel.add(username);
        username.setBounds(120, 120, 160, 23);

        password.setBackground(new java.awt.Color(112, 97, 116));
        password.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loginpanel.add(password);
        password.setBounds(120, 170, 160, 23);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        loginpanel.add(jLabel2);
        jLabel2.setBounds(480, 290, 120, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/login2.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        loginpanel.add(jButton2);
        jButton2.setBounds(360, 230, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/loginf.png"))); // NOI18N
        loginpanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 603, 366);

        parentpanel.add(loginpanel, "card4");

        signuppanel.setPreferredSize(new java.awt.Dimension(603, 366));
        signuppanel.setLayout(null);

        signuptxt1.setBackground(new java.awt.Color(112, 97, 116));
        signuptxt1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        signuptxt1.setForeground(new java.awt.Color(255, 255, 255));
        signuptxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signuptxt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signuptxt1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                signuptxt1FocusLost(evt);
            }
        });
        signuptxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signuptxt1MouseClicked(evt);
            }
        });
        signuptxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuptxt1ActionPerformed(evt);
            }
        });
        signuppanel.add(signuptxt1);
        signuptxt1.setBounds(310, 90, 200, 30);
        signuppanel.add(usernameb);
        usernameb.setBounds(530, 90, 30, 30);
        signuppanel.add(pass1);
        pass1.setBounds(530, 130, 30, 30);
        signuppanel.add(pass2);
        pass2.setBounds(530, 170, 30, 30);
        signuppanel.add(emaillabel);
        emaillabel.setBounds(530, 210, 30, 30);

        signupbtn1.setBackground(new java.awt.Color(255, 255, 255));
        signupbtn1.setForeground(new java.awt.Color(99, 98, 130));
        signupbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/sbtn2.jpg"))); // NOI18N
        signupbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signupbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtn1ActionPerformed(evt);
            }
        });
        signuppanel.add(signupbtn1);
        signupbtn1.setBounds(50, 310, 240, 40);

        signuptxt2.setBackground(new java.awt.Color(112, 97, 116));
        signuptxt2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        signuptxt2.setForeground(new java.awt.Color(255, 255, 255));
        signuptxt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signuptxt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signuptxt2FocusLost(evt);
            }
        });
        signuptxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuptxt2ActionPerformed(evt);
            }
        });
        signuppanel.add(signuptxt2);
        signuptxt2.setBounds(310, 170, 200, 30);

        signuptxt4.setBackground(new java.awt.Color(112, 97, 116));
        signuptxt4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        signuptxt4.setForeground(new java.awt.Color(255, 255, 255));
        signuptxt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signuptxt4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signuptxt4FocusLost(evt);
            }
        });
        signuptxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuptxt4ActionPerformed(evt);
            }
        });
        signuppanel.add(signuptxt4);
        signuptxt4.setBounds(310, 130, 200, 30);

        signuptxt3.setBackground(new java.awt.Color(112, 97, 116));
        signuptxt3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        signuptxt3.setForeground(new java.awt.Color(255, 255, 255));
        signuptxt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signuptxt3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signuptxt3FocusLost(evt);
            }
        });
        signuptxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuptxt3ActionPerformed(evt);
            }
        });
        signuppanel.add(signuptxt3);
        signuptxt3.setBounds(310, 210, 200, 30);

        signupbtn.setBackground(new java.awt.Color(255, 255, 255));
        signupbtn.setForeground(new java.awt.Color(99, 98, 130));
        signupbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/sbtn1.jpg"))); // NOI18N
        signupbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        signuppanel.add(signupbtn);
        signupbtn.setBounds(310, 310, 240, 40);

        photosignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/asd.png"))); // NOI18N
        signuppanel.add(photosignup);
        photosignup.setBounds(0, 0, 610, 370);

        parentpanel.add(signuppanel, "card2");

        guapanelup.setLayout(null);
        guapanelup.add(image123);
        image123.setBounds(120, 70, 380, 220);

        guanext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/next.png"))); // NOI18N
        guanext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        guanext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guanextActionPerformed(evt);
            }
        });
        guapanelup.add(guanext);
        guanext.setBounds(260, 310, 90, 30);

        guaconfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/confirm.png"))); // NOI18N
        guaconfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        guaconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guaconfirmActionPerformed(evt);
            }
        });
        guapanelup.add(guaconfirm);
        guaconfirm.setBounds(420, 310, 90, 30);

        guaretry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/retryf.png"))); // NOI18N
        guaretry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        guaretry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guaretryActionPerformed(evt);
            }
        });
        guapanelup.add(guaretry);
        guaretry.setBounds(90, 310, 90, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalsocialhavaldar/guasignup.png"))); // NOI18N
        guapanelup.add(jLabel3);
        jLabel3.setBounds(0, 0, 603, 366);

        parentpanel.add(guapanelup, "card3");

        getContentPane().add(parentpanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signuptxt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signuptxt1FocusLost
        // TODO add your handling code here:
        String temp=signuptxt1.getText();
        t=vaildate(temp);
        if(t==TRUE)
        {
            System.out.println("ok");
            usernameb.setIcon(new ImageIcon("E:\\vault pictures\\check_mark_new.png"));
        }
        else
        {
             System.out.println(" not ok");
             usernameb.setIcon(new ImageIcon("E:\\vault pictures\\Delete-icon.png"));
        }
       
    }//GEN-LAST:event_signuptxt1FocusLost

    private void signuptxt2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signuptxt2FocusLost
        // TODO add your handling code here:
        String password=signuptxt2.getText();
        if(password.length()<5 || password.length()>10)
        {
            t3=FALSE;
            System.out.println("not ok");
        }
        else
        {
            t3=TRUE;
            System.out.println("ok");
        }
        if(signuptxt4.getText().equals(signuptxt2.getText()))
        {
            t4=TRUE;
            pass1.setIcon(new ImageIcon("E:\\vault pictures\\check_mark_new.png"));
            pass2.setIcon(new ImageIcon("E:\\vault pictures\\check_mark_new.png"));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!" );
            pass1.setIcon(new ImageIcon("E:\\vault pictures\\Delete-icon.png"));
            pass2.setIcon(new ImageIcon("E:\\vault pictures\\Delete-icon.png"));
        }
    }//GEN-LAST:event_signuptxt2FocusLost

    private void signuptxt3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signuptxt3FocusLost
        // TODO add your handling code here:
        String hex=signuptxt3.getText();
        t2=validate2I(hex);
        if(t2==TRUE)
        {
            emaillabel.setIcon(new ImageIcon("E:\\vault pictures\\check_mark_new.png"));
            System.out.println("ok");
        }
        else
        {
            System.out.println(" not ok");
            emaillabel.setIcon(new ImageIcon("E:\\vault pictures\\Delete-icon.png"));
            
        }
        
    }//GEN-LAST:event_signuptxt3FocusLost

    private void signuptxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuptxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signuptxt3ActionPerformed

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
        if((count-noclicksFtry)==noclicksFtry)
        {
            System.out.println("count==noclicksFtry");
        }else
        {
            JOptionPane.showMessageDialog(null,"Points selected don't match, please try again!");
            count=noclicksFtry;
        image123.repaint();
        }
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
        else
        {
            JOptionPane.showMessageDialog(null,"Points selected don't match, please try again!");
            count=noclicksFtry;
        image123.repaint();
        }
            
    }
    private void loginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtn1ActionPerformed
        // TODO add your handling code here:
        
            String username1=username.getText();
        String pass1=password.getText();
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
       // String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!

        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("signup.txt"));

            int i=0;
            int flag=0;

            while ((sCurrentLine = br.readLine()) != null && flag!=1) {
                String[] arr = sCurrentLine.split(" ");
                if(username1.equals(arr[0]) && pass1.equals(arr[1]))
                flag=1;

                //Now if you want to enter them into separate arrays
                // characters[i] = arr[0];
                // and you can do the same with
                // names[1] = arr[1]
                //etc

                i++;
            }

            if(flag==1)
            {
                //ImageCrypto img=new ImageCrypto();
                //img.setVisible(true);
                mainframe mf = new mainframe();
                mf.setVisible(true);
                this.dispose();

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Username or Password!" );
                count++;
                if(count>2){
                   Webcam webcam = Webcam.getDefault();
		webcam.setCustomViewSizes(nonStandardResolutions);
		webcam.setViewSize(WebcamResolution.HD720.getSize());
		webcam.open();
               // private static final long serialVersionUID = 1L;
                try {
					String name = String.format("test-%d.jpg", System.currentTimeMillis());
					ImageIO.write(webcam.getImage(), "JPG", new File(name));
					System.out.format("File %s has been saved\n", name);
				} catch (IOException t) {
					t.printStackTrace();
				}
                    //System.exit(0);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                if (br != null)br.close();
                //File file3 =new File("signup.txt");
                //file3.delete();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        
        
    }//GEN-LAST:event_loginbtn1ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void preloginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preloginbtn1ActionPerformed
        // TODO add your handling code here:
        BufferedReader br = null;
        prec2=new Point[10];
        // String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        int countgua;
        String arr[] = null;
        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("gua.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                arr = sCurrentLine.split(" ");
            }
            // count=Integer.parseInt(arr[0]);
            /*  point1x=Integer.parseInt(arr[1]);
            point1y=Integer.parseInt(arr[2]);
            point2x=Integer.parseInt(arr[3]);
            point2y=Integer.parseInt(arr[4]);
            point3x=Integer.parseInt(arr[5]);
            point3y=Integer.parseInt(arr[6]);
            point4x=Integer.parseInt(arr[7]);
            point4y=Integer.parseInt(arr[8]);
            point5x=Integer.parseInt(arr[9]);
            point5y=Integer.parseInt(arr[10]);

            c2[i]=new Point(point1x,point1y);
            c2[1]=new Point(point2x,point2y);
            c2[2]=new Point(point3x,point3y);
            c2[3]=new Point(point4x,point4y);
            c2[4]=new Point(point5x,point5y);*/
            countgua=Integer.parseInt(arr[0]);
            int j=1;
            for(int a=0;a<countgua;a++)
            {
                prec2[a]=new Point(Integer.parseInt(arr[j]),Integer.parseInt(arr[j+1]));
                System.out.println(" "+prec2[a]);
                j=j+2;
            }

            for(prei=0;prei<countgua;prei++)
            {
                if(prec1[prei].x<=prec2[prei].x+10 && prec1[prei].x>=prec2[prei].x-10 && prec1[prei].y<=prec2[prei].y+10 && prec1[prei].y>=prec2[prei].y-10)
                System.out.println(prec1[prei].x+"equal"+prec2[prei].x);
                else
                {
                    preconfirmpassword=false;
                    System.out.println("false");
                    System.out.println(prec1[prei].x+"equal"+prec2[prei].x);
                }

            }
            if(preconfirmpassword==true)
            {
                //ImageCrypto imgd=new ImageCrypto();
                //imgd.setVisible(true);
                mainframe mf=new mainframe();
                mf.setVisible(true);
                this.dispose();
            }
            else
            {
                
            }
            

        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {

                if (br != null)br.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_preloginbtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        precount=0;
        preloginimage.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guaretryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guaretryActionPerformed
        // TODO add your handling code here:
        //count=0;
        if(bcount==0)
        {
            count=0;
            image123.repaint();
        }else
        {
        count=noclicksFtry;
        image123.repaint();
        }
    }//GEN-LAST:event_guaretryActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
        if(gua==true)
        {
            BufferedImage image1 = loadImage();
        
        img=new ImageIcon(image1.getScaledInstance(image123.getWidth(),image123.getHeight(),BufferedImage.SCALE_SMOOTH));
        image123.setIcon(img);
        }
        File file1 =new File("Encryptedsignup.txt");
        File file2 =new File("signup.txt");
        
        if(t!=t2 || t2!=t3 || t2!=TRUE)
        {
            JOptionPane.showMessageDialog(null,"Please Enter Valid Credentials!" );
        }        
        else{
            try{file2.createNewFile();
                FileOutputStream fout= new FileOutputStream("signup.txt");
                String s1= signuptxt1.getText();
                s1=s1.concat(" ");
                String s2= signuptxt2.getText();
                s2=s2.concat(" ");
                String s3= signuptxt3.getText();
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
            cb.CBCEncrypt(inputStream,outputStream);
        } catch (IOException | ShortBufferException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
            file2.delete();
                }catch(Exception e){
                    //JOptionPane.showMessageDialog(null,"File Does Not Exist!");
                }
                String str="Encryptedsignup.txt";
                File file=new File(str);
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

        //File file1 = new File("signup.txt");

        if(gua==true ){
            parentpanel.removeAll();
        parentpanel.add(guapanelup);
        parentpanel.repaint();
        parentpanel.revalidate();
            

        }
        else
        {
            mainframe mf = null;
            try {
                mf = new mainframe();
            } catch (IOException ex) {
                Logger.getLogger(signupframe1.class.getName()).log(Level.SEVERE, null, ex);
            }
            mf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_signupbtnActionPerformed

    private void signuptxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuptxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signuptxt2ActionPerformed

    private void signuptxt4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signuptxt4FocusLost
        // TODO add your handling code here:
        String password=signuptxt2.getText();
        if(password.length()<5 || password.length()>10)
        {
            t4=FALSE;
            System.out.println("not ok");
        }
        else
        {
            t4=TRUE;
            System.out.println("ok");
        }
    }//GEN-LAST:event_signuptxt4FocusLost

    private void signuptxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuptxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signuptxt4ActionPerformed

    private void signupbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtn1ActionPerformed
        // TODO add your handling code here:
        gua=TRUE;
        JFileChooser jfc= new JFileChooser();
         FileFilter imgfilter = new FileNameExtensionFilter(
        "Image files", ImageIO.getReaderFileSuffixes());
         jfc.setFileFilter(imgfilter);
        jfc.showOpenDialog(this);
        
         f=jfc.getSelectedFile();
         fileNameGua= f.getAbsolutePath();
         try {
            fout= new FileOutputStream("guaFileName.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Wallet.class.getName()).log(Level.SEVERE, null, ex);
        }
         byte b1[]=fileNameGua.getBytes();
         try
            {
                fout.write(b1);
            } catch (IOException ex) {
             Logger.getLogger(signupframe1.class.getName()).log(Level.SEVERE, null, ex);
         }
         finally
         {
            try {
                fout.close();
            } catch (IOException ex) {
                Logger.getLogger(signupframe1.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }//GEN-LAST:event_signupbtn1ActionPerformed

    private void signuptxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuptxt1ActionPerformed
        // TODO add your handling code here:
       // signuptxt1.setText("");
    }//GEN-LAST:event_signuptxt1ActionPerformed

    private void signuptxt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signuptxt1FocusGained
        // TODO add your handling code here:
        //signuptxt1.setText("");
    }//GEN-LAST:event_signuptxt1FocusGained

    private void signuptxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signuptxt1MouseClicked
        // TODO add your handling code here:
       // signuptxt1.setText("");
    }//GEN-LAST:event_signuptxt1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String emailto;
        String username1;
        String pass1;
        String path=new String("signup.txt");
        BouncyCastleProvider_AES_CBC cb=new BouncyCastleProvider_AES_CBC();
       

        //String path=new String("c://DecryptFiles//");

        //path=path.concat(str1);
        File file2=new File("Encryptedsignup.txt");
        try{
            FileInputStream file = new FileInputStream(file2.getAbsolutePath());

            FileOutputStream outStream = new FileOutputStream(path);
            cb.InitCiphers();
            cb.CBCDecrypt(file, outStream);
            //JOptionPane.showMessageDialog(null,"File Decrypted!");

        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"File Does Not Exist!");
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
                emailto=arr[2];
                username1=arr[0];
                pass1=arr[1];
                File file1 =new File("signup.txt");
                file1.delete();
                final String username = "socialhavaldar@gmail.com";
                final String password = "socialhavaldar123";

                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");
                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

                Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        @Override
                        protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                            return new javax.mail.PasswordAuthentication(username, password);
                        }
                    });

                    try {

                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("socialhavaldar@gmail.com"));
                        message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(emailto));
                        message.setSubject("Password Recovery");
                        message.setText("Username:"+username1
                            + "\n\n Password:"+pass1);

                        Transport.send(message);

                        JOptionPane.showMessageDialog(null,"Password Mailed!" );

                    } catch (MessagingException e) {
                        JOptionPane.showMessageDialog(null,"Password Mail Failed!" );
                    }
                    
                    i++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {

                    if (br != null)br.close();
                    File file1 =new File("signup.txt");
                    file1.delete();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         BufferedReader br = null;
          String[] arr = null;
        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("guaFileName.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                arr = sCurrentLine.split(" ");
     //   jwallet=arr.length;
                System.out.println(arr[0]);
            }
            
           fileNameGua=arr[0];
           f=new File(fileNameGua);
       //     cardno.setText(arr[0]);
         //   cvv.setText(arr[1]);
           // month.setText(arr[2]+""+arr[3]);
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
        BufferedImage preimage1 = loadImage();
        preimg=new ImageIcon(preimage1.getScaledInstance(preloginimage.getWidth(),preloginimage.getHeight(),BufferedImage.SCALE_SMOOTH));
        preloginimage.setIcon(preimg);
        
        parentpanel.removeAll();
        parentpanel.add(prelogin);
        parentpanel.repaint();
       parentpanel.revalidate();
       
    }//GEN-LAST:event_jButton2ActionPerformed
          
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
            java.util.logging.Logger.getLogger(signupframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new signupframe1().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emaillabel;
    private javax.swing.JButton guaconfirm;
    private javax.swing.JButton guanext;
    private javax.swing.JPanel guapanelup;
    private javax.swing.JButton guaretry;
    private javax.swing.JLabel image123;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginbtn1;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel parentpanel;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel photosignup;
    private javax.swing.JPanel prelogin;
    private javax.swing.JButton preloginbtn1;
    private javax.swing.JLabel preloginimage;
    private javax.swing.JButton signupbtn;
    private javax.swing.JButton signupbtn1;
    private javax.swing.JPanel signuppanel;
    private javax.swing.JTextField signuptxt1;
    private javax.swing.JPasswordField signuptxt2;
    private javax.swing.JTextField signuptxt3;
    private javax.swing.JPasswordField signuptxt4;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameb;
    // End of variables declaration//GEN-END:variables

private boolean vaildate(String temp) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     matcher = pattern.matcher(temp);
		  return matcher.matches();
    }

    private boolean validate2I(String hex) {
matcher = pattern2.matcher(hex);
		return matcher.matches();        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
