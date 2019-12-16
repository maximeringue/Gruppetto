/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Fenêtre
 * Classe Android : Recherche_Profil
 * Date : 11/12/2019 15:41:09
 * Version de wdjava.dll  : 24.0.254.7
 */


package com.masociete.gruppeto.wdgen;


import com.masociete.gruppeto.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.table.*;
import fr.pcsoft.wdjava.ui.champs.table.colonne.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFRecherche_Profil extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de Recherche_Profil
////////////////////////////////////////////////////////////////////////////

/**
 * rech_Nom
 */
class GWDrech_Nom extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Recherche_Profil.rech_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,44,40);
super.setRectCompPrincipal(44,2,230,40);
super.setQuid(3307749465171436026l);

super.setChecksum("862954023");

super.setNom("rech_Nom");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 88);

super.setTailleInitiale(44, 276);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(4);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\maxri\\Desktop\\Gruppetto-master\\Gabarits\\WM\\230 iGram\\iGram_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0xC7C7C7, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xFF8000, 0xFF8000, 0xFF8000, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

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
public GWDrech_Nom mWD_rech_Nom;

/**
 * btn_recherche
 */
class GWDbtn_recherche extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Recherche_Profil.btn_recherche
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307749542486435695l);

super.setChecksum("868543294");

super.setNom("btn_recherche");

super.setType(4);

super.setBulle("");

super.setLibelle("Rechercher");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(60, 145);

super.setTailleInitiale(48, 162);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

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
 * Traitement: Clic sur btn_recherche
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// recherche_tab()
fWD_recherche_tab();

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
public GWDbtn_recherche mWD_btn_recherche;

/**
 * tab_pro
 */
class GWDtab_pro extends WDTable
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de Recherche_Profil.tab_pro
////////////////////////////////////////////////////////////////////////////

/**
 * id
 */
class GWDid extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Recherche_Profil.tab_pro.id
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307752175317270828l);

super.setNom("id");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(40);

super.setTitre("id");

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
public GWDid mWD_id = new GWDid();

/**
 * Nom
 */
class GWDNom extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Recherche_Profil.tab_pro.Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307749967697078730l);

super.setNom("Nom");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(139);

super.setTitre("Nom");

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
public GWDNom mWD_Nom = new GWDNom();

/**
 * Prenom
 */
class GWDPrenom extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de Recherche_Profil.tab_pro.Prenom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307749967697209802l);

super.setNom("Prenom");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(131);

super.setTitre("Prenom");

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
public GWDPrenom mWD_Prenom = new GWDPrenom();

/**
 * Mail
 */
class GWDMail extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de Recherche_Profil.tab_pro.Mail
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307749967697340889l);

super.setNom("Mail");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(160);

super.setTitre("Mail");

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
public GWDMail mWD_Mail = new GWDMail();
/**
 * Initialise tous les champs de Recherche_Profil.tab_pro
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Recherche_Profil.tab_pro
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("id",mWD_id);
super.ajouterColonne("Nom",mWD_Nom);
super.ajouterColonne("Prenom",mWD_Prenom);
super.ajouterColonne("Mail",mWD_Mail);
mWD_id.initialiserObjet();
mWD_Nom.initialiserObjet();
mWD_Prenom.initialiserObjet();
mWD_Mail.initialiserObjet();

}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307749967696882122l);

super.setChecksum("877229797");

super.setNom("tab_pro");

super.setType(9);

super.setBulle("");

super.setLibelle("Table");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(116, 0);

super.setTailleInitiale(291, 478);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setTailleCellule(42, 3, 3, 3, 3, 0);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setNumColonneAncree(2);

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
public GWDtab_pro mWD_tab_pro;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de Recherche_Profil.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307749362081252238l);

super.setChecksum("851985771");

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

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ Recherche_Profil.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de Recherche_Profil
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  recherche_tab ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_recherche_tab()
{
initExecProcLocale("recherche_tab");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_cMaRequete = WDVarNonAllouee.ref;
WDObjet vWD_i = new WDBooleen();

WDObjet vWD_cMaReponse = WDVarNonAllouee.ref;
WDObjet vWD_vCTest = new WDVariant();



// 	cMaRequete est un restRequête
vWD_cMaRequete = new WDInstance( new WDHTTPRequete() );


// cMaRequete..Méthode = httpGet
vWD_cMaRequete.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete..URL = "https://gruppeto-91fd3.firebaseio.com/Utilisateur.json"
vWD_cMaRequete.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Utilisateur.json");

// i est un booléen = faux

vWD_i.setValeur(false);


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
// 		tab_pro.SupprimeTout()
WDAPITable.tableSupprimeTout(mWD_tab_pro);

// 		POUR TOUT utilisateur DE vCTest
IWDParcours parcours1 = null;
try
{
WDObjet vWD_utilisateur = WDParcoursFactory.creerVariableParcours(vWD_vCTest);
parcours1 = WDParcoursFactory.pourTout(vWD_vCTest, vWD_utilisateur, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 			si utilisateur.nom..Valeur = rech_Nom alors
if(parcours1.getVariableParcours().get("nom").getProp(EWDPropriete.PROP_VALEUR).opEgal(mWD_rech_Nom))
{
// 				i = vrai
vWD_i.setValeur(true);

// 				tab_pro.AjouteLigne(utilisateur.id..Valeur,utilisateur.nom..Valeur,utilisateur.prenom..Valeur,utilisateur.mail..Valeur)
WDAPITable.tableAjouteLigne(mWD_tab_pro,new Object[] {parcours1.getVariableParcours().get("id").getProp(EWDPropriete.PROP_VALEUR),parcours1.getVariableParcours().get("nom").getProp(EWDPropriete.PROP_VALEUR),parcours1.getVariableParcours().get("prenom").getProp(EWDPropriete.PROP_VALEUR),parcours1.getVariableParcours().get("mail").getProp(EWDPropriete.PROP_VALEUR)} );

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


// 		SI i = Faux ALORS
if(vWD_i.opEgal(false))
{
// 			Info ("Personne n'a été trouvé. Vérifier l'orthographe !")	
WDAPIDialogue.info("Personne n'a été trouvé. Vérifier l'orthographe !");

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
// Déclaration des champs du fils n°1 de Recherche_Profil.ActionBar
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
 * Traitement: Déclarations globales de Recherche_Profil
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre Recherche_Profil
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_rech_Nom = new GWDrech_Nom();
mWD_btn_recherche = new GWDbtn_recherche();
mWD_tab_pro = new GWDtab_pro();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre Recherche_Profil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3307749362081186702l);

super.setChecksum("856466876");

super.setNom("Recherche_Profil");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(407, 478);

super.setTitre("Recherche ");

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


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Recherche_Profil
////////////////////////////////////////////////////////////////////////////
mWD_rech_Nom.initialiserObjet();
super.ajouter("rech_Nom", mWD_rech_Nom);
mWD_btn_recherche.initialiserObjet();
super.ajouter("btn_recherche", mWD_btn_recherche);
mWD_tab_pro.initialiserObjet();
super.ajouter("tab_pro", mWD_tab_pro);
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
return GWDPGruppeto.getInstance().mWD_Recherche_Profil;
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
