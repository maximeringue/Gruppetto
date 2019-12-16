/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Fenêtre
 * Classe Android : Fen_Messages
 * Date : 11/12/2019 15:41:09
 * Version de wdjava.dll  : 24.0.254.7
 */


package com.masociete.gruppeto.wdgen;


import com.masociete.gruppeto.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.table.*;
import fr.pcsoft.wdjava.ui.champs.table.colonne.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.json.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.pulltorefresh.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFen_Messages extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de Fen_Messages
////////////////////////////////////////////////////////////////////////////

/**
 * lib_lieu
 */
class GWDlib_lieu extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Fen_Messages.lib_lieu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309312592781396976l);

super.setChecksum("895703949");

super.setNom("lib_lieu");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Lieu");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 73);

super.setTailleInitiale(28, 156);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -11.000000, 1), 3, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDlib_lieu mWD_lib_lieu;

/**
 * tab_mess
 */
class GWDtab_mess extends WDTable
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Fen_Messages.tab_mess
////////////////////////////////////////////////////////////////////////////

/**
 * prenom
 */
class GWDprenom extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Fen_Messages.tab_mess.prenom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313202672400797l);

super.setNom("prenom");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(160);

super.setTitre("prenom");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDprenom mWD_prenom = new GWDprenom();

/**
 * message
 */
class GWDmessage extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Fen_Messages.tab_mess.message
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313202672531869l);

super.setNom("message");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(160);

super.setTitre("message");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDmessage mWD_message = new GWDmessage();
/**
 * Initialise tous les champs de Fen_Messages.tab_mess
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Fen_Messages.tab_mess
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("prenom",mWD_prenom);
super.ajouterColonne("message",mWD_message);
mWD_prenom.initialiserObjet();
mWD_message.initialiserObjet();

}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313202672204174l);

super.setChecksum("901157993");

super.setNom("tab_mess");

super.setType(9);

super.setBulle("");

super.setLibelle("Table");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(44, 0);

super.setTailleInitiale(202, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setTailleCellule(42, 3, 3, 3, 3, 0);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setNumColonneAncree(1);

super.setEnregistrementSortieLigne(true);

super.setPersistant(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xDBDBDB);

super.setStyleSeparateurHorizontaux(0, 0xDBDBDB);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0xDBDBDB, 0x5B5B5B, 0xCDCBC9, 2.000000, 2.000000, 1, 1));

super.setDessinerLigneVide(true);

super.setCouleursLigne(0x262626, 0xCDCBC9, 0x262626, 0xFFFFFF);

super.setStyleSelection(0x262626, 0xEFEFEF, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleEnteteColonne(28, 1, WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0xFFFFFF, 2.000000, 2.000000, 1, 1), creerPolice_GEN("Roboto", -8.000000, 0), 0x262626, true, "C:\\Users\\maxri\\Desktop\\Gruppetto-master\\Gabarits\\WM\\230 iGram\\iGram_Table_ColPict@dpi1x.png");

super.setCadreFondLigne(WDCadreFactory.creerCadre_GEN("", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 0xFFFFFFFF, 0, 5));

super.setPoliceColonne(creerPolice_GEN("Roboto", -8.000000, 0));

super.setScrollRapideTable(false, null);

super.setBtnEnrouleDeroule(true);

super.setSwipe(0);

super.setNbMaxLignes(0);

super.setImagePlusMoins("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\Gabarits\\WM\\230 iGram\\iGram_Break_Pict@dpi1x.png?E2_");

super.setMargeInterneEnteteColonne(0, 0, 0, 0);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}
protected final int getIdEnteteAt(int nColonne, int nLigne) {return 0;}
protected final String getLibelleEnteteFromId(int nId) {return null;}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDtab_mess mWD_tab_mess;

/**
 * txt_mess
 */
class GWDtxt_mess extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de Fen_Messages.txt_mess
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,304,20);
super.setRectCompPrincipal(0,20,302,41);
super.setQuid(3309313275692432374l);

super.setChecksum("906938986");

super.setNom("txt_mess");

super.setType(20001);

super.setBulle("");

super.setLibelle("Votre message");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(272, 8);

super.setTailleInitiale(63, 304);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(1, 0, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\Gabarits\\WM\\230 iGram\\iGram_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xDBDBDB, 0x5B5B5B, 0xFFFFFF, 4.000000, 4.000000, 1, 1), 0x262626, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDtxt_mess mWD_txt_mess;

