# demo-devops

## Pokretanje zasebno
Otvori se u IntelliJ i pokrene se aplikacija

### Pokrtanje preko docker-a
Potrebno je uraditi mvn clean package

`docker build --tag=post-server:latest .` (demo1) ili `docker build --tag=post-server2:latest .` (demo2)

`docker compose up` ili se otvori docker-compose.yaml fajl i pokrene se klikom na strelicu

Otvori se browser na localhost 4000 (demo1) ili 5000 (demo2)

## Pokretanje svega
Izbilduju se obe slike kao sto je gore navedeno

Pokrene se docker compose iz root foldera projekta
