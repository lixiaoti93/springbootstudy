package com.li.springboothelloworldqucik.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件的值映射到这个组件中
 * @ConfigurationProperties 告诉springboot 将此类所有的属性和配置文件中的配置绑定
 * 只有这个组件是容器中的组件，才能利用容器提供的@ConfigurationProperties功能
 * 默认从全局变量中获取值
 */
//@PropertySource("classpath:person.properties")//可以指定配置文件
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
  //  @Value("#{person.username}")
    private String username;
  // @Value("#{11*2}")
    private Integer age;
  //  @Value("false")
    private Boolean boss;
  //  @Email //数据格式必须是邮箱类型校验
    private Date date;
    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", date=" + date +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
