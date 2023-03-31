package telas;

import Modelos.Conexao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.sql.*;
import javax.swing.*;
import org.json.JSONObject;

public class EditarQuiroprata extends javax.swing.JInternalFrame {

    private String cpf;

    public EditarQuiroprata(String cpf) {
        initComponents();
        telaEditar(cpf);
        this.cpf = cpf;
    }

    private void telaEditar(String cpf) {
        try {
            //Conectar ao banco de dados:
            Conexao com = new Conexao();
            //Criar uma consulta para executar no banco
            Statement stmt = null;
            //aciona o mecanismo necessário para a criação da consulta
            stmt = com.c.createStatement();
            //instancia variavel para receber resultado da pesquisa            
            ResultSet rs = null;
            //Atribui o valor da pesquisa à variável            
            rs = stmt.executeQuery("SELECT Nome,CPF,Sexo,DataNasc,CEP,Logradouro,Bairro,Cidade,UF,Numero,Complemento,Telefone1,Telefone2 FROM Quiroprata WHERE CPF ='" + cpf + "'");
            //preenche os campos com os valores da pesquisa
            nomeQuiroprata.setText(rs.getString("Nome"));
            cpfQuiroprata.setText(rs.getString("CPF"));
            sexoQuiroprata.setSelectedItem(rs.getString("Sexo"));
            dataNascQuiroprata.setText(rs.getString("DataNasc"));
            cepQuiroprata.setText(rs.getString("CEP"));
            logradouroQuiroprata.setText(rs.getString("Logradouro"));
            bairroQuiroprata.setText(rs.getString("Bairro"));
            cidadeQuiroprata.setText(rs.getString("Cidade"));
            ufQuiroprata.setText(rs.getString("UF"));
            numeroQuiroprata.setText(rs.getString("Numero"));
            complQuiroprata.setText(rs.getString("Complemento"));
            telefone1Quiroprata.setText(rs.getString("Telefone1"));
            telefone2Quiroprata.setText(rs.getString("Telefone2"));

            //Fecha o conjunto de resultados para limpar a memória     
            //Fecha o mecanismo de consulta
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logradouroQuiroprata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numeroQuiroprata = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bairroQuiroprata = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cidadeQuiroprata = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ufQuiroprata = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        complQuiroprata = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cepQuiroprata = new javax.swing.JFormattedTextField();
        telefone1Quiroprata = new javax.swing.JFormattedTextField();
        telefone2Quiroprata = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeQuiroprata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cpfQuiroprata = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        dataNascQuiroprata = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        sexoQuiroprata = new javax.swing.JComboBox<>();
        botaoSalvarEdiçao = new javax.swing.JButton();
        botaoExcluirQuiroprata = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Quiroprata");
        setPreferredSize(new java.awt.Dimension(1296, 620));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1296, 620));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raioxcoluna.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localização/Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel5.setText("CEP");

        jLabel7.setText("Logradouro:");

        jLabel8.setText("Número");

