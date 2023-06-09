/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import Modelos.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sucel
 */
public class AgendaDia extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgendaDia
     */
    public AgendaDia() {
        initComponents();
        listaAgenda();
        

    }

    private void listaAgenda() {

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
            rs = stmt.executeQuery("SELECT Paciente.Nome_Paciente, AgendamentoConsulta.Horario,Quiroprata.nome,Paciente.Telefone1 FROM AgendamentoConsulta INNER JOIN Paciente ON Paciente.Id_Paciente = Paciente_ID INNER JOIN Quiroprata ON Quiroprata.Id_Quiroprata = Quiroprata_ID WHERE Agendamento = date('now', 'localtime')ORDER BY AgendamentoConsulta.Horario ");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabelaDia.getModel();
            //Seta a linha 0 (inicial)
            tabelaModel.setRowCount(0);
            
            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {

                tabelaModel.addRow(new Object[]{rs.getString("Nome_Paciente"),rs.getString("Horario"), rs.getString("Nome"), rs.getString("Telefone1")});

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDia = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agenda do dia");

        tabelaDia.setBackground(new java.awt.Color(51, 204, 255));
        tabelaDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Hora", "Quiroprata", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabelaDia);
        if (tabelaDia.getColumnModel().getColumnCount() > 0) {
            tabelaDia.getColumnModel().getColumn(1).setMinWidth(4);
            tabelaDia.getColumnModel().getColumn(1).setPreferredWidth(1);
            tabelaDia.getColumnModel().getColumn(2).setPreferredWidth(8);
            tabelaDia.getColumnModel().getColumn(3).setPreferredWidth(8);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(120, 150, 468, 380);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDia;
    // End of variables declaration//GEN-END:variables
}
