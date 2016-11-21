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

File → New Project →Xtext > Xtext Project From Existing Ecore Models → Add Epackages → select genModel

- Paramètres du New Xtext Project :

org.xtext.twitter.twt : project name
name langage : org.xtext.twitter.twt.TwitterRESTAPI
extension : twt
