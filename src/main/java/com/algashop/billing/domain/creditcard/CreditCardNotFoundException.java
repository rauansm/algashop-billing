package com.algashop.billing.domain.creditcard;

import com.algashop.billing.domain.DomainException;

public class CreditCardNotFoundException extends DomainException {
    public CreditCardNotFoundException() {
    }

    public CreditCardNotFoundException(String message) {
        super(message);
    }

    public CreditCardNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
