package com.rootaround.api.token;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TokenRepository extends CrudRepository<Token, UUID> {

    @Query(value = """
        select t from Token t inner join User u\s
        on t.user.id = u.id\s
        where u.id = :id and (t.expired = false or t.revoked = false)\s    
        """)
    List<Token> findAllValidTokenByUser(String id);

    Optional<Token> findByToken(String token);

}
