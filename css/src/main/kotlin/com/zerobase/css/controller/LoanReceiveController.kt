package com.zerobase.css.controller

import com.zerobase.css.dto.*
import com.zerobase.css.service.LoanReviewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/css/api/v1")
class LoanReceiveController(
        private val loanReviewService: LoanReviewService
) {
    @PostMapping("/request")
    fun loanReceive(
            @RequestBody requestInputDto: LoanRequestDto.RequestInputDto
    ): LoanResultDto.ResponseDto =
            loanReviewService.loanReview(requestInputDto)
}