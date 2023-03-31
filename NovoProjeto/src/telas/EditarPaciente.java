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
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

public class EditarPaciente extends javax.swing.JInternalFrame {
    //instancia Variavel 

    private String cpf;
    //Metodo Recebe o cpf por parametro

    public EditarPaciente(String cpf) {
        initComponents();
        // a tela editar recebe cpf por parametro
        telaEditar(cpf);
        //A esta variavel cpf é atribuido o valor do cpf que veio da consulta por parametro 
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
            rs = stmt.executeQuery("SELECT Nome_Paciente,CPF,Sexo,DataNascimento,CEP,Logradouro,Bairro,Cidade,UF,Numero,Complemento,Telefone1,Telefone2,Observacoes FROM  Paciente where CPF ='" + cpf + "'");
            //preenche os campos com os valores da pesquisa
            nomePaciente.setText(rs.getString("Nome_Paciente"));
            cpfPaciente.setText(rs.getString("CPF"));
            sexoPaciente.setSelectedItem(rs.getString("sexo"));
            dtaNascPaciente.setText(rs.getString("DataNascimento"));
            cepPaciente.setText(rs.getString("CEP"));
            logradouro.setText(rs.getString("Logradouro"));
            bairroPaciente.setText(rs.getString("Bairro"));
            cidade.setText(rs.getString("Cidade"));
            uf.setText(rs.getString("Uf"));
            numero.setText(rs.getString("Numero"));
            complemento.setText(rs.getString("Numero"));
            telefone1.setText(rs.getString("Telefone1"));
            telefone2.setText(rs.getString("Telefone2"));
            obs.setText(rs.getString("Observacoes"));

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

        painel = new javax.swing.JPanel();
        observacoes = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        botaoSalvarEdição = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logradouro = new javax.swing.JTextField();
        bairroPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        uf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        complemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        telefone1 = new javax.swing.JFormattedTextField();
        telefone2 = new javax.swing.JFormattedTextField();
        cepPaciente = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sexoPaciente = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        dtaNascPaciente = new javax.swing.JFormattedTextField();
        cpfPaciente = new javax.swing.JFormattedTextField();
        botaoExcluirPaciente = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Paciente");
        setPreferredSize(new java.awt.Dimension(1296, 620));

        painel.setBackground(new java.awt.Color(102, 204, 255));
        painel.setPreferredSize(new java.awt.Dimension(1290, 620));

        obs.setColumns(20);
        obs.setRows(5);
        obs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        observacoes.setViewportView(obs);

        botaoSalvarEdição.setBackground(new java.awt.Color(51, 153, 0));
        botaoSalvarEdição.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoSalvarEdição.setText("Editar Paciente");
        botaoSalvarEdição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarEdiçãoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localização/Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel5.setText("CEP");

        jLabel7.setText("Logradouro:");

        jLabel6.setText("Bairro");

        jLabel9.setText("Cidade");

        jLabel10.setText("UF:");

        jLabel8.setText("Número");

        jLabel12.setText("Complemento");

        jLabel13.setText("Telefone 1:");

        jLabel14.setText("Telefone 2:");

        try {
            telefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone1ActionPerformed(evt);
            }
        });

        try {
            telefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone2ActionPerformed(evt);
            }
        });

        try {
            cepPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepPacienteActionPerformed(evt);
            }
        });
        cepPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepPacienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(257, 257, 257)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(cepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(187, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel1.setText("Nome do Paciente: ");

        nomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePacienteActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF:");

        jLabel3.setText("Data Nascimento:");

        sexoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "" }));

        jLabel11.setText("Sexo");

        try {
            dtaNascPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dtaNascPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtaNascPacienteActionPerformed(evt);
            }
        });

        try {
            cpfPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfPaciente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cpfPacienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dtaNascPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(sexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dtaNascPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoExcluirPaciente.setBackground(new java.awt.Color(255, 0, 0));
        botaoExcluirPaciente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoExcluirPaciente.setText("Excluir Paciente");
        botaoExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observacoes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(botaoSalvarEdição)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExcluirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarEdição, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePacienteActionPerformed

    private void botaoSalvarEdiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarEdiçãoActionPerformed

        //primeiramente valida-se os dados no sistema
        String msg = "";
        if (nomePaciente.getText().equals("")) {
            msg += "Favor preencher campo nome do Paciente;\n";
        }
        if (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().isEmpty()) {
            msg += "Favor preencher campo CPF;\n";

        }
        if (dtaNascPaciente.getText().replaceAll("\\/", "").trim().isEmpty()) {
            msg += "Favor preencher campo Data Nascimento;\n";
        }
        if (sexoPaciente.getSelectedItem().equals("Selecione")) {
            msg += "Favor selecionar campo Sexo;\n";
        }
        if (telefone1.getText().replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("\\-", "").trim().isEmpty()) {
            msg += "Favor preencher Telefone 1.\n";
        }
        if (!msg.equals("")) {
            JOptionPane.showMessageDialog(null, msg);
            return;
        }
        try {
            //Conectar ao banco de dados:            
            Conexao com = new Conexao();
            //Criar uma consulta para executar no banco          
            Statement stmt = null;
            //aciona o mecanismo necessário para a criação da consulta
            stmt = com.c.createStatement();
            //Pega os valores dos campos e altera na tabela
            stmt.executeUpdate("UPDATE Paciente set Nome_Paciente = '" + nomePaciente.getText() + "',CPF = '" + cpfPaciente.getText() + "',Sexo = '" + sexoPaciente.getSelectedItem() + "',DataNascimento = '" + dtaNascPaciente.getText() + "',CEP = '" + cepPaciente.getText() + "',Logradouro = '" + logradouro.getText() + "',Bairro = '" + bairroPaciente.getText() + "',Cidade = '" + cidade.getText() + "',UF = '" + uf.getText() + "',Numero = '" + numero.getText() + "',Complemento = '" + complemento.getText() + "',Telefone1 = '" + telefone1.getText() + "',Telefone2 = '" + telefone2.getText() + "',Observacoes = '" + obs.getText() + "' WHERE cpf = '" + this.cpf + "'");

            //Fecha o conjunto de resultados para limpar a memória     
            //Fecha o mecanismo de consulta        
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();
            //Aviso de Alteração com sucessp
            JOptionPane.showMessageDialog(null, "alteração efetuada com sucesso");    
            
            ConsultaPaciente tela = new ConsultaPaciente();                     
            getParent().add(tela);
            this.setVisible(false);
            tela.setMaximum(true);
            tela.setVisible(true);
            this.repaint();
        

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarEdiçãoActionPerformed

    private void telefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone1ActionPerformed

    private void telefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone2ActionPerformed

    private void botaoExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirPacienteActionPerformed

        try {
            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT CPF FROM Paciente INNER JOIN AgendamentoConsulta ON Paciente.Id_Paciente = AgendamentoConsulta.Paciente_ID Where CPF = '" + this.cpf + "'");

            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Desculpa, mas esta exclusão não poderá ser efetuada, pois o paciente selecionado esta cadastrado nos agendamentos.");
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
        recebe = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Paciente? ", "ATENÇÃO!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (recebe == 0) {
            try {

                Conexao com = new Conexao();
                Statement stmt = null;
                stmt = com.c.createStatement();
                ResultSet rs = null;
                stmt.executeUpdate("DELETE FROM  Paciente WHERE cpf = '" + this.cpf + "'");
                stmt.close();
                //Fecha a conexão com o banco de dados
                com.c.close();
                JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso");
                ConsultaPaciente tela = new ConsultaPaciente();
                getParent().add(tela);
                this.setVisible(false);
                tela.setMaximum(true);
                tela.setVisible(true);
                this.repaint();
                /*this.setVisible(false);
                nomePaciente.setText("");
                cpfPaciente.setText("");
                sexoPaciente.setSelectedItem("Selecione");
                dtaNascPaciente.setText("");
                cepPaciente.setText("");
                logradouro.setText("");
                bairroPaciente.setText("");
                cidade.setText("");
                uf.setText("");
                numero.setText("");
                complemento.setText("");
                telefone1.setText("");
                telefone2.setText("");
                obs.setText("");*/
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }
    }//GEN-LAST:event_botaoExcluirPacienteActionPerformed

    private void cepPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepPacienteKeyReleased
        if (cepPaciente.getText().trim().length() < 9) {
            logradouro.setText("");
            bairroPaciente.setText("");
            cidade.setText("");
            uf.setText("");
        }
        if (cepPaciente.getText().trim().length() == 9) {
            try {
                String aUrl = "http://viacep.com.br/ws/" + cepPaciente.getText() + "/json/";
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
                    logradouro.setText(jsonOb.get("logradouro").toString());
                    //inserindo o bairro na label jLabel2
                    bairroPaciente.setText(jsonOb.get("bairro").toString());
                    cidade.setText(jsonOb.get("localidade").toString());
                    uf.setText(jsonOb.get("uf").toString());
                }

            } catch (MalformedURLException ex) {
                java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cepPacienteKeyReleased

    private void cepPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepPacienteActionPerformed

    private void dtaNascPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtaNascPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtaNascPacienteActionPerformed

    private void cpfPacienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cpfPacienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfPacienteAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroPaciente;
    private javax.swing.JButton botaoExcluirPaciente;
    private javax.swing.JButton botaoSalvarEdição;
    private javax.swing.JFormattedTextField cepPaciente;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField complemento;
    private javax.swing.JFormattedTextField cpfPaciente;
    private javax.swing.JFormattedTextField dtaNascPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField logradouro;
    private javax.swing.JTextField nomePaciente;
    private javax.swing.JTextField numero;
    private javax.swing.JTextArea obs;
    private javax.swing.JScrollPane observacoes;
    private javax.swing.JPanel painel;
    private javax.swing.JComboBox<String> sexoPaciente;
    private javax.swing.JFormattedTextField telefone1;
    private javax.swing.JFormattedTextField telefone2;
    private javax.swing.JTextField uf;
    // End of variables declaration//GEN-END:variables
}
