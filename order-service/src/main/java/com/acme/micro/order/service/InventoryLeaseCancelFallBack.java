package com.acme.micro.order.service;

import com.acme.micro.order.service.dto.InventoryLeaseCancellationResponse;

public class InventoryLeaseCancelFallBack implements InventoryLeaseCancellationClient {
    @Override
    public InventoryLeaseCancellationResponse cancel(int leaseId) {
        return InventoryLeaseCancellationResponse.builder().cancelled(false).build();
    }
}
