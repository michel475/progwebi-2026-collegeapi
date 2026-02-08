package progwebi.apicollege.LoginController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping(path = ("/tela-de-login/"))
    public String telaDeLogin() {
        return ("""
                <html>
                    <head></head>
                    <body>
                    <h1 font-color=blue>Bem vindo</h1>
                        <label>Usuario</label>
                        <input type="text" placeholder="Digite seu nome de usuario">
                        <label>Senha</label>
                        <input type="password" placeholder="Digite sua senha">
                    </body>
                </html>
                """);
    }
}
