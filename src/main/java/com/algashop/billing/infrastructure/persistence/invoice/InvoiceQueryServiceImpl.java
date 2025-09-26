package com.algashop.billing.infrastructure.persistence.invoice;

import com.algashop.billing.application.invoice.query.InvoiceOutput;
import com.algashop.billing.application.invoice.query.InvoiceQueryService;
import com.algashop.billing.application.invoice.utility.Mapper;
import com.algashop.billing.domain.invoice.Invoice;
import com.algashop.billing.domain.invoice.InvoiceNotFoundException;
import com.algashop.billing.domain.invoice.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InvoiceQueryServiceImpl implements InvoiceQueryService {

    private final InvoiceRepository invoiceRepository;
    private final Mapper mapper;

    @Override
    public InvoiceOutput findByOrderId(String orderId) {
        Invoice invoice = invoiceRepository.findByOrderId(orderId).orElseThrow(InvoiceNotFoundException::new);
        return mapper.convert(invoice, InvoiceOutput.class);
    }
}
