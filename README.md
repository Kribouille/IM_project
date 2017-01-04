#IMA_project

Nous avons décidé de réaliser un éditeur graphique avec Sirius. Il permettrait aux utilisateurs de concevoir intuitivement leurs decks. 
Le métamodèle a été repensé pour correspondre à nos besoins. Des tests sous forme d'arborescence ont été créés pour vérifier la corrélation entre les éléments du MM et les éléments graphiques de l'éditeur.

Principe : Lorsque l'utilisateur a terminé son dessin, une première passe est effectuée sur son graphe pour récupérer l'ensemble des requêtes de chaque deck. Cette passe va simplifier les requêtes pour retourner une seule requête (qui peut être importante) pour chaque deck. Le générateur s'occupe ensuite de générer un fichier JSON contenant l'intégralité des decks et la query a faire auprès de l'API Twitter. Enfin, une appli Node.js toute prête s'occupe de lire ce fichier JSON et d'afficher les différents decks sur le navigateur. Cette appli effectuera les requêtes sur l'API Twitter via une autre API "surcouche" simplifiée : https://github.com/ttezel/twit. Les principales possibilités du champ "query" sont décrites dans le wiki.

TODO : 
- Sirius 
- Le générateur 
- L'appli Node.js

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
##### A faire :
- Coder le générateur avec Xtend
- Faire un appel REST avec angularjs


