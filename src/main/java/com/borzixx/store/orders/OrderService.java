package com.borzixx.store.orders;

import com.borzixx.store.auth.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private final AuthService authService;
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public List<OrderDto> getAllOrdersDto(){
        var customer = authService.getCurrentUser();
        var orders = orderRepository.getOrdersByCustomer(customer);
        return orders.stream().map(orderMapper::toDto).toList();
    }

    public OrderDto getOrder(Long orderId){
        var order = orderRepository.getOrderWithItems(orderId).orElseThrow(OrderNotFoundException::new);
        var customer = authService.getCurrentUser();
        if(!order.isPlacedBy(customer)){
            throw new AccessDeniedException("You do not have access to this order.");
        }
        return orderMapper.toDto(order);
    }
}
