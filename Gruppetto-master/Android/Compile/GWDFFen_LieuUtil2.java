/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Fenêtre
 * Classe Android : Fen_LieuUtil2
 * Date : 11/12/2019 16:43:46
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
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFen_LieuUtil2 extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de Fen_LieuUtil2
////////////////////////////////////////////////////////////////////////////

/**
 * lib_nom_pre
 */
class GWDlib_nom_pre extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Fen_LieuUtil2.lib_nom_pre
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313559166499997l);

super.setChecksum("913165595");

super.setNom("lib_nom_pre");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Prenom + nom");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 81);

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
public GWDlib_nom_pre mWD_lib_nom_pre;

/**
 * tab_res
 */
class GWDtab_res extends WDTable
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Fen_LieuUtil2.tab_res
////////////////////////////////////////////////////////////////////////////

/**
 * Lieu
 */
class GWDLieu extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Fen_LieuUtil2.tab_res.Lieu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313559166631069l);

super.setNom("Lieu");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(160);

super.setTitre("Lieu");

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
public GWDLieu mWD_Lieu = new GWDLieu();

/**
 * Date
 */
class GWDDate extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Fen_LieuUtil2.tab_res.Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313559166696605l);

super.setNom("Date");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(160);

super.setTitre("Date");

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
public GWDDate mWD_Date = new GWDDate();

/**
 * idl
 */
class GWDidl extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de Fen_LieuUtil2.tab_res.idl
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309314108934303682l);

super.setNom("idl");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(80);

super.setTitre("idl");

super.setLargeurMin(14);

super.setVisibleInitial(false);

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
public GWDidl mWD_idl = new GWDidl();
/**
 * Initialise tous les champs de Fen_LieuUtil2.tab_res
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Fen_LieuUtil2.tab_res
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("Lieu",mWD_Lieu);
super.ajouterColonne("Date",mWD_Date);
super.ajouterColonne("idl",mWD_idl);
mWD_Lieu.initialiserObjet();
mWD_Date.initialiserObjet();
mWD_idl.initialiserObjet();

}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313559166565533l);

super.setChecksum("913233867");

super.setNom("tab_res");

super.setType(9);

super.setBulle("");

super.setLibelle("Table");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(44, 0);

super.setTailleInitiale(363, 320);

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

super.setStyleEnteteColonne(10, 1, WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0xFFFFFF, 2.000000, 2.000000, 1, 1), creerPolice_GEN("Roboto", -8.000000, 0), 0x262626, true, "C:\\Users\\maxri\\Desktop\\Gruppetto-master\\Gabarits\\WM\\230 iGram\\iGram_Table_ColPict@dpi1x.png");

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

/**
 * Traitement: Double Tap / Bouton gauche double-clic sur tab_res
 */
public void doubleClicSurBoutonGauche()
{
super.doubleClicSurBoutonGauche();

// ouvre(Fen_Messages,id,Tab_res[tab_res].idl)
WDAPIFenetre.ouvre(GWDPGruppeto.getInstance().mWD_Fen_Messages,new WDObjet[] {vWD_id,this.get(this).get("idl")} );

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurDoubleTape();
}
protected final int getIdEnteteAt(int nColonne, int nLigne) {return 0;}
protected final String getLibelleEnteteFromId(int nId) {return null;}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDtab_res mWD_tab_res;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de Fen_LieuUtil2.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309313559166762141l);

super.setChecksum("913427739");

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

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ Fen_LieuUtil2.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de Fen_LieuUtil2
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

// cMaRequete2..URL = "https://gruppeto-91fd3.firebaseio.com/Lieu_visiter.json"
vWD_cMaRequete2.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Lieu_visiter.json");

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
// 		tab_res.SupprimeTout()
WDAPITable.tableSupprimeTout(mWD_tab_res);

// 		POUR TOUT util DE vCTest
IWDParcours parcours1 = null;
try
{
WDObjet vWD_util = WDParcoursFactory.creerVariableParcours(vWD_vCTest);
parcours1 = WDParcoursFactory.pourTout(vWD_vCTest, vWD_util, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 			si util.idUtil..Valeur = id ALORS
if(parcours1.getVariableParcours().get("idUtil").getProp(EWDPropriete.PROP_VALEUR).opEgal(vWD_id))
{
// 				lib_nom_pre = util.prenom..Valeur +" " + util.nom..Valeur
mWD_lib_nom_pre.setValeur(parcours1.getVariableParcours().get("prenom").getProp(EWDPropriete.PROP_VALEUR).opPlus(" ").opPlus(parcours1.getVariableParcours().get("nom").getProp(EWDPropriete.PROP_VALEUR)));

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


// 		POUR TOUT LieuV DE vCTest2
IWDParcours parcours2 = null;
try
{
WDObjet vWD_LieuV = WDParcoursFactory.creerVariableParcours(vWD_vCTest2);
parcours2 = WDParcoursFactory.pourTout(vWD_vCTest2, vWD_LieuV, null, null, null, 0x0, 0x2);
while(parcours2.testParcours())
{
// 			SI LieuV.idUtil..Valeur = id ALORS
if(parcours2.getVariableParcours().get("idUtil").getProp(EWDPropriete.PROP_VALEUR).opEgal(vWD_id))
{
// 				pour Tout Lieux de vCTest3
IWDParcours parcours3 = null;
try
{
WDObjet vWD_Lieux = WDParcoursFactory.creerVariableParcours(vWD_vCTest3);
parcours3 = WDParcoursFactory.pourTout(vWD_vCTest3, vWD_Lieux, null, null, null, 0x0, 0x2);
while(parcours3.testParcours())
{
// 					Si LieuV.idLieu..Valeur = Lieux.idLieu..Valeur ALORS
if(parcours2.getVariableParcours().get("idLieu").getProp(EWDPropriete.PROP_VALEUR).opEgal(parcours3.getVariableParcours().get("idLieu").getProp(EWDPropriete.PROP_VALEUR)))
{
// 						tab_res.AjouteLigne(Lieux.nom..Valeur, LieuV.date..Valeur, Lieux.idLieu..Valeur )
WDAPITable.tableAjouteLigne(mWD_tab_res,new Object[] {parcours3.getVariableParcours().get("nom").getProp(EWDPropriete.PROP_VALEUR),parcours2.getVariableParcours().get("date").getProp(EWDPropriete.PROP_VALEUR),parcours3.getVariableParcours().get("idLieu").getProp(EWDPropriete.PROP_VALEUR)} );

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




/**
 * ActionBar
 */
class GWDActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Fen_LieuUtil2.ActionBar
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
 * Traitement: Déclarations globales de Fen_LieuUtil2
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam, 1, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_id = WD_tabParam[0];
}
else { vWD_id = null; }
super.ajouterVariableGlobale("id",vWD_id);


// init()
fWD_init();

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_id = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre Fen_LieuUtil2
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_lib_nom_pre = new GWDlib_nom_pre();
mWD_tab_res = new GWDtab_res();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre Fen_LieuUtil2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3309313559166434461l);

super.setChecksum("917488700");

super.setNom("Fen_LieuUtil2");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(407, 320);

super.setTitre("Lieux d'un Utilisateur");

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
// Initialisation des champs de Fen_LieuUtil2
////////////////////////////////////////////////////////////////////////////
mWD_lib_nom_pre.initialiserObjet();
super.ajouter("lib_nom_pre", mWD_lib_nom_pre);
mWD_tab_res.initialiserObjet();
super.ajouter("tab_res", mWD_tab_res);
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
return GWDPGruppeto.getInstance().mWD_Fen_LieuUtil2;
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