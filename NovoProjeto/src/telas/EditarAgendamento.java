/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import Modelos.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sucel
 */
public class EditarAgendamento extends javax.swing.JInternalFrame {

    private String ID_Agendamento;
    //Metodo Recebe o cpf por parametro

    public EditarAgendamento(String ID_Agendamento) {
        initComponents();
        // a tela editar recebe cpf por parametro
        telaEditar(ID_Agendamento);
        //A esta variavel cpf é atribuido o valor do cpf que veio da consulta por parametro 
        this.ID_Agendamento = ID_Agendamento;
    }

    private void telaEditar(String ID_Agendamento) {

        try {
            //Conectar ao banco de dados:
            Conexao com = new Conexao();
            //Criar uma consulta para executar no banco
            Statement stmt = null;
            //aciona o mecanismo necessário para a criação da consulta
            stmt = (Statement) com.c.createStatement();
            //instancia variavel para receber resultado da pesquisa            
            ResultSet rs = null;
            //Atribui o valor da pesquisa à variável            
            rs = stmt.executeQuery("SELECT Paciente.Nome_Paciente, Quiroprata.nome,AgendamentoConsulta.Agendamento,AgendamentoConsulta.Horario, AgendamentoConsulta.Valor,AgendamentoConsulta.TipoConsulta, AgendamentoConsulta.consulta FROM AgendamentoConsulta INNER JOIN Paciente ON Paciente.Id_Paciente = Paciente_ID INNER JOIN Quiroprata ON Quiroprata.Id_Quiroprata = Quiroprata_ID WHERE AgendamentoConsulta.ID_Agendamento = '" + ID_Agendamento + "'");
            //preenche os campos com os valores da pesquisa
            paciente.setText(rs.getString("Nome_Paciente"));
            quiroprata.setText(rs.getString("Nome"));
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date data = format.parse(rs.getString("Agendamento"));
            agendamento.setDate(data);
            horario.setSelectedItem(rs.getObject("Horario"));
            valor.setText(rs.getString("Valor"));
            tipoConsulta.setSelectedItem(rs.getObject("TipoConsulta"));
            consultaRealizada.setSelectedItem(("Selecione"));

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
        botaoSalvarEdicao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoCancelarAgendamento = new javax.swing.JButton();
        paciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quiroprata = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoConsulta = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        horario = new javax.swing.JComboBox<>();
        consultaRealizada = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Agendamento");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 500));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Agendamento:");

        botaoSalvarEdicao.setBackground(new java.awt.Color(51, 153, 0));
        botaoSalvarEdicao.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoSalvarEdicao.setText("Editar Agendamento");
        botaoSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarEdicaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Paciente: ");

        botaoCancelarAgendamento.setBackground(new java.awt.Color(255, 51, 51));
        botaoCancelarAgendamento.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoCancelarAgendamento.setText("Excluir Agendamento");
        botaoCancelarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarAgendamentoActionPerformed(evt);
            }
        });

        paciente.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Tipo de Consulta: ");

        quiroprata.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Valor R$ ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Consulta Realizada?  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Quiroprata");

        tipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Consultório", "Domicílio" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Horário: ");

        horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00" }));
        horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioActionPerformed(evt);
            }
        });

        consultaRealizada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));
        consultaRealizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaRealizadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(tipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(382, 382, 382)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quiroprata)))
                        .addGap(160, 160, 160))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoSalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(359, 359, 359)
                                .addComponent(botaoCancelarAgendamento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(consultaRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(quiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(consultaRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarEdicaoActionPerformed
        
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String data = format.format(agendamento.getDate());
            //Conectar ao banco de dados:
            Conexao com = new Conexao();
            //Criar uma consulta para executar no banco
            Statement stmt = null;
            //aciona o mecanismo necessário para a criação da consulta
            stmt = (Statement) com.c.createStatement();
            //instancia variavel para receber resultado da pesquisa            
            ResultSet rs = null;
            //Atribui o valor da pesquisa à variável            
            stmt.executeUpdate("UPDATE AgendamentoConsulta set tipoConsulta = '" + tipoConsulta.getSelectedItem() + "', valor ='" + valor.getText() + "', Agendamento = '" + data + "' ,Horario = '" + horario.getSelectedItem() + "',Consulta = '" + consultaRealizada.getSelectedItem() + "' WHERE ID_Agendamento = '" + ID_Agendamento + "'");
            if (consultaRealizada.getSelectedItem().equals("Sim")) {
                stmt.executeUpdate("INSERT INTO MovCaixa (Data,Historico,Entrada)VALUES ( '" + data + "','" + ("Consulta de: ") + paciente.getText() + "','" + valor.getText() + "')");
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso e Valor registrado no caixa.");
            } else if (consultaRealizada.getSelectedItem().equals("Não")) {
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso.");
            }
            //Fecha o conjunto de resultados para limpar a memória     
            //Fecha o mecanismo de consulta
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();
            
            //Aviso de Alteração com sucessp
            JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso.");
            //this.setVisible(false);
            ConsultarAgendamento tela = new ConsultarAgendamento();                     
            getParent().add(tela);
            this.setVisible(false);
            tela.setMaximum(true);
            tela.setVisible(true);
            this.repaint();



        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }//GEN-LAST:event_botaoSalvarEdicaoActionPerformed

    private void botaoCancelarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarAgendamentoActionPerformed
        int recebe;
        recebe = JOptionPane.showConfirmDialog(null, "Deseja realmente Cancelar e Excluir este Agendamento? ", "ATENÇÃO!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (recebe == 0) {

            try {

                Conexao com = new Conexao();
                Statement stmt = null;
                stmt = com.c.createStatement();
                ResultSet rs = null;
                stmt.executeUpdate("DELETE FROM  AgendamentoConsulta WHERE ID_Agendamento = '" + this.ID_Agendamento + "'");
                stmt.close();
                //Fecha a conexão com o banco de dados
                com.c.close();
                JOptionPane.showMessageDialog(null, "Cancelamento Realizado com sucesso");
                this.setVisible(false);

            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }

    }//GEN-LAST:event_botaoCancelarAgendamentoActionPerformed

    private void consultaRealizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaRealizadaActionPerformed

    }//GEN-LAST:event_consultaRealizadaActionPerformed

    private void horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioActionPerformed
       // if(horario.getSelectedItem().equals("Selecione")){
        //    return;
        //}
        try {
            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String data = format.format(agendamento.getDate());

            rs = stmt.executeQuery("select * FROM AgendamentoConsulta where Horario = '" + horario.getSelectedItem() + "' AND Agendamento = '" + data + "' AND Quiroprata_ID = (select Id_Quiroprata from Quiroprata where Nome = '" + quiroprata.getText() + "' ");

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser agendamento;
    private javax.swing.JButton botaoCancelarAgendamento;
    private javax.swing.JButton botaoSalvarEdicao;
    private javax.swing.JComboBox<String> consultaRealizada;
    private javax.swing.JComboBox<String> horario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField paciente;
    private javax.swing.JTextField quiroprata;
    private javax.swing.JComboBox<String> tipoConsulta;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
