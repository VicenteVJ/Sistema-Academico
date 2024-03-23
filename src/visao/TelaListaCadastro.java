package visao;

import controle.ControleAluno;
import controle.ControleCurso;
import controle.ControleDocente;
import controle.ControleFuncionario;
import controle.IControleCadastro;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Vicente
 */
public class TelaListaCadastro extends javax.swing.JFrame {

    private final IControleCadastro controle;
    /**
     * Creates new form ListaAlunos
     * @param controle
     */
    public TelaListaCadastro(IControleCadastro controle) {
        initComponents();
        setLocationRelativeTo(null);
        this.controle = controle;
        inicializarComponentesTela();
        gerarTabela();
    }
    
    private void inicializarComponentesTela() {
        if (controle instanceof ControleAluno) {
            super.setTitle("Lista de Alunos");
        }else if(controle instanceof ControleFuncionario){
            super.setTitle("Lista de Funcionários");
        }else if(controle instanceof ControleDocente){
            super.setTitle("Lista de Docentes");
        }else if(controle instanceof ControleCurso){
            super.setTitle("Lista de Cursos");
        }            
    }

    private void gerarTabela() {
        String[] colunas = controle.gerarColunasTabela();
        String[][] dados = controle.gerarDadosTabela(colunas.length);

        DefaultTableModel model = new DefaultTableModel(
                dados,
                colunas
        ) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        jTabela.setModel(model);
        //não permite editar os dados da tabela
        jTabela.setDefaultEditor(Object.class, null);

    }
    
    public void atualizarTabela(){
        gerarTabela();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jB_Adicionar = new javax.swing.JButton();
        jB_Remover = new javax.swing.JButton();
        jB_Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Alunos");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "E-mail", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);

        jB_Adicionar.setText("Adicionar");
        jB_Adicionar.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AdicionarActionPerformed(evt);
            }
        });

        jB_Remover.setText("Remover");
        jB_Remover.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RemoverActionPerformed(evt);
            }
        });

        jB_Editar.setText("Editar");
        jB_Editar.setToolTipText("");
        jB_Editar.setActionCommand("");
        jB_Editar.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        if (evt.getClickCount() > 1 && jTabela.getSelectedRow()>=0) {
            int linha = jTabela.getSelectedRow();
            controle.abrirTelaCadastroParaEdicao(linha);
        }
    }//GEN-LAST:event_jTabelaMouseClicked

    private void jB_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EditarActionPerformed
        int linha = jTabela.getSelectedRow();
        if(linha>=0){
            controle.abrirTelaCadastroParaEdicao(linha);
        }
    }//GEN-LAST:event_jB_EditarActionPerformed

    private void jB_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AdicionarActionPerformed
        //DefaultTableModel model = (DefaultTableModel) jTabela.getModel();
        //model.addRow(new Object[model.getColumnCount()]);
        controle.abrirTelaCadastro();
    }//GEN-LAST:event_jB_AdicionarActionPerformed

    private void jB_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RemoverActionPerformed
        int posicao = jTabela.getSelectedRow();
        if(posicao >= 0 && controle.removerCadastro(posicao)){
            DefaultTableModel model = (DefaultTableModel) jTabela.getModel();
            model.removeRow(posicao);
        }
    }//GEN-LAST:event_jB_RemoverActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Adicionar;
    private javax.swing.JButton jB_Editar;
    private javax.swing.JButton jB_Remover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables
}
