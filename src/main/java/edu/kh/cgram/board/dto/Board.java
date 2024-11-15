package edu.kh.cgram.board.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Board {
    
    // 행 번호 ==>  ????????????????
    private int	   rnum;
    
    // BOARD 테이블 컬럼과 매핑되는 필드
    private int    boardNo;
    private String boardContent;
    
    // 작성일 수정일
    private String createdAt;
    private String modifiedAt;
    
    private int    readCount;
    private String boardDelFl;
    private int    memberNo;
    
    // MEMBER 테이블 JOIN 컬럼
    private String memberNickname;
    
    // 목록 조회 시 댓글 / 좋아요 수 상관 쿼리 결과
    private int    commentCount;
    private int    likeCount;
    
    // ----------------------------------------
    
    private String thumbnail;	// 썸네일 이미지 (경로와 이름)
    private String profileImg;	// 작성자 프로필 이미지
    
    // 특정 게시글의 이미지 목록을 저장할 필드
    private List<BoardImg> imageList;
    
    // 특정 게시글의 댓글 목록을 저장할 필드
    private List<Comment> commentList;
    
    // 좋아요 체크 여부를 저장할 필드(1 == 누른적 있음)
    private int likeCheck;
    
}
