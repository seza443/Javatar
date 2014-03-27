package vue;

import controleur.Controleur;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import modele.Avatar;
import modele.Composant;
import modele.MagasinBoucheFemme;
import modele.MagasinBoucheHomme;
import modele.MagasinCheveuxFemme;
import modele.MagasinCheveuxHomme;
import modele.MagasinNezFemme;
import modele.MagasinNezHomme;
import modele.MagasinYeuxFemme;
import modele.MagasinYeuxHomme;

/**
 * Classe responsable des interactions avec l'utilisateurs. Affiche les
 * différents éléments graphiques et les boutons. Contient les actionListener
 * des boutons et appelle les méthodes du controleur appropriées.
 *
 * @author Tanguy
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    Controleur controleur;

    /**
     * Creates new form FenetrePrincipale
     *
     * @param c controleur
     */
    public FenetrePrincipale(Controleur c) {
        controleur = c;

        //Le code suivant a été copié-collé depuis la fenetre générée en mode design
        //ce code a également subi quelques modifications pour l'élément jPanelAvatar notament en déplaçant le code responsable des différentes contraintes sur ce panneau dans la classe privée jPanelAvatar
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jLabelFooter = new javax.swing.JLabel();
        jPanelAccueil = new javax.swing.JPanel();
        jLabelBienvenue = new javax.swing.JLabel();
        jButtonImporter = new javax.swing.JButton();
        jButtonNouveau = new javax.swing.JButton();
        jPanelEdition = new javax.swing.JPanel();
        jTabbedPanePalette = new javax.swing.JTabbedPane();
        jPanelPaletteCheveux = new JPanel();
        jPanePaletteYeux = new JPanel();
        jPanePaletteNez = new JPanel();
        jPanelPaletteBouches = new JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButtonSave = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButtonExport = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButtonHomme = new javax.swing.JButton();
        jButtonFemme = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFichier = new javax.swing.JMenu();
        jMenuItemNouveau = new javax.swing.JMenuItem();
        jMenuItemImporter = new javax.swing.JMenuItem();
        jMenuItemSauvegarder = new javax.swing.JMenuItem();
        jMenuItemExporter = new javax.swing.JMenuItem();
        jMenuItemQuitter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                controleur.quitter();
            }
        });
        setTitle("Avatar Creator");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 550));

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setLayout(new java.awt.BorderLayout());

        jLabelTitre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitre.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 24)); // NOI18N
        jLabelTitre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitre.setText("Création d'avatar");
        jLabelTitre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanelPrincipal.add(jLabelTitre, java.awt.BorderLayout.NORTH);

        jLabelFooter.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFooter.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelFooter.setForeground(new java.awt.Color(153, 153, 153));
        jLabelFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFooter.setText("Application développée par Tanguy Vaessen");
        jLabelFooter.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelFooter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jLabelFooter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelFooter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelPrincipal.add(jLabelFooter, java.awt.BorderLayout.SOUTH);

        jPanelAccueil.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAccueil.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelAccueil.setLayout(new java.awt.GridBagLayout());

        jLabelBienvenue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenue.setText("Bienvenue dans la création d'avatar. Sélectionner une option ci-dessous pour commencer.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 39);
        jPanelAccueil.add(jLabelBienvenue, gridBagConstraints);

        jButtonImporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/icon/importer.png"))); // NOI18N
        jButtonImporter.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Importer", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 102, 255)));
        jButtonImporter.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImporterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 135, 75, 0);
        jPanelAccueil.add(jButtonImporter, gridBagConstraints);

        jButtonNouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/icon/creer.png"))); // NOI18N
        jButtonNouveau.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nouveau", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 102, 255)));
        jButtonNouveau.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNouveauActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 46, 75, 0);
        jPanelAccueil.add(jButtonNouveau, gridBagConstraints);

        jPanelPrincipal.add(jPanelAccueil, java.awt.BorderLayout.CENTER);

        jPanelEdition.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEdition.setLayout(new java.awt.GridBagLayout());

        //--------------------------------------------
        //NAM: propriétés des panel Palettes...
        //--------------------------------------------
        jPanelPaletteCheveux.setBackground(new java.awt.Color(255, 255, 255));
        jPanePaletteYeux.setBackground(new java.awt.Color(255, 255, 255));
        jPanePaletteNez.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPaletteBouches.setBackground(new java.awt.Color(255, 255, 255));

        jPanelPaletteCheveux.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY, 1));
        jPanePaletteYeux.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY, 1));
        jPanePaletteNez.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY, 1));
        jPanelPaletteBouches.setBorder(javax.swing.BorderFactory.createLineBorder(Color.GRAY, 1));

        jPanelPaletteCheveux.setLayout(new FlowLayout());
        jPanePaletteYeux.setLayout(new FlowLayout());
        jPanePaletteNez.setLayout(new FlowLayout());
        jPanelPaletteBouches.setLayout(new FlowLayout());

        jPanelPaletteCheveux.setAutoscrolls(true);
        jPanePaletteYeux.setAutoscrolls(true);
        jPanePaletteNez.setAutoscrolls(true);
        jPanelPaletteBouches.setAutoscrolls(true);

        jPanelPaletteCheveux.setMaximumSize(new java.awt.Dimension(360, 340));
        jPanelPaletteCheveux.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanelPaletteCheveux.setPreferredSize(new Dimension(355, 310));

        jPanePaletteYeux.setMaximumSize(new java.awt.Dimension(360, 340));
        jPanePaletteYeux.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanePaletteYeux.setPreferredSize(new Dimension(355, 310));

        jPanePaletteNez.setMaximumSize(new java.awt.Dimension(360, 340));
        jPanePaletteNez.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanePaletteNez.setPreferredSize(new Dimension(355, 310));

        jPanelPaletteBouches.setMaximumSize(new java.awt.Dimension(360, 340));
        jPanelPaletteBouches.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanelPaletteBouches.setPreferredSize(new Dimension(355, 310));


        //--------------------------------------------
        //--------------------------------------------

        jTabbedPanePalette.addTab("Cheveux", jPanelPaletteCheveux);
        jTabbedPanePalette.addTab("Yeux", jPanePaletteYeux);
        jTabbedPanePalette.addTab("Nez", jPanePaletteNez);
        jTabbedPanePalette.addTab("Bouche", jPanelPaletteBouches);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 233;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 63, 0, 0);
        jPanelEdition.add(jTabbedPanePalette, gridBagConstraints);
        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.add(filler2);

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/icon/sauver.png"))); // NOI18N
        jButtonSave.setFocusable(false);
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSave);
        jToolBar1.add(filler3);

        jButtonExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/icon/export.png"))); // NOI18N
        jButtonExport.setFocusable(false);
        jButtonExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExport.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExporterActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonExport);
        jToolBar1.add(filler1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = -7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 92, 39, 146);
        jPanelEdition.add(jToolBar1, gridBagConstraints);

        jButtonHomme.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonHomme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/icon/homme-mini.png"))); // NOI18N
        jButtonHomme.setText("Homme");
        jButtonHomme.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHommeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 92, 0, 0);
        jPanelEdition.add(jButtonHomme, gridBagConstraints);

        jButtonFemme.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonFemme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/icon/femme-mini.png"))); // NOI18N
        jButtonFemme.setText("Femme");
        jButtonFemme.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFemmeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 8, 0, 146);
        jPanelEdition.add(jButtonFemme, gridBagConstraints);

        jPanelPrincipal.add(jPanelEdition, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        jMenuFichier.setText("File");

        jMenuItemNouveau.setText("Nouveau avatar");
        jMenuItemNouveau.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNouveauActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemNouveau);

        jMenuItemImporter.setText("Importer avatar");
        jMenuItemImporter.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImporterActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemImporter);

        jMenuItemSauvegarder.setText("Sauvegarder");
        jMenuItemSauvegarder.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSauvegarderActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemSauvegarder);

        jMenuItemExporter.setText("Exporter");
        jMenuItemExporter.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExporterActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemExporter);

        jMenuItemQuitter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemQuitter.setText("Quitter");
        jMenuItemQuitter.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitterActionPerformed(evt);
            }
        });
        jMenuFichier.add(jMenuItemQuitter);

        jMenuBar.add(jMenuFichier);

        setJMenuBar(jMenuBar);

        avatarPreview = new AvatarPreview();
        java.awt.GridBagConstraints gridBagConstraints2 = avatarPreview.init();
        jPanelEdition.add(avatarPreview, gridBagConstraints2);
        pack();
    }// </editor-fold>

    /**
     * Méthode actionListener du bouton "importer" du menu
     *
     * @param evt
     */
    private void jMenuItemImporterActionPerformed(java.awt.event.ActionEvent evt) {
        this.jButtonImporterActionPerformed(evt);
    }

    private void ExporterActionPerformed(java.awt.event.ActionEvent evt) {
        controleur.exporter();
    }

    /**
     * Méthode actionListener du bouton "sauvegarder" du menu
     *
     * @param evt
     */
    private void jMenuItemSauvegarderActionPerformed(java.awt.event.ActionEvent evt) {
        this.jButtonSaveActionPerformed(evt);
    }

    /**
     * Méthode actionListener du bouton "nouveau" du menu
     *
     * @param evt
     */
    private void jMenuItemNouveauActionPerformed(java.awt.event.ActionEvent evt) {
        this.jButtonNouveauActionPerformed(evt);
    }

    /**
     * Méthode actionListener du bouton "importer" de la fenetre
     *
     * @param evt
     */
    private void jButtonImporterActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO code d'importation (from bouton)
        controleur.importer();
    }

    /**
     * Appelé lorsque le bouton "créer nouveau avatar" est enfoncé.
     *
     * @param evt
     */
    private void jButtonNouveauActionPerformed(java.awt.event.ActionEvent evt) {
        controleur.nouvelAvatar();
        controleur.panneauEdition(true);
    }

    /**
     * Quitter le programme
     *
     * @param evt
     */
    private void jMenuItemQuitterActionPerformed(java.awt.event.ActionEvent evt) {
        controleur.quitter();
    }

    /**
     * Méthode actionListener du bouton "sauvegarder" de la fenetre
     *
     * @param evt
     */
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {
        controleur.sauver();
    }

    /**
     * Choix sexe homme
     *
     * @param evt
     */
    private void jButtonHommeActionPerformed(java.awt.event.ActionEvent evt) {
        controleur.hommeButton();
    }

    /**
     * Choix sexe femme
     *
     * @param evt
     */
    private void jButtonFemmeActionPerformed(java.awt.event.ActionEvent evt) {
        controleur.femmeButton();
    }

    /**
     * Rend visible ou invisible le jPanel Accueil
     *
     * @param visible true pour rendre visible et false pour rendre invisible
     */
    public void panneauAccueil(boolean visible) {
        this.jPanelAccueil.setVisible(visible);
        if (!visible) {
            jPanelPrincipal.remove(jPanelAccueil);
        } else {
            jPanelPrincipal.add(jPanelAccueil);
        }
    }

    /**
     * Rend visible ou invisible le jPanel Edition avatar
     *
     * @param visible true pour rendre visible et false pour rendre invisible
     */
    public void panneauEdition(boolean visible) {
        this.jPanelEdition.setVisible(visible);
        if (!visible) {
            jPanelPrincipal.remove(jPanelEdition);
        } else {
            jPanelPrincipal.add(jPanelEdition);
        }
    }
    // Variables declaration
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButtonExport;
    private javax.swing.JButton jButtonFemme;
    private javax.swing.JButton jButtonHomme;
    private javax.swing.JButton jButtonImporter;
    private javax.swing.JButton jButtonNouveau;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelBienvenue;
    private javax.swing.JLabel jLabelFooter;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFichier;
    private javax.swing.JMenuItem jMenuItemExporter;
    private javax.swing.JMenuItem jMenuItemImporter;
    private javax.swing.JMenuItem jMenuItemNouveau;
    private javax.swing.JMenuItem jMenuItemQuitter;
    private javax.swing.JMenuItem jMenuItemSauvegarder;
    private javax.swing.JPanel jPanelAccueil;
    private javax.swing.JPanel jPanelEdition;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTabbedPane jTabbedPanePalette;
    private JPanel jPanelPaletteBouches;
    private JPanel jPanelPaletteCheveux;
    private JPanel jPanePaletteNez;
    private JPanel jPanePaletteYeux;
    private javax.swing.JToolBar jToolBar1;
    private AvatarPreview avatarPreview;
    // End of variables declaration

    /**
     * Classe AvatarPreview JPanel affichant l'avatar implemente observer pour
     * le rafraichissement de la vue Représente graphiquement l'avatar.
     */
    private class AvatarPreview extends JPanel implements Observer {

        private Avatar avatar;
        java.awt.GridBagConstraints gridBagConstraints2; //défini ses propres contraintes, copiées-collées du mode design.

        public AvatarPreview() {
            this.setBackground(new java.awt.Color(255, 255, 255));
            //this.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avatar preview", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
            this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            this.setMaximumSize(new java.awt.Dimension(180, 180));
            this.setMinimumSize(new java.awt.Dimension(180, 180));
            this.setOpaque(true);
            this.setPreferredSize(new java.awt.Dimension(180, 180));
        }

        /**
         * Permet de définir les contraintes nécessaires au bon placement des
         * panneaux dans le layout GridBagLayout (reprises de la génération
         * automatique)
         *
         * @return les contraintes.
         */
        public GridBagConstraints init() {
            gridBagConstraints2 = new java.awt.GridBagConstraints();
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            gridBagConstraints2.gridwidth = 2;
            gridBagConstraints2.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints2.insets = new java.awt.Insets(68, 92, 0, 146);
            return this.gridBagConstraints2;
        }

        /**
         * Appelée à chaque modification de l'avatar. Rafraichit la vue.
         *
         * @param o
         * @param arg
         */
        @Override
        public void update(Observable o, Object arg) {
            /*
            //essai pour equals et toString
            try {
                System.out.println(avatar.toString());
                if (avatar.equals(o)) {
                    System.out.println("Avatar égaux");
                } else {
                    System.out.println("Avatar pas égaux");
                }
            } catch (NullPointerException ex) {
                
            }
            */
            avatar = (Avatar) o;
            this.repaint();
        }

        /**
         * Redessine le panneau
         *
         * @param g
         */
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (avatar != null) {
                for (Composant composant : avatar.getComposants().values()) {
                    g.drawImage(composant.getImage(), 0, 0, null);
                }
            }
        }
    }

    /**
     *
     * @return Le panneau à placer en observer dans la classe Avatar
     */
    public AvatarPreview getAvatarPreview() {
        return avatarPreview;
    }

    /**
     * Bouton personnalisés, contenant une référence vers un Composant. Utilisé
     * dans les différentes palettes de Composants.
     */
    private class BoutonComposant extends JButton {

        private Composant composant;

        /**
         * constructeur par défaut vide qui contiendra un composant affichant un
         * '?'
         */
        public BoutonComposant() {
            composant = new Composant("none", "none", "none");
        }

        /**
         * Constructeur
         *
         * @param composant le composant à référencer
         */
        public BoutonComposant(Composant composant) {
            this.composant = composant;
            this.setSize(180, 180);
            this.setBackground((new java.awt.Color(255, 255, 255)));
            this.setIcon(new ImageIcon(composant.getCheminIcon()));
        }

        /**
         * retourne le composant contenu dans le bouton
         *
         * @return le composant
         */
        public Composant getComposant() {
            return this.composant;
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS CHEVEUX HOMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinCheveux(MagasinCheveuxHomme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanelPaletteCheveux.add(bouton);
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS CHEVEUX FEMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinCheveux(MagasinCheveuxFemme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanelPaletteCheveux.add(bouton);
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS YEUX HOMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinYeux(MagasinYeuxHomme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanePaletteYeux.add(bouton);
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS YEUX FEMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinYeux(MagasinYeuxFemme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanePaletteYeux.add(bouton);
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS NEZ HOMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinNez(MagasinNezHomme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanePaletteNez.add(bouton);
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS NEZ FEMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinNez(MagasinNezFemme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanePaletteNez.add(bouton);
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS BOUCHE HOMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinBouche(MagasinBoucheHomme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanelPaletteBouches.add(bouton);
        }
    }

    /**
     * METHODES D'AJOUT DE MAGASINS BOUCHE FEMME AUX PALETTES.
     *
     * @param magasin magasin à ajouter à la palette
     */
    public void ajouterMagasinBouche(MagasinBoucheFemme magasin) {
        for (Composant composant : magasin.getListeComposant()) {
            final BoutonComposant bouton = new BoutonComposant(composant);
            bouton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifierComposant(bouton.getComposant());
                }
            });
            jPanelPaletteBouches.add(bouton);
        }
    }

    /**
     * Modifie les composants de l'avatar.
     *
     * @param composant composant à modifier
     */
    public void modifierComposant(Composant composant) {
        controleur.modiferComposant(composant);
    }

    /**
     * Retire tous les boutons présents dans les palettes.
     */
    public void viderPalettes() {
        jPanePaletteNez.removeAll();
        jPanePaletteYeux.removeAll();
        jPanelPaletteBouches.removeAll();
        jPanelPaletteCheveux.removeAll();
    }

    /**
     * Redessine les palettes de Composants.
     */
    public void redessinerPalettes() {
        jTabbedPanePalette.repaint();
    }
}
