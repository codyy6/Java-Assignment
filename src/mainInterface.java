import static java.awt.Color.GREEN;
import static java.awt.Color.RED;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Cody
 */
public class mainInterface extends javax.swing.JFrame {
    File f = new File("C:\\Users\\Cody\\OneDrive - Asia Pacific University\\Desktop\\Sem 5\\Java\\Reservation.txt");
    String line;
    String[] details;
    SimpleDateFormat dcn = new SimpleDateFormat("dd/MM/yyyy");
    int ln;
    String room;
    /**
     * Creates new form mainInterface
     */
    public mainInterface() {
        initComponents();
    }
    void checkRoom(String in,String out){
        try {
            RandomAccessFile raf = new RandomAccessFile(f,"rw");
            Date In = dcn.parse(in);
            Date Out = dcn.parse(out);
            while ((line = raf.readLine()) != null){
                details = line.split(",");
                Calendar c = Calendar.getInstance();
                c.setTime(dcn.parse(details[1]));
                c.add(Calendar.DATE,-1);
                Date start = c.getTime();
                c.setTime(dcn.parse(details[2]));
                Date end = c.getTime();
                if (((In.before(end)) && (In.after(start))) || (((Out).after(start)) && (Out.before(end)||(start.before(Out)&&start.after(In))||(In.before(end)&&In.after(start))))){
                    setColour(details[0]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(mainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void setColour(String room){
        switch(room){
            case "room101":
                room101Button.setBackground(RED);
                break;
            case "room102":
                room102Button.setBackground(RED);
                break;
            case "room103":
                room103Button.setBackground(RED);
                break;
            case "room104":
                room104Button.setBackground(RED);
                break;
            case "room105":
                room105Button.setBackground(RED);
                break;
            case "room106":
                room106Button.setBackground(RED);
                break;
            case "room107":
                room107Button.setBackground(RED);
                break;
            case "room108":
                room108Button.setBackground(RED);
                break;
            case "room109":
                room109Button.setBackground(RED);
                break;
            case "room110":
                room110Button.setBackground(RED);
                break;
            case "room201":
                room201Button.setBackground(RED);
                break;
            case "room202":
                room202Button.setBackground(RED);
                break;
            case "room203":
                room203Button.setBackground(RED);
                break;
            case "room204":
                room204Button.setBackground(RED);
                break;
            case "room205":
                room205Button.setBackground(RED);
                break;
            case "room206":
                room206Button.setBackground(RED);
                break;
            case "room207":
                room207Button.setBackground(RED);
                break;
            case "room208":
                room208Button.setBackground(RED);
                break;
            case "room209":
                room209Button.setBackground(RED);
                break;
            case "room210":
                room210Button.setBackground(RED);
                break;
        }
    }
    void clearColour(){
        room101Button.setBackground(GREEN);
        room102Button.setBackground(GREEN);
        room103Button.setBackground(GREEN);
        room104Button.setBackground(GREEN);
        room105Button.setBackground(GREEN);
        room106Button.setBackground(GREEN);
        room107Button.setBackground(GREEN);
        room108Button.setBackground(GREEN);
        room109Button.setBackground(GREEN);
        room110Button.setBackground(GREEN);
        room201Button.setBackground(GREEN);
        room202Button.setBackground(GREEN);
        room203Button.setBackground(GREEN);
        room204Button.setBackground(GREEN);
        room205Button.setBackground(GREEN);
        room206Button.setBackground(GREEN);
        room207Button.setBackground(GREEN);
        room208Button.setBackground(GREEN);
        room209Button.setBackground(GREEN);
        room210Button.setBackground(GREEN);
    }
    void booking(){
        Booking b = new Booking();
        b.show();
    }
    void checkRoom(File f,String in,String out){
            SimpleDateFormat dcn = new SimpleDateFormat("dd/MM/yyyy");
            String line;
            String[] details;
        try {
            RandomAccessFile raf = new RandomAccessFile(f,"rw");
            Date In = dcn.parse(in);
            Date Out = dcn.parse(out);
            while ((line = raf.readLine()) != null){
                details = line.split(",");
                Calendar c = Calendar.getInstance();
                c.setTime(dcn.parse(details[1]));
                c.add(Calendar.DATE,-1);
                Date start = c.getTime();
                c.setTime(dcn.parse(details[2]));
                Date end = c.getTime();
                if (((In.before(end)) && (In.after(start))) || (((Out).after(start)) && (Out.before(end)||(start.before(Out)&&start.after(In))||(In.before(end)&&In.after(start))))){
                     setColour(details[0]);
                    
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(mainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        bookingButton = new javax.swing.JButton();
        editBookingsButton = new javax.swing.JButton();
        calender = new com.toedter.calendar.JCalendar();
        check = new javax.swing.JButton();
        room101Button = new javax.swing.JButton();
        room102Button = new javax.swing.JButton();
        room103Button = new javax.swing.JButton();
        room104Button = new javax.swing.JButton();
        room105Button = new javax.swing.JButton();
        room106Button = new javax.swing.JButton();
        room107Button = new javax.swing.JButton();
        room108Button = new javax.swing.JButton();
        room109Button = new javax.swing.JButton();
        room110Button = new javax.swing.JButton();
        room201Button = new javax.swing.JButton();
        room202Button = new javax.swing.JButton();
        room203Button = new javax.swing.JButton();
        room204Button = new javax.swing.JButton();
        room205Button = new javax.swing.JButton();
        room206Button = new javax.swing.JButton();
        room207Button = new javax.swing.JButton();
        room208Button = new javax.swing.JButton();
        room209Button = new javax.swing.JButton();
        room210Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startDate = new javax.swing.JTextField();
        endDate = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        endButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        registerButton.setText("Register New Account");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        bookingButton.setText("Booking");
        bookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingButtonActionPerformed(evt);
            }
        });

        editBookingsButton.setText("Records");
        editBookingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookingsButtonActionPerformed(evt);
            }
        });

        check.setText("Check Availability");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        room101Button.setBackground(new java.awt.Color(0, 255, 0));
        room101Button.setText("Room 101");
        room101Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room101ButtonActionPerformed(evt);
            }
        });

        room102Button.setBackground(new java.awt.Color(0, 255, 0));
        room102Button.setText("Room 102");
        room102Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room102ButtonActionPerformed(evt);
            }
        });

        room103Button.setBackground(new java.awt.Color(0, 255, 0));
        room103Button.setText("Room 103");
        room103Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room103ButtonActionPerformed(evt);
            }
        });

        room104Button.setBackground(new java.awt.Color(0, 255, 0));
        room104Button.setText("Room 104");
        room104Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room104ButtonActionPerformed(evt);
            }
        });

        room105Button.setBackground(new java.awt.Color(0, 255, 0));
        room105Button.setText("Room 105");
        room105Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room105ButtonActionPerformed(evt);
            }
        });

        room106Button.setBackground(new java.awt.Color(0, 255, 0));
        room106Button.setText("Room 106");
        room106Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room106ButtonActionPerformed(evt);
            }
        });

        room107Button.setBackground(new java.awt.Color(0, 255, 0));
        room107Button.setText("Room 107");
        room107Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room107ButtonActionPerformed(evt);
            }
        });

        room108Button.setBackground(new java.awt.Color(0, 255, 0));
        room108Button.setText("Room 108");
        room108Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room108ButtonActionPerformed(evt);
            }
        });

        room109Button.setBackground(new java.awt.Color(0, 255, 0));
        room109Button.setText("Room 109");
        room109Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room109ButtonActionPerformed(evt);
            }
        });

        room110Button.setBackground(new java.awt.Color(0, 255, 0));
        room110Button.setText("Room 110");
        room110Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room110ButtonActionPerformed(evt);
            }
        });

        room201Button.setBackground(new java.awt.Color(0, 255, 0));
        room201Button.setText("Room 201");
        room201Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room201ButtonActionPerformed(evt);
            }
        });

        room202Button.setBackground(new java.awt.Color(0, 255, 0));
        room202Button.setText("Room 202");
        room202Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room202ButtonActionPerformed(evt);
            }
        });

        room203Button.setBackground(new java.awt.Color(0, 255, 0));
        room203Button.setText("Room 203");
        room203Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room203ButtonActionPerformed(evt);
            }
        });

        room204Button.setBackground(new java.awt.Color(0, 255, 0));
        room204Button.setText("Room 204");
        room204Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room204ButtonActionPerformed(evt);
            }
        });

        room205Button.setBackground(new java.awt.Color(0, 255, 0));
        room205Button.setText("Room 205");
        room205Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room205ButtonActionPerformed(evt);
            }
        });

        room206Button.setBackground(new java.awt.Color(0, 255, 0));
        room206Button.setText("Room 206");
        room206Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room206ButtonActionPerformed(evt);
            }
        });

        room207Button.setBackground(new java.awt.Color(0, 255, 0));
        room207Button.setText("Room 207");
        room207Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room207ButtonActionPerformed(evt);
            }
        });

        room208Button.setBackground(new java.awt.Color(0, 255, 0));
        room208Button.setText("Room 208");
        room208Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room208ButtonActionPerformed(evt);
            }
        });

        room209Button.setBackground(new java.awt.Color(0, 255, 0));
        room209Button.setText("Room 209");
        room209Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room209ButtonActionPerformed(evt);
            }
        });

        room210Button.setBackground(new java.awt.Color(0, 255, 0));
        room210Button.setText("Room 210");
        room210Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room210ButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ocean View");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jungle View");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        startButton.setText("Start Date");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        endButton.setText("End Date");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(7, 7, 7)
                .addComponent(registerButton)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(calender, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(startButton)))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(endButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(room102Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room101Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room103Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room104Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room105Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room106Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room107Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room108Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room109Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(room110Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room201Button)
                    .addComponent(room210Button)
                    .addComponent(room209Button)
                    .addComponent(room208Button)
                    .addComponent(room207Button)
                    .addComponent(room206Button)
                    .addComponent(room205Button)
                    .addComponent(room204Button)
                    .addComponent(room203Button)
                    .addComponent(room202Button)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(check)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(bookingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editBookingsButton)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerButton)
                            .addComponent(logOutButton))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room101Button)
                            .addComponent(room201Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room102Button)
                            .addComponent(room202Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room103Button)
                            .addComponent(room203Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room104Button)
                            .addComponent(room204Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room105Button)
                            .addComponent(room205Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room106Button)
                            .addComponent(room206Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room107Button)
                            .addComponent(room207Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room108Button)
                            .addComponent(room208Button)))
                    .addComponent(calender, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room109Button)
                            .addComponent(room209Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room110Button)
                            .addComponent(room210Button))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endButton)
                            .addComponent(startButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingButton)
                            .addComponent(editBookingsButton))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
