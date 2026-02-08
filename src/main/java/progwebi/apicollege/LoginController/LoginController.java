package progwebi.apicollege.LoginController;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import progwebi.apicollege.model.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LoginController {
    @GetMapping(path = ("/tela-de-login/"))
    public List<student> telaDeLogin() {
        student estudante = new student();
        estudante.setId(1l);
        estudante.setName("Michel");
        estudante.setCourse("Sistemas de informacao");
        estudante.setRegisterNumber("20260101");
        estudante.setRegisterDate(LocalDate.now());
        student estudante2 = student.builder()
                .id(2l)
                .name("Amanda")
                .registerNumber("20260202")
                .course("Sistemas de informacao")
                .registerDate(LocalDate.now())
                .build();
        List<student> lista = Arrays.asList(estudante, estudante2);
        return lista;
    }
}
