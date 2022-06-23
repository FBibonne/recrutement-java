# Exercice recrutement technique en java

Ce projet a pour objectif d'aborder quelques notions de java dans le cadre d'un entretien de recrutement technique.
Les quelques lignes de codes à écrire permettront de :
- interroger la base des communes de l'Insee (référentiel géographique)
- enregistrer ces communes dans un fichier
- exécuter quelques traitement algorithmiques dessus

## Pré-requis

### Information sur la base des communes de l'Insee

L'Insee expose une API publique qui permet d'interroger son référentiel des communes. On peut par exemple obtenir la liste courante de toutes les communes françaises en interrogeant l'url `GET https://api.insee.fr/metadonnees/V1/geo/communes?com=false`. Cette url est un web service REST qui fournit une réponse en json (si on lui demande) de la sorte :
```json
[
  {
    "code": "01001",
    "uri": "http://id.insee.fr/geo/commune/166857ef-114f-4067-9d3d-f712562850c5",
    "type": "Commune",
    "dateCreation": "1943-01-01",
    "intituleSansArticle": "Abergement-Clémenciat",
    "typeArticle": "5",
    "intitule": "L'Abergement-Clémenciat"
  },
  {
    "code": "01002",
    "uri": "http://id.insee.fr/geo/commune/43018c68-c278-433a-b285-3531e8d5347e",
    "type": "Commune",
    "dateCreation": "1943-01-01",
    "intituleSansArticle": "Abergement-de-Varey",
    "typeArticle": "5",
    "intitule": "L'Abergement-de-Varey"
  },
  {
    "code": "01004",
    "uri": "http://id.insee.fr/geo/commune/9957029c-4f49-4183-8c94-f6001a6e5a92",
    "type": "Commune",
    "dateCreation": "1955-03-31",
    "intituleSansArticle": "Ambérieu-en-Bugey",
    "typeArticle": "1",
    "intitule": "Ambérieu-en-Bugey"
  },
  {
    "code": "01005",
    "uri": "http://id.insee.fr/geo/commune/041f652a-f819-4b83-bf9c-d704f1edfcb2",
    "type": "Commune",
    "dateCreation": "1943-01-01",
    "intituleSansArticle": "Ambérieux-en-Dombes",
    "typeArticle": "1",
    "intitule": "Ambérieux-en-Dombes"
  },
  {
    "code": "01006",
    "uri": "http://id.insee.fr/geo/commune/2c8a0f87-3fd6-489b-9e6e-58b44e9aba5e",
    "type": "Commune",
    "dateCreation": "1943-01-01",
    "intituleSansArticle": "Ambléon",
    "typeArticle": "1",
    "intitule": "Ambléon"
  },
...
]
```
La classe java RestHttp permet de réaliser cette interrogation. 

### Désérialisation des données

Afin d'effectuer le traitement sur les données json fournies par l'API, on pourra utiliser la librairie jackson en important la dépendance suivante :
```xml
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.13.3</version>
    </dependency>
```

[Démonstration de l'utilisation de jackson](https://www.baeldung.com/jackson-deserialize-json-unknown-properties) 

Le schéma de la classe représentant une commune se déduit facilement du json.

### Java

Les exercices nécessitent d'avoir un jdk installé sur son poste. On pourra choisir [un build eclipse Temurin d'_openJDK_]'https://adoptium.net/temurin/releases/). Il est préférable que la variable d'environnement `JAVA_HOME` soit renseignée et que le dossier `$JAVA_HOME/bin` soit présent dans le _path_.

### Apache maven (ou gradle)

Les exercices nécessitent d'avoir un outil de build installé et correctement configuré sur son poste. On pourra choisir Apache maven ou bien Gradle (dernières versions stables).

### IDE

Disposer également d'un IDE prêt à fonctionner (eclipse, intellij Idea, VSCode)

### Git

Pour bien récupérer correctement le projet de départ sur son poste, il est recommandé d'utiliser l'outil git et de cloner ce projet sur son poste.