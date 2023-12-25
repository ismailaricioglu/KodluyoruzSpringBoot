package com.iaricioglu;

import com.iaricioglu.Test.TestCrud;
import com.iaricioglu.data.entity.EmployeeEntity;
import com.iaricioglu.data.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodluyoruzSpringBootApplicationTests {
/*class KodluyoruzSpringBootApplicationTests implements TestCrud {

    @Autowired
    EmployeeRepository employeeRepository;

    // CREATE
    @Test
    @Override
    public void testCreate() {
        EmployeeEntity employeeEntity = EmployeeEntity
                .builder()
                .firstName("İsmail Test")
                .lastName("Arıcıoğlu Test")
                .emailId("test@tmail.com")
                .build();
        employeeRepository.save(employeeEntity);

        // Assert
        // nesne null ise assertionError hatası göndersin
        assertNotNull(employeeRepository.findById(1L).get());
    }

    // UPDATE
    @Test
    @Override
    public void testUpdate() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        employeeEntity.setFirstName("İsmail Test Updated");
        employeeRepository.save(employeeEntity);

        // Assert
        // veriler eşit değil ise sorun olmayacak ama eşitse exception fırlatsın
        assertNotEquals("İsmail Test",employeeRepository.findById(1L).get().getFirstName());
    }

    //LIST
    @Test
    @Override
    public void testList() {
        List<EmployeeEntity> list = employeeRepository.findAll();

        // Assert
        // eğer 0'dan büyükse liste vardır
        assertThat(list).size().isGreaterThan(0);
    }

    // FINDBYID
    @Test
    @Override
    public void testFindById() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();

        // Assert
        // İsmail Test adında kayıt var mı yok mu
        assertEquals("İsmail Test", employeeEntity.getFirstName());
    }

    // DELETE
    @Test
    @Override
    public void testDelete() {
        employeeRepository.deleteById(1L);

        // Assert
        // isFalse
        assertThat(employeeRepository.existsById(1L)).isFalse();
    }*/
}
