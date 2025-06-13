package com.secor.cif9jun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MainRestController
{

    @Autowired
    CredentialRepository credentialRepository;

    @PostMapping("signup")
    public ResponseEntity<String> signup(@ModelAttribute Credential credential)
    {
        credentialRepository.save(credential);
        return ResponseEntity.ok("Credential saved successfully!");
    }

}
