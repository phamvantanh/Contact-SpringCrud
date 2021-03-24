package myspring.crud.myspringcrud.repository;

import org.springframework.data.repository.CrudRepository;
import myspring.crud.myspringcrud.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Long> {
}