/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Fenêtre
 * Classe Android : Liste_Event
 * Date : 11/12/2019 15:41:09
 * Version de wdjava.dll  : 24.0.254.7
 */


package com.masociete.gruppeto.wdgen;


import com.masociete.gruppeto.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.table.*;
import fr.pcsoft.wdjava.ui.champs.table.colonne.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.json.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFListe_Event extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de Liste_Event
////////////////////////////////////////////////////////////////////////////

/**
 * Table1
 */
class GWDTable1 extends WDTable
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Liste_Event.Table1
////////////////////////////////////////////////////////////////////////////

/**
 * Nom
 */
class GWDNom extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Liste_Event.Table1.Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309389421333987603l);

super.setNom("Nom");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(160);

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
 * Lieu
 */
class GWDLieu extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Liste_Event.Table1.Lieu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309389421334118690l);

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
// Déclaration des champs du fils n°3 de Liste_Event.Table1.Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309389421334249762l);

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
 * id
 */
class GWDid extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de Liste_Event.Table1.id
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309389421334380850l);

super.setNom("id");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(160);

super.setTitre("id");

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
public GWDid mWD_id = new GWDid();
/**
 * Initialise tous les champs de Liste_Event.Table1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de Liste_Event.Table1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("Nom",mWD_Nom);
super.ajouterColonne("Lieu",mWD_Lieu);
super.ajouterColonne("Date",mWD_Date);
super.ajouterColonne("id",mWD_id);
mWD_Nom.initialiserObjet();
mWD_Lieu.initialiserObjet();
mWD_Date.initialiserObjet();
mWD_id.initialiserObjet();

}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3309389421333790995l);

super.setChecksum("1073127744");

super.setNom("Table1");

super.setType(9);

super.setBulle("");

super.setLibelle("Table");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(407, 320);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

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

/**
 * Traitement: Double Tap / Bouton gauche double-clic sur Table1
 */
public void doubleClicSurBoutonGauche()
{
super.doubleClicSurBoutonGauche();

// participe(Table1[Table1].id)
fWD_participe(this.get(this).get("id"));

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
public GWDTable1 mWD_Table1;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Liste_Event.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307735927388112665l);

super.setChecksum("816544958");

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

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ Liste_Event.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de Liste_Event
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
WDObjet vWD_cMaReponse = WDVarNonAllouee.ref;
WDObjet vWD_vCTest = new WDVariant();



// cMaRequete est un restRequête
vWD_cMaRequete = new WDInstance( new WDHTTPRequete() );


// cMaRequete..Méthode = httpGet
vWD_cMaRequete.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete..URL = "https://gruppeto-91fd3.firebaseio.com/Evenement.json"
vWD_cMaRequete.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Evenement.json");

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
// 		Table1.SupprimeTout()
WDAPITable.tableSupprimeTout(mWD_Table1);

