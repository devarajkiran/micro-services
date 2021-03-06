package com.acme.monolith.resource;

import com.acme.monolith.resource.dto.OrderRequest;
import com.acme.monolith.resource.dto.OrderResponse;
import com.acme.monolith.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static org.springframework.util.StringUtils.isEmpty;

@RestController
@RequestMapping("/orders")
public class OrderResource {

  private final OrderService service;

  public OrderResource(OrderService service) {
    this.service = service;
  }

  @GetMapping
  List<OrderResponse> listOrders() {
      return service.getAllOrders();
  }

  @GetMapping("/{id}")
  ResponseEntity<OrderResponse> getOrderById(@PathVariable int id) {
    return service.getOrderById(id)
        .map(orderResponse -> ResponseEntity.ok().body(orderResponse))
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping
  ResponseEntity<OrderResponse> placeOrder(@Valid @RequestBody OrderRequest request) {
    return service.placeOrder(request)
        .map(orderResponse -> ResponseEntity.ok().body(orderResponse))
        .orElseGet(() -> ResponseEntity.badRequest().build());
  }

}
