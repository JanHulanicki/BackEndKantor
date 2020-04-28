package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.Order;
import com.kodilla.backendkantor.domain.OrderDto;
import com.kodilla.backendkantor.exception.UserNotFoundException;
import com.kodilla.backendkantor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    @Autowired
    UserRepository userRepository;

    public Order mapToOrder(final OrderDto orderDto) throws UserNotFoundException {
        Order order = new Order();
        order.setOrderId(orderDto.getOrderId());
        order.setUser(userRepository.findById(orderDto.getUserId()).orElseThrow(UserNotFoundException::new));
        order.setCreated(orderDto.getCreated());
        return order;
    }

    public OrderDto mapToOrderDto(final Order order) {
        return new OrderDto(
                order.getOrderId(),
                order.getUser().getId(),
                order.getCreated());
    }

    public List<OrderDto> mapToOrderDtoList(final List<Order> orderList) {
        return orderList.stream()
                .map(o -> new OrderDto(o.getOrderId(), o.getUser().getId(), o.getCreated()))
                .collect(Collectors.toList());
    }
}
