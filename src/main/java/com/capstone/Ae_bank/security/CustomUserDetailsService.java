package com.capstone.Ae_bank.security;

import com.capstone.Ae_bank.auth.User;
import com.capstone.Ae_bank.repositories.UserRepository;
import com.sun.security.auth.UserPrincipal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@AllArgsConstructor
@RequiredArgsConstructor

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return  userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        //return new User(user.getUsername(), user.getPassword(), user.getAuthorities().toString());

    }
}
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Let people login with username
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() ->
//                        new UsernameNotFoundException("User not found with username : "));
//
//        return UserPrincipal.create(user);
//    }
//
//
//
//    // This method is used by JWTAuthenticationFilter
//    @Transactional
//    public UserDetails loadUserById(Long id) {
//        User user = userRepository.findById(id).orElseThrow(
//                () -> new UsernameNotFoundException("User not found with id : " + id)
//        );
//
//        return UserPrincipal.create(user);
//    }
//}
