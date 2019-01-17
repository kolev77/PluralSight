package _05_AbstractFactory_pattern.factory;

import _05_AbstractFactory_pattern.cart.CardType;
import _05_AbstractFactory_pattern.cart.CreditCard;
import _05_AbstractFactory_pattern.validator.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
