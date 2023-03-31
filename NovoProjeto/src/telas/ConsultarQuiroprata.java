/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import Modelos.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sucel
 */
public class ConsultarQuiroprata extends javax.swing.JInternalFrame {

    private String cpf;

    public ConsultarQuiroprata() {
        initComponents();
        consultaQuiroprata();
        this.cpf = cpf;
    }

    private void consultaQuiroprata() {

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
            rs = stmt.executeQuery("SELECT Nome,CPF,Sexo,Bairro || ', ' || Logradouro || ', ' || Numero AS Endereco FROM Quiroprata Order By Nome");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) consultaQuiroprata.getModel();
            //Seta a linha 0 (inicial)
            tabelaModel.setRowCount(0);

            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Nome"), rs.getString("CPF"), rs.getString("Sexo"), rs.getString("Endereco")});

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
        listaQuiroprata = new javax.swing.JScrollPane();
        consultaQuiroprata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        filtrarQuiroprata = new javax.swing.JTextField();
        botaoEditar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisar Quiroprata");
        setPreferredSize(new java.awt.Dimension(1296, 620));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 500));

        consultaQuiroprata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome do Quiroprata", "CPF do Quiroprata", "Sexo", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaQuiroprata.setViewportView(consultaQuiroprata);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Filtro");

        filtrarQuiroprata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarQuiroprataActionPerformed(evt);
            }
        });
        filtrarQuiroprata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtrarQuiroprataKeyReleased(evt);
            }
        });

        botaoEditar.setBackground(new java.awt.Color(51, 153, 0));
        botaoEditar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoEditar.setText("Editar Quiroprata");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(listaQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtrarQuiroprata)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filtrarQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaQuiroprata, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarQuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarQuiroprataActionPerformed

    }//GEN-LAST:event_filtrarQuiroprataActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        //Validar seleção de linha
        if (consultaQuiroprata.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "favor selecionar uma linha");
            return;
        };

        try {
            //instancia variavel 
            //String cpf;
            //atribui à variavel o valor do CPF da linha selecionada
            cpf = consultaQuiroprata.getModel().getValueAt(consultaQuiroprata.getSelectedRow(), 1).toString();
            //Remove todas as telas
            this.removeAll();
            //instancia e exibe a tela de editar paciente
            EditarQuiroprata tela = new EditarQuiroprata(cpf);
            getParent().add(tela);
            this.setVisible(false);
            tela.setMaximum(true);
            tela.setVisible(true);
            this.repaint();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void filtrarQuiroprataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtrarQuiroprataKeyReleased
        try {

            Conexao com = new Conexao();
            Statement stmt = null;
            stmt = com.c.createStatement();
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT Nome,CPF,Sexo,Bairro || ', ' || Logradouro || ', ' || Numero AS Endereco FROM Quiroprata WHERE Nome LIKE '%" + filtrarQuiroprata.getText() + "%' or CPF LIKE '%" + filtrarQuiroprata.getText() + "%'");

            DefaultTableModel tabelaModel = (DefaultTableModel) consultaQuiroprata.getModel();
            tabelaModel.setRowCount(0);

            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Nome"), rs.getString("CPF"), rs.getString("Sexo"), rs.getString("Endereco")});
            }
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_filtrarQuiroprataKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JTable consultaQuiroprata;
    private javax.swing.JTextField filtrarQuiroprata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane listaQuiroprata;
    // End of variables declaration//GEN-END:variables
}
