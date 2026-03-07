package com.university.labmanager;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import java.util.HashMap;
import java.util.Map;

public class TestAppsScript {
    public static void main(String[] args) {
        String APP_SCRIPT_URL = "https://script.google.com/macros/s/AKfycbxqnzpEUfRU8ec1F2EGQP7naGen0E0_pGhIZqCVWQF123rNFk1ybnqTPGbanZR_0Kx-/exec";
        RestTemplate restTemplate = new RestTemplate();

        System.out.println("Started TestAppsScript...");

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            Map<String, String> body = new HashMap<>();
            body.put("to", "ortizlopezf59@gmail.com");
            body.put("subject", "Test from Local Java");
            body.put("htmlBody", "<h1>Hello</h1><p>This is a test</p>");

            HttpEntity<Map<String, String>> request = new HttpEntity<>(body, headers);

            System.out.println("Sending POST to: " + APP_SCRIPT_URL);
            String response = restTemplate.postForObject(APP_SCRIPT_URL, request, String.class);
            System.out.println("RESPONSE: " + response);

        } catch (Exception e) {
            System.out.println("ERROR OCCURRED:");
            e.printStackTrace();
        }
    }
}
