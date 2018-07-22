package mr.mbconsulting.Sygep.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mr.mbconsulting.Sygep.services.BienImmobilierService;
import org.springframework.web.bind.annotation.*;

import mr.mbconsulting.Sygep.entities.BienImmobilier;


@RestController
@RequestMapping("/bien-immobiliers")
public class BienImobilierController {

    private BienImmobilierService bienImmobilierService;

    public BienImobilierController(BienImmobilierService bienImmobilierService) {
        this.bienImmobilierService = bienImmobilierService;
    }

    @GetMapping("/all")
    public List<BienImmobilier> getAll() {
        return bienImmobilierService.getAll();

    }

    @PostMapping("/add")
    public BienImmobilier save(@RequestBody BienImmobilier bienImmobilier) {
        return bienImmobilierService.save(bienImmobilier);
    }



    @PutMapping("/update/{id}")
    public BienImmobilier update(@PathVariable("id") Long id, @RequestBody BienImmobilier bienImmobilier) {

        return bienImmobilierService.update(id, bienImmobilier);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delate(@PathVariable("id") Long id) {
        return bienImmobilierService.delete(id);
    }


}
