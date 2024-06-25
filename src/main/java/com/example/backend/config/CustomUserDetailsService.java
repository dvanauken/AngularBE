package com.example.backend.config;

import com.example.backend.entity.Role;
import com.example.backend.repository.RoleUserRepository;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


import java.util.Collection;
import java.util.stream.Collectors;
// ... other imports ...

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleUserRepository roleUserRepository; // Add this repository

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.example.backend.entity.User user = userRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        // Fetch roles from RoleUser table
        Collection<Role> roles = roleUserRepository.findRolesByUserId(user.getId());

        System.out.printf("\nuserName=[%s], password=[%s], roles=[%s]", user.getUserName(), user.getPassword(), roles);

        return new org.springframework.security.core.userdetails.User(
                user.getUserName(),
                user.getPassword(), // Use the plain text password as it is
                mapRolesToAuthorities(roles)
        );
    }


    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
