import database.dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class transaksipembayaran_page extends javax.swing.JFrame {
    private Connection cn;
    private PreparedStatement preparedStatement;
    
    public transaksipembayaran_page() {
        initComponents();
        dbconnection koneksi = new dbconnection();
        cn = koneksi.getConnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfidtransaksi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfnis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbkelas = new javax.swing.JComboBox<>();
        cbjurusan = new javax.swing.JComboBox<>();
        cbpembayaran = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbcicilan = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cbmetode = new javax.swing.JComboBox<>();
        btnbatal = new javax.swing.JButton();
        btnlanjut = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cbsemester = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        tftotal = new javax.swing.JTextField();
        menupanel = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btntransaksi = new javax.swing.JButton();
        btndashboard = new javax.swing.JButton();
        btndatasiswa = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnriwayat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 135, 147));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel15.setBackground(new java.awt.Color(85, 113, 171));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Transaksi Pembayaran");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setText("ID Transaksi");

        jLabel8.setText("Nomor Induk Siswa");

        jLabel9.setText("Nama Siswa");

        jLabel10.setText("Jurusan");

        jLabel11.setText("Semester");

        jLabel12.setText("Keterangan Pembayaran");

        cbkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kelas", "X TGB 1", "X TGB 2", "X TGB 3", "X TGB 4", "X TGB 5", " ", "X TKB 1", "X TKB 2", "X TKB 3", "X TKB 4", "X TKB 5", " ", "X TPK 1", "X TPK 2", "X TPK 3", "X TPK 4", "X TPK 5", " ", "X TMO 1", "X TMO 2", "X TMO 3", "X TMO 4", "X TMO 5", " ", "X TP 1", "X TP 2", "X TP 3", "X TP 4", "X TP 5", " ", "X TM 1", "X TM 2", "X TM 3", "X TM 4", "X TM 5", " ", "X TKJ 1", "X TKJ 2", "X TKJ 3", "X TKJ 4", "X TKJ 5", " ", "X TRPL 1", "X TRPL 2", "X TRPL 3", "X TRPL 4", "X TRPL 5", " ", "XI TGB 1", "XI TGB 2", "XI TIGB 3", "XI TGB 4", "XI TGB 5", " ", "XI TKB 1", "XI TKB 2", "XI TKB 3", "XI TKB 4", "XI TKB 5", " ", "XI TPK 1", "XI TPK 2", "XI TPK 3", "XI TPK 4", "XI TPK 5", " ", "XI TMO 1", "XI TMO 2", "XI TMO 3", "XI TMO 4", "XI TMO 5", " ", "XI TP 1", "XI TP 2", "XI TP 3", "XI TP 4", "XI TP 5", " ", "XI TM 1", "XI TM 2", "XI TM 3", "XI TM 4", "XI TM 5", " ", "XI TKJ 1", "XI TKJ 2", "XI TKJ 3", "XI TKJ 4", "XI TKJ 5", " ", "XI TRPL 1", "XI TRPL 2", "XI TRPL 3", "XI TRPL 4", "XI TRPL 5", " ", "XII TGB 1", "XII TGB 2", "XII TGB 3", "XII TGB 4", "XII TGB 5", " ", "XII TKB 1", "XII TKB 2", "XII TKB 3", "XII TKB 4", "XII TKB 5", " ", "XII TPK 1", "XII TPK 2", "XII TPK 3", "XII TPK 4", "XII TPK 5", " ", "XII TMO 1", "XII TMO 2", "XII TMO 3", "XII TMO 4", "XII TMO 5", " ", "XII TP 1", "XII TP 2", "XII TP 3", "XII TP 4", "XII TP 5", " ", "XII TM 1", "XII TM 2", "XII TM 3", "XII TM 4", "XII TM 5", " ", "XII TKJ 1", "XII TKJ 2", "XII TKJ 3", "XII TKJ 4", "XII TKJ 5", " ", "XII TRPL 1", "XII TRPL 2", "XII TRPL 3", "XII TRPL 4", "XII TRPL 5" }));

        cbjurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan", "Teknik Gambar Bangunan", "Teknik Konstruksi Bangunan", "Teknik Pemanfaatan Ketenagalistrikan", "Teknik Mekanik Otomatif", "Teknik Pemesinan", "Teknologi Multimedia", "Teknologi Komputer dan Jaringan", "Teknologi Rekayasa Perangkat Lunak" }));

        cbpembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Pembayaran", "Lunas", "Cicilan" }));
        cbpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpembayaranActionPerformed(evt);
            }
        });

        jLabel18.setText("Maks Cicilan");

        cbcicilan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Cicilan", "1", "2", " " }));
        cbcicilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcicilanActionPerformed(evt);
            }
        });

        jLabel19.setText("Metode Pembayaran");

        cbmetode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Metode Pembayaran", "Tunai", "Non Tunai" }));

        btnbatal.setBackground(new java.awt.Color(255, 0, 0));
        btnbatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbatal.setForeground(new java.awt.Color(255, 255, 255));
        btnbatal.setText("Batal");
        btnbatal.setBorder(null);
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnlanjut.setBackground(new java.awt.Color(0, 204, 51));
        btnlanjut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlanjut.setForeground(new java.awt.Color(255, 255, 255));
        btnlanjut.setText("Lanjut");
        btnlanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlanjutActionPerformed(evt);
            }
        });

        jLabel21.setText("Kelas");

        cbsemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Semester", "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6" }));

        jLabel20.setText("Total Pembayaran");

        tftotal.setText("Rp ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tftotal))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(cbpembayaran, 0, 265, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbcicilan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbsemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlanjut, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbkelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfidtransaksi)
                            .addComponent(tfnama)
                            .addComponent(tfnis)
                            .addComponent(cbjurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbmetode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfidtransaksi)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbcicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmetode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlanjut, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        menupanel.setBackground(new java.awt.Color(122, 161, 242));

        jPanel16.setBackground(new java.awt.Color(85, 113, 171));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Anantha Aditya");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Siswa");

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\TUF\\Documents\\OPP GUI ASSETS\\Group 3.png")); // NOI18N
        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(8, 8, 8))
        );

        btntransaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntransaksi.setForeground(new java.awt.Color(85, 113, 171));
        btntransaksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\TUF\\Documents\\OPP GUI ASSETS\\transaksipembayaran.png")); // NOI18N
        btntransaksi.setText("Transaksi Pembayaran");
        btntransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransaksiActionPerformed(evt);
            }
        });

        btndashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndashboard.setForeground(new java.awt.Color(85, 113, 171));
        btndashboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\TUF\\Documents\\OPP GUI ASSETS\\dashboard.png")); // NOI18N
        btndashboard.setText("Dashboard");
        btndashboard.setAutoscrolls(true);
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });

        btndatasiswa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndatasiswa.setForeground(new java.awt.Color(85, 113, 171));
        btndatasiswa.setIcon(new javax.swing.ImageIcon("C:\\Users\\TUF\\Documents\\OPP GUI ASSETS\\datasiswa.png")); // NOI18N
        btndatasiswa.setText("Data Siswa");
        btndatasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatasiswaActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(255, 0, 0));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\TUF\\Documents\\OPP GUI ASSETS\\logout.png")); // NOI18N
        btnlogout.setText("Log Out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btnriwayat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnriwayat.setForeground(new java.awt.Color(85, 113, 171));
        btnriwayat.setIcon(new javax.swing.ImageIcon("C:\\Users\\TUF\\Documents\\OPP GUI ASSETS\\history.png")); // NOI18N
        btnriwayat.setText("RIwayat Transaksi");
        btnriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriwayatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(btndashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndatasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnriwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndatasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnriwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpembayaranActionPerformed
        
    }//GEN-LAST:event_cbpembayaranActionPerformed

    private void cbcicilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcicilanActionPerformed
        
    }//GEN-LAST:event_cbcicilanActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
        new dashboard_page().show();
        this.dispose();
    }//GEN-LAST:event_btndashboardActionPerformed

    private void btndatasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatasiswaActionPerformed
        new lihatdata_page().show();
        this.dispose();
    }//GEN-LAST:event_btndatasiswaActionPerformed

    private void btntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransaksiActionPerformed
        new transaksipembayaran_page().show();
        this.dispose();
    }//GEN-LAST:event_btntransaksiActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
        new riwayat_page().show();
        this.dispose();
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        new login_page().show();
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnlanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlanjutActionPerformed
        String selectedMetode = cbmetode.getSelectedItem().toString();
        
        if ("Tunai".equals(selectedMetode)) {
            saveDataToDatabase();
            JOptionPane.showMessageDialog(this, "Silakan datang ke sekolah untuk pembayaran tunai.");
        
        } else if ("Non Tunai".equals(selectedMetode)) {
            new transaksinontunai_page().show();
            this.dispose();
            saveDataToDatabase();
        }
    }//GEN-LAST:event_btnlanjutActionPerformed
    
    private void saveDataToDatabase() {
        String idtransaksi = tfidtransaksi.getText();
        String nis = tfnis.getText();
        String nama = tfnama.getText();
        String jurusan = cbjurusan.getSelectedItem().toString();
        String kelas = cbkelas.getSelectedItem().toString();
        String semester = cbsemester.getSelectedItem().toString();
        String keterangan = cbpembayaran.getSelectedItem().toString();
        String cicilan = cbcicilan.getSelectedItem().toString();
        String metode = cbmetode.getSelectedItem().toString();
        String total = tftotal.getText();

        try {
            String sql = "INSERT INTO riwayat_transaksi (id_transaksi, nis, nama_lengkap, jurusan, kelas, semester, keterangan, cicilan, metode_pembayaran, total_pembayaran) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, idtransaksi);
            preparedStatement.setString(2, nis);
            preparedStatement.setString(3, nama);
            preparedStatement.setString(4, jurusan);
            preparedStatement.setString(5, kelas);
            preparedStatement.setString(6, semester);
            preparedStatement.setString(7, keterangan);
            preparedStatement.setString(8, cicilan);
            preparedStatement.setString(9, metode);
            preparedStatement.setString(10, total);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke dalam database!");
            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data ke dalam database. Pesan kesalahan: " + e.getMessage());
        }
    }

    private void clearFields() {
        tfidtransaksi.setText("");
        tfnis.setText("");
        tfnama.setText("");
        cbjurusan.setSelectedIndex(0);
        cbkelas.setSelectedIndex(0);
        cbpembayaran.setSelectedIndex(0);
        cbcicilan.setSelectedIndex(0);
        cbmetode.setSelectedIndex(0);
        tftotal.setText("");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksipembayaran_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btndashboard;
    private javax.swing.JButton btndatasiswa;
    private javax.swing.JButton btnlanjut;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btntransaksi;
    private javax.swing.JComboBox<String> cbcicilan;
    private javax.swing.JComboBox<String> cbjurusan;
    private javax.swing.JComboBox<String> cbkelas;
    private javax.swing.JComboBox<String> cbmetode;
    private javax.swing.JComboBox<String> cbpembayaran;
    private javax.swing.JComboBox<String> cbsemester;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel menupanel;
    private javax.swing.JTextField tfidtransaksi;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnis;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables

    private Object transaksinontunai_page() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
