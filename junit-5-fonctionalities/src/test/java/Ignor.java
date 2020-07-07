import org.junit.Ignore;
import org.junit.Test;

/*Il est quelquefois n�cessaire d'ignorer un test �crit. C'est utile par exemple
lorsque la m�thode � tester n'est pas encore pr�te ou que le test est devenu faux �
cause d�un refactoring en cours. La fa�on la plus simple d'ignorer un test, c'est le
mettre en commentaire. Le probl�me avec cette fa�on de faire, c'est que le test mis
en commentaire risque d'�tre oubli� au cours du temps et que le test ne sera plus
actif jusqu'� ce qu'un d�veloppeur s'aper�oive par hasard qu'il avait �t� mis en
commentaire. Une autre situation o� il est important d�ignorer un test, c�est quand il
d�pend de l�environnement d�ex�cution tel que le type de syst�me d�exploitation ou
les ressources disponibles.
JUnit met � disposition des m�canismes pour ignorer des tests temporairement,
conditionnellement ou par cat�gorie. Lorsque l'on ex�cute les tests, le moteur signale
par un message les tests ignor�s, ce qui permet au d�veloppeur de ne jamais oublier
que les tests ignor�s temporairement devront un jour �tre r�int�gr�s.*/

/*Ignorer des tests temporairement
L'annotation @Ignore signifie d'ignorer une m�thode de test. Un message peut
�tre ajout� pour justifier sa mise � l'�cart lors de l'ex�cution des tests.*/

//@Ignore("Not implemented correctly")
public class Ignor {

	@Ignore("not ready")
	@Test
	public void test1() {
		
		
	}
	
}

/*Si l�annotation @Ignore est mise sur la classe alors toutes les m�thodes de test de
la classe sont ignor�es.*/


