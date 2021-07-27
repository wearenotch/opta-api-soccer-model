# ag04/opta-api-soccer-model

Agency04 Java representation of the data model for OPTA soccer API (push and pull).

### SDAPI
Model supports the following opta feeds:

* Tournament Calendars (OT2)
* Fixtures and Results (MA1)
* Match Stats (MA2)
* Match Events (MA3)
* Teams (TM1)
* Team Standings (TM2)
* Squads (TM3)
* Rankings (PE4)

### SDDP


## Usage

To use this library in you gradle project simply add the following repository definition to the project build.gradle:

```groovy
    maven {
        url 'https://maven.pkg.github.com/ag04/opta-api-soccer-model'
        credentials {
            username = System.getenv("GITHUB_PACKAGES_USERID") ?: "dmadunic"
            // Safe to share the password since it is a `read:package` scoped token.
            password = System.getenv("GITHUB_PACKAGES_IMPORT_TOKEN") ?: "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"
        }
    }
```
This package is published in github packages gradle repository, yet unfortunatelly due to the lack of public access to the published libraries this hack is needed.

Password is **readonly** personal access token (PAT) to github packages.


### Requirements
* [Java JDK 11](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### Setup (First time)
1. Clone the repository: `git clone git@github.com:ag04/opta-api-soccer-model.git`
4. Build project with: ` ./gradlew clean build `

### Release new version
Make sure that file gradle.properties in the folder ${USER_HOME}/.gradle/ contains the following two variables defined:

* github_username
* github_password : personal github token to be used to install/update packages

1) Commit and push everything
2) `./gradlew release`

And simply follow the instructions on the console

## Changelog

## Credits
* Domagoj Madunić (Maintener)
