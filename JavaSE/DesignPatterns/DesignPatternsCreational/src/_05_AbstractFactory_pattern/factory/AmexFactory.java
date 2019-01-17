package _05_AbstractFactory_pattern.factory;

import _05_AbstractFactory_pattern.cart.AmexGoldCreditCard;
import _05_AbstractFactory_pattern.cart.AmexPlatinumCreditCard;
import _05_AbstractFactory_pattern.cart.CardType;
import _05_AbstractFactory_pattern.cart.CreditCard;
import _05_AbstractFactory_pattern.validator.AmexGoldValidator;
import _05_AbstractFactory_pattern.validator.AmexPlatinumValidator;
import _05_AbstractFactory_pattern.validator.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
	
			case PLATINUM:
				return new AmexPlatinumCreditCard();
				
			default:
				break;
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				
				return new AmexGoldValidator();
	
			case PLATINUM:
				
				return new AmexPlatinumValidator();
		
		}
		
		return null;
	}
}
