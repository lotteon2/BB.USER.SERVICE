package com.bit.lotte.flower.user.social.service;

import org.springframework.stereotype.Service;

@Service
public interface SocialUpdateUserService {
  void updateUserInfo(Long userId, String nickname, String email, String phoneNumber);
}

