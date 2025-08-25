# API-Automation-RestAssured

Automated API testing framework using **Java**, **RestAssured**, and **TestNG**.

## 🔧 Tech Stack

- Java 11+
- RestAssured (v5+)
- TestNG
- Maven

## 📁 Project Structure


src/
├── main/java/utils/ → BaseTest with setup
└── test/java/tests/ → API test cases



## 🧪 Sample Tests

- `GET /users?page=2` → Returns user list
- `POST /users` → Creates a new user

## ▶️ How to Run

```bash
mvn clean test




✅ Example Test Assertion

Assert.assertEquals(response.getStatusCode(), 200);
Assert.assertTrue(response.jsonPath().getList("data").size() > 0);





---

## 🔁 CI/CD Integration

GitHub Actions CI pipeline automatically runs all **RestAssured API tests** on push and PRs.

### ✅ Workflow: `.github/workflows/ci.yml`
```yaml
on: [push, pull_request]
jobs:
  api-tests:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - uses: actions/setup-java@v3
        with:
          java-version: '11'
      - run: mvn clean test




📄 Test Report
Basic console output. For reporting plugins (like ExtentReports or Allure), extend the setup.
