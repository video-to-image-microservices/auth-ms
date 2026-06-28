package video.to.image.auth_ms.infra.adapters.inbound.web.presenter.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import video.to.image.auth_ms.core.domain.exceptions.NotFoundException;

@RestControllerAdvice
public class HttpExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFound(NotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new HttpExceptionMessage(HttpStatus.NOT_FOUND.value(), e.getMessage()));
    }
}

