package com.zerobase.api.loan.request

import com.zerobase.domain.domain.UserInfo
import org.springframework.stereotype.Service


interface LoanRequestService {
    fun loanRequestMain(
            loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): LoanRequestDto.LoanRequestResponseDto

    fun saveUserInfo(
        userInfoDto: UserInfoDto
    ): UserInfo

    fun loanRequestReview(userInfoDto: UserInfoDto){
    }
}