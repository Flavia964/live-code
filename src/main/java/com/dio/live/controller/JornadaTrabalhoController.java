package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping ("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada ( @RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada ( jornadaTrabalho );
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @PutMapping
    public JornadaTrabalho updateJornada ( @RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada ( jornadaTrabalho );
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity <JornadaTrabalho> getJornadaByid( @PathVariable("idjornada") Long idJornada) throws Exception{
        try {
            jornadaService.deleteJornada ( idJornada );
        }catch (Exception e) {
            System.out.println ( e.getMessage () );
        }
      return (ResponseEntity< JornadaTrabalho>) ResponseEntity.ok ();

    }
}
