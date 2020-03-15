package com.blackjack.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Score {
	private static final String SCORE_OUT_OF_RANGE_MESSAGE = "점수의 범위를 벗어났습니다.";
	private static final int MIN_SCORE = 1;
	private static final int MAX_SCORE = 30;
	private static final int BLACKJACK_SCORE = 21;
	private static final Map<Integer, Score> SCORE_CACHE = new HashMap<>();

	static {
		for (int score = MIN_SCORE; score <= MAX_SCORE; ++score) {
			SCORE_CACHE.put(score, new Score(score));
		}
	}

	private final int score;

	private Score(int score) {
		validateBounds(score);
		this.score = score;
	}

	public static Score valueOf(int value) {
		return Optional.ofNullable(SCORE_CACHE.get(value))
				.orElseThrow(() -> new IllegalArgumentException(SCORE_OUT_OF_RANGE_MESSAGE));
	}

	private void validateBounds(int score) {
		if (score < MIN_SCORE || score > MAX_SCORE) {
			throw new IllegalArgumentException(SCORE_OUT_OF_RANGE_MESSAGE);
		}
	}

	public boolean isLowerThan(int drawCondition) {
		return score < drawCondition;
	}

	public boolean isBust() {
		return score > BLACKJACK_SCORE;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Score score1 = (Score)o;
		return score == score1.score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(score);
	}

	@Override
	public String toString() {
		return String.valueOf(score);
	}

	public ResultType compareTo(Score dealerScore) {
		if (score > dealerScore.score) {
			return ResultType.WIN;
		}
		if (score < dealerScore.score) {
			return ResultType.LOSE;
		}
		return ResultType.DRAW;
	}
}
