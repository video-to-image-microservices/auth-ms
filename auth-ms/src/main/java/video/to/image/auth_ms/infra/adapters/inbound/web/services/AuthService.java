package video.to.image.auth_ms.infra.adapters.inbound.web.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import video.to.image.auth_ms.core.application.ports.in.AuthenticateUseCaseInputPort;
import video.to.image.auth_ms.infra.adapters.inbound.web.presenter.dto.authcontroller.login.AuthLoginMapper;
import video.to.image.auth_ms.infra.adapters.inbound.web.presenter.dto.authcontroller.login.AuthLoginRequestDto;
import video.to.image.auth_ms.infra.adapters.inbound.web.presenter.dto.authcontroller.login.AuthLoginResponseDto;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticateUseCaseInputPort authenticateUseCase;

    @Transactional(readOnly = true)
    public AuthLoginResponseDto login(AuthLoginRequestDto body) {
        return AuthLoginMapper.toResponseDto(
                this.authenticateUseCase.authenticate(body.getEmail(), body.getPassword())
        );
    }
}
