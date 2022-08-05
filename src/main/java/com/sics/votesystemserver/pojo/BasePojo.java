package com.sics.votesystemserver.pojo;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liangjc
 * @version 2022/07/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BasePojo<T> implements Serializable {
    private T data;
    private int code;
    private String message;
}
