package com.dev.spring_boot_rest_api_basics.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

//@JsonIgnoreProperties({"field2", "field3"})
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private final String field1;

    //	@JsonIgnore
    private final String field2;

    //	@JsonIgnore
    private final String field3;

    public SomeBean(String field1, String field2, String field3) {
        super();
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "SomeBean [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
    }

}
