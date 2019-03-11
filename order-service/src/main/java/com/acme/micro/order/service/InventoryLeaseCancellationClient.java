package com.acme.micro.order.service;

import com.acme.micro.order.service.dto.InventoryLeaseCancellationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "inventory-service", fallback = InventoryLeaseCancelFallBack.class)
public interface InventoryLeaseCancellationClient {
    @PostMapping("/cancelLease")
    InventoryLeaseCancellationResponse cancel(int leaseId);
}
