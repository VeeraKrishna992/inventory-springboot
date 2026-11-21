package com.example.inventory;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @GetMapping("/api/inventory")
    public List<Map<String, Object>> inventory() {
        return List.of(Map.of("id", 1, "item", "Laptop", "quantity", 200),
                       Map.of("id", 2, "item", "Mouse", "quantity", 250),
                       Map.of("id", 3, "item", "Keyboard", "quantity", 150));
    }
    @GetMapping("/api/health")
    public Map<String, String> health() { return Map.of("status", "UP"); }
}
