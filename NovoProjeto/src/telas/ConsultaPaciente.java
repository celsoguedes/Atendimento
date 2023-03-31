package telas;

import Modelos.Conexao;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConsultaPaciente extends javax.swing.JInternalFrame {

    private String cpf;

    public ConsultaPaciente() {
        initComponents();
        listaPaciente();
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
            rs = stmt.executeQuery("SELECT Nome_Paciente,CPF,Telefone1 FROM  Paciente Order By Nome_Paciente");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabela.getModel();
            //Seta a linha 0 (inicial)
            tabelaModel.setRowCount(0);

            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Nome_Paciente"), rs.getString("CPF"), rs.getString("Telefone1")});

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
        jLabel1 = new javax.swing.JLabel();
        botaoEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        filtrarPaciente = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisa de Pacientes");
        setPreferredSize(new java.awt.Dimension(1295, 620));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1285, 620));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Filtro");

        botaoEditar.setBackground(new java.awt.Color(51, 153, 0));
        botaoEditar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone1"
            }
        ));
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        filtrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarPacienteActionPerformed(evt);
            }
        });
        filtrarPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtrarPacienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtrarPaciente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(filtrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        //Validar seleção de linha
        if (tabela.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "favor selecionar uma linha");
            return;
        };

        try {
            //instancia variavel 
            String cpf;
            //atribui à variavel o valor do CPF da linha selecionada
            cpf = tabela.getModel().getValueAt(tabela.getSelectedRow(), 1).toString();
            //Remove todas as telas
            this.removeAll();
            //instancia e exibe a tela de editar paciente
            EditarPaciente tela = new EditarPaciente(cpf);
            getParent().add(tela);
            this.setVisible(false);
            tela.setMaximum(true);
            tela.setVisible(true);
            this.repaint();

        } catch (Exception e) {
        }


    }//GEN-LAST:event_botaoEditarActionPerformed

    private void filtrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtrarPacienteActionPerformed

    private void filtrarPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtrarPacienteKeyReleased

        try {

            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT Nome_Paciente,CPF,Telefone1 FROM  Paciente WHERE Nome_Paciente LIKE '%" + filtrarPaciente.getText() + "%' or CPF LIKE '%" + filtrarPaciente.getText() + "%'");

            DefaultTableModel tabelaModel = (DefaultTableModel) tabela.getModel();
            tabelaModel.setRowCount(0);

            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Nome_Paciente"), rs.getString("CPF"), rs.getString("Telefone1")});

            }
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }


    }//GEN-LAST:event_filtrarPacienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JTextField filtrarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
