package org.myspring.test.v1;

import org.junit.Assert;
import org.junit.Test;
import org.myspring.beans.BeanDefinition;
import org.myspring.beans.factory.BeanCreationException;
import org.myspring.beans.factory.BeanDefinitStoreException;
import org.myspring.beans.factory.support.DefaultBeanFactory;
import org.myspring.service.v1.PetStoreService;

import static org.junit.Assert.*;

public class BeanFactoryTest {


    @Test
    public void testGetBean() {
        DefaultBeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        BeanDefinition bd = factory.getBeanDefinition("petStore");
        assertEquals("org.myspring.service.v1.PetStoreService", bd.getBeanClassName());
        PetStoreService petStore = (PetStoreService) factory.getBean("petStore");
        assertNotNull(petStore);
    }

    @Test
    public void testInvalidBean() {
        DefaultBeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        try {
            factory.getBean("invalidBean");
        } catch (BeanCreationException e) {
            return;
        }
        Assert.fail("expect BeanCreationException");
    }

    @Test
    public void testBeanDefinition() {
        try {
            DefaultBeanFactory factory = new DefaultBeanFactory("petstore.xml");
        } catch (BeanDefinitStoreException e) {
            return ;
        }
        Assert.fail("expect BeanDefinitionException");
    }
}
