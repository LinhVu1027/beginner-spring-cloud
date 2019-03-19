package com.cloud.web;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class NameServiceTest {
    @Test
    public void getNameTest() throws Exception {
//        RestTemplate rest = mock(RestTemplate.class);
//        doReturn("Cloud1").when(rest).getForObject(eq("http://localhost:7070"), eq(String.class));
//        NameService nameService = new NameService(rest);
//        String name = nameService.getName();
//        assertEquals(name, "Cloud1");

        NameService.NameFeignClient nameFeignClient = mock(NameService.NameFeignClient.class);
        doReturn("Cloud1").when(nameFeignClient).getName();
        NameService nameService = new NameService(nameFeignClient);
        String name = nameService.getName();
        assertEquals(name, "Cloud1");
    }
}
