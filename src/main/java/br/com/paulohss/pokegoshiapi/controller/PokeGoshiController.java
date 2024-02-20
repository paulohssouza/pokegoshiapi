package br.com.paulohss.pokegoshiapi.controller;

import br.com.paulohss.pokegoshiapi.dto.PokeGoshiEggTypeListDTO;
import br.com.paulohss.pokegoshiapi.service.PokeGoshiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pokegoshi")
public class PokeGoshiController {

    private final PokeGoshiService pokeGoshiService;

    public PokeGoshiController(PokeGoshiService service) {
        this.pokeGoshiService = service;
    }

    @GetMapping("/eggs")
    public PokeGoshiEggTypeListDTO getEggs() {
        return pokeGoshiService.getEggInfoPokeAPI();
    }
}
