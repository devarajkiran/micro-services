
-Dspring.profiles.active=service-registry1
http://localhost:8761/


-Dspring.profiles.active=service-registry2
http://localhost:8762/

Open C:\Windows\System32\drivers\etc\hosts
127.0.0.1       service-registry1
127.0.0.1       service-registry2

1. Eureka we run in peer mode(2 servers), so it will act both as Client and Server.