clearColour();
checkRoom(startDate.getText(),endDate.getText());
    }//GEN-LAST:event_checkActionPerformed
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
registerAccount ra = new registerAccount();
ra.show();// TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed
    private void room101ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room101ButtonActionPerformed
room = "room101";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room101ButtonActionPerformed
    private void room108ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room108ButtonActionPerformed
room = "room108";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room108ButtonActionPerformed
    private void room102ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room102ButtonActionPerformed
room = "room102";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room102ButtonActionPerformed
    private void room103ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room103ButtonActionPerformed
room = "room103";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room103ButtonActionPerformed
    private void room104ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room104ButtonActionPerformed
room = "room104";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room104ButtonActionPerformed
    private void room105ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room105ButtonActionPerformed
room = "room105";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room105ButtonActionPerformed
    private void room106ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room106ButtonActionPerformed
room = "room106";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room106ButtonActionPerformed
    private void room107ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room107ButtonActionPerformed
room = "room107";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room107ButtonActionPerformed
    private void room109ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room109ButtonActionPerformed
room = "room109";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room109ButtonActionPerformed
    private void room110ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room110ButtonActionPerformed
room = "room110";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room110ButtonActionPerformed
    private void room201ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room201ButtonActionPerformed
room = "room201";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room201ButtonActionPerformed
    private void room202ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room202ButtonActionPerformed
