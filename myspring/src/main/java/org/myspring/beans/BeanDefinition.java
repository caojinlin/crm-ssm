package org.myspring.beans;

public interface BeanDefinition {
    public String getBeanClassName() ;

    public String getId() ;

    public void setId(String id) ;

    public void setBeanClassName(String beanClassName);

    public String getScope() ;

    public void setScope(String scope) ;
}
