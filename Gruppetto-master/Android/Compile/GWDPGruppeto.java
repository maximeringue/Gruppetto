/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Projet
 * Classe Android : Gruppeto
 * Date : 11/12/2019 18:41:40
 * Version de wdjava.dll  : 24.0.254.7
 */


package com.masociete.gruppeto.wdgen;


import com.masociete.gruppeto.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPGruppeto extends WDProjet
{
/**
 * Accès au projet: Gruppeto
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPGruppeto.getInstance()
 */
public static GWDPGruppeto getInstance()
{
return (GWDPGruppeto) ms_instance;
}

 // Inscription
public GWDFInscription mWD_Inscription = new GWDFInscription();
 // accesseur de Inscription
public GWDFInscription getInscription()
{
mWD_Inscription.checkOuverture();
return mWD_Inscription;
}

 // FEN_Login
public GWDFFEN_Login mWD_FEN_Login = new GWDFFEN_Login();
 // accesseur de FEN_Login
public GWDFFEN_Login getFEN_Login()
{
mWD_FEN_Login.checkOuverture();
return mWD_FEN_Login;
}

 // Menu
public GWDFMenu mWD_Menu = new GWDFMenu();
 // accesseur de Menu
public GWDFMenu getMenu()
{
mWD_Menu.checkOuverture();
return mWD_Menu;
}

 // Fen_carte
public GWDFFen_carte mWD_Fen_carte = new GWDFFen_carte();
 // accesseur de Fen_carte
public GWDFFen_carte getFen_carte()
{
mWD_Fen_carte.checkOuverture();
return mWD_Fen_carte;
}

 // Profil
public GWDFProfil mWD_Profil = new GWDFProfil();
 // accesseur de Profil
public GWDFProfil getProfil()
{
mWD_Profil.checkOuverture();
return mWD_Profil;
}

 // Liste_Event
public GWDFListe_Event mWD_Liste_Event = new GWDFListe_Event();
 // accesseur de Liste_Event
public GWDFListe_Event getListe_Event()
{
mWD_Liste_Event.checkOuverture();
return mWD_Liste_Event;
}

 // Menu_Modo
public GWDFMenu_Modo mWD_Menu_Modo = new GWDFMenu_Modo();
 // accesseur de Menu_Modo
public GWDFMenu_Modo getMenu_Modo()
{
mWD_Menu_Modo.checkOuverture();
return mWD_Menu_Modo;
}

 // modif_profil
public GWDFmodif_profil mWD_modif_profil = new GWDFmodif_profil();
 // accesseur de modif_profil
public GWDFmodif_profil getmodif_profil()
{
mWD_modif_profil.checkOuverture();
return mWD_modif_profil;
}

 // Recherche_Profil
public GWDFRecherche_Profil mWD_Recherche_Profil = new GWDFRecherche_Profil();
 // accesseur de Recherche_Profil
public GWDFRecherche_Profil getRecherche_Profil()
{
mWD_Recherche_Profil.checkOuverture();
return mWD_Recherche_Profil;
}

 // Fen_Messages
public GWDFFen_Messages mWD_Fen_Messages = new GWDFFen_Messages();
 // accesseur de Fen_Messages
public GWDFFen_Messages getFen_Messages()
{
mWD_Fen_Messages.checkOuverture();
return mWD_Fen_Messages;
}

 // Fen_LieuUtil
public GWDFFen_LieuUtil mWD_Fen_LieuUtil = new GWDFFen_LieuUtil();
 // accesseur de Fen_LieuUtil
public GWDFFen_LieuUtil getFen_LieuUtil()
{
mWD_Fen_LieuUtil.checkOuverture();
return mWD_Fen_LieuUtil;
}

 // Fen_Visit
public GWDFFen_Visit mWD_Fen_Visit = new GWDFFen_Visit();
 // accesseur de Fen_Visit
public GWDFFen_Visit getFen_Visit()
{
mWD_Fen_Visit.checkOuverture();
return mWD_Fen_Visit;
}

 // FEN_L_Util
public GWDFFEN_L_Util mWD_FEN_L_Util = new GWDFFEN_L_Util();
 // accesseur de FEN_L_Util
public GWDFFEN_L_Util getFEN_L_Util()
{
mWD_FEN_L_Util.checkOuverture();
return mWD_FEN_L_Util;
}

 // FEN_LLieu
public GWDFFEN_LLieu mWD_FEN_LLieu = new GWDFFEN_LLieu();
 // accesseur de FEN_LLieu
public GWDFFEN_LLieu getFEN_LLieu()
{
mWD_FEN_LLieu.checkOuverture();
return mWD_FEN_LLieu;
}

 // FEN_PEvent
public GWDFFEN_PEvent mWD_FEN_PEvent = new GWDFFEN_PEvent();
 // accesseur de FEN_PEvent
public GWDFFEN_PEvent getFEN_PEvent()
{
mWD_FEN_PEvent.checkOuverture();
return mWD_FEN_PEvent;
}

 // Fen_LEvent
public GWDFFen_LEvent mWD_Fen_LEvent = new GWDFFen_LEvent();
 // accesseur de Fen_LEvent
public GWDFFen_LEvent getFen_LEvent()
{
mWD_Fen_LEvent.checkOuverture();
return mWD_Fen_LEvent;
}

 // Créer_un_évènement
public GWDFCreer_un_evenement mWD_Creer_un_evenement = new GWDFCreer_un_evenement();
 // accesseur de Créer_un_évènement
public GWDFCreer_un_evenement getCreer_un_evenement()
{
mWD_Creer_un_evenement.checkOuverture();
return mWD_Creer_un_evenement;
}

 // Fen_LieuUtil2
public GWDFFen_LieuUtil2 mWD_Fen_LieuUtil2 = new GWDFFen_LieuUtil2();
 // accesseur de Fen_LieuUtil2
public GWDFFen_LieuUtil2 getFen_LieuUtil2()
{
mWD_Fen_LieuUtil2.checkOuverture();
return mWD_Fen_LieuUtil2;
}


 // Constructeur de la classe GWDPGruppeto
public GWDPGruppeto()
{
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0x394AE1, 0x26A0FA, 0x6DBC61, 0x85A800, 0xD2AC54, 0xC9822B, 0xA95CF8, 0xB86592, 0xB74A5E, 0x654E44, 0xA5A595});
ajouterFenetre("Inscription", mWD_Inscription);
ajouterFenetre("FEN_Login", mWD_FEN_Login);
ajouterFenetre("Menu", mWD_Menu);
ajouterFenetre("Fen_carte", mWD_Fen_carte);
ajouterFenetre("Profil", mWD_Profil);
ajouterFenetre("Liste_Event", mWD_Liste_Event);
ajouterFenetre("Menu_Modo", mWD_Menu_Modo);
ajouterFenetre("modif_profil", mWD_modif_profil);
ajouterFenetre("Recherche_Profil", mWD_Recherche_Profil);
ajouterFenetre("Fen_Messages", mWD_Fen_Messages);
ajouterFenetre("Fen_LieuUtil", mWD_Fen_LieuUtil);
ajouterFenetre("Fen_Visit", mWD_Fen_Visit);
ajouterFenetre("FEN_L_Util", mWD_FEN_L_Util);
ajouterFenetre("FEN_LLieu", mWD_FEN_LLieu);
ajouterFenetre("FEN_PEvent", mWD_FEN_PEvent);
ajouterFenetre("Fen_LEvent", mWD_Fen_LEvent);
ajouterFenetre("Créer_un_évènement", mWD_Creer_un_evenement);
ajouterFenetre("Fen_LieuUtil2", mWD_Fen_LieuUtil2);



}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
public String getVersionApplication(){ return "0.0.97.0";}
public String getNomSociete(){ return "";}
public String getNomAPK(){ return "Gruppetto";}
public int getIdNomApplication(){return com.masociete.gruppeto.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.gruppeto";}
public int getIdIconeApplication(){ return com.masociete.gruppeto.R.drawable.a0823335_550281969156625_7746811294656757760_n__1__0;}
public String getCleGoogleMapsApi()
{
return "AIzaSyD6gi8yVL3LUvTnOlk7xfEUWyLaxjWSbLk";
}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 480;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "Gruppeto";
}
public String getNomConfiguration()
{
return "Gruppetto";
}
public String getNomAnalyse()
{
return "";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\LISTE.PNG?E5",com.masociete.gruppeto.R.drawable.liste_18_selector+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\CRÉER.PNG?E5",com.masociete.gruppeto.R.drawable.creer_17_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\PROFIL.PNG?E5",com.masociete.gruppeto.R.drawable.profil_16_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\LIEU.PNG?E5",com.masociete.gruppeto.R.drawable.lieu_15_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\JOUER.PNG?E5",com.masociete.gruppeto.R.drawable.jouer_14_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\ENTETE-BCKGRD.PNG",com.masociete.gruppeto.R.drawable.entete_bckgrd_13+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\DÉCO.PNG?E5",com.masociete.gruppeto.R.drawable.deco_12_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\CARTE1.PNG?E5",com.masociete.gruppeto.R.drawable.carte1_11_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\ADMIN.PNG?E5",com.masociete.gruppeto.R.drawable.admin_10_selector+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\69859915_735420500276264_4892531954227871744_N.PNG",com.masociete.gruppeto.R.drawable.a9859915_735420500276264_4892531954227871744_n_9+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\LOUPE.PNG?E5",com.masociete.gruppeto.R.drawable.loupe_8_selector+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\GABARITS\\WM\\230 IGRAM\\IGRAM_TABLE_COLPICT.PNG",com.masociete.gruppeto.R.drawable.igram_table_colpict_7+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\GABARITS\\WM\\230 IGRAM\\IGRAM_ROLLOVER.PNG",com.masociete.gruppeto.R.drawable.igram_rollover_6+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\GABARITS\\WM\\230 IGRAM\\IGRAM_CBOX_TABLE.PNG",com.masociete.gruppeto.R.drawable.igram_cbox_table_5+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\GABARITS\\WM\\230 IGRAM\\IGRAM_BREAK_PICT.PNG?E2_",com.masociete.gruppeto.R.drawable.igram_break_pict_4_selector+23, "");
super.ajouterFichierAssocie("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\GABARITS\\WM\\230 IGRAM\\IGRAM_BREAK.PNG",com.masociete.gruppeto.R.drawable.igram_break_3+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\GABARITS\\WM\\230 IGRAM\\IGRAM_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.gruppeto.R.drawable.igram_edt_2_np3_8_8_8_8_selector+23, "");
super.ajouterFichierAssocie("C:\\USERS\\MAXRI\\DESKTOP\\GRUPPETTO-MASTER\\GABARITS\\WM\\230 IGRAM\\IGRAM_BTN_STD.PNG?E5_3NP_10_10_10_10",com.masociete.gruppeto.R.drawable.igram_btn_std_1_np3_10_10_10_10_selector+23, "");
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPGruppeto.class;
}
}
}
