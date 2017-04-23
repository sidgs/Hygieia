package com.capitalone.dashboard.repository;


import com.capitalone.dashboard.model.Role;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleRepositoryTest extends FongoBaseRepositoryTest {

    @Autowired
    RoleRepository roleRepository;

    private static Role role1, role2 ;

    @Before
    public void setUp() {
        role1 = new Role();
        role1.setActive(false);
        role1.setName("test");
        role1.setDescription("Test role for unit testing");
    }

    @Test
    public void addRole() {
        roleRepository.save(role1);
        role2 = roleRepository.findOne(role1.getName());
//        role2 = roleRepository.findName(role1.getName());
        assert (role2.equals(role1));
    }
}
