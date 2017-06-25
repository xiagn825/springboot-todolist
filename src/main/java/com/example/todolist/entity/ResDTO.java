package com.example.todolist.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by timxia on 2017/6/23.
 */
@XmlRootElement
public class ResDTO extends BaseDTO {

    private String code = "200";

    private String message = "正常处理";


    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlElement
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
