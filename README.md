# ag04/opta-api-soccer-model

AG04 Java representation of data model for OPTA soccer API (push and pull) 

## Usage

To use this library in you gradle project simply add the following repository definition to the project build.gradle:

```groovy
    maven {
        url 'https://maven.pkg.github.com/ag04/opta-api-soccer-model'
        credentials {
            username = "dmadunic"
            password = "cd1682474e79efb726afe2dd08f902b3da7aa993"
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
