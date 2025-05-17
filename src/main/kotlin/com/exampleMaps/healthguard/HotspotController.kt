package com.example.healthguard

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hotspots")
class HotspotController {

    @GetMapping
    fun getHotspots(): List<Hotspot> {
        return listOf(
            Hotspot(42.0, 21.43, "pollution", "Air pollution above EU threshold"),
            Hotspot(41.99, 21.42, "virus", "Detected flu-like cluster"),
            Hotspot(42.01, 21.45, "both", "Combined hotspot: pollution + virus")
        )
    }
}