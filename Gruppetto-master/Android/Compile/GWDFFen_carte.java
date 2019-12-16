/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Fenêtre
 * Classe Android : Fen_carte
 * Date : 11/12/2019 17:29:31
 * Version de wdjava.dll  : 24.0.254.7
 */


package com.masociete.gruppeto.wdgen;


import com.masociete.gruppeto.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.carte.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.geo.map.*;
import fr.pcsoft.wdjava.geo.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFen_carte extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de Fen_carte
////////////////////////////////////////////////////////////////////////////

/**
 * Carte1
 */
class GWDCarte1 extends WDChampCarteV2
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de Fen_carte.Carte1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3310419886782929825l);

super.setChecksum("789018842");

super.setNom("Carte1");

super.setType(30001);

super.setBulle("");

super.setLibelle("Carte");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(407, 320);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setPersistant(false);

super.setImageMarqueur("");

super.setParamZoom(true, true);

super.setModeCarte(1);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDCarte1 mWD_Carte1;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de Fen_carte.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307480943809144634l);

super.setChecksum("855946487");

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
// Pas de traitement pour le champ Fen_carte.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de Fen_carte
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
WDObjet vWD_cMaRequete2 = WDVarNonAllouee.ref;
WDObjet vWD_cMaReponse2 = WDVarNonAllouee.ref;
WDObjet vWD_vCTest2 = new WDVariant();



// cMaRequete2 est un restRequête
vWD_cMaRequete2 = new WDInstance( new WDHTTPRequete() );


// cMaRequete2..Méthode = httpGet
vWD_cMaRequete2.setProp(EWDPropriete.PROP_METHODE,1);

// cMaRequete2..URL = "https://gruppeto-91fd3.firebaseio.com/Lieu_visiter.json"
vWD_cMaRequete2.setProp(EWDPropriete.PROP_URL,"https://gruppeto-91fd3.firebaseio.com/Lieu_visiter.json");

// cMaReponse2 est un restRéponse = RESTEnvoie(cMaRequete2)
vWD_cMaReponse2 = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponse2.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete2));


// vCTest2 est un Variant = JSONVersVariant(AnsiVersUnicode(cMaReponse2..Contenu))

vWD_vCTest2.setValeur(WDAPIVariant.jsonVersVariant(WDAPIChaine.ansiVersUnicode(vWD_cMaReponse2.getProp(EWDPropriete.PROP_CONTENU))));


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
// 		POUR TOUT LieuV DE vCTest2
IWDParcours parcours1 = null;
try
{
WDObjet vWD_LieuV = WDParcoursFactory.creerVariableParcours(vWD_vCTest2);
parcours1 = WDParcoursFactory.pourTout(vWD_vCTest2, vWD_LieuV, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 			SI LieuV.idUtil..Valeur = id ALORS
if(parcours1.getVariableParcours().get("idUtil").getProp(EWDPropriete.PROP_VALEUR).opEgal(vWD_id))
{
// 				Marq est un Marqueur
WDObjet vWD_Marq = WDVarNonAllouee.ref;
vWD_Marq = new WDInstance( new WDMarqueur() );


// 				MaPosition est une géoPosition
WDObjet vWD_MaPosition = WDVarNonAllouee.ref;
vWD_MaPosition = new WDInstance( new WDGeoPosition() );


// 				MaPosition..Latitude = LieuV.lat..valeur
vWD_MaPosition.setProp(EWDPropriete.PROP_LATITUDE,parcours1.getVariableParcours().get("lat").getProp(EWDPropriete.PROP_VALEUR));

// 				MaPosition..Longitude = LieuV.long..valeur
vWD_MaPosition.setProp(EWDPropriete.PROP_LONGITUDE,parcours1.getVariableParcours().get("long").getProp(EWDPropriete.PROP_VALEUR));

// 				Marq..position = MaPosition
vWD_Marq.setProp(EWDPropriete.PROP_POSITION,vWD_MaPosition);

// 				Marq..ActionClic = ProcClicMarqueur
vWD_Marq.setProp(EWDPropriete.PROP_ACTIONCLIC,(new WDChaineU("Fen_carte.procClicMarqueur")));

// 				Carte1.AjouteMarqueur(Marq)
WDAPICarte.carteAjouteMarqueur(mWD_Carte1,vWD_Marq);

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


// 		CarteAffichePosition(Carte1, "Toulouse, France")
WDAPICarte.carteAffichePosition(mWD_Carte1,new WDChaineU("Toulouse, France"));

// 		Carte1..Zoom = 10	
mWD_Carte1.setProp(EWDPropriete.PROP_ZOOM,10);

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
//  procClicMarqueur ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_procClicMarqueur( WDObjet vWD_MaMarque )
{
initExecProcLocale("procClicMarqueur");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_longi = new WDChaineU();

WDObjet vWD_lati = new WDChaineU();

WDObjet vWD_bob = new WDChaineU();



vWD_MaMarque = WDParametre.traiterParametreClasse(vWD_MaMarque, 1, false, WDMarqueur.class, 111);


// longi est une chaîne


// lati est une chaîne


// bob est une chaîne


// longi = MaMarque..Position..Longitude
vWD_longi.setValeur(vWD_MaMarque.getProp(EWDPropriete.PROP_POSITION).getProp(EWDPropriete.PROP_LONGITUDE));

// lati = MaMarque..Position..Latitude
vWD_lati.setValeur(vWD_MaMarque.getProp(EWDPropriete.PROP_POSITION).getProp(EWDPropriete.PROP_LATITUDE));

// bob = géoRécupèreAdresse(lati+","+longi).Rue
vWD_bob.setValeur(WDAPIGeo.geoRecupereAdresse(vWD_lati.opPlus(",").opPlus(vWD_longi).getString()).get("Rue"));

// ToastAffiche(ChaîneConstruit("Lieu : " + bob))
WDAPIToast.toastAffiche(WDAPIChaine.chaineConstruit(new WDChaineU("Lieu : ").opPlus(vWD_bob)).getString());

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
// Déclaration des champs du fils n°1 de Fen_carte.ActionBar
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
 * Traitement: Déclarations globales de Fen_carte
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
// Création des champs de la fenêtre Fen_carte
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_Carte1 = new GWDCarte1();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ActionBar = new GWDActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre Fen_carte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3307480943809079098l);

super.setChecksum("860269592");

super.setNom("Fen_carte");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(407, 320);

super.setTitre("Carte");

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
// Initialisation des champs de Fen_carte
////////////////////////////////////////////////////////////////////////////
mWD_Carte1.initialiserObjet();
super.ajouter("Carte1", mWD_Carte1);
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
* Retourne vrai si la fenêtre contient un champ mapView, faux sinon.
*/
public boolean isAvecChampCarteV2()
{
return true;
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
return GWDPGruppeto.getInstance().mWD_Fen_carte;
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
