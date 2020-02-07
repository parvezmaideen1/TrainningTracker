/**
 * 
 */
package com.perficient.demo.jaxrs.repository;

/**
 * @author parvez.maideen
 *
 */
import org.springframework.data.repository.CrudRepository;
import com.perficient.demo.jaxrs.model.User;
 
public interface UserRepository extends CrudRepository<User, Long> {
 
}
