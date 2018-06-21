# L'objectif de ce projet est d'apprendre à développer en Java et plus particulièrement de découvrir la programmation orientée objet

Pour se faire, nous allons modéliser une corbeille à fruit (dans un premier une corbeille de pommes)

Nous verrons donc plusieurs notions: 
 - test unitaire : verifier que notre code fait bien ce qui est souhaité. C'est un concept fondamental quelque soit le paradigme de programmation utilisé
 - les types de classes : classe, classe abstraite, énuméré
 - les conditions : si - sinon si - alors / switch - case
 - les boucles : sous plusieurs format
 - interface : cela permet de donner un(e) étiquette/casquette/role à un type donné
 - collection : cela permet d'ajouter la notion d'ensemble
 - exception : ce qui sort du comportement normal du fonctionnement
 - pattern : en francais, les patrons de conception. Mais c'est plus classe de dire pattern :D
 - stream : a pour vocation de faciliter la lecture du code et son écriture

# Aller, c'est parti pour la pratique
Je vais écrire les différentes étapes : il est possible qu'il y ait quelques couacs mais on verra au fil de l'eau :D

On va donc essayer de représenter une corbeille de fruit, appeler fruitbag car je suis dans l'avion et que je ne connais pas la traduction de corbeille et qu'il est 3h heures martiniquaises ou 8h en heure francaise (oui je me la raconte et alors :P). Bon d'après Lucie, basket est la traduction de corbeille (oui, je devrais avoir honte, mais non). Mais, comme j'ai tout écris avec bag. Ca sera bag :P.

Bref, let's go :)

PS : Lors de chaque action, la vérification via un ou plusieurs unitaires est requise.

Nous allons créer un panier de fruit avec les contraintes suivantes en pas à pas:
 - Un panier peut contenir des fruits différents
 - Un fruit est un objet qui ne peut être instancier
 - il existe 3 types de fruit : orange, pomme, banane
 
## Classe
Dans un premier temps, le panier de fruit ne peut contenir qu'une pomme.
Vérifier qu'une pomme peut être ajoutée.

## Héritage et classe abstraite
Créer une classe fruit qui est étendue par les classes Orange, Banane et Pomme

## Est-ce qu'une pomme est une banane ? 
On considère que deux pommes sont identiques (dans le but de l'exercice). Une pomme ne peut être égale qu'à une autre pomme. 
(Java : implémentation de equals et Hashcode)

## Tableau et collection
Vérifier que l'on peut ajouter plusieurs pommes et les récupérer.
Le panier peut maintenant contenir des fruits
Parcourir les fruits de 4 façons différentes.

## Interface
Créer une interface Comestible avec une méthode isComestible : 
 une pomme est comestible pendant 14j, une banane 4j, et une orange 7j.

## Ahh, mais en fait il y a aussi le type légume :O
Créer le Légume Poireau. Attention, pour des questions de simplicité un fruit ne peut être un légume et inversement.
Vous vous doutez des contraintes à mettre :D.
Le panier de fruit peut maintenant contenir des fruits et des légumes

## C'est pas le tout mais j'ai faim
Créer une classe personne qui peut manger un élément comestible.

## Aaahh !! Mais c'est pas bon ca ! Ca bouge  :s
Créer une exception : VereuseException
L'exception est lancée lorsque qu'une personne mange une pomme verreuse.

## C'est pas le ton mais le panier est vide :(
Créer un magasin que l'on peut aussi appeler FruitFactory
Elle permet d'acheter des fruits.

## C'est meilleur cuit
Créer une cocotte qui permet de faire cuire des légumes. 
Pour cuir les aliments, il faut de l'eau, les légumes. Puis faire, puis faire cuir.
On obtient une soupe.

## Cookeo, la cocote qui facilite la vie.
Créer une cocotte cookeo qui permet de faire la même chose qu'une cocotte mais plus facile d'utilisation.
(Utiliser le pattern fluent builder)

## Les coulisses de l'entrepôt 
Un entrepôt permet de trier un ensemble de fruit dans des paniers spécifiques.
(Utilisation des streams)

## Des fruits de saison
On va ajouter une saison à chaque comestible. Une saison est un énuméré.

Bon appétit ! 
