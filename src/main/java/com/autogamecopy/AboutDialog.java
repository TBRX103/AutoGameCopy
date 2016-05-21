/*
 * Copyright (C) 2016 Benjamin Schellenberger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.autogamecopy;

import com.autogamecopy.util.Global;

/**
 *
 * @author Benjamin Schellenberger
 */
public class AboutDialog extends javax.swing.JDialog {

    /**
     * Creates new form AboutDialog
     */
    public AboutDialog(java.awt.Frame parent) {
        super(parent, true);
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
        java.awt.GridBagConstraints gridBagConstraints;

        lblTitle = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTextArea1 = new org.jdesktop.swingx.JXTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTitle.setText(Global.APPLICATION_FULL_TITLE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(lblTitle, gridBagConstraints);

        btnClose.setMnemonic('l');
        btnClose.setText("Close");
        btnClose.setToolTipText("");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        getContentPane().add(btnClose, gridBagConstraints);

        jXTextArea1.setEditable(false);
        jXTextArea1.setColumns(20);
        jXTextArea1.setLineWrap(true);
        jXTextArea1.setRows(5);
        jXTextArea1.setText("Lorem ipsum dolor sit amet, blandit aliquando mei ex, esse alterum mediocrem usu no. Debet luptatum aliquando te nam, quo alii sumo ne. Ius in tantas voluptaria. Vix inermis inimicus pericula an, vis euismod senserit ei.\n\nSed an magna molestie quaestio, ut sed tale ignota dissentiunt. Pri no aperiam fuisset suavitate, intellegam intellegebat mea at. Sit no dolore graece, euismod salutatus moderatius eu nam, ornatus inermis petentium sea ne. Nec nullam impedit deleniti ex, mei inani praesent incorrupte ex.\n\nNulla debet te vix. Ad quo dolore constituto. Meliore invenire no eos, no mel cibo eius omittam, eum viris affert aperiam cu. Ea quem partem constituam ius, duo quaerendum theophrastus ei. Eum id accumsan elaboraret quaerendum, case singulis eu duo.\n\nVim habemus percipit interesset ea. Cu unum melius eum, sonet propriae vituperata duo at. His consulatu appellantur accommodare eu, omnium minimum adversarium usu id, ne per tritani laoreet omittam. Inani omnium at mel, tamquam oporteat pri ex, no etiam graeci mea. Ut tantas saperet his, ut vis nostro animal. Nam id dico officiis mediocrem, ius fugit clita et, liber iusto dicit ad pri.\n\nDiam fugit doctus et vis, mea no vitae moderatius, mea et quas convenire vituperatoribus. Falli dicunt vim ad, idque soleat aliquam no eam. Lobortis accommodare est ad. Te vide euismod accusata ius, movet democritum his in. Ei stet primis qui, at vero accusam democritum eos.");
        jXTextArea1.setWrapStyleWord(true);
        jXTextArea1.setCaretPosition(0);
        jXTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jXTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTextArea jXTextArea1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
