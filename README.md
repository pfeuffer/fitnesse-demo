# This is a demo project for FitNesse.

This project is meant first and foremost meant to be a starting point
to start using **FitNesse** tests in maven java projects.

This demo includes:

- Starting FitNesse using Maven.
- Running FitNesse tests in the Maven build cycle.
- A opinionated way to include FitNesse in a Maven project.
- Simple fixtures for recurring issues.

To achieve this, the [MAFIA plugin](https://github.com/sijpesteijn/mafia-maven-plugin)
is used.

## Usage

To run this simple demo, you need

- [Maven](https://maven.apache.org/).
- Set the environment variable **MAVEN_HOME** to the path, where maven is installed.
- Java (surprised, aren't you).
- A bash environment (under Windows, you probably already have this when you have
git installed).

### Initialization

Just run **init_fitnesse.sh**.

This builds the project (aka mvn install).

### Start FitNesse

Just run **start_fitnesse.sh**.

This starts the local FitNesse server, where you can edit and execute your tests.
