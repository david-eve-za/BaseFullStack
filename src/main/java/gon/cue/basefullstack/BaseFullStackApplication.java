package gon.cue.basefullstack;

import gon.cue.basefullstack.auth.dao.IUserDao;
import gon.cue.basefullstack.auth.entity.LocalUser;
import gon.cue.basefullstack.auth.entity.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BaseFullStackApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(BaseFullStackApplication.class);

    private final BCryptPasswordEncoder passwordEncoder;
    private final IUserDao dao;

    public BaseFullStackApplication(BCryptPasswordEncoder passwordEncoder, IUserDao dao) {
        this.passwordEncoder = passwordEncoder;
        this.dao = dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(BaseFullStackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.dao.findByUsername("root") == null){
            LocalUser root = new LocalUser();
            root.setUsername("root");
            root.setPassword(passwordEncoder.encode("12345"));
            root.setEnabled(Boolean.TRUE);
            root.getRoles().add(new Role("ROLE_ADMIN"));
            root.getRoles().add(new Role("ROLE_USER"));
            this.dao.save(root);
        }
    }
}
