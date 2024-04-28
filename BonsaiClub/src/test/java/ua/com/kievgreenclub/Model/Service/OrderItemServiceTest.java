package ua.com.kievgreenclub.Model.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.com.kievgreenclub.Model.Entity.OrderItem;
import ua.com.kievgreenclub.Model.Repository.OrderItemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderItemServiceTest {

    @Mock
    private OrderItemRepository orderItemRepository;

    @InjectMocks
    private OrderItemService orderItemService;

    @Test
    void testSaveOrderItem() {
        OrderItem item = new OrderItem();
        when(orderItemRepository.save(any(OrderItem.class))).thenReturn(item);

        OrderItem savedItem = orderItemService.saveOrderItem(item);

        assertNotNull(savedItem);
    }

    @Test
    void testFindOrderItemById() {
        OrderItem item = new OrderItem();
        item.setId(1L);
        when(orderItemRepository.findById(1L)).thenReturn(Optional.of(item));

        Optional<OrderItem> found = orderItemService.findOrderItemById(1L);

        assertTrue(found.isPresent());
        assertEquals(1L, found.get().getId());
    }

    @Test
    void testFindOrderItemsByOrderId() {
        List<OrderItem> items = new ArrayList<>();
        items.add(new OrderItem());
        when(orderItemRepository.findByOrderId(1L)).thenReturn(items);

        List<OrderItem> result = orderItemService.findOrderItemsByOrderId(1L);

        assertFalse(result.isEmpty());
    }

}
