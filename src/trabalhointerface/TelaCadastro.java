/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhointerface;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Aluno
 */
public class TelaCadastro extends javax.swing.JPanel {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        comboUf.addItem("Acre");
        comboUf.addItem("Alagoas");
        comboUf.addItem("Amapá");
        comboUf.addItem("Amazonas");
        comboUf.addItem("Bahia");
        comboUf.addItem("Ceará");
        comboUf.addItem("Distrito Federal");
        comboUf.addItem("Espírito Santo");
        comboUf.addItem("Goiás");
        comboUf.addItem("Maranhão");
        comboUf.addItem("Mato Grosso");
        comboUf.addItem("Mato Grosso do Sul");
        comboUf.addItem("Minas Gerais");
        comboUf.addItem("Pará");
        comboUf.addItem("Paraíba");
        comboUf.addItem("Paraná");
        comboUf.addItem("Pernambuco");
        comboUf.addItem("Piauí");
        comboUf.addItem("Rio de Janeiro");
        comboUf.addItem("Rio Grande do Norte");
        comboUf.addItem("Rio Grande do Sul");
        comboUf.addItem("Rondônia");
        comboUf.addItem("Roraima");
        comboUf.addItem("Santa Catarina");
        comboUf.addItem("São Paulo");
        comboUf.addItem("Sergipe");
        comboUf.addItem("Tocantins");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        labelPainel = new javax.swing.JLabel();
        labelDados = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        labelCnpj = new javax.swing.JLabel();
        cpInscricao = new javax.swing.JTextField();
        labelInscricao = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelLocalizacao = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        cpCidade = new javax.swing.JTextField();
        labelUf = new javax.swing.JLabel();
        comboUf = new javax.swing.JComboBox<>();
        labelEndereco = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        cpEndereco = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        labelNum = new javax.swing.JLabel();
        cpNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpBairro = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelContato = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        cpEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelResponsavel = new javax.swing.JLabel();
        labelCelularResp = new javax.swing.JLabel();
        labelRenda = new javax.swing.JLabel();
        labelLinkFace = new javax.swing.JLabel();
        cpLinkFace = new javax.swing.JTextField();
        labelLinkInsta = new javax.swing.JLabel();
        cpLinkInsta = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        cpCpf = new javax.swing.JFormattedTextField();
        cpCnpj = new javax.swing.JFormattedTextField();
        cpData = new javax.swing.JFormattedTextField();
        cpCep = new javax.swing.JFormattedTextField();
        cpTelefone = new javax.swing.JFormattedTextField();
        cpCelular = new javax.swing.JFormattedTextField();
        cpCelularResp = new javax.swing.JFormattedTextField();
        cpRenda = new javax.swing.JFormattedTextField();

        labelPainel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPainel.setText("PAINEL DE CADASTRO");

        labelDados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDados.setText("Dados Cadastrais Da Empresa");

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelNome.setText("Nome");

        labelCnpj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelCnpj.setText("Inscrição Estadual");

        labelInscricao.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelInscricao.setText("CNPJ");

        labelData.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelData.setText("Data De Cadastro");

        labelLocalizacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelLocalizacao.setText("Localização");

        labelCidade.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelCidade.setText("Cidade");

        labelUf.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelUf.setText("UF");

        comboUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelEndereco.setText("Rua");

        labelCep.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelCep.setText("CEP");

        cpEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpEnderecoActionPerformed(evt);
            }
        });

        labelNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNumero.setText("n°");

        cpNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNumeroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Bairro");

        labelContato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelContato.setText("Contato");

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelEmail.setText("Email");

        cpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpEmailActionPerformed(evt);
            }
        });

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelTelefone.setText("Telefone");

        labelCelular.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelCelular.setText("Celular");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("CPF");

        labelResponsavel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelResponsavel.setText("Responsável");

        labelCelularResp.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelCelularResp.setText("Celular");

        labelRenda.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelRenda.setText("Renda");

        labelLinkFace.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelLinkFace.setText("Link facebok");

        labelLinkInsta.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelLinkInsta.setText("Link Instagram");

        cpLinkInsta.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        try {
            cpCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCelularResp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpRenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(labelLocalizacao))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCidade)
                        .addGap(18, 18, 18)
                        .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDados)
                            .addComponent(labelPainel))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelCnpj))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelInscricao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpCnpj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelData)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(labelContato))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelEmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(cpEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labelEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelCep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNum)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTelefone)
                                .addGap(27, 27, 27)
                                .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCelularResp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpCelularResp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLinkFace)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpLinkFace, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelLinkInsta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpLinkInsta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 24, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelRenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpRenda)
                                .addGap(40, 40, 40))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(labelResponsavel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelPainel)
                .addGap(18, 18, 18)
                .addComponent(labelDados)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCnpj)
                    .addComponent(cpInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInscricao)
                    .addComponent(labelData)
                    .addComponent(cpCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLocalizacao)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUf)
                    .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelNum))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEndereco)
                            .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumero)
                            .addComponent(cpNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCep)
                            .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(labelCelular)
                    .addComponent(cpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelResponsavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelCelularResp)
                    .addComponent(labelRenda)
                    .addComponent(cpCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCelularResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLinkFace)
                    .addComponent(cpLinkFace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLinkInsta)
                    .addComponent(cpLinkInsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpEnderecoActionPerformed

    private void cpNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNumeroActionPerformed

    private void cpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpEmailActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (this.validarCampos()) {
            JOptionPane.showMessageDialog(null, "Campos preenchidos corretamente");

        }
        
        FileWriter arquivoTxt = null;
        try {
            arquivoTxt = new FileWriter("Dados De Cadastro.txt");
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
PrintWriter gravarArq = new PrintWriter(arquivoTxt);

String gravar = "DADOS CADASTRAIS:\n\n\nNome: "+cpNome.getText()+"\nInscrição Estadual: "+cpInscricao.getText()+"\nCNPJ: "+cpCnpj.getText()+
"\nData De Cadastro: "+cpData.getText()+"\n\nLOCALIZAÇÃO:\n\nCidade: "+cpCidade.getText()+
"\nRua: "+cpEndereco.getText()+"\nNumero: "+cpNumero.getText()+"\nBairro: "+cpBairro.getText()+
"\nUF: "+comboUf.getSelectedItem()+"\nCEP: "+cpCep.getText()+"\n\nCONTATO:\n\nEmail: "+cpEmail.getText()+
"\nTelefone: "+cpTelefone.getText()+"\nCelular: "+cpCelular.getText()+"\n\nRESPONSÁVEL\n\nCPF: "+cpCpf.getText()+
"\nCelular: "+cpCelularResp.getText()+"\nRenda: "+cpRenda.getText()+"\nLink Do Facebook: "+cpLinkFace.getText()+
"\nLink Do Instagram: "+cpLinkInsta.getText();


gravarArq.println(gravar);


        try {
            arquivoTxt.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        EnvioDeEmail mail = new EnvioDeEmail();
        
         String remetente = "diogo_cruz@estudante.sc.senai.br";
        String destinatario = "marcio_santos9@estudante.sc.senai.br";
        String assunto = "Cadastros";
        String msg = "DADOS CADASTRAIS:\n\n\nNome: "+cpNome.getText()+"\nInscrição Estadual: "+cpInscricao.getText()+"\nCNPJ: "+cpCnpj.getText()+
"\nData De Cadastro: "+cpData.getText()+"\n\nLOCALIZAÇÃO:\n\nCidade: "+cpCidade.getText()+
"\nRua: "+cpEndereco.getText()+"\nNumero: "+cpNumero.getText()+"\nBairro: "+cpBairro.getText()+
"\nUF: "+comboUf.getSelectedItem()+"\nCEP: "+cpCep.getText()+"\n\nCONTATO:\n\nEmail: "+cpEmail.getText()+
"\nTelefone: "+cpTelefone.getText()+"\nCelular: "+cpCelular.getText()+"\n\nRESPONSÁVEL\n\nCPF: "+cpCpf.getText()+
"\nCelular: "+cpCelularResp.getText()+"\nRenda: "+cpRenda.getText()+"\nLink Do Facebook: "+cpLinkFace.getText()+
"\nLink Do Instagram: "+cpLinkInsta.getText(); ;
        
        boolean retorno = mail.enviar(remetente, destinatario, assunto, msg);
        
        if (mail.enviar(remetente, destinatario, assunto, msg)) {
            JOptionPane.showMessageDialog(null, "E-mai enviado com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao enviar e-mail!", "Erro!", ERROR_MESSAGE);
        }
        
        
        
        
        
    }//GEN-LAST:event_btSalvarActionPerformed

    
    
    
    
    private boolean validarCampos() {
        CPFValidator validator = new CPFValidator();

        try {
            // lógica de negócio ...
            validator.assertValid(cpCpf.getText()); 
            
            
            String nome = cpNome.getText();
            String inscricao = cpInscricao.getText();
            String data = cpData.getText();
            
            if (nome.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe o nome!");
                return false;
            } else if (comboUf.getSelectedItem().equals("Selecione")) {
                JOptionPane.showMessageDialog(null, "Selecione o UF!");
                return false;
            } else if (inscricao.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Inscrição Estadual!");
                return false;
            }else if(data.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Data De Cadastro!");
                return false;
            }

            return true;
            // continuação da lógica de negócio ...
        } catch (InvalidStateException e) { // exception lançada quando o documento é inválido
            JOptionPane.showMessageDialog(null, "CPF Inválido!" + e.getInvalidMessages());
            return false;
        }
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> comboUf;
    private javax.swing.JTextField cpBairro;
    private javax.swing.JFormattedTextField cpCelular;
    private javax.swing.JFormattedTextField cpCelularResp;
    private javax.swing.JFormattedTextField cpCep;
    private javax.swing.JTextField cpCidade;
    private javax.swing.JFormattedTextField cpCnpj;
    private javax.swing.JFormattedTextField cpCpf;
    private javax.swing.JFormattedTextField cpData;
    private javax.swing.JTextField cpEmail;
    private javax.swing.JTextField cpEndereco;
    private javax.swing.JTextField cpInscricao;
    private javax.swing.JTextField cpLinkFace;
    private javax.swing.JTextField cpLinkInsta;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpNumero;
    private javax.swing.JFormattedTextField cpRenda;
    private javax.swing.JFormattedTextField cpTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCelularResp;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCnpj;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelDados;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelInscricao;
    private javax.swing.JLabel labelLinkFace;
    private javax.swing.JLabel labelLinkInsta;
    private javax.swing.JLabel labelLocalizacao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNum;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPainel;
    private javax.swing.JLabel labelRenda;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUf;
    // End of variables declaration//GEN-END:variables
}
