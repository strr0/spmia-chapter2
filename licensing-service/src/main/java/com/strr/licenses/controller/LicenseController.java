package com.strr.licenses.controller;

import com.strr.licenses.model.License;
import com.strr.licenses.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
public class LicenseController {
    private final LicenseService licenseService;

    @Autowired
    public LicenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @GetMapping("/{licenseId}")
    public License getLicenses(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId) {

        return licenseService.getLicense(licenseId);
    }

    @PutMapping("{licenseId}")
    public String updateLicenses( @PathVariable("licenseId") String licenseId) {
        return "This is the put";
    }

    @PostMapping("{licenseId}")
    public String saveLicenses( @PathVariable("licenseId") String licenseId) {
        return "This is the post";
    }

    @DeleteMapping("{licenseId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses( @PathVariable("licenseId") String licenseId) {
        return "This is the Delete";
    }
}
