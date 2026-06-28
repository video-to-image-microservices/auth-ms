package video.to.image.auth_ms.core.domain.enums;

public enum ConstMessagesEnum {
    NOT_FOUND("Entidade não encontrada");

    private final String messageBase;

    ConstMessagesEnum(String messageBase) {
        this.messageBase = messageBase;
    }

    public String getMessagem() {
        return this.messageBase;
    }
}