// 		POUR TOUT evt DE vCTest
IWDParcours parcours1 = null;
try
{
WDObjet vWD_evt = WDParcoursFactory.creerVariableParcours(vWD_vCTest);
parcours1 = WDParcoursFactory.pourTout(vWD_vCTest, vWD_evt, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 			Table1.AjouteLigne(evt.nomE..Valeur,evt.lieuE..Valeur,evt.dateE..Valeur,evt.idEvent..Valeur)
WDAPITable.tableAjouteLigne(mWD_Table1,new Object[] {parcours1.getVariableParcours().get("nomE").getProp(EWDPropriete.PROP_VALEUR),parcours1.getVariableParcours().get("lieuE").getProp(EWDPropriete.PROP_VALEUR),parcours1.getVariableParcours().get("dateE").getProp(EWDPropriete.PROP_VALEUR),parcours1.getVariableParcours().get("idEvent").getProp(EWDPropriete.PROP_VALEUR)} );

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
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
// participe (<idEvent>)
// 
//  Paramètres :
//  	idEvent : <indiquez ici le rôle de idEvent>
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_participe( WDObjet vWD_idEvent )
{
initExecProcLocale("participe");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_cMaRequete2 = WDVarNonAllouee.ref;
WDObjet vWD_cMaReponse2 = WDVarNonAllouee.ref;
WDObjet vWD_vCTest2 = new WDVariant();

WDObjet vWD_i = new WDBooleen();



// cMaRequete2 est un restRequête
vWD_cMaRequete2 = new WDInstance( new WDHTTPRequete() );


// cMaRequete2..Méthode = httpGet
vWD_cMaRequete2.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete2..URL = "https://gruppeto-91fd3.firebaseio.com/Participe_Event.json"
vWD_cMaRequete2.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Participe_Event.json");

// cMaReponse2 est un restRéponse = RESTEnvoie(cMaRequete2)
vWD_cMaReponse2 = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponse2.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete2));


// vCTest2 est un Variant = JSONVersVariant(AnsiVersUnicode(cMaReponse2..Contenu))

vWD_vCTest2.setValeur(WDAPIVariant.jsonVersVariant(WDAPIChaine.ansiVersUnicode(vWD_cMaReponse2.getProp(EWDPropriete.PROP_CONTENU))));


// i est un booléen = faux

vWD_i.setValeur(false);


// SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	SI cMaReponse2..Contenu = Vrai ALORS
if(vWD_cMaReponse2.getProp(EWDPropriete.PROP_CONTENU).opEgal(true))
{
// 		Info("Le site a bien été mis à jour.")
WDAPIDialogue.info("Le site a bien été mis à jour.");

}
else
{
// 		POUR TOUT evtP DE vCTest2
IWDParcours parcours2 = null;
try
{
WDObjet vWD_evtP = WDParcoursFactory.creerVariableParcours(vWD_vCTest2);
parcours2 = WDParcoursFactory.pourTout(vWD_vCTest2, vWD_evtP, null, null, null, 0x0, 0x2);
while(parcours2.testParcours())
{
// 			SI evtP.idUtil..Valeur = idUtil ALORS
if(parcours2.getVariableParcours().get("idUtil").getProp(EWDPropriete.PROP_VALEUR).opEgal(vWD_idUtil))
{
// 				i=Vrai
vWD_i.setValeur(true);

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


// 		Si i=Vrai alors
if(vWD_i.opEgal(true))
{
// 			info("Vous êtes déjà inscrit à l'évènement !!")
WDAPIDialogue.info("Vous êtes déjà inscrit à l'évènement !!");

}
else
{
// 			cMaRequete2..Méthode = httpPost
vWD_cMaRequete2.setProp(EWDPropriete.PROP_METHODE,2);

// 			envoie est un Variant
WDObjet vWD_envoie = new WDVariant();



// 			envoie.idUtil = idUtil
vWD_envoie.get("idUtil").setValeur(vWD_idUtil);

// 			envoie.idEvent = idEvent
vWD_envoie.get("idEvent").setValeur(vWD_idEvent);

// 			tampon est un JSON = VariantVersJSON(envoie)
WDObjet vWD_tampon = WDVarNonAllouee.ref;
vWD_tampon = new WDInstance( new WDJSON() );

vWD_tampon.setValeur(WDAPIVariant.variantVersJSON(vWD_envoie));


// 			cMaRequete2..ContentType="application/json"
vWD_cMaRequete2.setProp(EWDPropriete.PROP_CONTENTTYPE,"application/json");

// 			cMaRequete2..Contenu= UnicodeVersAnsi(tampon)
vWD_cMaRequete2.setProp(EWDPropriete.PROP_CONTENU,WDAPIChaine.UnicodeVersAnsi(vWD_tampon));

// 			cMonEnvoi est un httpRéponse = RESTEnvoie(cMaRequete2)
WDObjet vWD_cMonEnvoi = WDVarNonAllouee.ref;
vWD_cMonEnvoi = new WDInstance( new WDHTTPReponse() );

vWD_cMonEnvoi.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete2));


// 			SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 				Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 				Info("Inscription réussite ! ")
WDAPIDialogue.info("Inscription réussite ! ");

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
// Déclaration des champs du fils n°1 de Liste_Event.ActionBar
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
 * Traitement: Déclarations globales de Liste_Event
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam, 1, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_idUtil = WD_tabParam[0];
}
else { vWD_idUtil = null; }
super.ajouterVariableGlobale("idUtil",vWD_idUtil);


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
 public WDObjet vWD_idUtil = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre Liste_Event
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_Table1 = new GWDTable1();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre Liste_Event
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3307735927388047129l);

super.setChecksum("820868063");

super.setNom("Liste_Event");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(407, 320);

super.setTitre("Liste des évènements");

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
// Initialisation des champs de Liste_Event
////////////////////////////////////////////////////////////////////////////
mWD_Table1.initialiserObjet();
super.ajouter("Table1", mWD_Table1);
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
return GWDPGruppeto.getInstance().mWD_Liste_Event;
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
