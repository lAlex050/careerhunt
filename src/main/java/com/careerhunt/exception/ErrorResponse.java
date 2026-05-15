package com.careerhunt.exception;

import java.time.Instant;

public record ErrorResponse(int status, ErrorCode error, String message, Instant timestamp, String path) {}