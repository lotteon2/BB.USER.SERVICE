package com.bit.lotte.flower.user.social.service;

import com.bit.lotte.flower.user.social.dto.response.UserMyPageDataResponse;
import org.springframework.stereotype.Service;

@Service
public interface GetUserInfoService {
  UserMyPageDataResponse getUserdata(Long id, Long couponCnt, Long likesCnt);
