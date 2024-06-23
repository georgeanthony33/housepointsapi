# House Points API

User and Auth service for House Points App

## Tech Stack

- Java 17
- Spring Boot 3.2.4
- Gradle 8.6
- Postgres

## Setup

### Dependencies

Using [asdf](https://asdf-vm.com/) to manage dependencies. You'll need to add the plugins for each dependency first e.g.

```sh
asdf plugin add postgres
```

Then `.tool-versions` file is used by `asdf` to load the specified versions of each dependency

```sh
asdf install
```

### Environment Variables

Copy the `.env.template.properties` file into `.env.local.properties` and update the values

```sh
cp .env.template.properties .env.local.properties
```

### Database

Use `psql` command to create local `house-points-db` DB. Ensure the DB "Owner" matches `DB_USERNAME`

### Build and run

In project root, build the `.jar` executable file with

```sh
./gradlew build
```

Then run with

```sh
java -jar build/libs/housepointsapi-0.0.1-SNAPSHOT.jar
```
