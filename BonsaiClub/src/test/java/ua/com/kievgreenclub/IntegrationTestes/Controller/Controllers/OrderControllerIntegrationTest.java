package ua.com.kievgreenclub.IntegrationTestes.Controller.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ua.com.kievgreenclub.Controller.Controllers.OrderController;
import ua.com.kievgreenclub.Model.Entity.Order;
import ua.com.kievgreenclub.Model.Service.OrderService;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(OrderController.class)
public class OrderControllerIntegrationTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService orderService;

    @Test
    public void testCreateOrder() throws Exception {
        Order order = new Order();
        order.setId(1L);
        given(orderService.saveOrder(any(Order.class))).willReturn(order);

        mockMvc.perform(post("/orders")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"totalPrice\": \"15.00\"}")) // Simplified JSON payload
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1));
    }

}
