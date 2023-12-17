package soa.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.entities.Categorie;
import soa.repository.CategorieRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categories")
public class CategorieRESTController {

    @Autowired
    private CategorieRepository categorieRepository;

    @GetMapping(value = "/")
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Categorie getCategorie(@PathVariable Long id) {
        return categorieRepository.findById(id).orElse(null);
    }

   /* @PostMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Categorie saveCategorie(@RequestBody Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Categorie updateCategorie(@PathVariable Long id, @RequestBody Categorie categorie) {
        Categorie existingCategorie = categorieRepository.findById(id).orElse(null);
        if (existingCategorie != null) {
            existingCategorie.setCode(categorie.getCode());
            existingCategorie.setLibelle(categorie.getLibelle());

            return categorieRepository.save(existingCategorie);
        }
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCategorie(@PathVariable Long id) {
        categorieRepository.deleteById(id);
    }*/
}
