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
public class MovimentoCaixa extends javax.swing.JInternalFrame {

    /**
     * Creates new form MovimentoCaixa
     */
    public MovimentoCaixa() {
        initComponents();
        listarCaixa();

    }

    private void listarCaixa() {
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
            rs = stmt.executeQuery("SELECT ID_Caixa, Data,Historico,Entrada,Saida FROM  MovCaixa where strftime('%m',Data) = strftime('%m',date('now', 'localtime'))Order By Data");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabelaCaixa.getModel();
            //Seta a linha 0 (inicial)
            tabelaModel.setRowCount(0);
            tabelaCaixa.removeColumn(tabelaCaixa.getColumnModel().getColumn(0));

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

            rs = stmt.executeQuery("SELECT  printf(\"%.2f\", SUM(Entrada))as Entradas, printf(\"%.2f\", SUM(Saida))as Saidas,printf(\"%.2f\", SUM(Entrada)- SUM(Saida)) as total FROM  MovCaixa where strftime('%m',Data) = strftime('%m',date('now', 'localtime'))");
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
                //    saldoAnterior.setText(rs.getString("acumulado"));
            }
            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as saldoAnterior FROM  MovCaixa where strftime('%m',Data) < strftime('%m',date('now', 'localtime'))");

            while (rs.next()) {
                String sAnt = rs.getString("saldoAnterior");
                float sA = Float.parseFloat(sAnt.replace(",", "."));
                sAnt = String.format("%.02f", sA);
                saldoAnterior.setText(sAnt);

            }
            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as saldoAcumulado FROM  MovCaixa");

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCaixa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        historicoEntrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorEntrada = new javax.swing.JTextField();
        botaoRegistrarEntrada = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dataEntrada = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        totalEntradas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalSaidas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        valorSaida = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        historicoSaida = new javax.swing.JTextField();
        botaoRegistrarSaida = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dataSaida = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        saldoAnterior = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saldoAcumulado = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Movimento de Caixa");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        tabelaCaixa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaCaixa);
        if (tabelaCaixa.getColumnModel().getColumnCount() > 0) {
            tabelaCaixa.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabelaCaixa.getColumnModel().getColumn(1).setPreferredWidth(1);
            tabelaCaixa.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabelaCaixa.getColumnModel().getColumn(3).setPreferredWidth(1);
            tabelaCaixa.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Data:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Historico:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Entrada  R$:");

        botaoRegistrarEntrada.setBackground(new java.awt.Color(51, 153, 0));
        botaoRegistrarEntrada.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoRegistrarEntrada.setText("Registrar Entradas");
        botaoRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarEntradaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("DD/MM/AAAA");

        try {
            dataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(botaoRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addComponent(historicoEntrada)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(valorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 155, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historicoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botaoRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Total de Entradas");

        totalEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalEntradasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Total de Saídas");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Saldo do mês");

        jPanel4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saída", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel12.setText("Data:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel13.setText("Saída R$:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel14.setText("Historico:");

        botaoRegistrarSaida.setBackground(new java.awt.Color(51, 153, 0));
        botaoRegistrarSaida.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botaoRegistrarSaida.setText("Registrar Saídas");
        botaoRegistrarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarSaidaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel10.setText("DD/MM/AAAA");

        try {
            dataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historicoSaida)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(dataSaida))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(valorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(botaoRegistrarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historicoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(botaoRegistrarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Saldo Anterior");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Saldo Acumulado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(saldoAnterior))
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
                        .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addComponent(saldoAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(499, 499, 499))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1287, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalEntradasActionPerformed

    }//GEN-LAST:event_totalEntradasActionPerformed

    private void botaoRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarEntradaActionPerformed
        //primeiramente valida-se os dados no sistema

        String msg = "";
        if (dataEntrada.getText().replaceAll("\\/", "").trim().isEmpty()) {
            msg += "Favor preencher Data da entrada;\n";
        }
        if (historicoEntrada.getText().equals("")) {
            msg += "Favor preencher Histórico;\n";

        }
        if (valorEntrada.getText().equals("")) {
            msg += "Favor preencher Valor da Entrada;\n";

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
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
            Date data = format.parse(dataEntrada.getText());
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            String dia = format2.format(data);

            //aciona o mecanismo necessário para realizar a consulta
            stmt.executeUpdate("INSERT INTO MovCaixa (Data,Historico,Entrada) VALUES ( '" + dia + "','" + historicoEntrada.getText() + "','" + valorEntrada.getText().replace(',', '.') + "')");

            //Aviso de sucesso no cadastro
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso.");
            ResultSet rs = stmt.executeQuery("SELECT ID_Caixa, Data,Historico,Entrada,Saida FROM  MovCaixa where strftime('%m',Data) = strftime('%m',date('now', 'localtime'))Order By Data");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabelaCaixa.getModel();
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
            rs = stmt.executeQuery("SELECT  printf(\"%.2f\", SUM(Entrada))as Entradas, printf(\"%.02f\", SUM(Saida))as Saidas,printf(\"%.02f\", SUM(Entrada)- SUM(Saida)) as total FROM  MovCaixa where strftime('%m',Data) = strftime('%m',date('now', 'localtime'))");
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
                //    saldoAnterior.setText(rs.getString("acumulado"));
            }
            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as saldoAnterior FROM  MovCaixa where strftime('%m',Data) < strftime('%m',date('now', 'localtime'))");
            while (rs.next()) {
                String sAnt = rs.getString("saldoAnterior");
                float sA = Float.parseFloat(sAnt.replace(",", "."));
                sAnt = String.format("%.02f", sA);
                saldoAnterior.setText(sAnt);
            }

            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as saldoAcumulado FROM  MovCaixa");

            while (rs.next()) {
                String sAcumu = rs.getString("saldoAcumulado");
                float sAcumulado = Float.parseFloat(sAcumu.replace(",", "."));
                sAcumu = String.format("%.02f", sAcumulado);
                saldoAcumulado.setText(sAcumu);

            }
            //Limpar Campos do formulário
            dataEntrada.setText("");
            historicoEntrada.setText("");
            valorEntrada.setText("");

            //Fecha o conjunto de resultados para limpar a memória     
            //Fecha o mecanismo de consulta
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_botaoRegistrarEntradaActionPerformed

    private void botaoRegistrarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarSaidaActionPerformed
        //primeiramente valida-se os dados no sistema
        String msg = "";
        if (dataSaida.getText().replaceAll("\\/", "").trim().isEmpty()) {
            msg += "Favor preencher Data da Saida;\n";
        }
        if (historicoSaida.getText().equals("")) {
            msg += "Favor preencher Histórico;\n";

        }
        if (valorSaida.getText().equals("")) {
            msg += "Favor preencher Valor da Saída;\n";

        }

        if (!msg.equals("")) {
            JOptionPane.showMessageDialog(null, msg);
            return;
        }

        Conexao com = new Conexao();
        //Criar uma consulta para executar no banco
        Statement stmt = null;

        try {
            //aciona o mecanismo necessário para a criação da consulta
            stmt = com.c.createStatement();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
            Date data = format.parse(dataSaida.getText());
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            String dia = format2.format(data);

            //aciona o mecanismo necessário para realizar a consulta
            stmt.executeUpdate("INSERT INTO MovCaixa (Data,Historico,Saida) VALUES ( '" + dia + "','" + historicoSaida.getText() + "','" + valorSaida.getText().replace(',', '.') + "')");

            //Aviso de sucesso no cadastro
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso.");
            ResultSet rs = stmt.executeQuery("SELECT ID_Caixa, Data,Historico,Entrada,Saida FROM  MovCaixa where strftime('%m',Data) = strftime('%m',date('now', 'localtime'))Order By Data");
            // Instancia a tabela nodelo
            DefaultTableModel tabelaModel = (DefaultTableModel) tabelaCaixa.getModel();
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
            rs = stmt.executeQuery("SELECT  printf(\"%.2f\", SUM(Entrada))as Entradas, printf(\"%.2f\", SUM(Saida))as Saidas,printf(\"%.2f\", SUM(Entrada)- SUM(Saida)) as total FROM  MovCaixa where strftime('%m',Data) = strftime('%m',date('now', 'localtime'))");
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
                //    saldoAnterior.setText(rs.getString("acumulado"));
            }
            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as saldoAnterior FROM  MovCaixa where strftime('%m',Data) < strftime('%m',date('now', 'localtime'))");
            while (rs.next()) {
                String sAnt = rs.getString("saldoAnterior");
                float sA = Float.parseFloat(sAnt.replace(",", "."));
                sAnt = String.format("%.02f", sA);
                saldoAnterior.setText(sAnt);
            }

            rs = stmt.executeQuery("SELECT  printf(\"%.2f\",  SUM(Entrada) - SUM(Saida)) as saldoAcumulado FROM  MovCaixa");

            while (rs.next()) {
                String sAcumu = rs.getString("saldoAcumulado");
                float sAcumulado = Float.parseFloat(sAcumu.replace(",", "."));
                sAcumu = String.format("%.02f", sAcumulado);
                saldoAcumulado.setText(sAcumu);

            }
            //Limpar Campos do formulário
            dataSaida.setText("");
            historicoSaida.setText("");
            valorSaida.setText("");

            //Fecha o conjunto de resultados para limpar a memória     
            //Fecha o mecanismo de consulta
            stmt.close();

            //Fecha a conexão com o banco de dados
            com.c.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_botaoRegistrarSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRegistrarEntrada;
    private javax.swing.JButton botaoRegistrarSaida;
    private javax.swing.JFormattedTextField dataEntrada;
    private javax.swing.JFormattedTextField dataSaida;
    private javax.swing.JTextField historicoEntrada;
    private javax.swing.JTextField historicoSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField saldoAcumulado;
    private javax.swing.JTextField saldoAnterior;
    private javax.swing.JTable tabelaCaixa;
    private javax.swing.JTextField totalEntradas;
    private javax.swing.JTextField totalSaidas;
    private javax.swing.JTextField valorEntrada;
    private javax.swing.JTextField valorSaida;
    // End of variables declaration//GEN-END:variables
}
