package org.myspring.beans.factory.support;

import org.myspring.beans.BeanDefinition;

public class GenericBeanDefinition implements BeanDefinition {

    private String id;

    private String beanClassName;

    private String scope;

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getBeanClassName() {
        return this.beanClassName;
    }
}
