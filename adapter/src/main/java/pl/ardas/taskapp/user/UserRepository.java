package pl.ardas.taskapp.user;

import org.springframework.data.repository.Repository;

interface SqlUserRepository extends UserRepository, Repository<User, Integer> {
}

interface SqlUserQueryRepository extends UserQueryRepository, Repository<User, Integer> {

}