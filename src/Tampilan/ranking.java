package Tampilan;

import Database.KoneksiDatabase;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 
/**
 *
 * @author muhammad ikbal
 */
public class ranking extends javax.swing.JFrame {

    ResultSet rs;
    KoneksiDatabase con;

    /**
     * Creates new form LaporanPelanggan
     */
    public ranking() {
        con = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadNilai();
        hmm.setEnabled(false);
        //loadTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_grade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelTranparan1 = new transparan.PanelTranparan();
        jLabel2 = new javax.swing.JLabel();
        txt_uts = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_khd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_siswa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_tgs = new javax.swing.JTextField();
        txt_uas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_id_nilai = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        table = new javax.swing.JButton();
        txt_angka = new javax.swing.JTextField();
        txt_nilai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hmm = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ranking = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ranking");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_grade.setBackground(new java.awt.Color(204, 204, 204));
        txt_grade.setMinimumSize(new java.awt.Dimension(6, 23));
        txt_grade.setPreferredSize(new java.awt.Dimension(6, 23));
        getContentPane().add(txt_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 150, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grade");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 100, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tentukan Ranking Siswa");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No Induk Siswa");

        txt_uts.setBackground(new java.awt.Color(204, 204, 204));
        txt_uts.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_uts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_utsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Siswa");

        txt_khd.setBackground(new java.awt.Color(204, 204, 204));
        txt_khd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_khd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_khdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kehadiran");

        txt_siswa.setBackground(new java.awt.Color(204, 204, 204));
        txt_siswa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_siswaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nilai UTS");

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NILAI");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nilai Tugas");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nilai UAS");

