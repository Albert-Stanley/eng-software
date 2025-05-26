package com.engsoft.mvc.controller;


import com.engsoft.mvc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaginaController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/pagina")
    public String listarProdutos(
            @RequestParam(value = "q", required = false) String query,
            Model model) {

        if (query != null) {
            model.addAttribute("produtos", produtoRepository.findByNome(query));
        } else {
            model.addAttribute("produtos", produtoRepository.findAll());
        }

        model.addAttribute("query", query);
        return "index"; // Retorna o nome do arquivo "index.html"
    }
}