/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Admin
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternalFrame = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPainelCadastroVendedor = new javax.swing.JLabel();
        jButtonCadastroVendedor = new javax.swing.JButton();
        jButtonCadastroProduto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonVender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastroFuncionario = new javax.swing.JMenu();
        jMenuFuncionario = new javax.swing.JMenu();
        jMenuItemVendedor = new javax.swing.JMenuItem();
        jMenuItemCaixa = new javax.swing.JMenuItem();
        jMenuItemGerente = new javax.swing.JMenuItem();
        jMenuItemEstoque = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternalFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternalFrame.setLayout(null);

        jLabel2.setText("Cadastros");
        jPanelInternalFrame.add(jLabel2);
        jLabel2.setBounds(20, 20, 60, 14);
        jPanelInternalFrame.add(jLabelPainelCadastroVendedor);
        jLabelPainelCadastroVendedor.setBounds(540, 60, 210, 180);

        jButtonCadastroVendedor.setText("Vendedor");
        jButtonCadastroVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroVendedorActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(jButtonCadastroVendedor);
        jButtonCadastroVendedor.setBounds(50, 50, 100, 23);

        jButtonCadastroProduto.setText("Produto");
        jButtonCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroProdutoActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(jButtonCadastroProduto);
        jButtonCadastroProduto.setBounds(180, 50, 90, 23);

        jButton1.setText("Cliente");
        jPanelInternalFrame.add(jButton1);
        jButton1.setBounds(310, 50, 80, 23);

        jLabel3.setText("Venda");
        jPanelInternalFrame.add(jLabel3);
        jLabel3.setBounds(20, 110, 40, 14);

        jButtonVender.setText("Vender");
        jPanelInternalFrame.add(jButtonVender);
        jButtonVender.setBounds(50, 140, 73, 23);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternalFrame);
        jPanelInternalFrame.setBounds(0, 60, 730, 210);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 260, 30);

        jButtonFecharBemVindo.setText("Fechar");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(650, 10, 73, 23);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(10, 10, 750, 300);

        jMenuCadastroFuncionario.setText("Cadastro");

        jMenuFuncionario.setText("Funcionario");

        jMenuItemVendedor.setText("Vendedor");
        jMenuItemVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedorActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItemVendedor);

        jMenuItemCaixa.setText("Caixa");
        jMenuFuncionario.add(jMenuItemCaixa);

        jMenuItemGerente.setText("Gerente");
        jMenuFuncionario.add(jMenuItemGerente);

        jMenuItemEstoque.setText("Estoque");
        jMenuFuncionario.add(jMenuItemEstoque);

        jMenuCadastroFuncionario.add(jMenuFuncionario);

        jMenuBar1.add(jMenuCadastroFuncionario);

        jMenuVenda.setText("Vender");
        jMenuBar1.add(jMenuVenda);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(781, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        // TODO add your handling code here:
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItemVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedorActionPerformed
        FormVendedor tela = new FormVendedor();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendedorActionPerformed

    private void jButtonCadastroVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroVendedorActionPerformed
        FormVendedor tela = new FormVendedor();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroVendedorActionPerformed

    private void jButtonCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroProdutoActionPerformed
        FormProdutos tela = new FormProdutos();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastroProdutoActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastroProduto;
    private javax.swing.JButton jButtonCadastroVendedor;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPainelCadastroVendedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastroFuncionario;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuItemCaixa;
    private javax.swing.JMenuItem jMenuItemEstoque;
    private javax.swing.JMenuItem jMenuItemGerente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenuItem jMenuItemVendedor;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPanel jPanelInternalFrame;
    // End of variables declaration//GEN-END:variables
}