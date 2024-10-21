package vn.tayjava.model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class LogMessage {
    private String controller;
    private String service;
}
