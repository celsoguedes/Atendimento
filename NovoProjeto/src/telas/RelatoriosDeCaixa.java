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
public class RelatoriosDeCaixa extends javax.swing.JInternalFrame {

    /**
     * Creates new form RelatoriosDeCaixa
     */
    public RelatoriosDeCaixa() {
        initComponents();
        listarRelatorios();
    }

    public void listarRelatorios() {
        tabelaRelatorio.removeColumn(tabelaRelatorio.getColumnModel().getColumn(0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalEntradas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalSaidas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saldoAnterior = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        saldoAcumulado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        relatorioMes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        relatorioAno = new javax.swing.JTextField();
        botaoBuscarRelatorio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Relatórios de Caixa");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Total de Entradas");

        totalEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalEntradasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Total de Saídas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Saldo Anterior");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Saldo do mês");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Saldo Acumulado");

        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Histórico", "Entrada", "Saida"
            }
        ));
        jScrollPane1.setViewportView(tabelaRelatorio);
        if (tabelaRelatorio.getColumnModel().getColumnCount() > 0) {
            tabelaRelatorio.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabelaRelatorio.getColumnModel().getColumn(1).setPreferredWidth(1);
            tabelaRelatorio.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabelaRelatorio.getColumnModel().getColumn(3).setPreferredWidth(1);
            tabelaRelatorio.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitar Relatórios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Voce deseja o relatorio de:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Mês: (MM)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Ano: (AAAA)");

        botaoBuscarRelatorio.setBackground(new java.awt.Color(51, 153, 0));
        botaoBuscarRelatorio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoBuscarRelatorio.setText("Buscar");
        botaoBuscarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoBuscarRelatorio)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relatorioAno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relatorioMes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(relatorioMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(relatorioAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(botaoBuscarRelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saldoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(totalEntradas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(totalSaidas)
                                .addComponent(jLabel8)
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saldoAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(saldoAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
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

        setBounds(0, 0, 1300, 551);
    }// </editor-fold>//GEN-END:initComponents

    private void totalEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalEntradasActionPerformed

    }//GEN-LAST:event_totalEntradasActionPerformed

    private void botaoBuscarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarRelatorioActionPerformed
        String msg = "";
        if (relatorioMes.getText().equals("")) {
            msg += "Favor preencher o campo Mês;\n";

        }
        if (relatorioAno.getText().equals("")) {
            msg += "Favor preencher o campo Ano;\n";

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

            //instancia variavel para receber resultado da pesquisa
            ResultSet rs = null;
            String mes = relatorioAno.getText() + "-" + relatorioMes.getText();

            //String mesanterior = relatorioAno.getText()+"-"+relatorioMes.getText();
            //Atribui o valor da pesquisa à variável
            rs = stmt.executeQuery("SELECT ID_Caixa, Data,Historico,Entrada,Saida FROM  MovCaixa where Data like '" + mes + "%'Order By Data");
            //rs = stmt.executeQuery("SELECT ID_Caixa, Data,Historico,Entrada,Saida FROM  MovCaixa where Data like '2022-05-%'");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabelaRelatorio.getModel();
            //Seta a linha 0 (inicial)
            tabelaModel.setRowCount(0);

            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {
                String saida = rs.getString("Saida");
                if (saida != null) {
                    float saidaF = Float.parseFloat(saida.replace(",", "."));
                    saida = String.format("%.02f", saidaF);
                }
                String entrada = rs.getString("Entrada");
                if (entrada != null) {
                    float entradaF = Float.parseFloat(entrada.replace(",", "."));
                    entrada = String.format("%.02f", entradaF);
                }
                tabelaModel.addRow(new Object[]{rs.getString("ID_Caixa"), rs.getString("Data"), rs.getString("Historico"), entrada, saida});

            }

            rs = stmt.executeQuery("SELECT  printf(\"%.2f\", SUM(Entrada))as Entradas, printf(\"%.2f\", SUM(Saida))as Saidas,printf(\"%.2f\", SUM(Entrada)- SUM(Saida)) as total FROM  MovCaixa where Data like '" + mes + "%'");
            //rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as acumulado FROM  MovCaixa where strftime('%m',Data) < strftime('%m',date('now', 'localtime'))");
            //cria laço para preenher a tabela com os dados da pesquisa
            while (rs.next()) {
                String tEntrada = rs.getString("Entradas");
                float te = Float.parseFloat(tEntrada.replace(",", "."));
                tEntrada = String.format("%.02f", te);

                String tSaida = rs.getString("Saidas");
                float ts = Float.parseFloat(tSaida.replace(",", "."));
                tSaida = String.format("%.02f", ts);

                String tSaldo = rs.getString("Total");
                float tsd = Float.parseFloat(tSaldo.replace(",", "."));
                tSaldo = String.format("%.02f", tsd);
                totalEntradas.setText(tEntrada);
                totalSaidas.setText(tSaida);
                saldo.setText(tSaldo);
            }

            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as saldoAnterior FROM  MovCaixa where Data < '" + mes + "%'");

            while (rs.next()) {
                String sAnt = rs.getString("saldoAnterior");
                float sA = Float.parseFloat(sAnt.replace(",", "."));
                sAnt = String.format("%.02f", sA);
                saldoAnterior.setText(sAnt);

            }
            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as Saldoacumulado FROM  MovCaixa where Data < '" + mes + "%' or Data Like '" + mes + "%'");

            while (rs.next()) {
                String sAcumu = rs.getString("saldoAcumulado");
                float sAcumulado = Float.parseFloat(sAcumu.replace(",", "."));
                sAcumu = String.format("%.02f", sAcumulado);
                saldoAcumulado.setText(sAcumu);

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

    }//GEN-LAST:event_botaoBuscarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField relatorioAno;
    private javax.swing.JTextField relatorioMes;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField saldoAcumulado;
    private javax.swing.JTextField saldoAnterior;
    private javax.swing.JTable tabelaRelatorio;
    private javax.swing.JTextField totalEntradas;
    private javax.swing.JTextField totalSaidas;
    // End of variables declaration//GEN-END:variables
}
