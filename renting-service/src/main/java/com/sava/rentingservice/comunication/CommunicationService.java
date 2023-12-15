package com.sava.rentingservice.comunication;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommunicationService {
    private final RestTemplate restTemplate;

    public Book getBookById(String id) {
        ResponseEntity<Book> response = restTemplate.exchange(
                RestClientConfig.BOOK_BASE_URL + "/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Book>() {
                });

        return response.getBody();
    }

    public Boolean decreaseBook(String id) {
        ResponseEntity<Boolean> response = restTemplate.exchange(
                RestClientConfig.BOOK_BASE_URL + "/decrease/" + id,
                HttpMethod.POST,
                null,
                new ParameterizedTypeReference<Boolean>() {
                });

        return response.getBody();
    }

    public User getUserId(String id) {
        ResponseEntity<User> response = restTemplate.exchange(
                RestClientConfig.USER_BASE_URL + "/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<User>() {
                });

        return response.getBody();
    }
}
