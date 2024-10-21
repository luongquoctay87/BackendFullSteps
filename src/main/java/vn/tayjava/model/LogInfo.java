package vn.tayjava.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class LogInfo {
    private String requestId;
    private Date timestamp;
    private int status;
    private LogMessage logMessage;
}
