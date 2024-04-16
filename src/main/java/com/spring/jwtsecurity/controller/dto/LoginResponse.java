package com.spring.jwtsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
