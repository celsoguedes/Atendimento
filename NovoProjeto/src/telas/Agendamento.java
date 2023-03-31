
package telas;

import Modelos.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agendamento extends javax.swing.JInternalFrame {

    private String cpf;


    public Agendamento() {
        initComponents();
        listaPaciente();
        listaQuiroprata();
        this.cpf = cpf;
    }

    private void listaPaciente() {

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
            rs = stmt.executeQuery("SELECT Id_Paciente, Nome_Paciente FROM  Paciente");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabela.getModel();
            //Seta a linha 0 (inicial)
            tabelaModel.setRowCount(0);
            tabela.removeColumn(tabela.getColumnModel().getColumn(0));

            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Id_paciente"), rs.getString("Nome_Paciente")});

            }

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

    private void listaQuiroprata() {

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
            rs = stmt.executeQuery("SELECT Id_Quiroprata, Nome FROM  Quiroprata");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabela1.getModel();
            //Seta a linha 0 (inicial)
            tabelaModel.setRowCount(0);
            tabela1.removeColumn(tabela1.getColumnModel().getColumn(0));

            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Id_Quiroprata"), rs.getString("Nome")});

            }

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
        jLabel5 = new javax.swing.JLabel();
        agendamento = new com.toedter.calendar.JDateChooser();
        botaoAgendar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filtrarPaciente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filtrarQuiroprata = new javax.swing.JTextField();
        tipoConsulta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        horario = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agendamento e Consulta");
        setPreferredSize(new java.awt.Dimension(1296, 620));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Agendamento:");

        botaoAgendar.setBackground(new java.awt.Color(51, 153, 0));
        botaoAgendar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoAgendar.setText("Agendar");
        botaoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Tipo de Consulta: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Valor R$ ");

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 250));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Buscar Paciente");

        filtrarPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtrarPacienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(filtrarPaciente))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quiroprata", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 250));

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane2.setViewportView(tabela1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Buscar Quiroprata");

        filtrarQuiroprata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtrarQuiroprataKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(filtrarQuiroprata)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtrarQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        tipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Consultório", "Domicilio" }));
        tipoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoConsultaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Horário:");

        horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00" }));
        horario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horarioMouseClicked(evt);
            }
        });
        horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(574, 574, 574))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(467, 467, 467))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(botaoAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtrarPacienteKeyReleased
        try {

            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT Id_Paciente, Nome_Paciente FROM  Paciente WHERE Nome_Paciente LIKE '%" + filtrarPaciente.getText() + "%' or CPF LIKE '%" + filtrarPaciente.getText() + "%'");

            DefaultTableModel tabelaModel = (DefaultTableModel) tabela.getModel();
            tabelaModel.setRowCount(0);

            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Id_Paciente"), rs.getString("Nome_PAciente")});

            }
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


    }//GEN-LAST:event_filtrarPacienteKeyReleased


    private void filtrarQuiroprataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtrarQuiroprataKeyReleased
        try {

            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT Id_Quiroprata, Nome FROM  Quiroprata WHERE Nome LIKE '%" + filtrarQuiroprata.getText() + "%' or CPF LIKE '%" + filtrarQuiroprata.getText() + "%'");

            DefaultTableModel tabelaModel = (DefaultTableModel) tabela1.getModel();
            tabelaModel.setRowCount(0);

            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Id_Quiroprata"), rs.getString("Nome")});

            }
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_filtrarQuiroprataKeyReleased

    private void botaoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendarActionPerformed

        //o local pra verificar se já tem atendimento no horario marcado seria aqui, nao?
        
        // não
        
        //primeiramente valida-se os dados no sistema
        String msg = "";
        if (tabela.getSelectedRowCount() == 0) {
            msg += "Favor selecionar campo nome do Paciente;\n";
        }
        if (tabela1.getSelectedRowCount() == 0) {
            msg += "Favor selecionar campo nome do Quiroprata;\n";
        }
        if (agendamento.getDate() == null) {
            msg += "Favor selecionar data do Agendamento;\n";
        }
        if (horario.getSelectedItem().equals("Selecione")) {
            msg += "Favor selecionar campo Horario;\n";
        }
        if (valor.getText().equals("")) {
            msg += "Favor preencher valor da consulta.\n";
        }
        if (tipoConsulta.getSelectedItem().equals("Selecione")) {
            msg += "Favor selecionar campo Tipo de Consulta;\n";
        }
        if (!msg.equals("")) {
            JOptionPane.showMessageDialog(null, msg);
            return;
        }

        //Conectar ao banco de dados:
        Conexao com = new Conexao();
        //Criar uma consulta para executar no banco
        Statement stmt = null;

        try {
            //aciona o mecanismo necessário para a criação da consulta
            stmt = com.c.createStatement();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String data = format.format(agendamento.getDate());

            String vConsulta = valor.getText();
            float vC = Float.parseFloat(vConsulta.replace(",", "."));
            vConsulta = String.format("%.02f", vC);
            //aciona o mecanismo necessário para realizar a consulta
            stmt.executeUpdate("INSERT INTO AgendamentoConsulta (Paciente_ID,Quiroprata_ID,TipoConsulta,Valor,Agendamento,Horario) VALUES ( '" + tabela.getModel().getValueAt(tabela.getSelectedRow(), 0).toString() + "','" + tabela1.getModel().getValueAt(tabela1.getSelectedRow(), 0).toString() + "','" + tipoConsulta.getSelectedItem() + "','" + vConsulta + "','" + data + "','" + horario.getSelectedItem() + "')");

            //Fecha o conjunto de resultados para limpar a memória     
            //Fecha o mecanismo de consulta
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();

            //Aviso de sucesso no cadastro
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
            tabela.clearSelection();
            tabela1.clearSelection();
            agendamento.setCalendar(null);
            horario.setSelectedItem("Selecione");
            valor.setText("");
            tipoConsulta.setSelectedItem("Selecione");
    }//GEN-LAST:event_botaoAgendarActionPerformed

    private void horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActionPerformed

        if(horario.getSelectedItem().equals("Selecione")){
            return;
        }
        try {
            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String data = format.format(agendamento.getDate());

            rs = stmt.executeQuery("select * FROM AgendamentoConsulta where Quiroprata_ID = '" + tabela1.getModel().getValueAt(tabela1.getSelectedRow(), 0).toString() + "' AND Horario = '" + horario.getSelectedItem() + "' AND Agendamento = '" + data + "'");

            if (rs.next()) { //se existe um next (proximo), é porque já tem consulta nesse dia e hora, com esse quiro
                JOptionPane.showMessageDialog(null, "Horario já agendado");
                horario.setSelectedItem("Selecione");
                stmt.close();

                //Fecha a conexão com o banco de dados
                com.c.close();
                return;
            }
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_horarioActionPerformed

    private void horarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horarioMouseClicked

    }//GEN-LAST:event_horarioMouseClicked

    private void tipoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser agendamento;
    private javax.swing.JButton botaoAgendar;
    private javax.swing.JTextField filtrarPaciente;
    private javax.swing.JTextField filtrarQuiroprata;
    private javax.swing.JComboBox<String> horario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JComboBox<String> tipoConsulta;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
