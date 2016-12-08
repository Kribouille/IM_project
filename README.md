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
