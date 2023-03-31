
package telas;

import Modelos.Conexao;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import org.json.JSONObject;



public class CadastrarPaciente extends javax.swing.JInternalFrame {


    public CadastrarPaciente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacaoPaciente = new javax.swing.JTextArea();
        botaoSalvarPaciente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cpfPaciente = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        dataNascPaciente = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        sexoPaciente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logradouroPaciente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numeroPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bairroPaciente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cidadePaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ufPaciente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        complPaciente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cepPaciente = new javax.swing.JFormattedTextField();
        telefone1Paciente = new javax.swing.JFormattedTextField();
        telefone2Paciente = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Paciente");
        setPreferredSize(new java.awt.Dimension(1300, 620));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1284, 620));

        observacaoPaciente.setColumns(20);
        observacaoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        observacaoPaciente.setRows(5);
        observacaoPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        jScrollPane1.setViewportView(observacaoPaciente);

        botaoSalvarPaciente.setBackground(new java.awt.Color(51, 153, 0));
        botaoSalvarPaciente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoSalvarPaciente.setText("Salvar");
        botaoSalvarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarPacienteActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jLabel1.setText("Nome do Paciente: ");

        nomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePacienteActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF:");

        try {
            cpfPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfPacienteKeyReleased(evt);
            }
        });

        jLabel3.setText("Data de  Nascimento:");

        try {
            dataNascPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Sexo");

        sexoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataNascPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localização/Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(528, 158));

        jLabel5.setText("CEP");

        jLabel7.setText("Logradouro:");

        jLabel8.setText("Número");

        numeroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPacienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Bairro");

        jLabel9.setText("Cidade");

        jLabel10.setText("UF:");

        jLabel12.setText("Complemento");

        jLabel13.setText("Telefone 1: ");

        jLabel14.setText("Telefone 2: ");

        try {
            cepPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepPacienteKeyReleased(evt);
            }
        });

        try {
            telefone1Paciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone1Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone1PacienteActionPerformed(evt);
            }
        });

        try {
            telefone2Paciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone2Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone2PacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(58, 58, 58)
                        .addComponent(cepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(complPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(telefone1Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefone2Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(ufPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logradouroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(cepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(logradouroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ufPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(cidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numeroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(complPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(telefone1Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefone2Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(644, Short.MAX_VALUE)
                .addComponent(botaoSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(550, 550, 550))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botaoSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomePacienteActionPerformed

    private void numeroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPacienteActionPerformed

    private void telefone1PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone1PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone1PacienteActionPerformed

    private void telefone2PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone2PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone2PacienteActionPerformed

    private void botaoSalvarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarPacienteActionPerformed
            //primeiramente valida-se os dados no sistema
          
            Date hoje = new Date();
            Date date = new Date();
            try{
            SimpleDateFormat atual = new SimpleDateFormat ("dd/MM/yyyy");
            date = atual.parse(dataNascPaciente.getText());
            }catch(Exception e){
            }
                  
            String msg = "";
            if(nomePaciente.getText().equals("")) {
                msg += "Favor preencher campo nome do Paciente;\n";
            }
            if(cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().isEmpty()) {
                msg += "Favor preencher campo CPF;\n";

            }
            if(dataNascPaciente.getText().replaceAll("\\/","").trim().isEmpty()){
                msg += "Favor preencher campo Data Nasc;\n";
            }
            if(date.compareTo(hoje)>= 0){
                msg += "Data de nascimento inválida\n";
            }
            if(sexoPaciente.getSelectedItem().equals("Selecione")) {
                msg += "Favor selecionar campo Sexo;\n";
            }
            if(telefone1Paciente.getText().replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("\\-","").trim().isEmpty()){
                msg += "Favor preencher Telefone 1.\n";
            }
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
                return;
            }
      
        //Conectar ao banco de dados:
        Conexao com = new Conexao ();
        //Criar uma consulta para executar no banco
        Statement stmt = null;

try {
    //aciona o mecanismo necessário para a criação da consulta
    stmt = com.c.createStatement();

    //aciona o mecanismo necessário para realizar a consulta
    stmt.executeUpdate( "INSERT INTO Paciente (Nome_Paciente,CPF,Sexo,DataNascimento,CEP,Logradouro,Bairro,Cidade,UF,Numero,Complemento,Telefone1,Telefone2,Observacoes)VALUES ( '"+nomePaciente.getText()+"','"+cpfPaciente.getText()+"','"+sexoPaciente.getSelectedItem()+"','"+dataNascPaciente.getText()+"','"+cepPaciente.getText()+"','"+logradouroPaciente.getText()+"','"+bairroPaciente.getText()+"','"+cidadePaciente.getText()+"','"+ufPaciente.getText()+"','"+numeroPaciente.getText()+"','"+complPaciente.getText()+"','"+telefone1Paciente.getText()+"','"+telefone2Paciente.getText()+"','"+observacaoPaciente.getText()+"')" );

       
    //Fecha o conjunto de resultados para limpar a memória     
      //Fecha o mecanismo de consulta
    stmt.close();
 
      //Fecha a conexão com o banco de dados
    com.c.close();
    
    //Aviso de sucesso no cadastro
    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
    
    //Limpar Campos do formulário
    nomePaciente.setText("");
    cpfPaciente.setText("");
    sexoPaciente.setSelectedItem("Selecione");
    dataNascPaciente.setText("");
    cepPaciente.setText("");
    logradouroPaciente.setText("");
    bairroPaciente.setText("");
    cidadePaciente.setText("");
    ufPaciente.setText("");
    numeroPaciente.setText("");
    complPaciente.setText("");
    telefone1Paciente.setText("");
    telefone2Paciente.setText("");
    observacaoPaciente.setText("");;
    
} catch ( Exception e ) {
    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    System.exit(0);
}
    }//GEN-LAST:event_botaoSalvarPacienteActionPerformed

    private void cepPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepPacienteKeyReleased
        if(cepPaciente.getText().trim().length() < 9) {
            logradouroPaciente.setText("");
            bairroPaciente.setText("");
            cidadePaciente.setText("");
            ufPaciente.setText("");
        }
        if(cepPaciente.getText().trim().length() == 9) {
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
            while ((json = rd.readLine()) != null)
            content.append(json + "\n");
            rd.close();
            //Instanciamos a classe que vai transformar o json em um Objeto
            JSONObject jsonOb = new JSONObject(content.toString());
            if (jsonOb.has("erro")) { // has = tem (Pergunta: no jsonOb TEM umA chave que mostra erro?)
                JOptionPane.showMessageDialog(null, "O CEP digitado é invalido!");
            }else {
                //inserindo o nome da rua na label jLabel1
                logradouroPaciente.setText(jsonOb.get("logradouro").toString());
                //inserindo o bairro na label jLabel2
                bairroPaciente.setText(jsonOb.get("bairro").toString());
                cidadePaciente.setText(jsonOb.get("localidade").toString());
                ufPaciente.setText(jsonOb.get("uf").toString());
            }
            
        } catch (MalformedURLException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cepPacienteKeyReleased

    private void cpfPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfPacienteKeyReleased
        if (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().isEmpty()) {
            cpfPaciente.setBorder(new LineBorder(Color.BLACK));
        } else if (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().length() >= 1 && cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().length() <= 10 || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().length() != 11) {
            cpfPaciente.setBorder(new LineBorder(Color.RED));
        } else {
            int numero_01 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(0, 1));  
            int numero_02 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(1, 2));  
            int numero_03 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(2, 3));  
            int numero_04 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(3, 4));  
            int numero_05 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(4, 5));  
            int numero_06 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(5 ,6));  
            int numero_07 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(6, 7));  
            int numero_08 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(7, 8));  
            int numero_09 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(8, 9));  
            int numero_10 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(9, 10));  
            int numero_11 = Integer.parseInt (cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().substring(10, 11));  

            int digito_01_numero_01 = numero_01 * 10;
            int digito_01_numero_02 = numero_02 * 9;
            int digito_01_numero_03 = numero_03 * 8;
            int digito_01_numero_04 = numero_04 * 7;
            int digito_01_numero_05 = numero_05 * 6;
            int digito_01_numero_06 = numero_06 * 5;
            int digito_01_numero_07 = numero_07 * 4;
            int digito_01_numero_08 = numero_08 * 3;
            int digito_01_numero_09 = numero_09 * 2;

            int soma_01 = digito_01_numero_01 + digito_01_numero_02 + digito_01_numero_03 + digito_01_numero_04 + digito_01_numero_05 + digito_01_numero_06 + digito_01_numero_07 + digito_01_numero_08 + digito_01_numero_09;

            int digito_01 = soma_01 % 11;

            if (digito_01 < 2) {
                digito_01 = 0;
            } else {
                digito_01 = 11 - digito_01;
            }
            //System.out.println (digito_01);

            int digito_02_numero_01 = numero_01 * 11;
            int digito_02_numero_02 = numero_02 * 10;
            int digito_02_numero_03 = numero_03 * 9;
            int digito_02_numero_04 = numero_04 * 8;
            int digito_02_numero_05 = numero_05 * 7;
            int digito_02_numero_06 = numero_06 * 6;
            int digito_02_numero_07 = numero_07 * 5;
            int digito_02_numero_08 = numero_08 * 4;
            int digito_02_numero_09 = numero_09 * 3;
            int digito_02_numero_10 = numero_10 * 2;

            int soma_02 = digito_02_numero_01 + digito_02_numero_02 + digito_02_numero_03 + digito_02_numero_04 + digito_02_numero_05 + digito_02_numero_06 + digito_02_numero_07 + digito_02_numero_08 + digito_02_numero_09 + digito_02_numero_10;

            int digito_02 = soma_02 % 11;

            if (digito_02 < 2) {
                digito_02 = 0;
            } else {
                digito_02 = 11 - digito_02;	
            }
            //System.out.println (digito_02);

            if (numero_10 != digito_01 || numero_11 != digito_02 || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("11111111111")  || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("22222222222") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("33333333333") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("44444444444") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("55555555555") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("66666666666") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("77777777777") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("88888888888") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("99999999999") || cpfPaciente.getText().replaceAll("\\.", "").replaceAll("-", "").trim().equals("00000000000")) {
                
                //JOptionPane.showMessageDialog (null, "Número de CPF inválido, por favor insira um novo", "CPF inválido", JOptionPane.ERROR_MESSAGE);
                cpfPaciente.setBorder(new LineBorder(Color.RED));
                int recebe;
                recebe = JOptionPane.showConfirmDialog(null, "Número de CPF inválido, Deseja continuar desta forma?", "ATENÇÃO!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (recebe == 1){
                    cpfPaciente.setText("");
                }
//msgCPF.setVisible(true);
                ;
            } else {
                //JOptionPane.showMessageDialog (null, "Número de CPF " + txtCPF + " foi válidado. Número de CPF correto", "CPF válido", JOptionPane.INFORMATION_MESSAGE);
                cpfPaciente.setBorder(new LineBorder(Color.GREEN));
                //msgCPF.setVisible(false);
            }
        }
    }//GEN-LAST:event_cpfPacienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroPaciente;
    private javax.swing.JButton botaoSalvarPaciente;
    private javax.swing.JFormattedTextField cepPaciente;
    private javax.swing.JTextField cidadePaciente;
    private javax.swing.JTextField complPaciente;
    private javax.swing.JFormattedTextField cpfPaciente;
    private javax.swing.JFormattedTextField dataNascPaciente;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField logradouroPaciente;
    private javax.swing.JTextField nomePaciente;
    private javax.swing.JTextField numeroPaciente;
    private javax.swing.JTextArea observacaoPaciente;
    private javax.swing.JComboBox<String> sexoPaciente;
    private javax.swing.JFormattedTextField telefone1Paciente;
    private javax.swing.JFormattedTextField telefone2Paciente;
    private javax.swing.JTextField ufPaciente;
    // End of variables declaration//GEN-END:variables
}
