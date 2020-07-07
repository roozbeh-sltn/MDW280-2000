
public interface FastTest {}

/*
  L'intérêt des catégories est, par
exemple, mettre en group les tests lents, des tests nécessitant une connexion particulière à
un serveur ou des tests non thread-safe.
La mise en oeuvre est très simple :
►Il faut définir des interfaces marqueurs (ie., marker interface ou tagging
interface), c'est-à-dire des interfaces sans méthode, pour chaque catégorie de
test souhaitée.
►Il faut ensuite étiqueter les méthodes de test (ou les classes) avec l’annotation
@Category.
►Pour choisir les catégories à exécuter, il faut créer une classe qui utilise le
moteur de test Categories.class et indiquer les catégories à inclure ou à
exclure de l'exécution des tests.
 */
	

