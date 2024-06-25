package com.example.backend.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

@Service
public class AuthenticationService {

  // Dummy credentials for demonstration
  private final String validUsername = "admin";
  private final String validPassword = "admin";

  public boolean authenticate(String authHeader) {
    if (authHeader != null && authHeader.startsWith("Basic ")) {
      // Extract base64 encoded username and password
      String base64Credentials = authHeader.substring("Basic ".length()).trim();
      String credentials = new String(Base64Utils.decodeFromString(base64Credentials));

      // credentials = username:password
      String[] values = credentials.split(":", 2);
      return values[0].equals(validUsername) && values[1].equals(validPassword);
    }
    return false;
  }
}
