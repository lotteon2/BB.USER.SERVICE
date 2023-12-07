package com.bit.lotte.flower.user.social.mapper;


import com.bit.lotte.flower.user.common.DefaultProfileImagerURL;
import com.bit.lotte.flower.user.common.valueobject.AuthId;
import com.bit.lotte.flower.user.social.dto.command.UserLoginCommand;
import com.bit.lotte.flower.user.social.dto.response.UserLoginDataResponse;
import com.bit.lotte.flower.user.social.dto.response.UserMyPageDataResponse;
import com.bit.lotte.flower.user.social.entity.SocialUser;

public class SocialUserMapper {


  private SocialUserMapper()
  {

  }

  public static UserLoginDataResponse getLoginResponse(String nickName,
      boolean isPhoneNumberRegistered) {
    return UserLoginDataResponse.builder()
        .nickname(nickName)
        .isPhoneNumberIsRegistered(isPhoneNumberRegistered).build();

  }


  public static SocialUser createSocialUserByLoginCommand(UserLoginCommand userCreateCommand) {
    return SocialUser.builder().isDeleted(false).nickname(userCreateCommand.getNickname()).email(
            userCreateCommand.getEmail())
        .phoneNumber(null).profileImage(DefaultProfileImagerURL.PROFILE_DEFAULT_IMAGE_URL).oauthId(
            userCreateCommand.getSocialId().getValue()).build();
  }

  public static UserLoginDataResponse createUserLoginCommandBySocialUser(String profileImage,
      String nickname, Boolean socialUserPhoneIsRegistered) {
    return UserLoginDataResponse.builder().isPhoneNumberIsRegistered(socialUserPhoneIsRegistered)
        .nickname(
            nickname).profileImage(profileImage).build();
  }

  public static UserMyPageDataResponse socialUserToUserMyPageDataResponse(SocialUser socialUser,
      Long couponCnt, Long likesCnt) {
    return UserMyPageDataResponse.builder().couponCnt(couponCnt).likesCnt(likesCnt)
        .email(socialUser.getEmail()).nickname(socialUser.getNickname())
        .phoneNumber(socialUser.getPhoneNumber()).build();
  }
}
