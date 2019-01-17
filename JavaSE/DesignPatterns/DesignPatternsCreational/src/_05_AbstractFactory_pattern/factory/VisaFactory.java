package _05_AbstractFactory_pattern.factory;

import _05_AbstractFactory_pattern.cart.CardType;
import _05_AbstractFactory_pattern.cart.CreditCard;
import _05_AbstractFactory_pattern.cart.VisaBlackCreditCard;
import _05_AbstractFactory_pattern.cart.VisaGoldCreditCard;
import _05_AbstractFactory_pattern.validator.Validator;
import _05_AbstractFactory_pattern.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
