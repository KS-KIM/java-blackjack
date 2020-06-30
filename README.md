# java-blackjack
블랙잭 게임 미션 저장소

## 기능 목록
* [X] 게임에 참여할 사람의 이름을 입력받는다.
    * [X] 참여자의 이름은 1 ~ 5자로 구성된다.
    * [X] 참여자의 이름 앞, 뒤에 오는 공백은 무시한다.
    * [X] 참여자의 이름은 comma(,) 단위로 구분한다.
    * [ ] 참여자의 수는 2 ~ 8명이다.
* [ ] 각 참여자의 베팅 금액을 입력받는다.
    * [X] 베팅 금액의 최소 단위는 100으로 제한한다.
* [ ] 딜러와 각 참여자에게 카드를 두 장씩 분배한다.
* [ ] 각 참여자에게 나누어 준 카드를 출력한다.
    * [ ] 딜러는 첫 번째 카드를 제외하고 한 장의 카드만 공개한다.
    * [ ] 각 참여자는 두 장의 카드를 공개한다.
* 딜러가 블랙잭인지 여부를 판별하고, 블랙잭이면 결과를 출력한다.
    * [ ] 참여자가 블랙잭이라면 무승부이다.
    * [ ] 참여자가 블랙잭이 아니라면 딜러의 승리이다.
* 참여자 히트
    * [ ] 참여자가 블랙잭, 버스트가 아니라면 추가적으로 카드를 히트할지 여부를 입력받는다.
    * [ ] 참여자가 스테이하면 다음 사람 턴으로 넘어간다.
    * [ ] 참여자가 히트하면 카드 발급 후 카드를 출력한다.
* 딜러 히트
    * [ ] 딜러는 가진 패의 합이 16 이하라면 반드시 히트해야 한다.
* [ ] 딜러와 참여자가 받은 모든 패를 공개하고, 결과를 출력한다.
* [ ] 각 참여자의 최종 수익을 출력한다.

## 게임 조건
* 두 장의 패를 뽑아 합이 21인 경우 블랙잭이다.
* 카드의 합이 21을 초과하는 경우 버스트이다.
* 각 ACE는 1 또는 11로 계산할 수 있다.
* 참여자가 버스트가 되면 딜러의 버스트 여부와 상관없이 참여자가 패배한다.

### 수익 계산
* 무승부인 경우 베팅한 금액을 돌려받아 수익이 없다.
* 참여자가 승리한 경우
    * 블랙잭이 아니라면 베팅 금액만큼 수익을 얻는다.
    * 블랙잭이라면 베팅 금액의 1.5배의 수익을 얻는다.
* 참여자가 패배하면 베팅한 모든 금액을 잃는다.
