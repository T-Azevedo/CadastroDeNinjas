package dev.azevedo.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    public NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Boas Vindas";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criar() {
        return "Criado com sucesso";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodos() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninjas por id (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar ninja por ID";
    }

    // Deletar ninjas (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaID() {
        return "Ninja deletado por ID";
    }


}
