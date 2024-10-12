package vn.tayjava.controller.response;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ApiErrorResponse implements Serializable {
    private Date timestamp;
    private int status;
    private String message;
}
