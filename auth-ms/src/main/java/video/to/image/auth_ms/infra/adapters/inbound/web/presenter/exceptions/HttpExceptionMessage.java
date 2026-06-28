package video.to.image.auth_ms.infra.adapters.inbound.web.presenter.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class HttpExceptionMessage {

    private Integer status;
    private String message;
    private LocalDateTime timestamp;

    public HttpExceptionMessage(Integer status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }
}
