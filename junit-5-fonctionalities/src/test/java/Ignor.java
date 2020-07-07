import org.junit.Ignore;
import org.junit.Test;

/*Il est quelquefois nécessaire d'ignorer un test écrit. C'est utile par exemple
lorsque la méthode à tester n'est pas encore prête ou que le test est devenu faux à
cause d’un refactoring en cours. La façon la plus simple d'ignorer un test, c'est le
mettre en commentaire. Le problème avec cette façon de faire, c'est que le test mis
en commentaire risque d'être oublié au cours du temps et que le test ne sera plus
actif jusqu'à ce qu'un développeur s'aperçoive par hasard qu'il avait été mis en
commentaire. Une autre situation où il est important d’ignorer un test, c’est quand il
dépend de l’environnement d’exécution tel que le type de système d’exploitation ou
les ressources disponibles.
JUnit met à disposition des mécanismes pour ignorer des tests temporairement,
conditionnellement ou par catégorie. Lorsque l'on exécute les tests, le moteur signale
par un message les tests ignorés, ce qui permet au développeur de ne jamais oublier
que les tests ignorés temporairement devront un jour être réintégrés.*/

/*Ignorer des tests temporairement
L'annotation @Ignore signifie d'ignorer une méthode de test. Un message peut
être ajouté pour justifier sa mise à l'écart lors de l'exécution des tests.*/

//@Ignore("Not implemented correctly")
public class Ignor {

	@Ignore("not ready")
	@Test
	public void test1() {
		
		
	}
	
}

/*Si l’annotation @Ignore est mise sur la classe alors toutes les méthodes de test de
la classe sont ignorées.*/


