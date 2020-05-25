package com.example.demo.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MyPasswordEncoder implements PasswordEncoder {
    private static String defaultSalt = "ds9323esadfasd,.$dfsadfsdf2323xxxx3";

    @Override
    public String encode(CharSequence rawPassword) {
        return MD5Util.getMD5Encoding(rawPassword + defaultSalt);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }

}
