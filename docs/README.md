## UI 요구사항

### PurchaseLottoComponent

- 로또 구입 컴포넌트

- [ ] 구입금액을 입력합니다.
- [ ] 구매한 로또를 개수와 함께 출력합니다.
- [ ] 로또 번호를 정렬한 상태로 출력합니다.

### RegisterAnswerLottoComponent

- 정답 로또 등록 컴포넌트

### RegisterBonusNumberComponent

- 보너스 번호 등록 컴포넌트

### PaymentSummaryComponent

- 정산 결과를 보여주는 컴포넌트

## Domain 요구사항

### PaymentAmount

- 결제 금액을 의미하는 도메인입니다.
- repository에 저장 됩니다.
- 구매 가능한 로또 개수를 반환하는 기능을 가집니다.

#### 예외 조건

- 1000원 미만은 구매할 수 없습니다.
- 1000원 단위로 구매 가능합니다.
