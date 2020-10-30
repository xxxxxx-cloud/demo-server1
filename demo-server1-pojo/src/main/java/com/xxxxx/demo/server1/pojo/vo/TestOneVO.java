package com.xxxxx.demo.server1.pojo.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jinshiqiang
 */
@Table(name = "test_one")
public class TestOneVO {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "value")
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TestOneVO{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
