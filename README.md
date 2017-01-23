# IMA_project

### Préambule
Nous avons décidé de réaliser un éditeur graphique avec Sirius. Il permettrait aux utilisateurs de concevoir intuitivement leurs decks. 
Le métamodèle a été repensé pour correspondre à nos besoins. Des tests sous forme d'arborescence ont été créés pour vérifier la corrélation entre les éléments du MM et les éléments graphiques de l'éditeur.

### Principe
Lorsque l'utilisateur a terminé son dessin, une première passe est effectuée sur son graphe pour récupérer l'ensemble des requêtes de chaque deck. Cette passe va simplifier les requêtes pour retourner une seule requête (qui peut être importante) pour chaque deck. Le générateur s'occupe ensuite de générer un fichier JSON contenant l'intégralité des decks et la query a faire auprès de l'API Twitter. Enfin, une appli Node.js toute prête s'occupe de lire ce fichier JSON et d'afficher les différents decks sur le navigateur. Cette appli effectuera les requêtes sur l'API Twitter via une autre API "surcouche" simplifiée : https://github.com/ttezel/twit. Les principales possibilités du champ "query" sont décrites dans le wiki.

### Structure du repo
Notre repo est un workspace à importer dans Eclipse. Il contient trois répertoires qui sont trois projets.

##### répertoire projet TwitterRESTAPI
- `/model/` contient le modèle Ecore et les fichiers de test xmi

##### répertoire projet SiriusTwitterRESTAPI
- `/description/` contient le fichier odesign qui est la définition de l'éditeur graphique Sirius  

##### répertoire projet TwitterAcceleo
- `/src/org/eclipse/acceleo/module/sample` contient les définitions des java services wrappers. Dans notre projet, on a un java service wrapper qui sert à formatter les dates : DateFormatter.java. Cette classe complémente le travail de l'Acceleo.
- `/src-gen/` contient les fichiers json contenant les requêtes à appliquer dans l'application Nodejs pour créer les decks de filtres 

##### répertoire website
Une application écrite en Nodejs. Elle peut générer dynamiquement les decks qui contiennent les filtres, en fonction des requêtes définies dans `/TwitterAcceleo/src-gen/twitter.json`.
- `/views/` contient les templates ejs qui servent à gérer du html dynamiquement au côté client
- `/public/` contient les ressources du site du côté client
- `server.js` contient la logique du serveur
- `keys_tokens.json` contient les informations d'authentification pour utiliser l'application. Ce fichier n'est pas inclu dans le repo. Demandez à l'équipe de projet si vous en voulez un.

### Comment lancer Sirius
##### Importer le projet
- Eclipse: File -> Open projects from File system -> /chemin/vers/répertoire/SiriusTwitterRESTAPI/ -> Ok -> Finish

### Comment lancer le générateur Acceleo

##### Configurer build path
- Cliquer droit sur le projet TwitterAcceleo -> Build path -> Configure Build path -> tab Libraries -> Add library -> Plug-in dependencies -> sélectionner le jar org.eclipse.osgi...
- Cliquer droit sur le projet TwitterAcceleo -> Configure -> Convert to Modeling nature

##### Déclarer une instance d'application Acceleo
- Cliquer droit sur le fichier generate.mtl dans le projet TwitterAcceleo -> Run as -> Run configuration -> Double cliquer Acceleo application. Configurer comme ci-dessous :
```
Main class : Dans la fenête Select main type : sélectionner Generate
Model : Dans la fenêtre Select a model : sélectionner le fichier xmi que vous voulez tester. \*.xmi permet de chercher tous les fichiers xmi dans le projet.
Target : Taper `/TwitterAcceleo/src-gen
```

##### Générer le fichier twitter.json
- Cliquer droit sur le fichier generate.mtl -> Run as -> Launch Acceleo application . Répéter cette étape à chaque fois que vous modifiez le contenu du fichier xmi
- Cela crée un fichier twitter.json dans le répertoire /src-gen/ . Ce fichier sera pris en compte automatiquement par l'application Nodejs.

### Comment lancer l'application web Nodejs
Prérequis : Vous avez node.js et npm préinstallés
- Dans le Terminal : aller dans le répertoire `/website/`
- `npm install`
- `node server.js`
- Ouvrir un navigateur, taper `localhost:8080`

TODO
- readme : décrire la structure du workspace (en cours) & comment le runner (OK)
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