/**
 * btn_val
 */
class GWDbtn_val extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de Fen_Messages.btn_val
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313310056831782l);

super.setChecksum("911600946");

super.setNom("btn_val");

super.setType(4);

super.setBulle("");

super.setLibelle("Envoyer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(351, 79);

super.setTailleInitiale(48, 162);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(1, 0, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0xDBDBDB, 0x5B5B5B, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0xDBDBDB, 0x5B5B5B, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0xDBDBDB, 0x5B5B5B, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\Gabarits\\WM\\230 iGram\\iGram_Btn_Std@dpi1x.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur btn_val
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// envoi()
fWD_envoi();

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDbtn_val mWD_btn_val;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de Fen_Messages.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308459148577701265l);

super.setChecksum("1053263098");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(96, 96);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ Fen_Messages.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de Fen_Messages
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  init ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_init()
{
initExecProcLocale("init");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_cMaRequete = WDVarNonAllouee.ref;
WDObjet vWD_cMaRequete2 = WDVarNonAllouee.ref;
WDObjet vWD_cMaRequete3 = WDVarNonAllouee.ref;
WDObjet vWD_cMaReponse = WDVarNonAllouee.ref;
WDObjet vWD_vCTest = new WDVariant();

WDObjet vWD_cMaReponse2 = WDVarNonAllouee.ref;
WDObjet vWD_vCTest2 = new WDVariant();

WDObjet vWD_cMaReponse3 = WDVarNonAllouee.ref;
WDObjet vWD_vCTest3 = new WDVariant();



// cMaRequete est un restRequête
vWD_cMaRequete = new WDInstance( new WDHTTPRequete() );


// cMaRequete..Méthode = httpGet
vWD_cMaRequete.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete..URL = "https://gruppeto-91fd3.firebaseio.com/Utilisateur.json"
vWD_cMaRequete.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Utilisateur.json");

// cMaRequete2 est un restRequête
vWD_cMaRequete2 = new WDInstance( new WDHTTPRequete() );


// cMaRequete2..Méthode = httpGet
vWD_cMaRequete2.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete2..URL = "https://gruppeto-91fd3.firebaseio.com/Message.json"
vWD_cMaRequete2.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Message.json");

// cMaRequete3 est un restRequête
vWD_cMaRequete3 = new WDInstance( new WDHTTPRequete() );


// cMaRequete3..Méthode = httpGet
vWD_cMaRequete3.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete3..URL = "https://gruppeto-91fd3.firebaseio.com/Lieu.json"
vWD_cMaRequete3.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Lieu.json");

// cMaReponse est un restRéponse = RESTEnvoie(cMaRequete)
vWD_cMaReponse = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete));


// vCTest est un Variant = JSONVersVariant(AnsiVersUnicode(cMaReponse..Contenu))

vWD_vCTest.setValeur(WDAPIVariant.jsonVersVariant(WDAPIChaine.ansiVersUnicode(vWD_cMaReponse.getProp(EWDPropriete.PROP_CONTENU))));


// cMaReponse2 est un restRéponse = RESTEnvoie(cMaRequete2)
vWD_cMaReponse2 = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponse2.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete2));


// vCTest2 est un Variant = JSONVersVariant(AnsiVersUnicode(cMaReponse2..Contenu))

vWD_vCTest2.setValeur(WDAPIVariant.jsonVersVariant(WDAPIChaine.ansiVersUnicode(vWD_cMaReponse2.getProp(EWDPropriete.PROP_CONTENU))));


// cMaReponse3 est un restRéponse = RESTEnvoie(cMaRequete3)
vWD_cMaReponse3 = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponse3.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete3));


// vCTest3 est un Variant = JSONVersVariant(AnsiVersUnicode(cMaReponse3..Contenu))

vWD_vCTest3.setValeur(WDAPIVariant.jsonVersVariant(WDAPIChaine.ansiVersUnicode(vWD_cMaReponse3.getProp(EWDPropriete.PROP_CONTENU))));


// SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	SI cMaReponse..Contenu = Vrai ALORS
if(vWD_cMaReponse.getProp(EWDPropriete.PROP_CONTENU).opEgal(true))
{
// 		Info("Le site a bien été mis à jour.")
WDAPIDialogue.info("Le site a bien été mis à jour.");

}
else
{
// 		tab_mess.SupprimeTout()
WDAPITable.tableSupprimeTout(mWD_tab_mess);

// 		POUR TOUT lieux DE vCTest3
IWDParcours parcours1 = null;
try
{
WDObjet vWD_lieux = WDParcoursFactory.creerVariableParcours(vWD_vCTest3);
parcours1 = WDParcoursFactory.pourTout(vWD_vCTest3, vWD_lieux, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 			SI lieux.idLieu..Valeur = idLieu ALORS
if(parcours1.getVariableParcours().get("idLieu").getProp(EWDPropriete.PROP_VALEUR).opEgal(vWD_idLieu))
{
// 				lib_lieu = lieux.nom..Valeur
mWD_lib_lieu.setValeur(parcours1.getVariableParcours().get("nom").getProp(EWDPropriete.PROP_VALEUR));

}

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// 		POUR TOUT Mess DE vCTest2
IWDParcours parcours2 = null;
try
{
WDObjet vWD_Mess = WDParcoursFactory.creerVariableParcours(vWD_vCTest2);
parcours2 = WDParcoursFactory.pourTout(vWD_vCTest2, vWD_Mess, null, null, null, 0x0, 0x2);
while(parcours2.testParcours())
{
// 			SI Mess.idLieu..Valeur = idLieu ALORS
if(parcours2.getVariableParcours().get("idLieu").getProp(EWDPropriete.PROP_VALEUR).opEgal(vWD_idLieu))
{
// 				POUR TOUT Util de vCTest
IWDParcours parcours3 = null;
try
{
WDObjet vWD_Util = WDParcoursFactory.creerVariableParcours(vWD_vCTest);
parcours3 = WDParcoursFactory.pourTout(vWD_vCTest, vWD_Util, null, null, null, 0x0, 0x2);
while(parcours3.testParcours())
{
// 					SI Util.idUtil..Valeur = Mess.idUtil..Valeur ALORS
if(parcours3.getVariableParcours().get("idUtil").getProp(EWDPropriete.PROP_VALEUR).opEgal(parcours2.getVariableParcours().get("idUtil").getProp(EWDPropriete.PROP_VALEUR)))
{
// 						tab_mess.AjouteLigne(Util.Prenom..Valeur, Mess.mess..Valeur)
WDAPITable.tableAjouteLigne(mWD_tab_mess,new Object[] {parcours3.getVariableParcours().get("Prenom").getProp(EWDPropriete.PROP_VALEUR),parcours2.getVariableParcours().get("mess").getProp(EWDPropriete.PROP_VALEUR)} );

}

}

}
finally
{
if(parcours3 != null)
{
parcours3.finParcours();
}
}


}

}

}
finally
{
if(parcours2 != null)
{
parcours2.finParcours();
}
}


}

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  envoi ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_envoi()
{
initExecProcLocale("envoi");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_cMaRequete = WDVarNonAllouee.ref;
WDObjet vWD_y = new WDEntier4();

WDObjet vWD_cMaReponse = WDVarNonAllouee.ref;
WDObjet vWD_vCTest = new WDVariant();



// cMaRequete est un restRequête
vWD_cMaRequete = new WDInstance( new WDHTTPRequete() );


// cMaRequete..Méthode = httpGet
vWD_cMaRequete.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete..URL = "https://gruppeto-91fd3.firebaseio.com/Message.json"
vWD_cMaRequete.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Message.json");

// y est un entier = 0

vWD_y.setValeur(0);


// cMaReponse est un restRéponse = RESTEnvoie(cMaRequete)
vWD_cMaReponse = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete));


// vCTest est un Variant = JSONVersVariant(AnsiVersUnicode(cMaReponse..Contenu))

vWD_vCTest.setValeur(WDAPIVariant.jsonVersVariant(WDAPIChaine.ansiVersUnicode(vWD_cMaReponse.getProp(EWDPropriete.PROP_CONTENU))));


// SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	SI cMaReponse..Contenu = Vrai ALORS
if(vWD_cMaReponse.getProp(EWDPropriete.PROP_CONTENU).opEgal(true))
{
// 		Info("Le site a bien été mis à jour.")
WDAPIDialogue.info("Le site a bien été mis à jour.");

}
else
{
// 		POUR TOUT mess DE vCTest
IWDParcours parcours4 = null;
try
{
WDObjet vWD_mess = WDParcoursFactory.creerVariableParcours(vWD_vCTest);
parcours4 = WDParcoursFactory.pourTout(vWD_vCTest, vWD_mess, null, null, null, 0x0, 0x2);
while(parcours4.testParcours())
{
// 			y++
vWD_y.opInc();

}

}
finally
{
if(parcours4 != null)
{
parcours4.finParcours();
}
}


// 			cMaRequete..Méthode = httpPost
vWD_cMaRequete.setProp(EWDPropriete.PROP_METHODE,2);

// 			envoie est un Variant
WDObjet vWD_envoie = new WDVariant();



// 			envoie.idUtil = id
vWD_envoie.get("idUtil").setValeur(vWD_id);

// 			envoie.idMess= 0
vWD_envoie.get("idMess").setValeur(0);

// 			envoie.idLieu = idLieu
vWD_envoie.get("idLieu").setValeur(vWD_idLieu);

// 			envoie.mess=txt_mess
vWD_envoie.get("mess").setValeur(mWD_txt_mess);

// 			tampon est un JSON = VariantVersJSON(envoie)
WDObjet vWD_tampon = WDVarNonAllouee.ref;
vWD_tampon = new WDInstance( new WDJSON() );

vWD_tampon.setValeur(WDAPIVariant.variantVersJSON(vWD_envoie));


// 			cMaRequete..Contenu= UnicodeVersAnsi(tampon)
vWD_cMaRequete.setProp(EWDPropriete.PROP_CONTENU,WDAPIChaine.UnicodeVersAnsi(vWD_tampon));

// 			cMonEnvoi est un httpRéponse = RESTEnvoie(cMaRequete)
WDObjet vWD_cMonEnvoi = WDVarNonAllouee.ref;
vWD_cMonEnvoi = new WDInstance( new WDHTTPReponse() );

vWD_cMonEnvoi.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete));


