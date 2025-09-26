package com.algashop.billing.infrastructure.listener;

import com.algashop.billing.domain.invoice.InvoiceCanceledEvent;
import com.algashop.billing.domain.invoice.InvoiceIssuedEvent;
import com.algashop.billing.domain.invoice.InvoicePaidEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InvoiceEventListener {

    @EventListener
    public void listen(InvoiceIssuedEvent event) {

    }

    @EventListener
    public void listen(InvoiceCanceledEvent event) {

    }

    @EventListener
    public void listen(InvoicePaidEvent event) {

    }

}
