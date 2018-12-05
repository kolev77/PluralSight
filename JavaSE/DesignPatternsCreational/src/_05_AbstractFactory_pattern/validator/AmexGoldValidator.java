package _05_AbstractFactory_pattern.validator;

import _05_AbstractFactory_pattern.cart.CreditCard;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
