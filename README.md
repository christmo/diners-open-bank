# diners-open-bank
Diners Oauth2 - Service Open Bank

# Compilation
```zsh
mvn clean package docker:build
```

# Docker build
```bash
cd services
docker build -t diners-services .
docker run --name diners-services -p 8082:8082 diners-services
docker tag diners-services:latest christmo/diners-services:latest
docker push christmo/diners-services:latest
```

# Docker OAuth2 Server

```bash
cd oauth2-server
docker build -t diners-oauth2 .
docker run --name diners-oauth2 -p 8081:8081 diners-oauth2
docker tag diners-oauth2:latest christmo/diners-oauth2:latest
docker push christmo/diners-oauth2:latest
```

# URI Oauth2

```curl
curl -X POST -H "Authorization: Basic RGluZXJzQ2x1YjpzZWNyZXQ=" -H "Content-Type: application/x-www-form-urlencoded" -d "grant_type=password&client_id=DinersClub&username=user1&password=pass" http://localhost:8081/diners-security/oauth/token
```

# URI Authenticated Service
```curl
curl -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJ1c2VyMSIsInNjb3BlIjpbImFwaSIsInJlYWQiLCJ3cml0ZSJdLCJvcmdhbml6YXRpb24iOiJ1c2VyMXpIaW4iLCJleHAiOjE1NjcwMDcwMDEsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJqdGkiOiJiZTExYjY0Ny01YWUwLTRiZGMtODMyNS0zNzgzZjAzZjJhYmUiLCJjbGllbnRfaWQiOiJEaW5lcnNDbHViIn0.5ui5nRBe4KiYe39SjBAhGEehwJljH8dzMuin_esJqVU" http://localhost:8082/services/accounts
```