// 			SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 				Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 				Info("Message Envoyer")
WDAPIDialogue.info("Message Envoyer");

}

}

}

}
finally
{
finExecProcLocale();
}

}




/**
 * ActionBar
 */
class GWDActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Fen_Messages.ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x333333, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDActionBar mWD_ActionBar;

/**
 * Traitement: Déclarations globales de Fen_Messages
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam, 2, 2);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_id = WD_tabParam[0];
}
else { vWD_id = null; }
super.ajouterVariableGlobale("id",vWD_id);

// Traitement du paramètre n°1
if(1<WD_ntabParamLen) 
{
vWD_idLieu = WD_tabParam[1];
}
else { vWD_idLieu = null; }
super.ajouterVariableGlobale("idLieu",vWD_idLieu);


// init()
fWD_init();

}




/**
 * Traitement: Rafraîchissement par tirer/relâcher de Fen_Messages
 */
public WDObjet raffraichissementPTR()
{
super.raffraichissementPTR();

// init()
fWD_init();

return new WDVoid("raffraichissementPTR");
}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_id = WDVarNonAllouee.ref;
 public WDObjet vWD_idLieu = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre Fen_Messages
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_lib_lieu = new GWDlib_lieu();
mWD_tab_mess = new GWDtab_mess();
mWD_txt_mess = new GWDtxt_mess();
mWD_btn_val = new GWDbtn_val();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre Fen_Messages
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3308459148577635729l);

super.setChecksum("1057586203");

super.setNom("Fen_Messages");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(407, 320);

super.setTitre("Messages");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);

super.setPullToRefresh("", 0xFFFFFFFF);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Fen_Messages
////////////////////////////////////////////////////////////////////////////
mWD_lib_lieu.initialiserObjet();
super.ajouter("lib_lieu", mWD_lib_lieu);
mWD_tab_mess.initialiserObjet();
super.ajouter("tab_mess", mWD_tab_mess);
mWD_txt_mess.initialiserObjet();
super.ajouter("txt_mess", mWD_txt_mess);
mWD_btn_val.initialiserObjet();
super.ajouter("btn_val", mWD_btn_val);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPGruppeto.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPGruppeto.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPGruppeto.getInstance().mWD_Fen_Messages;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "230 IGRAM#WM";
}
}
