## UI 요구사항

### PurchaseLottoComponent

- 로또 구매 화면

### RegisterAnswerLottoComponent

- 당첨 로또 등록 화면

### RegisterBonusLottoComponent

- 보너스 등록 화면

### StaticsLottoComponent

- 로또 통계 화면

--- 

## 저장 대상

- PurchasedLottoBundle
- PaymentAmount
- AnswerLotto

--- 

## 도메인 요구사항

### [도메인] 로또 #Lotto

- 1~45사이의 숫자로 구성되 6자리로 구성되어 있습니다.
- 중복되지 않습니다.

### [도메인] 보너스 번호 #BonusNumber

- 1~45사이의 숫자로 구성 됩니다.

### [도메인] AnswerLotto

- 로또와 보너스 번호를 가집니다.
- 보너스 번호는 로또와 중복되지 않습니다.
- 로또와 비교 가능합니다.

### [도메인] 구매한 로또 묶음 PurchasedLottoBundle

- 정답 로또와 비교 가능합니다.

### [도메인] 로또 결과 #RottoResult

- 일반 번호 정답 개수를 가집니다.
- 보너스 번호 확인 여부를 가집니다.

---