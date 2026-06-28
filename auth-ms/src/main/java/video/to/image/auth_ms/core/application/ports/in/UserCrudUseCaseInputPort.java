package video.to.image.auth_ms.core.application.ports.in;

import video.to.image.auth_ms.core.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface UserCrudUseCaseInputPort {
    User findById(UUID id);
    User create(User user);
    User update(UUID userid, User user);
    void delete(UUID userid);
    List<User> findAll();
}
