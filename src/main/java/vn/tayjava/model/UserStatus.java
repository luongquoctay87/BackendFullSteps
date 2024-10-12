package vn.tayjava.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

public enum UserStatus {
    active,
    inactive,
    locked,
    none;
}