        txt_tgs.setBackground(new java.awt.Color(204, 204, 204));
        txt_tgs.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_tgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tgsActionPerformed(evt);
            }
        });

        txt_uas.setBackground(new java.awt.Color(204, 204, 204));
        txt_uas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_uas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_uasActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID Nilai");

        txt_id_nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_nilaiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data Siswa");

        txt_id.setBackground(new java.awt.Color(204, 204, 204));
        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Kelas");

        txt_kelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7.1", "7.2", "7.3", "7.4", "7.5", "7.6", "7.7", "7.8", "8.1", "8.2", "8.3", "8.4", "8.5", "8.6", "8.7", "8.8", "9.1", "9.2", "9.3", "9.4", "9.5", "9.6", "9.7", "9.8" }));
        txt_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTranparan1Layout = new javax.swing.GroupLayout(panelTranparan1);
        panelTranparan1.setLayout(panelTranparan1Layout);
        panelTranparan1Layout.setHorizontalGroup(
            panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranparan1Layout.createSequentialGroup()
                .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranparan1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranparan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel16))))
                .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTranparan1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id_nilai, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranparan1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                            .addComponent(txt_uts, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranparan1Layout.createSequentialGroup()
                            .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelTranparan1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTranparan1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tgs, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(txt_uas, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                        .addGroup(panelTranparan1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(22, 22, 22)
                            .addComponent(txt_khd)))
                    .addComponent(jLabel8))
                .addGap(32, 32, 32))
        );
        panelTranparan1Layout.setVerticalGroup(
            panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTranparan1Layout.createSequentialGroup()
                .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranparan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_id_nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txt_uts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelTranparan1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_khd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTranparan1Layout.createSequentialGroup()
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_uas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(panelTranparan1Layout.createSequentialGroup()
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTranparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        getContentPane().add(panelTranparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 660, 270));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ranking Siswa");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nilai Rata2");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/table.png"))); // NOI18N
        table.setText("Daftar Table");
        table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableActionPerformed(evt);
            }
        });
        getContentPane().add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, -1, -1));

        txt_angka.setBackground(new java.awt.Color(204, 204, 204));
        txt_angka.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_angka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_angkaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_angka, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 150, -1));

        txt_nilai.setBackground(new java.awt.Color(204, 204, 204));
        txt_nilai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nilaiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 150, -1));

        hmm.setBackground(new java.awt.Color(204, 204, 204));
        hmm.setColumns(20);
        hmm.setRows(5);
        jScrollPane1.setViewportView(hmm);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 330, 180));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 51));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo4.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel18.setText("SMP NEGERI 176 JAKARTA");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/minimize button.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/restore down.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/close button.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel23.setText("SMP NEGERI 176 JAKARTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25)))
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        ranking.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/podium.png"))); // NOI18N
        ranking.setText("Ranking");
        ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingActionPerformed(evt);
            }
        });
        getContentPane().add(ranking, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 140, -1));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Result Output");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background 1.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        setSize(new java.awt.Dimension(839, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        create();
    }//GEN-LAST:event_saveActionPerformed

    private void tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableActionPerformed
        // TODO add your handling code here:
          tableranking fm = new tableranking();
       fm.setVisible(true);
    }//GEN-LAST:event_tableActionPerformed

    private void txt_angkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_angkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_angkaActionPerformed

    private void txt_nilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nilaiActionPerformed

    private void rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingActionPerformed
        // TODO add your handling code here:
        int kehadiran, nilai_uts, nilai_uas, nilai_tugas, ranking, nilai ;
        String hasil;
        kehadiran = Integer.parseInt(txt_khd.getText());
        nilai_uts = Integer.parseInt(txt_uts.getText());
        nilai_uas = Integer.parseInt(txt_uas.getText());
        nilai_tugas = Integer.parseInt(txt_uas.getText());
        ranking = (kehadiran + nilai_uts + nilai_uas + nilai_tugas ) / (4);
        hasil = String.valueOf(ranking);
        txt_nilai.setText(hasil);

        if (ranking >= 95) {
            txt_angka.setText("Peringkat 1");
            txt_grade.setText("A+");
        } else if ((ranking < 95) && (ranking >= 80)){
            txt_angka.setText("Peringkat 2");
            txt_grade.setText("A-");
        } else if ((ranking < 80) && (ranking >= 70)) {
            txt_angka.setText("Peringkat 3");
            txt_grade.setText("B+");
        } else if ((ranking < 70) && (ranking >= 60)) {
            txt_angka.setText("Peringkat 4");
            txt_grade.setText("B-");
        } else if ((ranking < 50) && (ranking >= 40)) {
            txt_angka.setText("Peringkat 5");
            txt_grade.setText("C+"+"C-");
        } else if ((ranking < 30) && (ranking >= 0 )) {
            txt_angka.setText("Tidak Dapat Peringkat");
            txt_grade.setText("D"+"E");
        }

        hmm.setText(
                "Nomor Induk Siswa : " + txt_id.getText() + "\n"
                + "Nama Siswa : " + txt_siswa.getText() + "\n"
                + "Kelas : " + txt_kelas.getSelectedItem()+ "\n"     
                + "Nilai Kehadiran : " + txt_khd.getText() + "\n"
                + "Nilai UTS : " + txt_uts.getText() + "\n"
                + "Nilai UAS : " + txt_uas.getText() + "\n"
                + "Nilai Tugas : " + txt_tgs.getText() + "\n"
                + "Nilai Rata Rata : " + txt_nilai.getText() + "\n"
                + "Peringkat : " + txt_angka.getText() + "\n"
                + "Grade : " + txt_grade.getText() + "\n");
    }//GEN-LAST:event_rankingActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_id_nilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_nilaiActionPerformed
        // TODO add your handling code here:
        String st = (String) txt_id_nilai.getSelectedItem();
        ResultSet rst = con.querySelectAll("nilai", "id_nilai='" + st + "'");
        try {
            while (rst.next()) {

                this.txt_id.setText(rst.getString("nis"));
                this.txt_siswa.setText(rst.getString("nama_siswa"));
                this.txt_kelas.setSelectedItem(rst.getString("kelas"));
                this.txt_khd.setText(rst.getString("kehadiran"));
                this.txt_uts.setText(rst.getString("nilai_uts"));
                this.txt_uas.setText(rst.getString("nilai_uas"));
                this.txt_tgs.setText(rst.getString("nilai_tugas"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ranking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_id_nilaiActionPerformed

    private void txt_uasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_uasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_uasActionPerformed

    private void txt_tgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tgsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tgsActionPerformed

    private void txt_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_siswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_siswaActionPerformed

    private void txt_khdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_khdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_khdActionPerformed

    private void txt_utsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_utsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_utsActionPerformed

    private void txt_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kelasActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.NORMAL);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

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
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ranking().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea hmm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private transparan.PanelTranparan panelTranparan1;
    private javax.swing.JButton ranking;
    private javax.swing.JButton save;
    private javax.swing.JButton table;
    private javax.swing.JTextField txt_angka;
    private javax.swing.JTextField txt_grade;
    private javax.swing.JTextField txt_id;
    private javax.swing.JComboBox<String> txt_id_nilai;
    private javax.swing.JComboBox txt_kelas;
    private javax.swing.JTextField txt_khd;
    private javax.swing.JTextField txt_nilai;
    private javax.swing.JTextField txt_siswa;
    private javax.swing.JTextField txt_tgs;
    private javax.swing.JTextField txt_uas;
    private javax.swing.JTextField txt_uts;
    // End of variables declaration//GEN-END:variables

    private void loadNilai() {  // mengambil database

        rs = con.querySelectAll("nilai");
        try {
            while (rs.next()) {
                txt_id_nilai.addItem(rs.getString("id_nilai"));
            }

        } catch (SQLException ex) {
            // Logger.getLogger(Form_Pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   private void create() {

        String kolom[] = {"id_nilai", "nis", "nama_siswa","kelas","kehadiran", "nilai_uts", "nilai_uas", "nilai_tugas", "peringkat", "rata_rata","grade"};

        String[] isi = {txt_id_nilai.getSelectedItem().toString(), txt_id.getText(), txt_siswa.getText(),txt_kelas.getSelectedItem().toString(), txt_khd.getText(), txt_uts.getText(), txt_uas.getText(), txt_tgs.getText(), txt_angka.getText(), txt_nilai.getText(), txt_grade.getText()};
        System.out.println(con.queryInsert("ranking", kolom, isi));
        JOptionPane.showMessageDialog(this, "Data Peringkat Berhasil Disimpan");
   }

}
