#IMA_project

Nous avons décidé de réaliser un éditeur graphique avec Sirius. Il permettrait aux utilisateurs de concevoir intuitivement leurs decks. 
Le métamodèle a été repensé pour correspondre à nos besoins. Des tests sous forme d'arborescence ont été créés pour vérifier la corrélation entre les éléments du MM et les éléments graphiques de l'éditeur.

Principe : Lorsque l'utilisateur a terminé son dessin, une première passe est effectuée sur son graphe pour récupérer l'ensemble des requêtes de chaque deck. Cette passe va simplifier les requêtes pour retourner une seule requête (qui peut être importante) pour chaque deck. Le générateur s'occupe ensuite de générer un fichier JSON contenant l'intégralité des decks et la query a faire auprès de l'API Twitter. Enfin, une appli Node.js toute prête s'occupe de lire ce fichier JSON et d'afficher les différents decks sur le navigateur. Cette appli effectuera les requêtes sur l'API Twitter via une autre API "surcouche" simplifiée : https://github.com/ttezel/twit. Les principales possibilités du champ "query" sont décrites dans le wiki.

### Sirius
- Eclipse: File -> Open projects from File system -> /chemin/vers/répertoire/SiriusTwitterRESTAPI/ -> Ok -> Finish

### Générateur Acceleo de requête json pour l'application Nodejs

##### Configuration
- Cliquer droit sur le projet TwitterAcceleo -> Build path -> Configure Build path -> tab Libraries -> Add library -> Plug-in dependencies -> sélectionner le jar org.eclipse.osgi...
- Cliquer droit sur le projet TwitterAcceleo -> Configure -> Convert to Modeling nature

##### Configuration pour lancement
- Cliquer droit sur le fichier generate.mtl dans le projet TwitterAcceleo -> Run as -> Run configuration -> Double cliquer Acceleo application. Configurer comme ci-dessous :
- -Main class : Dans la fenête Select main type : sélectionner Generate
- -Model : Dans la fenêtre Select a model : sélectionner le fichier xmi que vous voulez tester. \*.xmi permet de chercher tous les fichiers xmi dans le projet.
- -Target : Taper `/TwitterAcceleo/src-gen`

##### Lancement
- Cliquer droit sur le fichier generate.mtl -> Run as -> Launch Acceleo application . Répéter cette étape à chaque fois que vous modifiez le contenu du fichier xmi
- Cela crée un fichier twitter.json dans le répertoire /src-gen/ . Ce fichier sera pris en compte automatiquement par l'application Nodejs.


TODO
- Editeur graphique (est-ce que c'est la même chose que Sirius ?)
- outils de refactoring
- outils de validation ou analyse

# IM_project

## Préambule
Ce projet vise à appréhender les notions de modèles et de métamodèles et de métamétamodèles. dans le cadre du cours Ingénierie des Modèles. 

## Outils
- Eclipse Neon 
  - Eclipse Modeling Framework
  - Plugin EMF Tools
  - Modeling tools Sirius
  - Modeling tools Xtext
  
![archi](https://github.com/Kribouille/IM_project/blob/master/archi.jpg)

## Intégration

- Génération du .edit / .editor / .tests :

Dans TwitterRESTAPI > model > twitterRESTAPI.genmodel :
Clique-droit dans la partie droite : « Generate All »

- Xtext :

ATTENTION : Penser à configurer le projet principal en tant que Xtext Project (clic droit sur le projet / Configure / Configure to Xtext Project)
File → New Project →Xtext > Xtext Project From Existing Ecore Models → Add Epackages → select genModel

- Paramètres du New Xtext Project :

  - Project name : org.xtext.twitter.twt
  - Name langage : org.xtext.twitter.twt.TwitterRESTAPI
  - Extension : twt
  
## Mettre à jour le repo
- `git pull`
- Clic Droit sur la Grammaire `TwitterRESTAPI.xtext`
- Choisir "Generate Xtext Artifact"
Cela corrige les erreurs produites par Xtext
  
##Process
  
  ![process](https://github.com/Kribouille/IM_project/blob/master/process.jpg)


