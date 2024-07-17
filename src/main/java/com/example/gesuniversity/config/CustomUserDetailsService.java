package com.example.gesuniversity.config;

import com.example.gesuniversity.model.Enseignant;
import com.example.gesuniversity.repository.EnseignantRepository;
import com.example.gesuniversity.service.impl.EnseignantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Enseignant enseignant = enseignantRepository.findByEmail(email);
        if (enseignant == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new User(enseignant.getEmail(), enseignant.getPassword(), getGrantedAuthorities(enseignant.getRole()));
    }

    private List<GrantedAuthority> getGrantedAuthorities(String role) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        return authorities;
    }
}
