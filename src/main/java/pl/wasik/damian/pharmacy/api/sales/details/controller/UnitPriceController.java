package pl.wasik.damian.pharmacy.api.sales.details.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wasik.damian.pharmacy.api.sales.details.model.UnitPrice;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/unitprices")
public class UnitPriceController {

    @GetMapping
    public List<UnitPrice> list() {
        return new ArrayList<>();
    }

    @PostMapping
    public UnitPrice create(@RequestBody UnitPrice unitPrice) {
        return new UnitPrice();
    }

    @GetMapping(value = "/{id}")
    public UnitPrice read(@PathVariable Long id) {
        return new UnitPrice();
    }

    @PutMapping
    public UnitPrice update(@RequestBody UnitPrice unitPrice) {
        return new UnitPrice();
    }

    @DeleteMapping(value = "/{id}")
    public UnitPrice delete(@PathVariable Long id) {
        return new UnitPrice();
    }
}
