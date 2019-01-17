package _05_AbstractFactory_pattern;

import _05_AbstractFactory_pattern.cart.CardType;
import _05_AbstractFactory_pattern.cart.CreditCard;
import _05_AbstractFactory_pattern.factory.CreditCardFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());
	}

}
