package video.to.image.auth_ms.infra.adapters.outbound.persistence.mappers;

import video.to.image.auth_ms.core.domain.entities.User;
import video.to.image.auth_ms.infra.adapters.outbound.persistence.jpaentities.JpaUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toDomain(JpaUser entity);
    JpaUser toEntity(User user);
}
