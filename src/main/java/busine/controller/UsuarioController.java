package busine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import busine.model.Usuario;
import busine.repository.UsuarioRepository;

@Controller //Declara que é uma classe controller (Está disponivel como uma url válida ). Quando vem uma requisição do usuário até o Spring, ele verifica a URL solicitada e direciona para a Controller correspondente.
public class UsuarioController {
	@Autowired//Adapta o contrutor automaticamente com as informações que forem passadas
	private UsuarioRepository usuarioRepository;//Declara a interface UsuarioRepository
	
	@RequestMapping(value = "/usuario/{idUsuario}", method = RequestMethod.GET)//Esta classe controller está esperando a solicitação da url aqui especificada (/usuario/{idUsuario}), com a ação também definida nesta anotação (GET). Em outras palavras, a anotação RequestMapping indica a URL que será usada pelo método (URL agora associada pelo Spring Boot à presente classe Controller, a qual esperará sua chamada) Juntamente com o tipo de ação que será realizada (GET, POST, PUT, DELETE).
    public ResponseEntity<?> getClienteById(@PathVariable("idUsuario") Long idUsuario) {//Com PathVariable o Spring Boot extrai o valor da URL (Que veio na variável idUsuario) e coloca na String (Ou seja qual for o tipo) contida nos parâmetros do método. 
        
		Usuario usuario = usuarioRepository.findOne(idUsuario);
      
        if (usuario == null) {//Se o objeto usuário for nulo (Não vier nenhuma informação), retorne mensagem de "Não encontrado"
            return new ResponseEntity(/*new CustomErrorType("Cliente com codCliente " + idUsuario + " nao encontrado"), */HttpStatus.NOT_FOUND);
        }else{//Se não estiver nulo, retorne o objeto usuario
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        }
    }
	
	
}
