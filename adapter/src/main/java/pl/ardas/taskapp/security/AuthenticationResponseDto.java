package pl.ardas.taskapp.security;

class AuthenticationResponseDto {
    private final String token;

    AuthenticationResponseDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
