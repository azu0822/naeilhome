package com.spring.naeilhome.review.service;

import java.util.List;
import java.util.Map;

import com.spring.naeilhome.review.domain.ReviewDomain;

public interface ReviewService {

	// 리뷰 게시글 조회
	public Map<String, Object> selectReviewList(String memberId) throws Exception;

	// 리뷰작성시 상품이름 조회
	public String selectProductName(int productNo) throws Exception;

	// 리뷰 저장
	public void addReview(ReviewDomain reviewDomain) throws Exception;

	// 리뷰이미지 저장
	public int selectCurrVal() throws Exception;

	// 리뷰 이미지저장
	public void addImage(Map<String, Object> imageMap) throws Exception;

	// 상세페이지에서 상품에 대한 모든 리뷰 조회
	public List<ReviewDomain> reviewsList(String productName) throws Exception;

}
