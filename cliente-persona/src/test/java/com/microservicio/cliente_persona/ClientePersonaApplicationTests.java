package com.microservicio.cliente_persona;

//import com.microservicio.cliente_persona.model.Cliente;
//import com.microservicio.cliente_persona.repository.ClienteRepository;
//import com.microservicio.cliente_persona.service.ClienteService;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.Mockito.*;

//import java.util.Arrays;
//import java.util.Optional;


@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
class ClientePersonaApplicationTests {

    @Test
	void contextLoads() {
	}

    /* 
	@InjectMocks
    private ClienteService clienteService;

    @Mock
    private ClienteRepository clienteRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAll() {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Ana");

        when(clienteRepository.findAll()).thenReturn(Arrays.asList(cliente1, cliente2));

        assertEquals(2, clienteService.findAll().size());
        verify(clienteRepository, times(1)).findAll();
    }

    @Test
    public void testFindById() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");

        when(clienteRepository.findById(1L)).thenReturn(Optional.of(cliente));

        Optional<Cliente> foundCliente = clienteService.findById(1L);
        assertTrue(foundCliente.isPresent());
        assertEquals("Juan", foundCliente.get().getNombre());
        verify(clienteRepository, times(1)).findById(1L);
    }

    @Test
    public void testSave() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");

        when(clienteRepository.save(cliente)).thenReturn(cliente);

        Cliente savedCliente = clienteService.save(cliente);
        assertNotNull(savedCliente);
        assertEquals("Juan", savedCliente.getNombre());
        verify(clienteRepository, times(1)).save(cliente);
    }

    @Test
    public void testUpdate() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setClienteId(1L);

        when(clienteRepository.existsById(1L)).thenReturn(true);
        when(clienteRepository.save(cliente)).thenReturn(cliente);

        Optional<Cliente> updatedCliente = clienteService.update(1L, cliente);
        assertTrue(updatedCliente.isPresent());
        assertEquals("Juan", updatedCliente.get().getNombre());
        verify(clienteRepository, times(1)).existsById(1L);
        verify(clienteRepository, times(1)).save(cliente);
    }

    @Test
    public void testUpdateNotFound() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");

        when(clienteRepository.existsById(1L)).thenReturn(false);

        Optional<Cliente> updatedCliente = clienteService.update(1L, cliente);
        assertFalse(updatedCliente.isPresent());
        verify(clienteRepository, times(1)).existsById(1L);
    }

    @Test
    public void testDelete() {
        when(clienteRepository.existsById(1L)).thenReturn(true);

        boolean isDeleted = clienteService.delete(1L);
        assertTrue(isDeleted);
        verify(clienteRepository, times(1)).existsById(1L);
        verify(clienteRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteNotFound() {
        when(clienteRepository.existsById(1L)).thenReturn(false);

        boolean isDeleted = clienteService.delete(1L);
        assertFalse(isDeleted);
        verify(clienteRepository, times(1)).existsById(1L);
        verify(clienteRepository, never()).deleteById(anyLong());
    }
    */

}
