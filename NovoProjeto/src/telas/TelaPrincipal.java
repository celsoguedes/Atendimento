/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author sucel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        AgendaDia tela = new AgendaDia();
        desktop.add(tela);
        tela.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        ImageIcon icon=new ImageIcon(getClass().getResource("/imagens/quirocomple.png"));
        Image img=icon.getImage();
        desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g)
            {   g.drawImage(img,0,0,getWidth(),
                getHeight(),this);
        }
    };
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    menuPaciente = new javax.swing.JMenu();
    cadastrarPaciente = new javax.swing.JMenuItem();
    consultarPaciente = new javax.swing.JMenuItem();
    menuQuiroprata = new javax.swing.JMenu();
    cadastrarQuiroprata = new javax.swing.JMenuItem();
    consultarQuiroprata = new javax.swing.JMenuItem();
    cadastrarUsuario = new javax.swing.JMenuItem();
    menuAgendaeConsuluta = new javax.swing.JMenu();
    agendarConsulta = new javax.swing.JMenuItem();
    consultarAgendamento = new javax.swing.JMenuItem();
    menuCaixa = new javax.swing.JMenu();
    movCaixa = new javax.swing.JMenuItem();
    menuRelatorio = new javax.swing.JMenu();
    agendaDia = new javax.swing.JMenuItem();
    relatorioCaixa = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Berg Quiropraxia");

    jLabel1.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 153, 255));
    jLabel1.setText("BERG QUIROPRAXIA");

    jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 204, 0));
    jLabel2.setText("A sua coluna em boas mãos");

    jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 204, 0));
    jLabel3.setText("C & C Desenvolvimento de Sistemas LTDA.");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel4.setText("Sinteag - Sistema Integrado de Agendamentos");

    desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    desktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
    desktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
    desktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
    desktop.setLayout(desktopLayout);
    desktopLayout.setHorizontalGroup(
        desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(desktopLayout.createSequentialGroup()
            .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopLayout.createSequentialGroup()
                    .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(desktopLayout.createSequentialGroup()
                            .addGap(405, 405, 405)
                            .addComponent(jLabel1))
                        .addGroup(desktopLayout.createSequentialGroup()
                            .addGap(514, 514, 514)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 409, Short.MAX_VALUE))
                .addGroup(desktopLayout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)))
            .addContainerGap())
    );
    desktopLayout.setVerticalGroup(
        desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(desktopLayout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
            .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jLabel4))
            .addContainerGap())
    );

    javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
    painelPrincipal.setLayout(painelPrincipalLayout);
    painelPrincipalLayout.setHorizontalGroup(
        painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(desktop)
    );
    painelPrincipalLayout.setVerticalGroup(
        painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(desktop)
    );

    jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    jMenuBar1.setPreferredSize(new java.awt.Dimension(1011, 76));

    menuPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255)));
    menuPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Paciente.png"))); // NOI18N
    menuPaciente.setText("Paciente");
    menuPaciente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
    menuPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            menuPacienteActionPerformed(evt);
        }
    });

    cadastrarPaciente.setText("Cadastrar");
    cadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cadastrarPacienteActionPerformed(evt);
        }
    });
    menuPaciente.add(cadastrarPaciente);

    consultarPaciente.setText("Consultar");
    consultarPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consultarPacienteActionPerformed(evt);
        }
    });
    menuPaciente.add(consultarPaciente);

    jMenuBar1.add(menuPaciente);

    menuQuiroprata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 2));
    menuQuiroprata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Quiroprata.png"))); // NOI18N
    menuQuiroprata.setText("Quiroprata");
    menuQuiroprata.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
    menuQuiroprata.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            menuQuiroprataActionPerformed(evt);
        }
    });

    cadastrarQuiroprata.setText("Cadastrar");
    cadastrarQuiroprata.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cadastrarQuiroprataActionPerformed(evt);
        }
    });
    menuQuiroprata.add(cadastrarQuiroprata);

    consultarQuiroprata.setText("Consultar");
    consultarQuiroprata.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consultarQuiroprataActionPerformed(evt);
        }
    });
    menuQuiroprata.add(consultarQuiroprata);

    cadastrarUsuario.setText("Cadastrar Usuário");
    cadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cadastrarUsuarioActionPerformed(evt);
        }
    });
    menuQuiroprata.add(cadastrarUsuario);

    jMenuBar1.add(menuQuiroprata);

    menuAgendaeConsuluta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    menuAgendaeConsuluta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Consulta.png"))); // NOI18N
    menuAgendaeConsuluta.setText("Consultas");
    menuAgendaeConsuluta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

    agendarConsulta.setText("Agendar");
    agendarConsulta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agendarConsultaActionPerformed(evt);
        }
    });
    menuAgendaeConsuluta.add(agendarConsulta);

    consultarAgendamento.setText("Consultar");
    consultarAgendamento.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            consultarAgendamentoActionPerformed(evt);
        }
    });
    menuAgendaeConsuluta.add(consultarAgendamento);

    jMenuBar1.add(menuAgendaeConsuluta);

    menuCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Caixa.png"))); // NOI18N
    menuCaixa.setText("Caixa");
    menuCaixa.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

    movCaixa.setText("Mov de Caixa");
    movCaixa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            movCaixaActionPerformed(evt);
        }
    });
    menuCaixa.add(movCaixa);

    jMenuBar1.add(menuCaixa);

    menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Relatorios.png"))); // NOI18N
    menuRelatorio.setText("Relatórios");
    menuRelatorio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

    agendaDia.setText("Agenda do Dia");
    agendaDia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agendaDiaActionPerformed(evt);
        }
    });
    menuRelatorio.add(agendaDia);

    relatorioCaixa.setText("Relatórios de caixa");
    relatorioCaixa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            relatorioCaixaActionPerformed(evt);
        }
    });
    menuRelatorio.add(relatorioCaixa);

    jMenuBar1.add(menuRelatorio);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPacienteActionPerformed
        CadastrarPaciente tela = new CadastrarPaciente();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarPacienteActionPerformed

    private void consultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPacienteActionPerformed
        ConsultaPaciente tela = new ConsultaPaciente();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_consultarPacienteActionPerformed

    private void menuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPacienteActionPerformed

    }//GEN-LAST:event_menuPacienteActionPerformed

    private void agendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarConsultaActionPerformed
        Agendamento tela = new Agendamento();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_agendarConsultaActionPerformed

    private void menuQuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuiroprataActionPerformed

    }//GEN-LAST:event_menuQuiroprataActionPerformed

    private void cadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioActionPerformed
        CadastrarUsuario tela = new CadastrarUsuario();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarUsuarioActionPerformed

    private void cadastrarQuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarQuiroprataActionPerformed
        CadastrarQuiroprata tela = new CadastrarQuiroprata();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_cadastrarQuiroprataActionPerformed

    private void consultarQuiroprataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarQuiroprataActionPerformed
        ConsultarQuiroprata tela = new ConsultarQuiroprata();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_consultarQuiroprataActionPerformed

    private void consultarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAgendamentoActionPerformed
        ConsultarAgendamento tela = new ConsultarAgendamento();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_consultarAgendamentoActionPerformed

    private void movCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movCaixaActionPerformed
        MovimentoCaixa tela = new MovimentoCaixa();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_movCaixaActionPerformed

    private void agendaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaDiaActionPerformed
        AgendaDia tela = new AgendaDia();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_agendaDiaActionPerformed

    private void relatorioCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioCaixaActionPerformed
        RelatoriosDeCaixa tela = new RelatoriosDeCaixa();
        desktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_relatorioCaixaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agendaDia;
    private javax.swing.JMenuItem agendarConsulta;
    private javax.swing.JMenuItem cadastrarPaciente;
    private javax.swing.JMenuItem cadastrarQuiroprata;
    private javax.swing.JMenuItem cadastrarUsuario;
    private javax.swing.JMenuItem consultarAgendamento;
    private javax.swing.JMenuItem consultarPaciente;
    private javax.swing.JMenuItem consultarQuiroprata;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAgendaeConsuluta;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenu menuPaciente;
    private javax.swing.JMenu menuQuiroprata;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem movCaixa;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JMenuItem relatorioCaixa;
    // End of variables declaration//GEN-END:variables
}
