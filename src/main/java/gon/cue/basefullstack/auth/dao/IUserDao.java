package gon.cue.basefullstack.auth.dao;

import gon.cue.basefullstack.auth.entity.LocalUser;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<LocalUser,Long> {
    public LocalUser findByUsername(String username);
}
