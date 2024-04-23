/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventario;

/**
 *
 * @author Usuario
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal() {
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

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        panelColor = new javax.swing.JPanel();
        mlmBienvenidos = new javax.swing.JLabel();
        barramenu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        itemIngresar = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        repti = new javax.swing.JMenu();
        FamTortu = new javax.swing.JMenuItem();
        Cocod = new javax.swing.JMenuItem();
        Igua = new javax.swing.JMenuItem();
        Serp = new javax.swing.JMenuItem();
        Camal = new javax.swing.JMenuItem();
        artro = new javax.swing.JMenu();
        Aracni = new javax.swing.JMenuItem();
        Insec = new javax.swing.JMenuItem();
        Crusta = new javax.swing.JMenuItem();
        Miria = new javax.swing.JMenuItem();
        aves = new javax.swing.JMenu();
        AvesV = new javax.swing.JMenuItem();
        AvesNV = new javax.swing.JMenuItem();
        FamFeli = new javax.swing.JMenu();
        FeliV = new javax.swing.JMenuItem();
        FeliP = new javax.swing.JMenuItem();
        FamAnfi = new javax.swing.JMenu();
        Ranas = new javax.swing.JMenuItem();
        Sapos = new javax.swing.JMenuItem();
        Salam = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        FamPez = new javax.swing.JMenu();
        Tibu = new javax.swing.JMenuItem();
        PAguaD = new javax.swing.JMenuItem();
        PaAguaS = new javax.swing.JMenuItem();
        Manta = new javax.swing.JMenuItem();
        MamAcua = new javax.swing.JMenu();
        Balle = new javax.swing.JMenuItem();
        Delfi = new javax.swing.JMenuItem();
        Focas = new javax.swing.JMenuItem();
        LeoMar = new javax.swing.JMenuItem();
        MamTer = new javax.swing.JMenu();
        Elef = new javax.swing.JMenuItem();
        Hipo = new javax.swing.JMenuItem();
        Jiraf = new javax.swing.JMenuItem();
        Rino = new javax.swing.JMenuItem();
        Bison = new javax.swing.JMenuItem();
        Hienas = new javax.swing.JMenuItem();
        Cebras = new javax.swing.JMenuItem();
        FamCan = new javax.swing.JMenu();
        Coyo = new javax.swing.JMenuItem();
        Lobos = new javax.swing.JMenuItem();
        FamOso = new javax.swing.JMenu();
        Osos = new javax.swing.JMenuItem();
        FamMarsu = new javax.swing.JMenu();
        Cangu = new javax.swing.JMenuItem();
        Koalas = new javax.swing.JMenuItem();
        Roedo = new javax.swing.JMenu();
        PDPra = new javax.swing.JMenuItem();
        Capi = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelColor.setBackground(new java.awt.Color(204, 204, 204));

        mlmBienvenidos.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        mlmBienvenidos.setText("BIENVENIDO");
        mlmBienvenidos.setAutoscrolls(true);
        mlmBienvenidos.setInheritsPopupMenu(false);
        mlmBienvenidos.setName(""); // NOI18N
        mlmBienvenidos.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(mlmBienvenidos)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(mlmBienvenidos)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        menuInicio.setText("Empleados");

        itemIngresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemIngresar.setText("Habitat");
        menuInicio.add(itemIngresar);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemSalir.setText("Seguridad");
        menuInicio.add(itemSalir);

        jMenuItem2.setText("Oficina");
        menuInicio.add(jMenuItem2);

        barramenu.add(menuInicio);

        jMenu1.setText("Ejemplares");

        repti.setText("Reptiles");

        FamTortu.setText("Tortugas");
        FamTortu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamTortuActionPerformed(evt);
            }
        });
        repti.add(FamTortu);

        Cocod.setText("Cocodrilos");
        Cocod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocodActionPerformed(evt);
            }
        });
        repti.add(Cocod);

        Igua.setText("Iguanas");
        repti.add(Igua);

        Serp.setText("Serpientes");
        repti.add(Serp);

        Camal.setText("Camaleones");
        repti.add(Camal);

        jMenu1.add(repti);

        artro.setText("Artrópodos");

        Aracni.setText("Aracnidos");
        Aracni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AracniActionPerformed(evt);
            }
        });
        artro.add(Aracni);

        Insec.setText("Insectos");
        artro.add(Insec);

        Crusta.setText("Crustáceos");
        Crusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrustaActionPerformed(evt);
            }
        });
        artro.add(Crusta);

        Miria.setText("Miriápodos");
        artro.add(Miria);

        jMenu1.add(artro);

        aves.setText("Aves");

        AvesV.setText("Voladoras");
        aves.add(AvesV);

        AvesNV.setText("No voladoras");
        aves.add(AvesNV);

        jMenu1.add(aves);

        FamFeli.setText("Felinos");

        FeliV.setText("Verdaderos");
        FamFeli.add(FeliV);

        FeliP.setText("Panterinos");
        FamFeli.add(FeliP);

        jMenu1.add(FamFeli);

        FamAnfi.setText("Anfibios");

        Ranas.setText("Ranas");
        FamAnfi.add(Ranas);

        Sapos.setText("Sapos");
        Sapos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaposActionPerformed(evt);
            }
        });
        FamAnfi.add(Sapos);

        Salam.setText("Salamandras");
        FamAnfi.add(Salam);

        jMenuItem4.setText("Tritones y Cecilidos");
        FamAnfi.add(jMenuItem4);

        jMenu1.add(FamAnfi);

        FamPez.setText("Peces");

        Tibu.setText("Tiburones");
        FamPez.add(Tibu);

        PAguaD.setText("Peces de agua dulce");
        PAguaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAguaDActionPerformed(evt);
            }
        });
        FamPez.add(PAguaD);

        PaAguaS.setText("Peces de agua salada");
        FamPez.add(PaAguaS);

        Manta.setText("Mantarrallas");
        FamPez.add(Manta);

        jMenu1.add(FamPez);

        MamAcua.setText("Mamiferos acuaticos");

        Balle.setText("Ballenas");
        MamAcua.add(Balle);

        Delfi.setText("Delfines");
        MamAcua.add(Delfi);

        Focas.setText("Focas");
        MamAcua.add(Focas);

        LeoMar.setText("Leones marinos");
        MamAcua.add(LeoMar);

        jMenu1.add(MamAcua);

        MamTer.setText("Mamiferos Terrestres");

        Elef.setText("Elefantes");
        MamTer.add(Elef);

        Hipo.setText("Hipopotamos");
        MamTer.add(Hipo);

        Jiraf.setText("Jirafas");
        MamTer.add(Jiraf);

        Rino.setText("Rinocerontes");
        MamTer.add(Rino);

        Bison.setText("Bisontes");
        MamTer.add(Bison);

        Hienas.setText("Hienas");
        MamTer.add(Hienas);

        Cebras.setText("Cebras");
        MamTer.add(Cebras);

        jMenu1.add(MamTer);

        FamCan.setText("Caninos");

        Coyo.setText("Coyotes");
        FamCan.add(Coyo);

        Lobos.setText("Lobos");
        FamCan.add(Lobos);

        jMenu1.add(FamCan);

        FamOso.setText("Ursidos");

        Osos.setText("Osos");
        Osos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsosActionPerformed(evt);
            }
        });
        FamOso.add(Osos);

        jMenu1.add(FamOso);

        FamMarsu.setText("Marsupiales");

        Cangu.setText("Canguros");
        FamMarsu.add(Cangu);

        Koalas.setText("Koalas");
        FamMarsu.add(Koalas);

        jMenu1.add(FamMarsu);

        Roedo.setText("Roedores");

        PDPra.setText("Perritos de la pradera");
        Roedo.add(PDPra);

        Capi.setText("Capibaras");
        Roedo.add(Capi);

        jMenu1.add(Roedo);

        barramenu.add(jMenu1);

        menuUsuario.setText("Abarrotes");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Alimento");
        menuUsuario.add(jCheckBoxMenuItem1);

        jMenuItem1.setText("Limpieza");
        menuUsuario.add(jMenuItem1);

        barramenu.add(menuUsuario);

        jMenu5.setText("Otro");
        barramenu.add(jMenu5);

        setJMenuBar(barramenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FamTortuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamTortuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FamTortuActionPerformed

    private void CocodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CocodActionPerformed

    private void AracniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AracniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AracniActionPerformed

    private void CrustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrustaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrustaActionPerformed

    private void SaposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaposActionPerformed

    private void PAguaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAguaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAguaDActionPerformed

    private void OsosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OsosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aracni;
    private javax.swing.JMenuItem AvesNV;
    private javax.swing.JMenuItem AvesV;
    private javax.swing.JMenuItem Balle;
    private javax.swing.JMenuItem Bison;
    private javax.swing.JMenuItem Camal;
    private javax.swing.JMenuItem Cangu;
    private javax.swing.JMenuItem Capi;
    private javax.swing.JMenuItem Cebras;
    private javax.swing.JMenuItem Cocod;
    private javax.swing.JMenuItem Coyo;
    private javax.swing.JMenuItem Crusta;
    private javax.swing.JMenuItem Delfi;
    private javax.swing.JMenuItem Elef;
    private javax.swing.JMenu FamAnfi;
    private javax.swing.JMenu FamCan;
    private javax.swing.JMenu FamFeli;
    private javax.swing.JMenu FamMarsu;
    private javax.swing.JMenu FamOso;
    private javax.swing.JMenu FamPez;
    private javax.swing.JMenuItem FamTortu;
    private javax.swing.JMenuItem FeliP;
    private javax.swing.JMenuItem FeliV;
    private javax.swing.JMenuItem Focas;
    private javax.swing.JMenuItem Hienas;
    private javax.swing.JMenuItem Hipo;
    private javax.swing.JMenuItem Igua;
    private javax.swing.JMenuItem Insec;
    private javax.swing.JMenuItem Jiraf;
    private javax.swing.JMenuItem Koalas;
    private javax.swing.JMenuItem LeoMar;
    private javax.swing.JMenuItem Lobos;
    private javax.swing.JMenu MamAcua;
    private javax.swing.JMenu MamTer;
    private javax.swing.JMenuItem Manta;
    private javax.swing.JMenuItem Miria;
    private javax.swing.JMenuItem Osos;
    private javax.swing.JMenuItem PAguaD;
    private javax.swing.JMenuItem PDPra;
    private javax.swing.JMenuItem PaAguaS;
    private javax.swing.JMenuItem Ranas;
    private javax.swing.JMenuItem Rino;
    private javax.swing.JMenu Roedo;
    private javax.swing.JMenuItem Salam;
    private javax.swing.JMenuItem Sapos;
    private javax.swing.JMenuItem Serp;
    private javax.swing.JMenuItem Tibu;
    private javax.swing.JMenu artro;
    private javax.swing.JMenu aves;
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JMenuItem itemIngresar;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JLabel mlmBienvenidos;
    private javax.swing.JPanel panelColor;
    private javax.swing.JMenu repti;
    // End of variables declaration//GEN-END:variables
}