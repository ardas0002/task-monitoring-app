package pl.ardas.taskapp.user;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String email;

    private String password;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;


    int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    String getName() {
        return username;
    }

    void setName(final String name) {
        this.username = name;
    }

    String getEmail() {
        return email;
    }

    void setEmail(final String email) {
        this.email = email;
    }

    String getPassword() {
        return password;
    }

    void setPassword(final String password) {
        this.password = password;
    }

    LocalDateTime getCreateDt() {
        return createDt;
    }

    void setCreateDt(final LocalDateTime createDt) {
        this.createDt = createDt;
    }

    LocalDateTime getUpdateDt() {
        return updateDt;
    }

    void setUpdateDt(final LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }
}
