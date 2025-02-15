package com.cupid.joalarm.comment.dto;

import com.cupid.joalarm.childcomment.dto.ChildCommentDto;
import io.swagger.annotations.ApiParam;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AllCommentDto {

    private Long commentId;

    @ApiParam(value = "유저 id")
    private Long userId;

    @ApiParam(value = "댓글 작성 시각")
    private LocalDateTime createdAt;

    @ApiParam(value = "댓글 내용")
    private String content;

    @ApiParam(value = "대댓글 리스트")
    private List<ChildCommentDto> childCommentDto;

    @ApiParam(value = "댓글 좋아요 수")
    private Long likeCnt;

    @ApiParam(value = "유저 학교")
    private String userSchool;

    @ApiParam(value = "익명 카운트")
    private Long anonymousCnt;

    @ApiParam(value = "좋아요 여부")
    private Boolean likeStatus;
}
