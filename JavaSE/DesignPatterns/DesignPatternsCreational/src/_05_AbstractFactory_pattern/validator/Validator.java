package _05_AbstractFactory_pattern.validator;

import _05_AbstractFactory_pattern.cart.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
