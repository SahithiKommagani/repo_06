package Mockito;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ServiceImplTest {
    ServiceImpl serviceimpl;
    @Mock
    Service service;
@BeforeEach
    public void setUp()  {
       serviceimpl=new ServiceImpl(service);
    }
@Test
    public void testRetrieve() {
    List<String> todos= Arrays.asList("Hello","learn Java","Learn Pentaho");
    when(service.listAllUsers("User")).thenReturn(todos);
    List<String> filteredTodos
            = serviceimpl.retrieve(
            "User");
    assertEquals(1, filteredTodos.size());
}

    @Test
    public void usingMock()
    {
        List<String> todos = Arrays.asList();
        when(service.listAllUsers("Dummy"))
                .thenReturn(todos);

        List<String> filteredTodos
                = serviceimpl.retrieve(
                "Dummy");
        assertEquals(0, filteredTodos.size());
    }
    }


