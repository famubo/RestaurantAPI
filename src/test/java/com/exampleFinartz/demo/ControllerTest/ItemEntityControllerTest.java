//package com.exampleFinartz.demo.ControllerTest;
//
//
//import com.exampleFinartz.demo.controllers.ItemController;
//import com.exampleFinartz.demo.models.entity.ItemEntity;
//import com.exampleFinartz.demo.repositories.ItemRepository;
//import com.exampleFinartz.demo.services.ItemService;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebMvcTest(value = ItemController.class)
//public class ItemEntityControllerTest {
//    @Autowired
//    MockMvc mockMvc;
//    @MockBean
//    ItemService itemService;
//    @MockBean
//    ItemRepository itemRepository;
//
//    String mapToJson(Object o) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(o);
//    }
//
//    @Test
//    public void add() throws Exception {
//        ItemEntity itemEntity = this.generateItem();
//        String URI = "/items";
//        String inputJson = this.mapToJson(itemEntity);
//        Mockito.when(itemService.update(Mockito.any(ItemEntity.class))).thenReturn(itemEntity);
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .post(URI)
//                .accept(MediaType.APPLICATION_JSON).content(inputJson)
//                .contentType(MediaType.APPLICATION_JSON_VALUE);
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        MockHttpServletResponse response = result.getResponse();
//        String outputJson = response.getContentAsString(StandardCharsets.UTF_8);
//        Assertions.assertThat("").isEqualTo(outputJson);
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        List<ItemEntity> itemEntityList = new ArrayList<>();
//        itemEntityList.add(this.generateItem());
//        String URI = "/items";
//        String inputJson = this.mapToJson(itemEntityList);
//        Mockito.when(itemService.getAll()).thenReturn(itemEntityList);
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .get(URI)
//                .accept(MediaType.APPLICATION_JSON);
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        MockHttpServletResponse response = result.getResponse();
//        String outputJson = response.getContentAsString(StandardCharsets.UTF_8);
//        Assertions.assertThat("").isEqualTo(outputJson);
//    }
//
//    @Test
//    public void getById() throws Exception {
//        ItemEntity itemEntity = this.generateItem();
//        String URI = "/items/11";
//        String inputJson = this.mapToJson(itemEntity);
//        Mockito.when(itemService.getById(Mockito.anyLong())).thenReturn(itemEntity);
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .get(URI)
//                .accept(MediaType.APPLICATION_JSON);
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        MockHttpServletResponse response = result.getResponse();
//        String outputJson = response.getContentAsString(StandardCharsets.UTF_8);
//        Assertions.assertThat("").isEqualTo(outputJson);
//    }
//
//    @Test
//    public void update() throws Exception {
//        ItemEntity items = this.generateItem();
//        String URI = "/items";
//        String inputJson = this.mapToJson(items);
//        Mockito.when(itemService.update(Mockito.any(ItemEntity.class))).thenReturn(items);
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .put(URI)
//                .accept(MediaType.APPLICATION_JSON).content(inputJson)
//                .contentType(MediaType.APPLICATION_JSON_VALUE);
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        MockHttpServletResponse response = result.getResponse();
//        String outputJson = response.getContentAsString(StandardCharsets.UTF_8);
//        Assertions.assertThat("").isEqualTo(outputJson);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        ItemEntity items = this.generateItem();
//        String URI = "/items/6";
//        Mockito.when(itemService.delete(Mockito.anyLong())).thenReturn("success");
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .delete(URI)
//                .accept(MediaType.APPLICATION_JSON);
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        MockHttpServletResponse response = result.getResponse();
//        String outputJson = response.getContentAsString(StandardCharsets.UTF_8);
//        Assertions.assertThat("").isEqualTo(outputJson);
//    }
//
//    private ItemEntity generateItem() {
//        return ItemEntity.builder()
//                .name("Patlıcak Musakka")
//                .build();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
