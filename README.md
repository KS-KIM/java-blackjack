# java-blackjack
블랙잭 게임 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 수익률 계산 방식

- 버스트는 점수를 0으로 판단하여 비교한다.

- 플레이어의 점수가 더 높은 경우
    - 플레이어가 블랙잭이면 배팅액의 1.5배의 수익을 얻는다.
    - 플레이어가 블랙잭이 아니면 배팅액의 1배의 수익을 얻는다.

- 점수가 같은 경우 수익을 얻지 않는다.

- 플레이어의 점수가 더 낮은 경우 베팅액을 모두 잃는다.

## 기능 목록

- 게임에 참여할 사람의 이름 입력
    - [예외] 이름은 최소 1글자 이상
    - [예외] 공백 불가능
    - [예외] 중복된 이름 불가능
    - [예외] 참여자는 7명 이하만 가능
    - 파싱하는 기능
    
- 52장의 카드를 생성하는 기능
    - 카드는 4가지 문양을 가진다
    - 카드는 1부터 10, J, Q, K를 가진다

- 플레이어에게 카드를 2장씩 나눠주는 기능

- 카드를 출력해주는 기능
    - 딜러는 1장만 출력
    - 플레이어는 받은 카드 모두 출력
    
- 각 플레이어가 카드를 더 받을지 입력받는 기능
    - 플레이어의 카드가 21이상인지 확인하는 기능
    
- 딜러의 카드가 16이하이면 카드를 받는 기능

- 결과를 계산하는 기능
- 참여자들의 모든 카드를 출력하는 기능

- 참여자들의 수익을 출력하는 기능