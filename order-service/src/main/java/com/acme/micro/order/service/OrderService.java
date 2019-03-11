package com.acme.micro.order.service;

import com.acme.micro.order.resource.dto.OrderRequest;
import com.acme.micro.order.resource.dto.OrderResponse;

import java.util.List;
import java.util.Optional;

public interface OrderService {
  List<OrderResponse> getAllOrders();
  Optional<OrderResponse> getOrderById(int id);
  Optional<OrderResponse> placeOrder(OrderRequest request);
}