        numeroQuiroprata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroQuiroprataActionPerformed(evt);
            }
        });

        jLabel6.setText("Bairro");

        jLabel9.setText("Cidade");

        jLabel10.setText("UF:");

        jLabel12.setText("Complemento");

        jLabel13.setText("Telefone 1: ");

        jLabel14.setText("Telefone 2: ");

        try {
            cepQuiroprata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepQuiroprata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepQuiroprataKeyReleased(evt);
            }
        });

        try {
            telefone1Quiroprata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone1Quiroprata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone1QuiroprataActionPerformed(evt);
            }
        });

        try {
            telefone2Quiroprata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone2Quiroprata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone2QuiroprataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(telefone1Quiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone2Quiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cepQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logradouroQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(numeroQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(cidadeQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ufQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(bairroQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cepQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(logradouroQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bairroQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cidadeQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(ufQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numeroQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(complQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(telefone1Quiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone2Quiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raioxcoluna.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel1.setText("Nome do Quiroprata: ");

        nomeQuiroprata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeQuiroprataActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF:");

        try {
            cpfQuiroprata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Data Nasc.:");

        try {
            dataNascQuiroprata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Sexo");

        sexoQuiroprata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexoQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpfQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataNascQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sexoQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoSalvarEdiçao.setBackground(new java.awt.Color(102, 153, 0));
        botaoSalvarEdiçao.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoSalvarEdiçao.setText("Editar Quiroprata");
        botaoSalvarEdiçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarEdiçaoActionPerformed(evt);
            }
        });

        botaoExcluirQuiroprata.setBackground(new java.awt.Color(255, 0, 0));
        botaoExcluirQuiroprata.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoExcluirQuiroprata.setText("Excluir Quiroprata");
        botaoExcluirQuiroprata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirQuiroprataActionPerformed(evt);
            }
        });
        botaoExcluirQuiroprata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoExcluirQuiroprataKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(374, 374, 374))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoSalvarEdiçao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluirQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jLabel16)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSalvarEdiçao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroQuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroQuiroprataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroQuiroprataActionPerformed

    private void telefone1QuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone1QuiroprataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone1QuiroprataActionPerformed

    private void telefone2QuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone2QuiroprataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone2QuiroprataActionPerformed

    private void nomeQuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeQuiroprataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeQuiroprataActionPerformed

    private void botaoSalvarEdiçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarEdiçaoActionPerformed
        // O nome do botão foi alterado para EDITAR QUIROPRATA
        try {
            //Conectar ao banco de dados:            
            Conexao com = new Conexao();
            //Criar uma consulta para executar no banco          
            Statement stmt = null;
            //aciona o mecanismo necessário para a criação da consulta
            stmt = com.c.createStatement();
            //Pega os valores dos campos e altera na tabela
            stmt.executeUpdate("UPDATE Quiroprata set Nome = '" + nomeQuiroprata.getText() + "',CPF = '" + cpfQuiroprata.getText() + "',Sexo = '" + sexoQuiroprata.getSelectedItem() + "',DataNasc = '" + dataNascQuiroprata.getText() + "',CEP = '" + cepQuiroprata.getText() + "',Logradouro = '" + logradouroQuiroprata.getText() + "',Bairro = '" + bairroQuiroprata.getText() + "',Cidade = '" + cidadeQuiroprata.getText() + "',UF = '" + ufQuiroprata.getText() + "',Numero = '" + numeroQuiroprata.getText() + "',Complemento = '" + complQuiroprata.getText() + "',Telefone1 = '" + telefone1Quiroprata.getText() + "',Telefone2 = '" + telefone2Quiroprata.getText() + "' WHERE CPF = '" + this.cpf + "'");

            //Fecha o conjunto de resultados para limpar a memória     
            //Fecha o mecanismo de consulta        
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();
            //Aviso de Alteração com sucessp
            JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");

            this.setVisible(false);
            
            ConsultarQuiroprata tela = new ConsultarQuiroprata();                     
            getParent().add(tela);
            this.setVisible(false);
            tela.setMaximum(true);
            tela.setVisible(true);
            this.repaint();

           

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_botaoSalvarEdiçaoActionPerformed

    private void botaoExcluirQuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirQuiroprataActionPerformed
        try {
            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT CPF FROM Quiroprata INNER JOIN AgendamentoConsulta ON Quiroprata.Id_Quiroprata = AgendamentoConsulta.Quiroprata_ID Where CPF = '" + this.cpf + "'");

            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Desculpa, mas esta exclusão não poderá ser efetuada, pois o Quiroprata selecionado esta cadastrado nos agendamentos.");
                stmt.close();
                //Fecha a conexão com o banco de dados
                com.c.close();
                return;
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        int recebe;
        recebe = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Quiroprata? ", "ATENÇÃO!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (recebe == 0) {
            try {
                Conexao com = new Conexao();
                Statement stmt = null;
                stmt = com.c.createStatement();
                ResultSet rs = null;
                stmt.executeUpdate("DELETE FROM Quiroprata WHERE CPF = '" + this.cpf + "'");
                stmt.close();
                //Fecha a conexão com o banco de dados
                com.c.close();
                JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
                 
                this.setVisible(false);

                ConsultarQuiroprata tela = new ConsultarQuiroprata();
                getParent().add(tela);
                this.setVisible(false);
                tela.setMaximum(true);
                tela.setVisible(true);
                this.repaint();
                /*Limpa campos do formulario
                nomeQuiroprata.setText("");
                cpfQuiroprata.setText("");
                sexoQuiroprata.setSelectedItem("Selecione");
                dataNascQuiroprata.setText("");
                cepQuiroprata.setText("");
                logradouroQuiroprata.setText("");
                bairroQuiroprata.setText("");
                cidadeQuiroprata.setText("");
                ufQuiroprata.setText("");
                numeroQuiroprata.setText("");
                complQuiroprata.setText("");
                telefone1Quiroprata.setText("");
                telefone2Quiroprata.setText("");*/

            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }

    }//GEN-LAST:event_botaoExcluirQuiroprataActionPerformed

    private void botaoExcluirQuiroprataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoExcluirQuiroprataKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirQuiroprataKeyPressed

    private void cepQuiroprataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepQuiroprataKeyReleased
        if (cepQuiroprata.getText().trim().length() < 9) {
            logradouroQuiroprata.setText("");
            bairroQuiroprata.setText("");
            cidadeQuiroprata.setText("");
            ufQuiroprata.setText("");
        }
        if (cepQuiroprata.getText().trim().length() == 9) {
            try {
                String aUrl = "http://viacep.com.br/ws/" + cepQuiroprata.getText() + "/json/";
                URL url = new URL(aUrl);
                URLConnection req;
                req = url.openConnection();
                req.connect();
                InputStream is = (InputStream) req.getContent();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                String json;
                StringBuilder content = new StringBuilder();
                while ((json = rd.readLine()) != null) {
                    content.append(json + "\n");
                }
                rd.close();
                //Instanciamos a classe que vai transformar o json em um Objeto
                JSONObject jsonOb = new JSONObject(content.toString());
                if (jsonOb.has("erro")) { // has = tem (Pergunta: no jsonOb TEM umA chave que mostra erro?)
                    JOptionPane.showMessageDialog(null, "O CEP digitado é invalido!");
                } else {
                    //inserindo o nome da rua na label jLabel1
                    logradouroQuiroprata.setText(jsonOb.get("logradouro").toString());
                    //inserindo o bairro na label jLabel2
                    bairroQuiroprata.setText(jsonOb.get("bairro").toString());
                    cidadeQuiroprata.setText(jsonOb.get("localidade").toString());
                    ufQuiroprata.setText(jsonOb.get("uf").toString());
                }

            } catch (MalformedURLException ex) {
                java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cepQuiroprataKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroQuiroprata;
    private javax.swing.JButton botaoExcluirQuiroprata;
    private javax.swing.JButton botaoSalvarEdiçao;
    private javax.swing.JFormattedTextField cepQuiroprata;
    private javax.swing.JTextField cidadeQuiroprata;
    private javax.swing.JTextField complQuiroprata;
    private javax.swing.JFormattedTextField cpfQuiroprata;
    private javax.swing.JFormattedTextField dataNascQuiroprata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField logradouroQuiroprata;
    private javax.swing.JTextField nomeQuiroprata;
    private javax.swing.JTextField numeroQuiroprata;
    private javax.swing.JComboBox<String> sexoQuiroprata;
    private javax.swing.JFormattedTextField telefone1Quiroprata;
    private javax.swing.JFormattedTextField telefone2Quiroprata;
    private javax.swing.JTextField ufQuiroprata;
    // End of variables declaration//GEN-END:variables
}