room = "room202";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room202ButtonActionPerformed
    private void room203ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room203ButtonActionPerformed
room = "room203";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room203ButtonActionPerformed
    private void room204ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room204ButtonActionPerformed
room = "room204";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room204ButtonActionPerformed
    private void room205ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room205ButtonActionPerformed
room = "room205";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room205ButtonActionPerformed
    private void room206ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room206ButtonActionPerformed
room = "room206";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room206ButtonActionPerformed
    private void room207ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room207ButtonActionPerformed
room = "room207";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room207ButtonActionPerformed
    private void room208ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room208ButtonActionPerformed
room = "room208";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room208ButtonActionPerformed
    private void room209ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room209ButtonActionPerformed
room = "room209";
new Booking(room).setVisible(true);
     }//GEN-LAST:event_room209ButtonActionPerformed
    private void room210ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room210ButtonActionPerformed
room = "room210";
new Booking(room).setVisible(true); 
    }//GEN-LAST:event_room210ButtonActionPerformed
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
Login l = new Login();
JOptionPane.showMessageDialog(null,"Successfully logged out.");
l.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_logOutButtonActionPerformed
    private void bookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingButtonActionPerformed
booking();        // TODO add your handling code here:
    }//GEN-LAST:event_bookingButtonActionPerformed
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
startDate.setText(dcn.format(calender.getDate()));        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonActionPerformed
    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
endDate.setText(dcn.format(calender.getDate()));        // TODO add your handling code here:
    }//GEN-LAST:event_endButtonActionPerformed
    private void editBookingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookingsButtonActionPerformed
String a = "a";
new EditFile(a).setVisible(true);
    }//GEN-LAST:event_editBookingsButtonActionPerformed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingButton;
    private com.toedter.calendar.JCalendar calender;
    private javax.swing.JButton check;
    private javax.swing.JButton editBookingsButton;
    private javax.swing.JButton endButton;
    private javax.swing.JTextField endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton room101Button;
    private javax.swing.JButton room102Button;
    private javax.swing.JButton room103Button;
    private javax.swing.JButton room104Button;
    private javax.swing.JButton room105Button;
    private javax.swing.JButton room106Button;
    private javax.swing.JButton room107Button;
    private javax.swing.JButton room108Button;
    private javax.swing.JButton room109Button;
    private javax.swing.JButton room110Button;
    private javax.swing.JButton room201Button;
    private javax.swing.JButton room202Button;
    private javax.swing.JButton room203Button;
    private javax.swing.JButton room204Button;
    private javax.swing.JButton room205Button;
    private javax.swing.JButton room206Button;
    private javax.swing.JButton room207Button;
    private javax.swing.JButton room208Button;
    private javax.swing.JButton room209Button;
    private javax.swing.JButton room210Button;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField startDate;
    // End of variables declaration//GEN-END:variables
}