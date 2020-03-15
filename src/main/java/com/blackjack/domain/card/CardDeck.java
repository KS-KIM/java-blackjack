package com.blackjack.domain.card;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import com.blackjack.exception.EmptyCardDeckException;

public class CardDeck {
	private Stack<Card> cards;

	private CardDeck(Stack<Card> cards) {
		validateDuplicate(cards);
		this.cards = cards;
	}

	public static CardDeck create() {
		Stack<Card> cards = new Stack<>();
		cards.addAll(Card.values());
		Collections.shuffle(cards);
		return new CardDeck(cards);
	}

	private void validateDuplicate(Stack<Card> cards) {
		Set<Card> distinctCards = new HashSet<>(cards);
		if (distinctCards.size() != cards.size()) {
			throw new IllegalArgumentException("카드에 중복된 수가 있습니다.");
		}
	}

	public Card pop() {
		try {
			return cards.pop();
		} catch (EmptyStackException e) {
			throw new EmptyCardDeckException();
		}
	}
}
