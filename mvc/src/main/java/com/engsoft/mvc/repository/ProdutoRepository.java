package com.engsoft.mvc.repository;

import com.engsoft.mvc.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProdutoRepository {

    private final List<Produto> produtos = new ArrayList<>();

    public ProdutoRepository() {
        // Dados estáticos com 20 produtos e preços atualizados
        produtos.add(new Produto(1L, "Dell XPS 15", "Notebook de alta performance com tela 4K UHD.", 13999.90, "https://m.media-amazon.com/images/I/71qVEKlOvUL.jpg"));
        produtos.add(new Produto(2L, "iPhone 15 Pro", "Câmera de 48MP e chip A17 Bionic.", 7299.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTouynk1Nu-ii7w8AWS8GuYYkiWx3hSkVfTnQ&s"));
        produtos.add(new Produto(3L, "Sony WH-1000XM5", "Fone com o melhor cancelamento de ruído do mercado.", 2099.00, "https://m.media-amazon.com/images/I/61ULAZmt9NL.jpg"));
        produtos.add(new Produto(4L, "Apple Watch Series 9", "Monitor de oxigênio no sangue e ECG.", 3799.00, "https://www.apple.com/newsroom/images/2023/09/apple-introduces-the-advanced-new-apple-watch-series-9/tile/Apple-Watch-S9-hero-230912.jpg.og.jpg?202505082053"));
        produtos.add(new Produto(5L, "Samsung Galaxy Tab S9", "Tablet com tela AMOLED Dinâmica 2X e S Pen.", 5499.00, "https://samsungbrshop.vtexassets.com/arquivos/ids/221615/Galaxy-Tab-S9-Ultra_Graphite_Product-Image_Combo.jpg?v=638514852915230000"));
        produtos.add(new Produto(6L, "Logitech MX Master 3S", "Mouse ergonômico sem fio para performance.", 699.00, "https://m.media-amazon.com/images/I/61+OT7FPABL._AC_UF894,1000_QL80_.jpg"));
        produtos.add(new Produto(7L, "Teclado Mecânico Keychron K2", "Layout 75%, hot-swappable, sem fio.", 599.00, "https://keychronbrasil.com.br/cdn/shop/files/Keychron-K2-Max-QMK-Wireless-Custom-Mechanical-Keyboard-RGB-Backlight-Aluminum-Frame-75percent-Layout-Fully-Assembled-for-Mac-Windows-Linux-Hot-Swappable-Keychron-Super-Red.jpg?v=1724441551&width=1080"));
        produtos.add(new Produto(8L, "Monitor Gamer Alienware 34\" QD-OLED", "Tela curva ultrawide com 175Hz.", 8299.00, "https://www.adrenaline.com.br/wp-content/uploads/2024/01/aw3225qf-back-front-912x569.png"));
        produtos.add(new Produto(9L, "Câmera Sony Alpha a7 IV", "Sensor full-frame de 33MP e vídeo 4K.", 13999.00, "https://acdn-us.mitiendanube.com/stores/976/586/products/1634813219_img_16275741-63b080359968c71da216546119238017-1024-1024.jpg"));
        produtos.add(new Produto(10L, "SSD NVMe Samsung 980 Pro 1TB", "Velocidades de leitura de até 7,000 MB/s.", 649.90, "https://m.media-amazon.com/images/I/71GLjKuxf7L.jpg"));
        produtos.add(new Produto(11L, "Roteador TP-Link Archer AX73 Wi-Fi 6", "Alta velocidade e cobertura para toda a casa.", 899.00, "https://m.media-amazon.com/images/I/51rbZCeyyYL.jpg"));
        produtos.add(new Produto(12L, "JBL Charge 5", "Caixa de som Bluetooth portátil à prova d'água.", 799.00, "https://lojaibyte.vteximg.com.br/arquivos/ids/216905-540-540/caixa-de-som-bluetooth-jbl-charge-5-azul-jblcharge5blu-1.jpg?v=637545256541600000"));
        produtos.add(new Produto(13L, "GoPro HERO12 Black", "Câmera de ação com estabilização HyperSmooth.", 2799.00, "https://static.gopro.com/assets/blta2b8522e5372af40/bltf3f604c53aa2d69f/64ddb11047ddbc04fbc98905/01-pdp-h12b-CE-gallery-1920.jpg?width=3840&quality=80&auto=webp&disable=upscale"));
        produtos.add(new Produto(14L, "Kindle Paperwhite Signature", "Tela de 6.8\" e carregamento sem fio.", 699.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4RDIi9qZenJP4uePDqAagK5OzyeprzZXlWQ&s"));
        produtos.add(new Produto(15L, "Placa de Vídeo NVIDIA RTX 4080", "Desempenho extremo para jogos e criação.", 7999.00, "https://www.nvidia.com/content/dam/en-zz/Solutions/geforce/ada/rtx-4080/geforce-rtx-4080-super-og-1200x630.jpg"));
        produtos.add(new Produto(16L, "Microfone HyperX QuadCast S", "Microfone USB com iluminação RGB.", 899.00, "https://row.hyperx.com/cdn/shop/files/ai-quadcast-s-1-2000x2000.jpg?v=1737792675"));
        produtos.add(new Produto(17L, "Impressora 3D Creality Ender 3 V2", "Ideal para iniciantes e entusiastas.", 1499.00, "https://images.tcdn.com.br/img/editor/up/712234/ender_3_v2_neo_caracteristicas_creality_impressora_3d_loja3d_design.png"));
        produtos.add(new Produto(18L, "Webcam Logitech C920s Pro HD", "Vídeo Full HD 1080p com tampa de privacidade.", 349.00, "https://cdn.awsli.com.br/2547/2547358/produto/206197257/webcam-logitech-c920-1-hjjltj.jpg"));
        produtos.add(new Produto(19L, "Drone DJI Mini 4 Pro", "Compacto, poderoso e com sensor de obstáculos.", 6199.00, "https://m.media-amazon.com/images/I/51YDGGsBOCL._AC_UF894,1000_QL80_.jpg"));
        produtos.add(new Produto(20L, "Cadeira Gamer Herman Miller x Logitech", "Ergonomia e design para longas sessões.", 6999.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_EcXIix6cvvgH4jdBQuBmDeFffNxTolVVHg&s"));
        produtos.add(new Produto(21L, "Headset Gamer Sem Fio Logitech G Astro A50 X LIGHTSPEED + Base Station", "Headset Gamer Sem Fio Logitech G Astro A50 X LIGHTSPEED + Base Station", 2899.00, "https://m.media-amazon.com/images/I/61FKdt+f-fL.jpg"));
    }

    public List<Produto> findAll() {
        return produtos;
    }

    public List<Produto> findByNome(String termo) {
        if (termo == null || termo.trim().isEmpty()) {
            return findAll();
        }
        return produtos.stream()
                .filter(p -> p.getNome().toLowerCase().contains(termo.toLowerCase()))
                .collect(Collectors.toList());
    }
}
