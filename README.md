# DevMate-SpringBoot 🧠

로컬에서 실행되는 AI 개발 비서입니다.  
Spring Boot + Ollama 기반으로, 다음 기능을 제공합니다:

- 📄 코드 생성
- 🧪 테스트 자동 작성
- 🔁 리팩토링 제안
- 📋 Confluence 페이지 요약
- 📝 Git 커밋 메시지 생성
- 📦 PR 메시지 자동 작성
- 📄 Swagger 주석 자동 생성

## 설치 방법
1. Ollama 설치: `brew install ollama`
2. 모델 다운로드: `ollama pull qwen2:7b`
3. 백엔드 실행: `./gradlew bootRun`

### 📁 디렉토리 구조

```
devmate-spring/
├── README.md
├── LICENSE
├── .gitignore
├── backend/
│   ├── src/main/java/com/devmate/
│   │   ├── controller/        # 기능별 API
│   │   ├── service/           # 로직 처리
│   │   ├── client/            # Ollama, Git, Confluence
│   │   ├── model/             # DTO
│   │   └── config/            # 설정
│   ├── src/main/resources/
│   │   └── prompts/           # 프롬프트 템플릿
│   └── build.gradle
└── frontend/ (선택)
    ├── public/
    ├── src/
    │   ├── components/
    │   ├── pages/
    │   ├── services/
    │   └── App.jsx
    └── package.json
```


## 🔗 API 예시

- `POST /generate` → 코드 생성
- `POST /test` → 테스트 생성
- `POST /refactor` → 리팩토링
- `POST /swagger/annotate` → Swagger 주석
- `POST /git/message` → 커밋/PR 메시지
- `POST /confluence/summarize` → 페이지 요약

---

## 🔐 보안 고려사항

- API 키는 `.env` 또는 `application.yml`로 분리
- Git 명령어는 `ProcessBuilder`로 안전하게 실행
- Confluence API는 PAT 또는 OAuth 방식 지원 가능
- CORS 설정 포함 → 프론트엔드 연동 가능

---
