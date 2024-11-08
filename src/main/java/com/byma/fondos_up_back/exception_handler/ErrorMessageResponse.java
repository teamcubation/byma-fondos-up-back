package com.byma.fondos_up_back.exception_handler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ErrorMessageResponse {
    private String exception;
    private String code;
    private String message;
    private String path;
    @Builder.Default
    private final LocalDateTime timestamp = LocalDateTime.now();
}
