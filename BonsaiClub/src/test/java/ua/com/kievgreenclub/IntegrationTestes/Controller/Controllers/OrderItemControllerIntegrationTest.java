package ua.com.kievgreenclub.IntegrationTestes.Controller.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import ua.com.kievgreenclub.Controller.Controllers.OrderItemController;
import ua.com.kievgreenclub.Model.Entity.OrderItem;
import ua.com.kievgreenclub.Model.Service.OrderItemService;
import org.springframework.http.MediaType;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(OrderItemController.class)
public class OrderItemControllerIntegrationTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderItemService orderItemService;

    @Test
    public void testAddOrderItem() throws Exception {
        OrderItem item = new OrderItem();
        item.setId(1L);
        given(orderItemService.saveOrderItem(any(OrderItem.class))).willReturn(item);

        mockMvc.perform(post("/order-items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"quantity\": \"2\"}")) // Simplified JSON payload
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1));
    }

}
