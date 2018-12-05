package _05_AbstractFactory_pattern.validator;

import _05_AbstractFactory_pattern.cart.CreditCard;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
