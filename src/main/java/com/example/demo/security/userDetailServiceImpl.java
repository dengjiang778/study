package com.example.demo.security;

import com.example.demo.mapper.AuthorityMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Date;
import java.util.List;

public class userDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userMapper.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Can't find user by username [" + username + "]");
        }
        if (user.isForbidden()) {
            Date now = new Date();
            if (now.before(user.getForbidEndTime())) {
                try {
                    throw new Exception("该用户暂时被禁用");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        List<String> authorityList = authorityMapper.findByUser(user.getId());
        authorityList.add("BACKEND");
        String authority = StringUtils.join(authorityList, ",");
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList(authority);
        user.setAuthorities(grantedAuthorities);
        return user;
    }


}
