package gon.cue.basefullstack.auth.service;

import gon.cue.basefullstack.auth.dao.IUserDao;
import gon.cue.basefullstack.auth.entity.LocalUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    private Logger log = LoggerFactory.getLogger(UserService.class);

    private final IUserDao dao;

    public UserService(IUserDao dao) {
        this.dao = dao;
    }


    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        LocalUser user = dao.findByUsername(s);

        if (user == null) {
            log.error("Error on login: the user not exists '" + s + "' on the system!");
            throw new UsernameNotFoundException("Error on login: the user not exists '" + s + "' on the system!");
        }

        List<GrantedAuthority> authorities = user.getRoles().
                stream().
                map(role -> new SimpleGrantedAuthority(role.getRolename())).
                peek(authority -> log.info("Role: "+ authority.getAuthority())).
                collect(Collectors.toList());

        return new User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, authorities);
    }
}
