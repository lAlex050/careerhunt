# careerhunt

A backend-oriented REST API for tracking job applications throughout the
hiring process. Built as a personal project to deepen my understanding
of Spring Boot, PostgreSQL, authentication, and clean backend architecture.

## What it does

careerhunt lets a user log every job they apply to, manage the application
through its lifecycle (Applied → Interview → Offer / Rejected), store
notes from interviews, and view stats about their search. The focus is on a solid, well-tested backend — clean REST
endpoints,
real authentication, proper database design, and migrations.

## Why this project

I'm building careerhunt while job hunting myself. I wanted a project I
would actually use, not a tutorial clone — and one that would push me
through every layer of a real backend: persistence, security, validation,
testing, and deployment.

## Tech stack

- Java 21
- Spring Boot 3
- PostgreSQL 16
- Flyway (database migrations)
- JWT (authentication)
- JUnit 5 + Mockito (testing)
- Docker Compose (local development)
- Maven (build tool)

## Status

In active development. See [LOG.md](./LOG.md) for daily progress.

## License

MIT