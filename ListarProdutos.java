/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marcelo
 */
public final class ListarProdutos extends javax.swing.JFrame {

    /**
     * Creates new form ListarProdutos
     * @throws java.sql.SQLException
     */
    public ListarProdutos() throws SQLException {
        initComponents();
        PopularTabelaProdutos();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoqueInsumos = new javax.swing.JTable();
        jPanelEditarProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSalvarProdutoEditado = new javax.swing.JButton();
        jTextDescricaoProduto = new javax.swing.JTextField();
        jTextQuantidadeProduto = new javax.swing.JTextField();
        jTextUnidadeMedida = new javax.swing.JTextField();
        jTextValorProduto = new javax.swing.JTextField();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonExcluirProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Estoque de Insumos");

        jTableEstoqueInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo do Produto", "Descri????o", "Quantidade", "Unidade de Medida", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstoqueInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstoqueInsumosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstoqueInsumos);

        jLabel2.setText("Descri????o do Produto");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Unidade de Medida");

        jLabel5.setText("Valor");

        jButtonSalvarProdutoEditado.setText("SALVAR");
        jButtonSalvarProdutoEditado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarProdutoEditadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditarProdutoLayout = new javax.swing.GroupLayout(jPanelEditarProduto);
        jPanelEditarProduto.setLayout(jPanelEditarProdutoLayout);
        jPanelEditarProdutoLayout.setHorizontalGroup(
            jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                .addGroup(jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                    .addComponent(jTextUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(jTextDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jButtonSalvarProdutoEditado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEditarProdutoLayout.setVerticalGroup(
            jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEditarProdutoLayout.createSequentialGroup()
                                .addGroup(jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3))
                            .addComponent(jTextQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4))
                    .addComponent(jTextUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButtonSalvarProdutoEditado)
                .addGap(36, 36, 36))
        );

        jButtonCadastrarProduto.setText("Cadastrar Produto");
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });

        jButtonExcluirProduto.setText("EXCLUIR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanelEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jButtonExcluirProduto)
                .addGap(237, 237, 237)
                .addComponent(jButtonCadastrarProduto)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarProduto)
                    .addComponent(jButtonExcluirProduto))
                .addGap(31, 31, 31)
                .addComponent(jPanelEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarProdutoEditadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarProdutoEditadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarProdutoEditadoActionPerformed

    private void jTableEstoqueInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueInsumosMouseClicked
        jPanelEditarProduto.setVisible(true);
        
         int row = jTableEstoqueInsumos.getSelectedRow();
        
        String descricao_produto = jTableEstoqueInsumos.getValueAt(row, 1).toString();
        String quantidade_produto = jTableEstoqueInsumos.getValueAt(row, 2).toString();
        String unidade_medida= jTableEstoqueInsumos.getValueAt(row, 3).toString();
        String valor_produto= jTableEstoqueInsumos.getValueAt(row, 3).toString();
        
       jTextDescricaoProduto.setText(descricao_produto);
       jTextQuantidadeProduto.setText(quantidade_produto);
       jTextUnidadeMedida.setText(unidade_medida);
       jTextValorProduto.setText(valor_produto);
    }//GEN-LAST:event_jTableEstoqueInsumosMouseClicked

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        CadastrarProduto cadastrar_produtos = new CadastrarProduto();
        cadastrar_produtos.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ListarProdutos().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonExcluirProduto;
    private javax.swing.JButton jButtonSalvarProdutoEditado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEditarProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstoqueInsumos;
    private javax.swing.JTextField jTextDescricaoProduto;
    private javax.swing.JTextField jTextQuantidadeProduto;
    private javax.swing.JTextField jTextUnidadeMedida;
    private javax.swing.JTextField jTextValorProduto;
    // End of variables declaration//GEN-END:variables

public void PopularTabelaProdutos() throws SQLException{

    DefaultTableModel model = (DefaultTableModel) jTableEstoqueInsumos.getModel();
    model.setNumRows(0);
    
    ConexaoBD con = new ConexaoBD();
    java.sql.Statement st = (java.sql.Statement) con.conexao.createStatement();
    
    String sql = "SELECT * FROM estoque_insumos";
   
    ResultSet resultado = st.executeQuery(sql);
    
    while(resultado.next()){
        model.addRow(new Object[]{
            resultado.getString("codigo_item"),
            resultado.getString("quantidade_item"),
            resultado.getString("unidade_medida"),
            resultado.getString("valor_item")
        });
    }        

}
}


