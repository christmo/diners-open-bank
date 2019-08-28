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
```

# Docker OAuth2 Server

```bash
docker run --name diners-oauth2 -p 8082:8082 diners-oauth2
```