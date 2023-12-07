package com.bit.lotte.flower.user.social.service;

import com.bit.lotte.flower.user.social.dto.response.UserMyPageDataResponse;
import org.springframework.stereotype.Service;

@Service
public interface SocialUserService {

  UserMyPageDataResponse getUserdata(Long id);

  void updatePhoneNumber(String phoneNumber);

  void updateUserInfo(String nickname, String email, String phoneNumber);
}

