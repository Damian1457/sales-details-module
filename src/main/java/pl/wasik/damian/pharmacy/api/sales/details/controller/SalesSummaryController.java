package pl.wasik.damian.pharmacy.api.sales.details.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wasik.damian.pharmacy.api.sales.details.model.SalesSummary;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/salessummaries")
public class SalesSummaryController {

    @GetMapping
    public List<SalesSummary> list() {
        return new ArrayList<>();
    }

    @PostMapping
    public SalesSummary create(@RequestBody SalesSummary salesSummary) {
        return new SalesSummary();
    }

    @GetMapping(value = "/{id}")
    public SalesSummary read(@PathVariable Long id) {
        return new SalesSummary();
    }

    @PutMapping
    public SalesSummary update(@RequestBody SalesSummary salesSummary) {
        return new SalesSummary();
    }

    @DeleteMapping(value = "/{id}")
    public SalesSummary delete(@PathVariable Long id) {
        return new SalesSummary();
    }
}
