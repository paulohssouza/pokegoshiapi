package br.com.paulohss.pokegoshiapi.service;

import br.com.paulohss.pokegoshiapi.dto.PokeGoshiEggTypeListDTO;
import br.com.paulohss.pokegoshiapi.util.Constants;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeGoshiService {

    public PokeGoshiEggTypeListDTO getEggInfoPokeAPI() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokeGoshiEggTypeListDTO> responseEntity = restTemplate
                .getForEntity(Constants.URL_EGGS, PokeGoshiEggTypeListDTO.class);
        return responseEntity.getBody();
    }

}
