package pl.ardas.taskapp.user.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

@JsonDeserialize(as = UserDto.DeserializationImpl.class)
public interface UserDto {

    int getId();

    String getUsername();

    String getEmail();

    String getPassword();

    LocalDateTime getCreateDt();

    LocalDateTime getUpdateDt();

    class DeserializationImpl implements  UserDto {

        private final int id;

        private final String username;

        private final String email;

        private final String password;

        private final LocalDateTime createDt;

        private final LocalDateTime updateDt;

        public DeserializationImpl(final int id, final String username, final String email, final String password, final LocalDateTime createDt, final LocalDateTime updateDt) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.password = password;
            this.createDt = createDt;
            this.updateDt = updateDt;
        }


        @Override
        public int getId() {
            return id;
        }

        @Override
        public String getUsername() {
            return username;
        }

        @Override
        public String getEmail() {
            return null;
        }

        @Override
        public String getPassword() {
            return null;
        }

        @Override
        public LocalDateTime getCreateDt() {
            return null;
        }

        @Override
        public LocalDateTime getUpdateDt() {
            return null;
        }
    }
}
