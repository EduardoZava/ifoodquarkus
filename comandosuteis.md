#Postgres 

sudo systemctl stop postgresql #parando o postgres externo da máquina que esta rodando

In general you can use the following procedure: Go to the terminal and type:

sudo -u postgres psql
When you're logged in and the psql prompt appears then issue this SQL command:

ALTER USER postgres PASSWORD 'newpassword';

#docker-compose

Commands:
  build       Build or rebuild services
  config      Parse, resolve and render compose file in canonical format
  cp          Copy files/folders between a service container and the local filesystem
  create      Creates containers for a service.
  down        Stop and remove containers, networks
  events      Receive real time events from containers.
  exec        Execute a command in a running container.
  images      List images used by the created containers
  kill        Force stop service containers.
  logs        View output from containers
  ls          List running compose projects
  pause       Pause services
  port        Print the public port for a port binding.
  ps          List containers
  pull        Pull service images
  push        Push service images
  restart     Restart service containers
  rm          Removes stopped service containers
  run         Run a one-off command on a service.
  start       Start services
  stop        Stop services
  top         Display the running processes
  unpause     Unpause services
  up          Create and start containers
  version     Show the Docker Compose version information
  wait        Block until the first service container stops

docker ps -a

docker-compose up -d

2019  sudo docker-compose down
2020  sudo docker-compose up -d
2021  ping ifoodquarkus_default
2022  sudo docker inspect   --format '{{ .NetworkSettings.IPAddress }}' 30f418a
2023  sudo docker ps -a
2028  sudo docker-compose down
2029  sudo docker-compose up -d
2030  sudo docker ps -a
2031  sudo docker logs c8b
2033  sudo docker inspect   --format '{{ .NetworkSettings.IPAddress }}' c8b
2034  sudo docker inspect   c8b
